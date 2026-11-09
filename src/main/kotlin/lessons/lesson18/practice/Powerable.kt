package lessons.lesson18.practice

import java.io.InputStream

interface Powerable {
    fun turnOn()
    fun turnOff()
}

interface Openable {
    fun open()
    fun close()
}

// Примеры для дальнейшей практической работы

interface WaterContainer {
    val capacity: Int
    fun fillWater(amount: Int)
    fun getWater(amount: Int)
}

interface TemperatureRegulatable {
    val maxTemperature: Int
    fun setTemperature(temp: Int)
}

interface WaterConnection {
    fun connectToWaterSupply()
    fun getWater(amount: Int)
}

interface AutomaticShutdown {
    val sensorType: String
    val maxSensoredValue: Int
    fun startMonitoring()
}

interface Drainable {
    fun connectToDrain()
    fun drain()
}

interface Timable {
    fun setTimer(time: Int)
}

interface BatteryOperated {
    fun getCapacity(): Double
    fun replaceBattery()
}

interface Mechanical {
    fun performMechanicalAction()
}

interface LightEmitting {
    fun emitLight()
    fun completeLiteEmission()
}

interface SoundEmitting {
    fun setVolume(volume: Int)
    fun mute()
    fun playSound(stream: InputStream)
}

interface Programmable {
    fun programAction(action: String)
    fun execute()
}

interface Movable {
    fun move(direction: String, distance: Int)
}

interface Cleanable {
    fun clean()
}

interface Rechargeable {
    fun getCapacity(): Double
    fun recharge()
}
//Используя эти интерфейсы, реализуй абстрактные классы для бытовой техники:
//
//Электрический чайник - Powerable, WaterContainer, Timable

//class ElectricKettle() :
//    Powerable,
//    WaterContainer,
//    TemperatureRegulatable,
//    AutomaticShutdown {
//
//}

//Пылесос - Powerable, Movable, Cleanable

//class VacuumCleaner() : Powerable, Openable, Movable, Programmable

//Микроволновая печь - Powerable, Openable, Timable, TemperatureRegulatable
//Портативная колонка - BatteryOperated, SoundEmitting, Rechargeable

//class SoundBarPortable() : Powerable, Rechargeable, SoundEmitting, LightEmitting

//Духовка - Powerable, TemperatureRegulatable, Timable, Openable
//Блендер - Powerable, Openable, Cleanable
//Водонагреватель - Powerable, WaterContainer, TemperatureRegulatable

abstract class WaterHeater() : Powerable, WaterContainer, WaterConnection, TemperatureRegulatable, AutomaticShutdown

//Игрушечный автомобиль - BatteryOperated, Movable, SoundEmitting
//Увлажнитель воздуха - Powerable, WaterContainer, LightEmitting
//Электрическая зубная щётка - BatteryOperated, Rechargeable, Cleanable
//Вентилятор - Powerable, Movable (направление воздушного потока)
//Умный дверной замок - BatteryOperated, Programmable, Openable
//Напиши функцию, которая принимает объект типа Powerable и выключает его.

fun turnOn(power: Powerable) {
    power.turnOn()
}

//Примени эту функцию к разным объектам, которые создавали в предыдущем задании
//(Электрический чайник, Холодильник, Механические часы)

//fun main() {
//    val householdAppliances = listOf<Powerable>(ElectricKettle(), VacuumCleaner(), SoundBarPortable())
//    householdAppliances.forEach {turnOn(it)}
//}