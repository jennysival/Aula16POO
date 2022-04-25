package Carro

class Carro(valorCarro: Double, proprietario: String) {
    var cor = "preto"
    var marca = "Honda"
    var modelo = "Civic"
    var nomeProprietario = proprietario
    var valorCarroAtributo = valorCarro

    fun correr(){
        println("O carro está correndo...")
    }

    fun exibirModelo(modeloCarro: String){
        println("O modelo é $modeloCarro")
    }
}