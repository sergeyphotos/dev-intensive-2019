package ru.skillbranch.devintensive.extensions

fun String.stripHtml(): String {
    return replace(Regex("</?[a-z][a-z0-9]*[^<>]*>"), "").replace(Regex("[\\s]+"), " ")
}