package classesobjetos

class PlantCasa {
    var quantidadePortas = 4
    var comodos = 6
    var areaCasa: Double = 250.00
    var nomeDono = "Jessica"
    var nomeArquiteto = "Carol"

    fun construir(){
        println("Construindo a casa...")
    }

    fun pintarCasa(){
        println("Pintando a casa...")
    }

    fun exibirInformacoesDonaCasa(){
        println("Proprietária: $nomeDono")
    }
}