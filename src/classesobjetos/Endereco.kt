package classesobjetos

class Endereco {
    var rua: String = "Rua Teste"
    var numero: String = "222"
    var cep: String = "00000-000"

    fun exibirEndereco(){
        println("Endereço cadastrado é: $rua, $numero. $cep")
    }
}