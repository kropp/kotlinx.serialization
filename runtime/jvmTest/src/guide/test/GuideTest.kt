// This file was automatically generated from serialization-guide.md by Knit tool. Do not edit.
package example.test

import org.junit.Test
import kotlinx.knit.test.*

class GuideTest {
    @Test
    fun testExampleBasic01() {
        captureOutput("ExampleBasic01") { example.exampleBasic01.main() }.verifyOutputLinesStart(
            "Exception in thread \"main\" kotlinx.serialization.SerializationException: Serializer for class 'Repository' is not found. Mark the class as @Serializable or provide the serializer explicitly."
        )
    }

    @Test
    fun testExampleBasic02() {
        captureOutput("ExampleBasic02") { example.exampleBasic02.main() }.verifyOutputLines(
            "{\"name\":\"kotlinx.serialization\",\"language\":\"Kotlin\"}"
        )
    }

    @Test
    fun testExampleBasic03() {
        captureOutput("ExampleBasic03") { example.exampleBasic03.main() }.verifyOutputLines(
            "Repository(name=kotlinx.serialization, language=Kotlin)"
        )
    }

    @Test
    fun testExampleClasses01() {
        captureOutput("ExampleClasses01") { example.exampleClasses01.main() }.verifyOutputLines(
            "{\"name\":\"Kotlin\",\"stars\":9000}"
        )
    }

    @Test
    fun testExampleClasses02() {
        captureOutput("ExampleClasses02") { example.exampleClasses02.main() }.verifyOutputLines(
            "{\"owner\":\"kotlin\",\"name\":\"kotlinx.serialization\"}"
        )
    }

    @Test
    fun testExampleClasses03() {
        captureOutput("ExampleClasses03") { example.exampleClasses03.main() }.verifyOutputLinesStart(
            "Exception in thread \"main\" java.lang.IllegalArgumentException: name cannot be empty"
        )
    }

    @Test
    fun testExampleClasses04() {
        captureOutput("ExampleClasses04") { example.exampleClasses04.main() }.verifyOutputLinesStart(
            "Exception in thread \"main\" kotlinx.serialization.MissingFieldException: Field 'language' is required, but it was missing"
        )
    }

    @Test
    fun testExampleClasses05() {
        captureOutput("ExampleClasses05") { example.exampleClasses05.main() }.verifyOutputLines(
            "Repository(name=kotlinx.serialization, language=Kotlin)"
        )
    }

    @Test
    fun testExampleClasses07() {
        captureOutput("ExampleClasses07") { example.exampleClasses07.main() }.verifyOutputLinesStart(
            "Exception in thread \"main\" kotlinx.serialization.MissingFieldException: Field 'language' is required, but it was missing"
        )
    }

    @Test
    fun testExampleClasses08() {
        captureOutput("ExampleClasses08") { example.exampleClasses08.main() }.verifyOutputLinesStart(
            "Exception in thread \"main\" kotlinx.serialization.json.JsonDecodingException: Unexpected JSON token at offset 60: Encountered an unknown key 'language'.",
            "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys."
        )
    }

    @Test
    fun testExampleClasses09() {
        captureOutput("ExampleClasses09") { example.exampleClasses09.main() }.verifyOutputLines(
            "{\"name\":\"kotlinx.serialization\",\"language\":\"Kotlin\"}"
        )
    }

    @Test
    fun testExampleClasses10() {
        captureOutput("ExampleClasses10") { example.exampleClasses10.main() }.verifyOutputLines(
            "{\"name\":\"kotlinx.serialization\",\"renamedTo\":null}"
        )
    }

    @Test
    fun testExampleClasses11() {
        captureOutput("ExampleClasses11") { example.exampleClasses11.main() }.verifyOutputLinesStart(
            "Exception in thread \"main\" kotlinx.serialization.json.JsonDecodingException: Unexpected JSON token at offset 52: Expected string literal but 'null' literal was found.",
            "Use 'coerceInputValues = true' in 'Json {}` builder to coerce nulls to default values."
        )
    }

    @Test
    fun testExampleClasses12() {
        captureOutput("ExampleClasses12") { example.exampleClasses12.main() }.verifyOutputLines(
            "{\"name\":\"kotlinx.serialization\",\"owner\":{\"name\":\"kotlin\"}}"
        )
    }

    @Test
    fun testExampleClasses13() {
        captureOutput("ExampleClasses13") { example.exampleClasses13.main() }.verifyOutputLines(
            "{\"name\":\"kotlinx.serialization\",\"owner\":{\"name\":\"kotlin\"},\"maintainer\":{\"name\":\"kotlin\"}}"
        )
    }

    @Test
    fun testExampleClasses14() {
        captureOutput("ExampleClasses14") { example.exampleClasses14.main() }.verifyOutputLines(
            "{\"name\":\"kotlinx.serialization\",\"lang\":\"Kotlin\"}"
        )
    }

    @Test
    fun testExampleBuiltin01() {
        captureOutput("ExampleBuiltin01") { example.exampleBuiltin01.main() }.verifyOutputLines(
            "{\"answer\":42,\"pi\":3.141592653589793}"
        )
    }

    @Test
    fun testExampleBuiltin02() {
        captureOutput("ExampleBuiltin02") { example.exampleBuiltin02.main() }.verifyOutputLinesStart(
            "Exception in thread \"main\" kotlinx.serialization.json.JsonEncodingException: 'NaN' is not a valid 'double' as per JSON specification.",
            "Use 'serializeSpecialFloatingPointValues = true' in 'Json {}' builder to serialize special values."
        )
    }

    @Test
    fun testExampleBuiltin03() {
        captureOutput("ExampleBuiltin03") { example.exampleBuiltin03.main() }.verifyOutputLines(
            "{\"signature\":2067120338512882656}"
        )
    }

    @Test
    fun testExampleBuiltin04() {
        captureOutput("ExampleBuiltin04") { example.exampleBuiltin04.main() }.verifyOutputLines(
            "{\"signature\":\"2067120338512882656\"}"
        )
    }

    @Test
    fun testExampleBuiltin05() {
        captureOutput("ExampleBuiltin05") { example.exampleBuiltin05.main() }.verifyOutputLines(
            "{\"name\":\"kotlinx.serialization\",\"status\":\"SUPPORTED\"}"
        )
    }

    @Test
    fun testExampleBuiltin06() {
        captureOutput("ExampleBuiltin06") { example.exampleBuiltin06.main() }.verifyOutputLines(
            "{\"name\":\"kotlinx.serialization\",\"status\":\"maintained\"}"
        )
    }

    @Test
    fun testExampleBuiltin07() {
        captureOutput("ExampleBuiltin07") { example.exampleBuiltin07.main() }.verifyOutputLines(
            "{\"first\":1,\"second\":{\"name\":\"kotlinx.serialization\"}}"
        )
    }

    @Test
    fun testExampleBuiltin08() {
        captureOutput("ExampleBuiltin08") { example.exampleBuiltin08.main() }.verifyOutputLines(
            "[{\"name\":\"kotlinx.serialization\"},{\"name\":\"kotlinx.coroutines\"}]"
        )
    }

    @Test
    fun testExampleBuiltin09() {
        captureOutput("ExampleBuiltin09") { example.exampleBuiltin09.main() }.verifyOutputLines(
            "[{\"name\":\"kotlinx.serialization\"},{\"name\":\"kotlinx.coroutines\"}]"
        )
    }

    @Test
    fun testExampleBuiltin10() {
        captureOutput("ExampleBuiltin10") { example.exampleBuiltin10.main() }.verifyOutputLines(
            "Data(a=[42, 42], b=[42])"
        )
    }

    @Test
    fun testExampleBuiltin11() {
        captureOutput("ExampleBuiltin11") { example.exampleBuiltin11.main() }.verifyOutputLines(
            "{\"1\":{\"name\":\"kotlinx.serialization\"},\"2\":{\"name\":\"kotlinx.coroutines\"}}"
        )
    }

    @Test
    fun testExamplePoly01() {
        captureOutput("ExamplePoly01") { example.examplePoly01.main() }.verifyOutputLines(
            "{\"name\":\"kotlinx.coroutines\"}"
        )
    }

    @Test
    fun testExamplePoly02() {
        captureOutput("ExamplePoly02") { example.examplePoly02.main() }.verifyOutputLinesStart(
            "Exception in thread \"main\" kotlinx.serialization.SerializationException: Serializer for class 'OwnedRepository' is not found. Mark the class as @Serializable or provide the serializer explicitly."
        )
    }

    @Test
    fun testExamplePoly03() {
        captureOutput("ExamplePoly03") { example.examplePoly03.main() }.verifyOutputLinesStart(
            "Exception in thread \"main\" kotlinx.serialization.SerializationException: Class 'OwnedRepository' is not registered for polymorphic serialization in the scope of 'Repository'.",
            "Mark the base class as 'sealed' or register serializer explicitly."
        )
    }

    @Test
    fun testExamplePoly04() {
        captureOutput("ExamplePoly04") { example.examplePoly04.main() }.verifyOutputLines(
            "{\"type\":\"example.examplePoly04.OwnedRepository\",\"name\":\"kotlinx.coroutines\",\"owner\":\"kotlin\"}"
        )
    }

    @Test
    fun testExamplePoly05() {
        captureOutput("ExamplePoly05") { example.examplePoly05.main() }.verifyOutputLines(
            "{\"type\":\"owned\",\"name\":\"kotlinx.coroutines\",\"owner\":\"kotlin\"}"
        )
    }

    @Test
    fun testExamplePoly06() {
        captureOutput("ExamplePoly06") { example.examplePoly06.main() }.verifyOutputLines(
            "{\"type\":\"owned\",\"status\":\"open\",name\":\"kotlinx.coroutines\",\"owner\":\"kotlin\"}"
        )
    }

    @Test
    fun testExamplePoly07() {
        captureOutput("ExamplePoly07") { example.examplePoly07.main() }.verifyOutputLines(
            "{\"type\":\"owned\",\"name\":\"kotlinx.coroutines\",\"owner\":\"kotlin\"}"
        )
    }

    @Test
    fun testExamplePoly08() {
        captureOutput("ExamplePoly08") { example.examplePoly08.main() }.verifyOutputLinesStart(
            "Exception in thread \"main\" kotlinx.serialization.SerializationException: Serializer for class 'Repository' is not found. Mark the class as @Serializable or provide the serializer explicitly."
        )
    }

    @Test
    fun testExamplePoly09() {
        captureOutput("ExamplePoly09") { example.examplePoly09.main() }.verifyOutputLines(
            "{\"type\":\"owned\",\"name\":\"kotlinx.coroutines\",\"owner\":\"kotlin\"}"
        )
    }

    @Test
    fun testExamplePoly10() {
        captureOutput("ExamplePoly10") { example.examplePoly10.main() }.verifyOutputLinesStart(
            "Exception in thread \"main\" kotlinx.serialization.SerializationException: Serializer for class 'Any' is not found. Mark the class as @Serializable or provide the serializer explicitly."
        )
    }

    @Test
    fun testExamplePoly11() {
        captureOutput("ExamplePoly11") { example.examplePoly11.main() }.verifyOutputLinesStart(
            "Exception in thread \"main\" kotlinx.serialization.SerializationException: Serializer for class 'Any' is not found. Mark the class as @Serializable or provide the serializer explicitly."
        )
    }

    @Test
    fun testExamplePoly12() {
        captureOutput("ExamplePoly12") { example.examplePoly12.main() }.verifyOutputLines(
            "{\"type\":\"owned\",\"name\":\"kotlinx.coroutines\",\"owner\":\"kotlin\"}"
        )
    }

    @Test
    fun testExampleJson01() {
        captureOutput("ExampleJson01") { example.exampleJson01.main() }.verifyOutputLines(
            "{",
            "    \"name\": \"kotlinx.serialization\",",
            "    \"language\": \"Kotlin\"",
            "}"
        )
    }

    @Test
    fun testExampleJson02() {
        captureOutput("ExampleJson02") { example.exampleJson02.main() }.verifyOutputLines(
            "{\"name\":\"kotlinx.serialization\"}"
        )
    }

    @Test
    fun testExampleJson03() {
        captureOutput("ExampleJson03") { example.exampleJson03.main() }.verifyOutputLines(
            "Repository(name=kotlinx.serialization)"
        )
    }

    @Test
    fun testExampleJson04() {
        captureOutput("ExampleJson04") { example.exampleJson04.main() }.verifyOutputLines(
            "[{\"name\":\"kotlinx.serialization\"},\"Serialization\",{\"name\":\"kotlinx.coroutines\"},\"Coroutines\"]"
        )
    }

    @Test
    fun testExampleJson05() {
        captureOutput("ExampleJson05") { example.exampleJson05.main() }.verifyOutputLines(
            "Repository(name=kotlinx.serialization, language=Kotlin)"
        )
    }

    @Test
    fun testExampleJson06() {
        captureOutput("ExampleJson06") { example.exampleJson06.main() }.verifyOutputLines(
            "{\"value\":NaN}"
        )
    }

    @Test
    fun testExampleJson07() {
        captureOutput("ExampleJson07") { example.exampleJson07.main() }.verifyOutputLines(
            "{\"#class\":\"owned\",\"name\":\"kotlinx.coroutines\",\"owner\":\"kotlin\"}"
        )
    }
}
