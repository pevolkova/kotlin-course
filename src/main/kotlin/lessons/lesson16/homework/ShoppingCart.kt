package lessons.lesson16.homework

import kotlin.collections.set

//Класс “Корзина товаров”: содержит поле словаря из ID товаров и их количества.
//Базовый метод addToCart(itemId) добавляет одну единицу товара к уже
//существующим в корзине.

class ShoppingCart(val items: MutableMap<String, Int> = mutableMapOf("Апельсины" to 5)) {
    fun addToCart(itemId: String) {
        if (items.containsKey(itemId)) {
            val newItemsNumber = items.getValue(itemId) + 1
            items[itemId] = newItemsNumber
        } else items[itemId] = 1
        println(items)
    }

    fun addToCart(itemId: String, amount: Int) {
        if (items.containsKey(itemId)) {
            val newItemsNumber = items.getValue(itemId) + amount
            items[itemId] = newItemsNumber
        } else items[itemId] = amount
        println(items)
    }

    fun addToCart(idAndAmount: Map<String, Int>) {
        items.putAll(idAndAmount)
        println(items)
    }

    fun addToCart(ids: List<String> = listOf()) {
        ids.forEach {
            if (items.containsKey(it)) {
                val newItemsNumber = items.getValue(it) + 1
                items[it] = newItemsNumber
            } else {
                items[it] = 1
            }
        }
        println(items)
    }

    override fun toString(): String {
        //1. Сделать шапку наименование/кол-во
        //2. Вывести строки со значениями
        //3. Всего артикулов
        //4. Всего товаров
        val firstString = "Наименование\tКоличество"
        val secondString = items.map { "${it.key}\t\t\t${it.value}" }.joinToString("\n")
        val thirdString = "Всего артикулов: ${items.keys.size}"
        val fourthString = "Всего товаров: ${items.values.sum()}"
            return firstString + "\n" + secondString + "\n" + thirdString + "\n" + fourthString
    }
}

fun main() {
    val shoppingCart = ShoppingCart()
    shoppingCart.addToCart("Мандарины")

    shoppingCart.addToCart("Киви", 8)
    shoppingCart.addToCart("Киви", 8)

    shoppingCart.addToCart(mapOf("Яблоки" to 3, "Тыква" to 1, "Груши" to 4))

    shoppingCart.addToCart(listOf("Брусника", "Малина", "Яблоки", "Тыква"))
    println(shoppingCart.toString())
}