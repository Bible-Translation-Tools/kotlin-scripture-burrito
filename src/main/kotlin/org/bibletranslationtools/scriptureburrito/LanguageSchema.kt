package org.bibletranslationtools.scriptureburrito

import com.fasterxml.jackson.annotation.*

class Languages: ArrayList<LanguageSchema>()

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "tag", "name", "numberingSystem", "rod", "scriptDirection"
)
class LanguageSchema {

    @get:JsonProperty("tag")
    @set:JsonProperty("tag")
    @JsonProperty("tag")
    @JsonPropertyDescription("A valid IETF language tag as specified by BCP 47.")
    var tag: String? = null
    
    @get:JsonProperty("name")
    @set:JsonProperty("name")
    @JsonProperty("name")
    @JsonPropertyDescription("A textual string specified in one or multiple languages, indexed by IETF language tag.")
    var name: HashMap<String, String> = hashMapOf()
    
    @get:JsonProperty("numberingSystem")
    @set:JsonProperty("numberingSystem")
    @JsonProperty("numberingSystem")
    @JsonPropertyDescription("Numbering System")
    var numberingSystem: NumberingSystemSchema? = null
    
    @get:JsonProperty("rod")
    @set:JsonProperty("rod")
    @JsonProperty("rod")
    @JsonPropertyDescription("A five-digit code from the Registry of Dialects.")
    var rod: String? = null

    @get:JsonProperty("scriptDirection")
    @set:JsonProperty("scriptDirection")
    @JsonProperty("scriptDirection")
    var scriptDirection: ScriptDirection? = null

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(LanguageSchema::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("tag")
        sb.append('=')
        sb.append((if ((this.tag == null)) "<null>" else this.tag))
        sb.append(',')
        sb.append("name")
        sb.append('=')
        sb.append((if ((this.name == null)) "<null>" else this.name))
        sb.append(',')
        sb.append("numberingSystem")
        sb.append('=')
        sb.append((if ((this.numberingSystem == null)) "<null>" else this.numberingSystem))
        sb.append(',')
        sb.append("rod")
        sb.append('=')
        sb.append((if ((this.rod == null)) "<null>" else this.rod))
        sb.append(',')
        sb.append("scriptDirection")
        sb.append('=')
        sb.append((if ((this.scriptDirection == null)) "<null>" else this.scriptDirection))
        sb.append(',')
        if (sb[sb.length - 1] == ',') {
            sb.setCharAt((sb.length - 1), ']')
        } else {
            sb.append(']')
        }
        return sb.toString()
    }

    override fun hashCode(): Int {
        var result = 1
        result = ((result * 31) + (if ((this.name == null)) 0 else name.hashCode()))
        result = ((result * 31) + (if ((this.tag == null)) 0 else tag.hashCode()))
        result = ((result * 31) + (if ((this.numberingSystem == null)) 0 else numberingSystem.hashCode()))
        result = ((result * 31) + (if ((this.rod == null)) 0 else rod.hashCode()))
        result = ((result * 31) + (if ((this.scriptDirection == null)) 0 else scriptDirection.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is LanguageSchema) == false) {
            return false
        }
        val rhs = other
        return ((((((this.name === rhs.name) || ((this.name != null) && (this.name == rhs.name))) && ((this.tag === rhs.tag) || ((this.tag != null) && (this.tag == rhs.tag)))) && ((this.numberingSystem == rhs.numberingSystem) || ((this.numberingSystem != null) && (this.numberingSystem == rhs.numberingSystem)))) && ((this.rod === rhs.rod) || ((this.rod != null) && (this.rod == rhs.rod)))) && ((this.scriptDirection == rhs.scriptDirection) || ((this.scriptDirection != null) && (this.scriptDirection == rhs.scriptDirection))))
    }


    
    enum class NumberingSystemSchema(private val value: String) {
        ADLM("adlm"),
        AHOM("ahom"),
        ARAB("arab"),
        ARABEXT("arabext"),
        ARMN("armn"),
        ARMNLOW("armnlow"),
        BALI("bali"),
        BENG("beng"),
        BHKS("bhks"),
        BRAH("brah"),
        CAKM("cakm"),
        CHAM("cham"),
        CYRL("cyrl"),
        DEVA("deva"),
        ETHI("ethi"),
        FINANCE("finance"),
        FULLWIDE("fullwide"),
        GEOR("geor"),
        GONG("gong"),
        GONM("gonm"),
        GREK("grek"),
        GREKLOW("greklow"),
        GUJR("gujr"),
        GURU("guru"),
        HANIDAYS("hanidays"),
        HANIDEC("hanidec"),
        HANS("hans"),
        HANSFIN("hansfin"),
        HANT("hant"),
        HANTFIN("hantfin"),
        HEBR("hebr"),
        HMNG("hmng"),
        HMNP("hmnp"),
        JAVA("java"),
        JPAN("jpan"),
        JPANFIN("jpanfin"),
        JPANYEAR("jpanyear"),
        KALI("kali"),
        KHMR("khmr"),
        KNDA("knda"),
        LANA("lana"),
        LANATHAM("lanatham"),
        LAOO("laoo"),
        LATN("latn"),
        LEPC("lepc"),
        LIMB("limb"),
        MATHBOLD("mathbold"),
        MATHDBL("mathdbl"),
        MATHMONO("mathmono"),
        MATHSANB("mathsanb"),
        MATHSANS("mathsans"),
        MLYM("mlym"),
        MODI("modi"),
        MONG("mong"),
        MROO("mroo"),
        MTEI("mtei"),
        MYMR("mymr"),
        MYMRSHAN("mymrshan"),
        MYMRTLNG("mymrtlng"),
        NATIVE("native"),
        NEWA("newa"),
        NKOO("nkoo"),
        OLCK("olck"),
        ORYA("orya"),
        OSMA("osma"),
        ROHG("rohg"),
        ROMAN("roman"),
        ROMANLOW("romanlow"),
        SAUR("saur"),
        SHRD("shrd"),
        SIND("sind"),
        SINH("sinh"),
        SORA("sora"),
        SUND("sund"),
        TAKR("takr"),
        TALU("talu"),
        TAML("taml"),
        TAMLDEC("tamldec"),
        TELU("telu"),
        THAI("thai"),
        TIRH("tirh"),
        TIBT("tibt"),
        TRADITIO("traditio"),
        VAII("vaii"),
        WARA("wara"),
        WCHO("wcho");

        override fun toString(): String {
            return this.value
        }

        @JsonValue
        fun value(): String {
            return this.value
        }

        companion object {
            private val CONSTANTS: MutableMap<String, NumberingSystemSchema> = HashMap()

            init {
                for (c in values()) {
                    CONSTANTS[c.value] = c
                }
            }

            @JsonCreator
            fun fromValue(value: String): NumberingSystemSchema {
                val constant = CONSTANTS[value]
                requireNotNull(constant) { value }
                return constant
            }
        }
    }

    enum class ScriptDirection(private val value: String) {
        LTR("ltr"),
        RTL("rtl");

        override fun toString(): String {
            return this.value
        }

        @JsonValue
        fun value(): String {
            return this.value
        }

        companion object {
            private val CONSTANTS: MutableMap<String, ScriptDirection> = HashMap()

            init {
                for (c in values()) {
                    CONSTANTS[c.value] = c
                }
            }

            @JsonCreator
            fun fromValue(value: String): ScriptDirection {
                val constant = CONSTANTS[value]
                requireNotNull(constant) { value }
                return constant
            }
        }
    }
}
