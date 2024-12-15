package org.example

fun main() {
    narrate("A hero enters the town of Kronstadt. What is their name?")
}

val narrationModifier: (String)->String = { message ->
    val numExclamationPoints = 3
    message.uppercase() + "!".repeat(numExclamationPoints)
}

fun narrate(
    message: String
){
    println(narrationModifier(message))
}