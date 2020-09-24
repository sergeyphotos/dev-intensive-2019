package ru.skillbranch.devintensive.extensions

import java.text.SimpleDateFormat
import java.util.*
import java.util.regex.Pattern
const val SECOND = 1000L
const val MINUTE = 60 * SECOND
const val HOUR = 60 * MINUTE
const val DAY = 24 * HOUR
fun Date.humanizeDiff(date: Date = Date()) : String {
    val time = date.time - Date().time
    /**
     * 0с - 1с "только что"

    1с - 45с "несколько секунд назад"

    45с - 75с "минуту назад"

    75с - 45мин "N минут назад"

    45мин - 75мин "час назад"

    75мин 22ч "N часов назад"

    22ч - 26ч "день назад"

    26ч - 360д "N дней назад"

    >360д "более года назад"*/
    when(time) {
        in 0..1 -> "только что"

    }
    return ""
}
fun Date.format(pattern: String = "HH:mm:ss dd.MM.yyyy"): String {
    val dateFormat = SimpleDateFormat(pattern, Locale("kz"))
    return dateFormat.format(this)
}

fun Date.add(value: Int, units: TimeUnits): Date {
    var time = this.time

    time += when(units) {
        TimeUnits.SECOND -> value * SECOND
        TimeUnits.MINUTE -> value * MINUTE
        TimeUnits.HOUR -> value * HOUR
        TimeUnits.DAY -> value * DAY
    }
    this.time = time
    return this
}

enum class TimeUnits {
    SECOND,
    MINUTE,
    HOUR,
    DAY
}