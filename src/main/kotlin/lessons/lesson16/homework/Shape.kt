package lessons.lesson16.homework

//Абстрактный (базовый) класс: Shape с open методом area().
//Метод area() возвращает 0.0.
//Создай набор геометрических фигур и выведи в цикле их площадь

fun main() {
    val circle = Circle(2.8)
    println(circle.area())

    val square = Square(13.4)
    println(square.area())

    val triangle = Triangle(2.1, 1.4, 17.9)
    println(triangle.area())

    val setShapes: Set<Shape> = setOf(circle, triangle, square)
    setShapes.forEach { println(it.area()) }
}

abstract class Shape {
    abstract fun area(): Double
}