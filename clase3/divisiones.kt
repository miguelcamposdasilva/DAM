package clase3


fun main(){
    dividir(10,5)
    dividir(20,10)
    dividir(1,0)
    dividir(200,100)
}
fun dividir(a:Int, b: Int){
    println("Voy a dividir $a entre $b")
    if (b!= 0){
        println(a/b)
    }
    else{
        println("No se puede dividir por cero")
    }
}
