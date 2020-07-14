// This file was automatically generated from serialization-guide.md by Knit tool. Do not edit.
package kotlinx.serialization.example.exampleJson03

import kotlinx.serialization.*
import kotlinx.serialization.json.*

val format = Json { ignoreUnknownKeys = true }

@Serializable 
data class Repository(val name: String)
    
fun main() {             
    val data = format.decodeFromString<Repository>("""
        {"name":"kotlinx.serialization","language":"Kotlin"}
    """)
    println(data)
}
