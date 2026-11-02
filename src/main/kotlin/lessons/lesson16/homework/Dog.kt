package lessons.lesson16.homework

import lessons.lesson16.practice.Colors
import lessons.lesson16.practice.printColored

//Переопределите метод makeSound() в каждом классе-наследнике, чтобы Dog
//выводил "Bark", Cat - "Meow", Bird - "Tweet". Обогати вывод звуков цветом.
//Создайте список животных List<Animal> и вызовите в цикле метод makeSound()

fun main() {
    val dog = Dog()
    dog.makeSound()

    val cat = Cat()
    cat.makeSound()

    val bird = Bird()
    bird.makeSound()

    val allAnimals: List<Animals> = listOf(cat, dog, bird)
    allAnimals.forEach { it.makeSound() }
}

class Dog: Animals() {
    override fun makeSound() {
        printColored("This animal barks.", Colors.GREEN)
    }
}