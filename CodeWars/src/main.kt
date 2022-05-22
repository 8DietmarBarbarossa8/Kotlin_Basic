fun main(){
    println("_________________________________________")
    println(addLetters(listOf('a', 'b', 'c')))
    println(addLetters(listOf('z')))
    println(addLetters(listOf('a', 'b')))
    println(addLetters(listOf('c')))
    println(addLetters(listOf('z', 'a')))
    println(addLetters(listOf('y', 'c', 'b')))
    println(addLetters(listOf()))
    println("---")
    println(repeats(intArrayOf(4, 5, 7, 5, 4, 8)))
    println(repeats(intArrayOf(9, 10, 19, 13, 19, 13)))
    println(repeats(intArrayOf(16, 0, 11, 4, 8, 16, 0, 11)))
    val range = 'a'..'z'
    for (r in range)
        println("$r - ${r.toInt()}")
    println("_________________________________________")
    println(moveTen("testcase"))
    println(moveTen("codewars"))
    println(moveTen("exampletesthere"))
    println("_________________________________________")
    println('a'.toInt())
    println('a'.toInt() - 96)
    println("_________________________________________")
    println(nameValue(arrayOf("abc", "abc abc")).toList())
    println(nameValue(arrayOf("codewars", "abc", "xyz")).toList())
    println(nameValue(arrayOf("abcdefghijklmnopqrstuvwxyz", "stamford bridge", "haskellers")).toList())
    println(predictAge(65, 60, 75, 55, 60, 63, 64, 45))
    println("_________________________________________")
    println(containAllRots("bsjq", arrayListOf("bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs")))
    println(containAllRots("XjYABhR", arrayListOf("TzYxlgfnhf", "yqVAuoLjMLy", "BhRXjYA", "YABhRXj", "hRXjYAB",
        "jYABhRX", "XjYABhR", "ABhRXjY")))
    println("_________________________________________")
    println(duplicates(intArrayOf(1, 2, 5, 6, 5, 2)))
    println(duplicates(intArrayOf(1, 2, 2, 20, 6, 20, 2, 6, 2)))
    println(duplicates(intArrayOf(0, 0, 0, 0, 0, 0, 0)))
    println(duplicates(intArrayOf(100, 100)))
    println("_________________________________________")
    println(evenNumbers(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9), 3))
    println("_________________________________________")
    val arrAny = arrayOf<Any>(2,3,"fda",5, "ee", "@@@", 123, 5467)
    println(DoubleSort.dbSort(arrAny).toList())
    println("_________________________________________")
    println(growingPlant(100, 10, 910))
    println(growingPlant(10,9,4))
    println("_________________________________________")
    println(babyCount("baby"))
    println(babyCount("abby"))
    println(babyCount("babybaby"))
    println(babyCount("Why the hell are there so many babies?!"))
    println(babyCount("Anyone remember life before babies?"))
    println(babyCount("Happy babies boom ba by?"))
    println(babyCount("bbbbbaay"))
    println(babyCount("none"))
    println(babyCount("aby"))
    println(babyCount(""))
}