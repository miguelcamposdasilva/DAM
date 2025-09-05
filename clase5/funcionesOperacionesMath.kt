package clase5

fun main(){
    println(verificador(20,10))
    println(verificador(10,20))

}

fun verificador(elemento1:Int, elemento2:Int) : Boolean{
    //verificamos si el elemento 1 es mayor a elemento2

    if(elemento1 > elemento2){
        return true
    }
    else{
        return false
    }

}