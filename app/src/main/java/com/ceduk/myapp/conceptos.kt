package com.ceduk.myapp

fun main() {
//    println(saludar("Juan"))
//    println(suma(10,5))
//    println(resta(10,5))

//    val operacion = obtenerOperacion("resta")
//    val resultado = operacion(5,3)

    //val cuadrado: (Int) -> Int = {num -> num * 2}
    //println(cuadrado(16))


    //println(numeros.sumarElementos())

//    numeros.forEach {
//        println( it * 2)
//    }

//    val duplicar: (Int) -> Int = { it * 2}
//    println(duplicar(6))

//    val texto = "Kotlin"
//    println(texto.reversa())
//    val juan = Persona("Juan")
//    juan.saludar()

//    val ejemplo = Ejemplo()
//    ejemplo.mensaje()

    val numeros = listOf(1,2,3,4,5)
    val cuadrados = numeros.map { it + it}
    val pares = numeros.filter { it % 2 == 0 }
    val sumaTotal = numeros.reduce { acc, i -> acc + i}
    val numerosMutable = mutableListOf(1,2,3,4,5)

    println(numerosMutable)
    numerosMutable.add(20)
    println(numerosMutable)

    println("Cuadrados: $cuadrados")
    println("Pares: $pares")
    println("SumaTotal: $sumaTotal")



}

fun tiposDeDatos(){
    // Este es un comentario de una línea.

    /*
    * Es es un comentario de varias líneas
    * */

    /*
    * Tipos de datos
    */

    // Numericos
    val byteExample1: Byte = 127;
    val shortExample1: Short = -32768;
    var intExample1: Int = 214748364;
    val longExample1: Long = 2147483648;

    // Decimales
    val floatExample1: Float = 3.141592f;
    val doubleExample1: Double = 3.141592653589793;

    // Strings
    val charExample1: Char = 'a';
    val stringExample1: String = "Esto es una cadena de texto";

    //Boolean
    val verdadero: Boolean = true;
    val falso: Boolean = false;

    intExample1 = 2147483;
    //print(intExample1);
}

fun tiposDeOperadores(){
    /*
    * Tipos de operadores
    * - Aritmeticos (+,-,*,/,%)
    * - Lógicos (||,&&, !)
    * - Relacionales (<,>,=,===,<=,>=,!=)
    */

    var num1: Int = 40;
    var num2: Int = 20;
    var num3: Int = 50

    var suma: Int = num1 + num2;
    var resta: Int = num1 - num2;
    var multiplicacion: Int = num1 * num2;
    var division: Double = num1.toDouble() / num2.toDouble();

    var string1: String = "El resultado ";
    var string2: String = "de la operacion es:"

    // ¿num1 es menor que num2?
    if (num1 < num2) {
        println("El numero $num1 es menor que $num2");
    } else if(num1 > num3) {
        println("El numero $num1 es mayor que $num3");
    } else if(num1 > num3) {
        println("El numero $num1 es mayor que $num3");
    } else if(num1 > num3) {
        println("El numero $num1 es mayor que $num3");
    } else if(num1 > num3) {
        println("El numero $num1 es mayor que $num3");
    } else if(num1 > num3) {
        println("El numero $num1 es mayor que $num3");
    } else {
        println("Es el numero de en medio.");
    }


    val diaDeLaSemana: String = "Domingo"

    when (diaDeLaSemana) {
        "Lunes" -> println("El dia de la semana es: Lunes")
        "Martes" -> println("El dia de la semana es: Martes")
        "Miercoles" -> println("El dia de la semana es: Miercoles");
        "Jueves" -> println("El dia de la semana es: Jueves")
        "Viernes" -> println("El dia de la semana es: Viernes")
        "Sabado" -> println("El dia de la semana es: Sabado")
        else -> println("El dia de la semana es: Domingo")
    }
}

fun saludar(name: String): String{
    return "Hola $name, bienvenido a Kotlin"
}

fun suma(numA: Int, numB: Int): Int{
    return numA + numB
}

fun resta(numA: Int, numB: Int) = numA - numB

fun operar(numA: Int, numB: Int, operacion: (Int,Int) -> Int): Int {
    return operacion(numA,numB)
}

fun obtenerOperacion(tipo: String): (Int, Int) -> Int {
    return when (tipo){
        "suma" -> {x, y -> x + y}
        "resta" -> {x, y -> x - y}
        "multiplicacion" -> {x, y -> x * y}
        "division" -> {x, y -> x / y}
        else -> { _, _ -> 0}
    }
}

fun String.reversa(): String {
    return this.reversed()
}

/*fun Persona.saludar(){
    println("Hola, mi nombre es $nombre")
}*/

fun List<Int>.sumarElementos(): Int {
    return this.sum()
}

/* Clases */
//class Persona(val nombre: String)

class Ejemplo {
    public fun mensaje() {
        println("Esto es un mensaje")
    }
}