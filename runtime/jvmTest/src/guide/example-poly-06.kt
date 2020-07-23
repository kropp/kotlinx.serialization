// This file was automatically generated from serialization-guide.md by Knit tool. Do not edit.
package example.examplePoly06

import kotlinx.serialization.*
import kotlinx.serialization.json.*

@Serializable
sealed class Repository {
    abstract val name: String   
    var status = "open"
}
            
@Serializable   
@SerialName("owned")
class OwnedRepository(override val name: String, val owner: String) : Repository()

fun main() {
    val data: Repository = OwnedRepository("kotlinx.coroutines", "kotlin")
    println(Json.encodeToString(data))
}  
