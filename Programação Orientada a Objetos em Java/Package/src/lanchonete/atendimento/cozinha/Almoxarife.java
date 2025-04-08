package lanchonete.atendimento.cozinha;

public class Almoxarife {
    private void controlarEntrada() {
        System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
    }
    private void controlarSaida() {
        System.out.println("CONTROLANDO A SAIDA DO PRODUTOS");
    }
    void entregarIngredientes(){
        System.out.println("ENTREGANDO OS INGREDIENTES");
        controlarEntrada();
    }
    void trocarGas(){
        System.out.println("TROCANDO O GÁS");
    }
    
}
