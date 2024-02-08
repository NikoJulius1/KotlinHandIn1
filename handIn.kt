package com.example.intro

import java.util.Locale

fun main() {

    val votingAge = 19
canYouVote(votingAge)

    val smallestNumber = findSmallest(8, 3, 9)
    println("$smallestNumber")

    val biggestNumber = findBiggest(8, 3, 9)
    println("$biggestNumber")

    val numbers = listOf(4.5, 6.7, 8.9, 10.2)
    val average = calculateAverage(numbers)
    println("The average is: $average")

    val cprNumber = "02072001"
    val check = cprCheck(cprNumber)
    println(check)

    //opgave 5
    for (i in 1..100) {
        if (i % 3 == 0 && i % 5 == 0) {
            println("FizzBuzz")
        } else if (i % 3 == 0) {
            println("Fizz")
        } else if (i % 5 == 0) {
            println("Buzz")
        } else {
            println(i)
        }
    }

    val fullName = "Nikolaus Julius"
    val abbrevateName = abbrevateName(fullName)
    println(abbrevateName)

    val myGrade = 78
    val americanGrade = americanGrade(myGrade)
    println(americanGrade)

    val differentLengthStrings = listOf("apple", "banana", "orange", "grape", "kiwi")
    val minLengthOne = 5
    val filteredWordsOne = filterWordsByLength(differentLengthStrings, minLengthOne)
    println("Words longer than or equal to $minLengthOne characters: $filteredWordsOne")
}

fun canYouVote(votingAge: Int) {
    if (votingAge >= 18) {
        println("You are elgible to vote!")
    } else {
        println("You are not elgible to vote")
    }
}

fun findBiggest(num1: Int, num2: Int, num3: Int): Int {
    return if (num1 > num2 && num1 > num3) {
        num1
    } else if (num2 > num3) {
        num2
    } else {
        num3
    }

}

fun findSmallest(maxNum1: Int, maxNum2: Int, maxNum3: Int): Int {
    return if (maxNum1 < maxNum2 && maxNum1 < maxNum3) {
        maxNum1
    } else if (maxNum2 < maxNum3) {
        maxNum2
    } else {
        maxNum3
    }
}

fun calculateAverage(numbers: List<Double>): Double {
    return numbers.sum() / numbers.size.toDouble()
}

fun cprCheck(cprNumber: String): Boolean {
    if (cprNumber.length > 10) {
        return false
    }

    val firstTwo = cprNumber.substring(0, 2).toIntOrNull()
    if (firstTwo == null || firstTwo > 31) {
        return false
    }

    val middleTwo = cprNumber.substring(2,4).toIntOrNull()
    if (middleTwo == null || middleTwo > 12) {
        return false
    }

    return true
}

fun abbrevateName(fullName: String): String {
    val cutName = fullName.split(" ")
    val firstName = cutName[0].take(1) + "."
    val lastName = cutName[1].take(1) + "."

    return "$firstName $lastName ${cutName.last()}"
}

fun americanGrade(grade: Int): String {
   return if (grade >= 90) {
        "You grade is A!"
    } else if (grade <= 90 && grade > 80) {
        "Your grade is B!"
    } else if (grade <= 80 && grade > 70) {
        "Your grade is C!"
    } else if (grade <= 70 && grade > 60) {
        "Your grade is D!"
    } else {
        "Your grade is F!"
    }
}

fun filterWordsByLength(words: List<String>, minLength: Int): List<String> {
    val filteredWords = mutableListOf<String>()
    for (word in words) {
        if (word.length >= minLength) {
            filteredWords.add(word)
        }
    }
    return filteredWords
}


