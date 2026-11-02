package lessons.lesson16.homework

//Базовый класс: Animal с методом makeSound().
//Классы наследники: Dog, Cat, Bird.
//Базовый метод makeSound() в классе Animal выводит "This animal makes no
//sound."
//Создайте список животных List<Animal> и вызовите в цикле метод makeSound()

abstract class Animals {
    open fun makeSound() {
        println("This animal makes no sound.")
    }
}