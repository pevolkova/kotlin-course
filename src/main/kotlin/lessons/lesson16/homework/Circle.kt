package lessons.lesson16.homework

import kotlin.math.PI

//Переопределите метод area() в каждом классе-наследнике для расчета площади
//соответствующей фигуры.
//Подсказка: каждый класс должен иметь аргументы конструктора, позволяющие
//вычислить площадь (для круга это радиус, для квадрата это сторона, для
//треугольника это две стороны и угол между ними)

class Circle(val radius: Double) : Shape() {
    override fun area(): Double {
        return PI * radius * radius
    }
}