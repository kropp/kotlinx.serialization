// This file was automatically generated from serialization-guide.md by Knit tool. Do not edit.
package example.examplePoly11

import kotlinx.serialization.*
import kotlinx.serialization.json.*

import kotlinx.serialization.modules.*

val module = SerializersModule {
    polymorphic(Any::class) {
        subclass(OwnedRepository::class)
    }
}
val format = Json { serializersModule = module }

@Serializable
abstract class Repository {
    abstract val name: String
}
            
@Serializable
@SerialName("owned")
class OwnedRepository(override val name: String, val owner: String) : Repository()

fun main() {
    val data: Any = OwnedRepository("kotlinx.coroutines", "kotlin")
    println(format.encodeToString(data))
}    
