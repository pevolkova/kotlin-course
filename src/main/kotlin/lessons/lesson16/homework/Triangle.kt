package lessons.lesson16.homework

import kotlin.math.sin

//Переопределите метод area() в каждом классе-наследнике для расчета площади
//соответствующей фигуры.
//Подсказка: каждый класс должен иметь аргументы конструктора, позволяющие
//вычислить площадь (для круга это радиус, для квадрата это сторона, для
//треугольника это две стороны и угол между ними)

class Triangle(
    val side1: Double,
    val side2: Double,
    val angle: Double
) : Shape() {
    override fun area(): Double {
        val angleRadians = Math.toRadians(angle)
        return 0.5 * side1 * side2 * sin(angleRadians)
    }
}