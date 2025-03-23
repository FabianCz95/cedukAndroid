package com.ceduk.myapp

fun main() {
//    val pedro = Persona("Pedro", 19)
//    val juan = Persona("Juan", 20)
//    val cesar = Persona("Cesar", 25)

//    val cuenta = CuentaPremium(200.00)
//    cuenta.depositar(40.0)
//    cuenta.aplicarIntereses(0.1)
//    println("Saldo en cuenta premium: ${cuenta.verSaldo()}")


    val miAnimal = Animal()
    val miPerro = Perro()
    val miGato = Gato()




    miAnimal.caminar()
    miAnimal.sonido()
    miPerro.sonido()
    miPerro.caminar()
    miGato.sonido()
    miGato.caminar()


}

fun bucleFor(numeros: List<Int>){
    for (numero in numeros){
        if (numero % 2 != 0) {
            println(numero)
        } else {
            continue
        }

    }
}

fun bucleWhile() {
    var contador = 10
    while (contador >= 0){
        println("Cuenta atrás: $contador")
        contador--
    }
}

class Persona(val nombre: String, var edad: Int){

    init {
        println("${this.nombre} ha sido registrado con ${this.edad} anios")
    }

    fun saludar(){
        println("Hola, soy ${this.nombre} y tengo ${this.edad} anios\"")
    }
}

open class CuentaBancaria(protected var saldo: Double) {
    fun depositar(monto: Double){
        saldo += monto
    }

    fun verSaldo() = println(saldo)
}

class CuentaPremium(saldo: Double): CuentaBancaria(saldo) {
    fun aplicarIntereses(tasa: Double) {
        saldo += saldo * tasa
    }
}

open class Animal {
    open fun sonido() {
        println("Haciendo un sonido")
    }

    open fun caminar(){
        println("Avanza hacia adelante")
    }
}

class Perro: Animal() {
    override fun sonido() {
        println("Guau guau")
    }
}

class Gato: Animal(){
    override fun sonido(){
        println("Miau miau")
    }
}