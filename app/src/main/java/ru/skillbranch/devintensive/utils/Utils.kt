package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName(fullName: String?): Pair<String?, String?> {
        val firstAndLastName = fullName?.split(" ")
        val firstName = firstAndLastName?.getOrNull(0)
        val lastName = firstAndLastName?.getOrNull(1)
        if (firstName.isNullOrBlank() && firstName.isNullOrEmpty() && lastName.isNullOrEmpty() && lastName.isNullOrBlank()) {
            return null to null
        }
        return firstName to lastName
    }
}