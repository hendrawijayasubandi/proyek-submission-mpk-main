/****************************************************************************************************
 *                               Perhatian                                                          *
 *                                                                                                  *
 *          Agar dapat diperiksa dengan baik, hindari beberapa hal berikut:                         *
 *                                                                                                  *
 *          1. Mengubah kode yang berada di dalam fungsi main()                                     *
 *          2. Mengubah atau menghapus kode yang sudah ada secara default                           *
 *          3. Membuat fungsi baru yang bukan merupakan tugas latihan                               *
 *          4. Mengubah struktur project (menghapus, mengedit, dan memindahkan package)             *
 *                                                                                                  *
 ***************************************************************************************************/

package com.dicoding.exam.latihan2

fun calculate(valueA: Int, valueB: Int, valueC: Int?): Int {
    return if (valueC == null) {
        valueA + (valueB - (valueC ?: 50))
    } else {
        valueA + (valueB - valueC)
    }
}

fun result(result: Int): String {
    return "Result is ${result}"
}

fun main() {
    val valueA = 101
    val valueB = 52
    val valueC = 99

    val resultA = calculate(valueA, valueB, valueC)
    val resultB = calculate(valueA, valueB, null)

    println("""
        ${result(resultA)}
        ${result(resultB)}
    """.trimIndent())
}