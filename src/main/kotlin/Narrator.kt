package org.example
fun main() {
    narrate("A hero enters the town of Kronstadt. What is their name?")
}

fun narrate(
    message: String
){
    println({
        val numExclamationPoints = 3
        message.uppercase() + "!".repeat(numExclamationPoints)
    }())
}