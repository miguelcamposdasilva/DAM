package PracticaPrueba1

fun main() {
    val numeros = mutableListOf(30,4,11,21,7,35)  // cree una lista con todos los elementos pares

    var pares = numeros.filter{ it%2 ==0}
    println("Elementos Pares: $pares")

    //Encuentre el primer elemento que sea menor a 10
    var primero = numeros.find{ it<10}
    println("First element < 10: $primero" )

    //Multiplique cada elemento de la lista *2
    var mul = numeros.map{it*2}
    println("Resultado multiplicacion de numeros de la lista:$mul")

    //suma el primer y ultimo elemento de la lista
    val primer = numeros.first()
    val ultimo = numeros.last()
    val resultado = primer + ultimo
    println("Resultado suma primer y ultimo elemento: $resultado")

    //Agregue [ 4, 4, 4] a la variable números.
    val numeros2 = mutableListOf(4,4,4)
    val resultadoLista = numeros + numeros2
    println("Nueva lista: $resultadoLista")

    //encuentre el primer elemento dividido por 7
    var dividido7 = numeros.first{ it%7 == 0}
    println("Numeros divisibles por 7: $dividido7")

    //sume todos los elementos que sean pares
    var sumarPares = resultadoLista.filter{it%2==0}.sum()
    println("Suma de pares: $sumarPares")

    //encuentre el primer elemento que sea impar y mayor a 10
    var primerImpar= resultadoLista.first{it%2!=0 && it >10}
    println("$primerImpar")
}