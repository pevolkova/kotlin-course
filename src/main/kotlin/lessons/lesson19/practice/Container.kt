package lessons.lesson19.practice

import kotlin.math.max

class Container<T>(private val item: T) {
    fun getItem(): T = item
}

class PairBox<K, V>(
    private val key: K,
    private val value: V
) {
    fun getMap(): Map<K, V> = mapOf(key to value)
}

class Multiplier<T : Number> {
    fun multiplyByTwo(value: T): Double = value.toDouble() * 2
}

class NullableBox<T> {
    fun isNull(value: T?): Boolean = value == null
}

interface Storage<T> {
    fun save(item: T)
    fun get(): T
}

interface Transformer<T, R> {
    fun convert(item: T): R
}

interface PairProcessor<T, R> {
    fun process(a: T, b: R)
}

interface ConnectorDifferent<T, R, S> {
    fun connect(a: List<T>, b: List<R>): List<S>
}

fun <T> swap(
    list: MutableList<T>,
    index1: Int,
    index2: Int
): List<T> {
    val a = list[index1]
    val b = list[index2]
    list.add(index2, a)
    list.add(index1, b)
    return list.toList()
}

//Напишите функцию mergeLists с дженериком ограниченным типом Number, которая
//принимает два списка типа T и возвращает список Double с суммой элементов списка.
//Если списки разных размеров, то отсутствующие элементы принимать за ноль.

fun <T : Number> mergeLists(a: List<T>, b: List<T>): List<Double> {
    val maxListSize = max(a.size, b.size)
    val listNew = mutableListOf<Double>()
    for (i in 0..<maxListSize) {
        val c = a.getOrNull(i)?.toDouble() ?: 0.0
        val d = b.getOrElse(i) { 0 }.toDouble()
        listNew.add(c + d)
    }
    return listNew.toList()
}

