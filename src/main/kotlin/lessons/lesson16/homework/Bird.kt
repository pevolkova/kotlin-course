package lessons.lesson16.homework

import lessons.lesson16.practice.Background
import lessons.lesson16.practice.Colors
import lessons.lesson16.practice.printColored

//Переопределите метод makeSound() в каждом классе-наследнике, чтобы Dog
//выводил "Bark", Cat - "Meow", Bird - "Tweet". Обогати вывод звуков цветом.

class Bird: Animals() {
    override fun makeSound() {
        printColored("This animal tweets.", Colors.YELLOW, Background.BLACK)
    }
}