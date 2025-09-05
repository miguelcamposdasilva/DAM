package clase5

open class Mascota( val nombre: String, var edad: Int){
    open fun info(){
        println("Nombre: $nombre || Edad: $edad")
    }

}

class Gato(nombre: String, edad: Int, var colorPelaje: String): Mascota( nombre, edad){
    fun correr(){
        println("El gatito está corriendo!!")
    }

    override fun info() {
        println("Nombre: $nombre || Edad: $edad || Pelaje: $colorPelaje")
    }
}

class Pez(nombre: String, edad:Int, var sangreFria: Boolean): Mascota (nombre,edad){
    fun nadar(){
        println("El pececito está nadando!!")
    }

    override fun info(){

        var estadoSangre= ""
        if(sangreFria == true) {
            estadoSangre = "Es de sangre fria"
        }
        else{
            estadoSangre = "Es Sangre caliente "
        }
        println("Nombre: $nombre || Edad: $edad || Sangre Fria: $estadoSangre")
    }
}

fun main(){
    val gatoMascota = Gato("Gatito", 20,"Blanco")
    gatoMascota.info()
    gatoMascota.correr()

    val pezMascota = Pez("Pececito", 60, true)
    pezMascota.info()
    pezMascota.nadar()
}