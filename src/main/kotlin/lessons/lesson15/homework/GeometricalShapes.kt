package lessons.lesson15.homework

//1. Геометрические Фигуры
//  1. Базовый класс: Геометрическая Фигура
//      1. Производные классы: Многоугольник, Круг
//          1. Дополнительное разветвление для Многоугольник: Треугольник, Четырехугольник

abstract class GeometricalShapes(val dimension: String) {
}

open class Polygon(
    val numberCorners: Int
) : GeometricalShapes("2D")

class Circle(
    val radius: Double,
    dimension: String = "2D"
) : GeometricalShapes(dimension)

class Triangle(
    val side1: Double,
    val side2: Double,
    val side3: Double
): Polygon(3)

class Square(
    val side: Double,
    numberCorners: Int = 4
): Polygon(numberCorners)
