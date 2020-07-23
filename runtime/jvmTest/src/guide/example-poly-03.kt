// This file was automatically generated from serialization-guide.md by Knit tool. Do not edit.
package example.examplePoly03

import kotlinx.serialization.*
import kotlinx.serialization.json.*

@Serializable
abstract class Repository {
    abstract val name: String
}

class OwnedRepository(override val name: String, val owner: String) : Repository()

fun main() {
    val data: Repository = OwnedRepository("kotlinx.coroutines", "kotlin")
    println(Json.encodeToString(data))
}  
