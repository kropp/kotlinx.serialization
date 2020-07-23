// This file was automatically generated from serialization-guide.md by Knit tool. Do not edit.
package example.examplePoly01

import kotlinx.serialization.*
import kotlinx.serialization.json.*

@Serializable
open class Repository(val name: String)

class OwnedRepository(name: String, val owner: String) : Repository(name)

fun main() {
    val data: Repository = OwnedRepository("kotlinx.coroutines", "kotlin")
    println(Json.encodeToString(data))
}  