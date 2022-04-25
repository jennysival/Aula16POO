package Moto

class Moto(
    var marca: String,
    var cor: String,
    var modelo: String = "Linda"
) {

    var ano: Int = 0
    var proprietario: String = ""

    fun comprarMoto(precoMoto: Double){
        println("A moto foi comprada por $proprietario no valor de $precoMoto com a cor da moto $cor e da marca $marca")
    }

    fun exibirMarcaEcor(){
        println("A marca da moto é $marca e a cor é $cor")
    }

}