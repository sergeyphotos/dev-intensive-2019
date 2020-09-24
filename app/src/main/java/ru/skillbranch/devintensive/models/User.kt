package ru.skillbranch.devintensive.models

import java.util.*
import kotlin.IllegalArgumentException

data class User(
    val id: String,
    var firstName: String?,
    var lastName: String?,
    var avatar: String?,
    var rating: Int = 0,
    var respect: Int = 0,
    var lastVisit: Date? = Date(),
    var isOnline: Boolean = false
) {
    constructor(id: String, firstName: String, lastName: String) : this(
        id = id,
        firstName = firstName,
        lastName = lastName,
        avatar = null
    )

    companion object Factory {
        private var lastId = -1
        fun makeUser(fullName: String): User {
            lastId++
            if (fullName.isNotBlank() && fullName.isNotEmpty()) {
                val (firstName, lastName) = fullName.split(" ")
                return User(id = "$lastId", firstName = firstName, lastName = lastName)
            } else {
                throw IllegalArgumentException("Write full name")
            }
        }
    }
}