fun main() {
println("Ejercicio 1")
    println(esPar(4))

println("Ejercicio 2")
    println(compararTexto("hola", "hoLa"))
println("Ejercicio 3")
    println(esMayorque10YMenorQue20(15,15))
println("Ejercicio 4")
    println(evaluarCalificacion(48))
println("Ejercicio 5")
    ///////////////
println("Ejercicio 6")
    var a= intArrayOf(5,4,3,2)
    var b=invertirArray(a)
    for( i in 0.. a.size-1){
        print(b[i])
    }
println("Ejercicio 7")
    /////////////
println("Ejercicio 12")
    imprimirNumerosPositivos()

}
//1. Escribe una función llamada esPar que tome un número como argumento y devuelva true si es par y false si es impar.
fun esPar(a:Int):Boolean{
    if(a%2==0) return true
    else return false
}
//2. Crea una función llamada compararTexto que tome dos cadenas de texto como argumentos y determine si son iguales
// utilizando tanto equals() como el operador ==.
fun compararTexto(a: String, b:String):Boolean{
    if(a==b && a.equals(b)) return true
    else return false
}
//3. Implementa una función llamada esMayorQue10YMenorQue20 que tome dos números como argumentos y devuelva true si
// ambos números son mayores que 10 y menores que 20, y false en caso contrario.
fun esMayorque10YMenorQue20(a:Int,b:Int):Boolean{
    if(a>10 && b>10 && a<20 && b<20) return true
    else return false
}
//4. Crea una función llamada evaluarCalificacion que tome la calificación de un estudiante (un número entre 0 y 100)
// como argumento y devuelva una letra de calificación (A, B, C, D, F) utilizando una estructura when.
fun evaluarCalificacion(a:Int):Char{
    when(a){
        in 0..20 -> return 'F'
        in 21..40 -> return 'D'
        in 41..60 -> return 'C'
        in 61..80 -> return 'B'
        in 81..100 -> return 'A'
        else -> return '0'

    }
}
//5. Define una función llamada sumarNumeros que tome un número variable de argumentos utilizando vararg y devuelva la
// suma de todos los números.

//6. Implementa una función llamada invertirArray que tome un array de números como argumento y devuelva un nuevo array
// con los elementos en orden inverso.
fun invertirArray(a:IntArray):IntArray{
    return a.reversed().toIntArray()
}

//7. Crea una lista inmutable de nombres de frutas y agrega una fruta adicional a la lista.
//En el main
//8. Utiliza una lista mutable para almacenar nombres de colores y elimina un color de la lista.
//En el main
//9. Escribe una función llamada imprimirNumeros que utilice un bucle for para imprimir los números del 1 al 10.
fun imprimirNumeros(){
    for (i in 1..10){
        println(i)
    }
}
//10. Define una función llamada imprimirLista que tome una lista de números como argumento y utilice un bucle forEach
// para imprimir cada número en la lista.
fun imprimirLista(a:IntArray){
    a.forEach { println(it) }
}
//11. Implementa una función llamada imprimirNumerosHastaN que tome un número como argumento y utilice un bucle while
// para imprimir los números del 1 al número dado.
fun imprimirNumerosHastaN(a: Int){
    var i=1
    while(i<a){
        println(i)
        i++
    }
}
//12. Crea una función llamada imprimirNumerosPositivos que utilice un bucle do-while para imprimir números positivos
// hasta que se alcance un número negativo.
fun imprimirNumerosPositivos(){
    var i=2147483641
    do{
        println(i)
        i++
    }while(i>=0)
}
//13. Define una función llamada esPrimo que tome un número como argumento y devuelva true si es primo y false si no lo
// es. Utiliza una declaración return para salir de la función una vez que se determine si el número es primo.
fun esPrimo(a: Int): Boolean{
    var bool = true
    var raiz=Math.sqrt(a.toDouble())
    for(i in 2..raiz.toInt()){
        if(a%i==0) bool = false
    }
    return bool
}
//14. Implementa una función llamada encontrarPrimoMayorQue100 que utilice un bucle for para encontrar el primer número
// primo mayor que 100. Utiliza una declaración break para salir del bucle una vez que se encuentre el número primo.
