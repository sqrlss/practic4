
import kotlin.math.sqrt
import kotlin.math.pow
fun main()

{
    println("Введите значение a ");
    val a :Float = readLine()!! .toFloat();
    println("Введите значение b ");
    val b :Float = readLine()!! .toFloat();
    println("Введите значение c ");
    val c :Float = readLine()!! .toFloat();
    val s = b.pow(2) - 4 * a * c
    if (s > 0 || s == null)
    {
        val x1 = (-b + s) / (2 * a)
        val x2 = (-b - s) / (2 * a)
        println("Первый корень $x1")
        println("Второй корень $x2")
    }
    else
    {
        println("Корней нет.")
    }
}


