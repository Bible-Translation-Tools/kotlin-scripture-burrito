package org.bibletranslationtools.scriptureburrito

import org.bibletranslationtools.scriptureburrito.container.BurritoContainer
import org.junit.Test
import org.wycliffeassociates.resourcecontainer.ResourceContainer
import org.wycliffeassociates.resourcecontainer.entity.*
import java.io.File
import java.util.*
import java.util.stream.Collectors

class TestLoadBurrito {

    val burrito = File("/Users/joe/Desktop/test.burrito")
    val rc = File("/Users/joe/Desktop/test.rc")

    @Test
    fun testOpenBurrito() {
        val burrito = BurritoContainer.load(File("/Users/joe/Desktop/test.burrito"))
        val metadata = burrito.manifest
        println(metadata)

        ResourceContainer.create(rc) {
            val (projects, media) = projectsFromBurrito(metadata),
            this.manifest = Manifest(
                dublinCore = dublinCoreFromBurrito(metadata),
                projects = projects,
                checking = Checking(),
            )
            this.media = media
        }

    }

    fun dublinCoreFromBurrito(burrito: MetadataSchema): DublinCore {
        val (identifier, title) = getTitleFromBurrito(burrito)
        return DublinCore(
            type = "bundle",
            conformsTo = "0.2",
            format = "text/usfm",
            identifier = identifier,
            title = title,
            description = "",
            language = getLanguageFromBurrito(burrito),
            rights = getCopyrightFromBurrito(burrito),
        )
    }

    private fun getTitleFromBurrito(burrito: MetadataSchema): Pair<String, String> {
        val langSlug = burrito.meta.defaultLocale
        var slug = ""
        var title = ""
        burrito.identification?.let {
            slug = it.abbreviation["en"] ?: it.abbreviation[langSlug] ?: ""
            title = it.name["en"] ?: it.name[langSlug] ?: ""
        }
        return Pair(slug, title)
    }

    private fun getLanguageFromBurrito(burrito: MetadataSchema): Language {
        val slug = burrito.meta.defaultLocale
        val lang = burrito.languages.first { it.tag == slug }
        return Language(
            "",
            slug,
            lang.name[slug] ?: lang.name["en"] ?: ""
        )
    }

    private fun getCopyrightFromBurrito(burrito: MetadataSchema): String {
        return burrito
            .copyright
            .shortStatements
            .map { it.statement }
            .reduce { acc, shortStatement -> "$acc\n$shortStatement" }
    }

    fun projectsFromBurrito(burrito: MetadataSchema): Pair<List<Project>, MediaManifest> {
        val slugs = burrito.type!!.flavorType.currentScope.keys.map { it.lowercase(Locale.US) }
        val ingredientsByBook = slugs.associateWith { mutableListOf<Pair<String, IngredientSchema>>() }
        burrito.ingredients.forEach { filepath, item ->
            item.scope?.let { scope ->
                scope.keys.forEach {
                    val slug = it.lowercase(Locale.US)
                    ingredientsByBook[slug]!!.add(Pair(filepath, item))
                }
            }
        }

        return Pair(listOf(), MediaManifest())
    }
}
/*
  type: "book"
  conformsto: "0.2"
  format: "text/usfm"
  identifier: "ulb"
  title: "Unlocked Literal Bible"
  subject: "Bible"
  description: ""
  language:
    direction: "ltr"
    identifier: "en"
    title: "English"
  source:
  - identifier: "ulb"
    language: "en"
    version: "12"
  rights: "CC BY-SA 4.0"
  creator: "Orature"
  contributor: []
  relation: []
  publisher: ""
  issued: "2024-06-10"
  modified: "2024-06-10"
  version: "12"
 */