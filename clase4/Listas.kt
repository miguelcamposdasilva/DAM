package clase4

fun main(){
    var lista = mutableListOf(1,2,5) //[1,2,5]
    lista.add(5)
    lista.add(5)
    lista.add(5)
    println("lista: $lista")


    var conjunto = mutableSetOf(1,2,3,4,5) // el setOf no permite elementos duplicados, para lograrlo tenemos que usar mutableSetOf
    lista.add(5)
    lista.add(5)
    lista.add(5)
    println("Conjunto: $conjunto")

    var mapa = mapOf("nombre" to "Juan", "edad" to "9", "dolares" to 1000)
    println("mapa: $mapa")

    var lista2 = mutableListOf(1,2,5,8,10,33,67,100) // [1,2,5]
    lista2.add(5)
    lista2.add(5)
    lista2.add(5)
    println("lista: $lista2")

    var filtrado = lista.filter{it % 2 ==0}
    println("filtrado: $filtrado")

    var doble = lista.map{it + 1}
    println("doble: $doble")

    var sumatoria = lista.sum()
    println("sumatoria: $sumatoria")

    var buscarElPar = lista.find{it % 2== 0}
    println("buscaElPar: $buscarElPar")

    var buscarElImpar = lista.find{it % 2!= 0}
    println("buscaElImpar: $buscarElImpar")

    var primerElemento = lista.first()
    println("primerElemento: $primerElemento")

    var ultimoElemento = lista.last()
    println("ultimoElemento: $ultimoElemento")

    for(i in lista){
        println("El elemento de la lista es: $i")
    }

    var informacion = mapOf("nombre" to "fernanda", "edad" to 28)
    informacion.forEach{(llave, valor) ->
        println("La llave es $llave y el valor es $valor")}

}

// %2 ==0 (numero par)
//%2!= 0 (numero impar)
//find busca el primer elemento de la condicion dada
//filter busca en la lista y le da una condicion. La convierte en un array y filtra por lo que estes buscando
//