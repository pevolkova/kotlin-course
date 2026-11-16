package lessons.lesson19.homework

interface Mapper<T, R> {
    fun convert(incoming: T): R
    fun convertList(incomingList: List<T>): List<R>
}