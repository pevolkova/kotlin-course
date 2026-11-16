package lessons.lesson19.homework

interface Validator<T> {
    fun validate(incomingValue: T?): Boolean
}