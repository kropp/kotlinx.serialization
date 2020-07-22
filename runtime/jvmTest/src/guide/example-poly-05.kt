// This file was automatically generated from serialization-guide.md by Knit tool. Do not edit.
package example.examplePoly05

import kotlinx.serialization.*
import kotlinx.serialization.json.*

@Serializable
sealed class Repository {
    abstract val name: String
}
            
@Serializable         
@SerialName("owned")
class OwnedRepository(override val name: String, val owner: String) : Repository()

fun main() {
    val data: Repository = OwnedRepository("kotlinx.coroutines", "kotlin")
    println(Json.encodeToString(data))
}  
