package clase3

fun main(){

    validacionEdad(21)

    validacionEdad(14)

    validacionEdad(11)

    validacionEdad(60)
}

fun validacionEdad(edad: Int){
    println("La edad es de $edad")
    if(edad >= 18){
        println("Es mayor de edad")
    }
    else{
        println("Es menor de edad")
    }
}


