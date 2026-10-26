package lessons.lesson14.homework

//3. Природное явление: луна. Создайте объект Moon, который будет
//представлять Луну. Добавьте свойства isVisible (Boolean), чтобы
//отображать, видна ли Луна в данный момент, и phase (String), чтобы
//отображать текущую фазу Луны (например, "Full Moon", "New Moon").
//Добавьте метод showPhase(), который выводит текущую фазу Луны.

object Moon {
    var isVisible = true
    var phase: String = ""
    fun showPhase() {
        if (isVisible) println("You can see the Moon's phase $phase.")
        else println("The Moon's phase is $phase, but you can't see it.")
    }
}