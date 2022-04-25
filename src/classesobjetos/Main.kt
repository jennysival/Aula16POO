package classesobjetos

fun main() {
    val endereco: Endereco = Endereco()

    //val nome: String = "Jenny"

    val casaUbatubaJessica: PlantCasa = PlantCasa()

    casaUbatubaJessica.construir()

    casaUbatubaJessica.exibirInformacoesDonaCasa()

    println("A casa tem ${casaUbatubaJessica.comodos} cômodos")


}