package clase4

fun main(){

    val charmander= Pokemon("charmander", 40,80)
    val newtwo = Pokemon("NewTwo", 300,450)

    charmander.informacion()
    newtwo.informacion()

    charmander.sePreparaParaLaBatalla()
    newtwo.recibeDano(charmander.atk)
    newtwo.sePreparaParaLaBatalla()
    charmander.recibeDano(newtwo.atk)


    //charmander.recibeDano(30)
    //charmander.recibeDano(30)
    // charmander.recibeDano(20)


}

class Pokemon(
    val nombre: String,
    val atk: Int,
    var hp: Int,

){
    fun sePreparaParaLaBatalla(){
        println("El $nombre se prepara para la batalla")
    }
    fun informacion(){
        println("$nombre - ATK: $atk HP: $hp")
    }
    fun recibeDano(dano:Int){
        println("$nombre recibe $dano puntos de daño")
        hp = hp - dano
        println("Ahora le quedan $hp puntos")
        if(hp<0){
            println("$nombre se ha DEBILITADO!!!")
        }
    }
}