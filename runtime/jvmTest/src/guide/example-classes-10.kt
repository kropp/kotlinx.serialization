// This file was automatically generated from serialization-guide.md by Knit tool. Do not edit.
package kotlinx.serialization.example.exampleClasses10

import kotlinx.serialization.*
import kotlinx.serialization.json.*

@Serializable
class Repository(val name: String, val renamedTo: String? = null)

fun main() {
    val data = Repository("kotlinx.serialization")
    println(Json.encodeToString(data))
}
