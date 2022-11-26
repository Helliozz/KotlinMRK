fun main() {
    while (true) {
        //first()
        //second()
        third()
    }
}


/**Создать ф-цию факториала, которая выкидывает ваше собственное исключение при неверных входных данных.*/
fun first() {
    val number = Factor(0)
    val num: Int? = readLine()?.toIntOrNull()
    try {
        number.factorial(num!!)
    } catch (e: MyException) {
        println(e.myMassage)
    } finally {
        println(number.factorial(num!!))
    }
}
class Factor(var number: Int) {
    fun factorial(number: Int): Int {
        if (number < 0) {
            throw MyException("wrong number to factorial")
        }
        var fac = 1
        for (i in 1..number) {
            fac *= i
        }
        return fac
    }
}
class MyException(val myMassage: String) : Exception() {}


/**Дата представлена строкой вида "15.07.2016".
 * Перевести её в строковый формат вида "15 июля 2016".
 * При неверном формате входной строки вернуть пустую строку
 * */
fun second() {
    var text: String? = readLine()
    text = data(text!!)
    println(text)
}
fun data(text: String): String {
    var data = text
    val month28: Array<String> = arrayOf(
        "01", "02", "03", "04",
        "05", "06", "07", "08",
        "09", "10", "11", "12",
        "13", "14", "15", "16",
        "17", "18", "19", "20",
        "21", "22", "23", "24",
        "25", "26", "27", "28"
    )
    val month30: Array<String> = arrayOf(
        "01", "02",
        "03", "04", "05", "06",
        "07", "08", "09", "10",
        "11", "12", "13", "14",
        "15", "16", "17", "18",
        "19", "20", "21", "22",
        "23", "24", "25", "26",
        "27", "28", "29", "30"
    )
    val month31: Array<String> = arrayOf(
        "01", "02", "03",
        "04", "05", "06", "07",
        "08", "09", "10", "11",
        "12", "13", "14", "15",
        "16", "17", "18", "19",
        "20", "21", "22", "23",
        "24", "25", "26", "27",
        "28", "29", "30", "31"
    )

    var dataArr = data.split('.').toMutableList()
    when (dataArr[1]) {
        "01" -> {
            dataArr[1] = "января"
            if (!month31.contains(dataArr[0])) return "неверный день"
        }

        "02" -> {
            dataArr[1] = "февраля"
            if (dataArr[2].toInt() % 4 == 0) {
                if (!(month28.contains(dataArr[0])) and !(dataArr[0] == "29")) return "неверный день"
            } else if (!month28.contains(dataArr[0])) return "неверный день"
        }

        "03" -> {
            dataArr[1] = "марта"
            if (!month31.contains(dataArr[0])) return "неверный день"
        }

        "04" -> {
            dataArr[1] = "апреля"
            if (!month30.contains(dataArr[0])) return "неверный день"
        }

        "05" -> {
            dataArr[1] = "мая"
            if (!month31.contains(dataArr[0])) return "неверный день"
        }

        "06" -> {
            dataArr[1] = "июня"
            if (!month30.contains(dataArr[0])) return "неверный день"
        }

        "07" -> {
            dataArr[1] = "июля"
            if (!month31.contains(dataArr[0])) return "неверный день"
        }

        "08" -> {
            dataArr[1] = "августа"
            if (!month31.contains(dataArr[0])) return "неверный день"
        }

        "09" -> {
            dataArr[1] = "сентября"
            if (!month30.contains(dataArr[0])) return "неверный день"
        }

        "10" -> {
            dataArr[1] = "октября"
            if (!month31.contains(dataArr[0])) return "неверный день"
        }

        "11" -> {
            dataArr[1] = "ноября"
            if (!month30.contains(dataArr[0])) return "неверный день"
        }

        "12" -> {
            dataArr[1] = "декабря"
            if (!month31.contains(dataArr[0])) return "неверный день"
        }

        else -> return "неверный месяц"
    }
    data = "${dataArr[0]} ${dataArr[1]} ${dataArr[2]}"
    return data
}

/**
 * Результаты спортсмена на соревнованиях в прыжках в длину представлены строкой вида
 * "706 - % 717 % 703".
 * В строке могут присутствовать числа, черточки - и знаки процента %, разделённые пробелами;
 * число соответствует удачному прыжку, - пропущенной попытке, % заступу.
 * Прочитать строку и вернуть максимальное присутствующее в ней число (717 в примере).
 * При нарушении формата входной строки или при отсутствии в ней чисел, вернуть -1.
 */
fun third() {
    var text = readLine()
    println(checker(text!!))
}
fun checker(text: String): Int {
    var s = text

    var symbols = arrayOf('1', '2', '3', '4', '5', '6', '7', '8', '9', '0', ' ', '%', '-')
    for (item in s){
        if(!symbols.contains(item)) return -1
    }

    s = s.replace(" ", "")
    s = s.replace('%', '.')
    s = s.replace('-', '.')
    var arrText = s.split(".")

    var a = 0
    for (item in arrText) {
        if (item.toIntOrNull() == null) continue
        if (a < item.toIntOrNull()!!) a = item.toIntOrNull()!!
    }
    return a
}


