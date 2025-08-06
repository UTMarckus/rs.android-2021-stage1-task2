package subtask1

import java.time.DateTimeException
import java.time.DayOfWeek
import java.time.LocalDate

class DateFormatter {

    fun toTextDay(day: String, month: String, year: String): String {
        val weekDay = when(
            try {
                LocalDate.of(year.toInt(), month.toInt(), day.toInt()).dayOfWeek
            } catch (e: DateTimeException) {
                return "Такого дня не существует"
            }
        ) {
            DayOfWeek.MONDAY -> "понедельник"
            DayOfWeek.TUESDAY -> "вторник"
            DayOfWeek.WEDNESDAY -> "среда"
            DayOfWeek.THURSDAY -> "четверг"
            DayOfWeek.FRIDAY -> "пятница"
            DayOfWeek.SATURDAY -> "суббота"
            DayOfWeek.SUNDAY -> "воскресенье"
        }

        val rusMonth = when(month.toInt()) {
            1 -> "января"
            2 -> "февраля"
            3 -> "марта"
            4 -> "апреля"
            5 -> "мая"
            6 -> "июня"
            7 -> "июля"
            8 -> "августа"
            9 -> "сентября"
            10 -> "октября"
            11 -> "ноября"
            else -> "декабря"
        }

        return "$day $rusMonth, $weekDay"
    }
}
