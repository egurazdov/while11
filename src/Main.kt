fun main() {
//    Пользователь вводит с клавиатуры число. Требуется посчитать факториал числа.
//    Например, если введено 3, факториал числа 1*2*3 = 6.
    println("Задание 1")
    println("Введите число факториал которого надо посчитать")
    var input = readln().toInt()
    var factorial = input
    while (input-- > 1) factorial *= input
    println(factorial)
    println("")
//    Дано вещественное число — цена 1 кг конфет. Вывести стоимость 1, 2, …, 10 кг конфет.
    println("Задание 2")
    val price = 36.6
    var i = 0
    while (i++ < 10) println("цена $i кг конфет = " + String.format("%.1f", price * i))
    println("")


//    Даны два целых числа A и B (A<B).
//    Вывести в порядке возрастания все целые числа, расположенные между A и B (включая сами числа A и B),
//    а также количество N этих чисел.
    println("Задание 3")
    val a = 3
    val b = 12
    var j = a - 1
    println("Всего колличество чисел " + (b - j) + " в диапазоне от $a до $b")
    while (j++ < b) println(j)
    println("")

//    Дано целое число N (>0). Используя операции деления нацело и взятия остатка от деления,
//    вывести все его цифры, начиная с самой правой.
    println("Задание 4")
    val n = 9475675
    var m = n % 10
    var o = n / 10
    while (o != 0) {
        println(m)
        m = o % 10
        o /= 10
    }
    println(m)
    println("")


//    Напишите программу, в которой выводятся на экран числа от 1 до 20 включительно со следующими условиями:
//    если числа нечетные – их не выводить на экран, если делятся на 4 без остатка – умножаем на 2,
//    если число равно 19 завершаем программу.
    println("Задание 5")
    var c = 0
    while (c++ < 20) {
        if (c % 4 == 0) println(c * 2)
        else if (c % 2 == 0) println(c)
        else if (c == 19) break
    }
    println("")


//    За каждый месяц банк начисляет к сумме вклада 7% от суммы. Напишите программу,
//    в которой вычисляется конечная сумма вклада с учетом начисления процентов за каждый месяц.
//    Сумма вклада равна 350, количество месяцев – 9.
    println("Задание 6")
    var deposit = 1000.0
    var month = 0
    println("Ваш стартовый депозит равен $deposit, при ставке 7% ежемесячно через 9 месяцев Вы получите")
    while (month++ < 9) deposit *= 1.07
    println(String.format("%.2f", deposit))

}