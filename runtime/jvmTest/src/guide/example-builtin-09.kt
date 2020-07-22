// This file was automatically generated from serialization-guide.md by Knit tool. Do not edit.
package example.exampleBuiltin09

import kotlinx.serialization.*
import kotlinx.serialization.json.*

@Serializable
class Repository(val name: String)

fun main() {
    val set = setOf(
        Repository("kotlinx.serialization"),
        Repository("kotlinx.coroutines")    
    )
    println(Json.encodeToString(set))
}  
