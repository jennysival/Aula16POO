package Carro

fun main() {
    val hondaCivic: Carro = Carro(valorCarro = 35.500, proprietario = "Jenny")
    hondaCivic.correr()
    hondaCivic.modelo = "Sedan"
    println("Honda Civic é ${hondaCivic.modelo} e ${hondaCivic.cor}")
    println("Valor: ${hondaCivic.valorCarroAtributo}. Proprietário: ${hondaCivic.nomeProprietario}")
    println(hondaCivic.exibirModelo(modeloCarro = "Civic"))

    val porche: Carro = Carro(valorCarro = 25.000, proprietario = "Jess")
    porche.correr()
    porche.modelo = "Esportivo"
    porche.cor = "Vermelho"

    println("Porche é ${porche.modelo} e ${porche.cor}")
    println("Valor: ${porche.valorCarroAtributo}. Proprietário: ${porche.nomeProprietario}")
}