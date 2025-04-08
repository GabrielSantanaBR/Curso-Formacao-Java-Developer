package lanchonete;

public class Estabelecimento {
    public static void main(String[] args){
        Cozinheiro cozinheiro = new Cozinheiro();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adcionarComboNoBalcao();
        cozinheiro.prepararLache();
        cozinheiro.prepararVitamina();
        cozinheiro.prepararCombo();
        cozinheiro.selecionarIngredientesLache();
        cozinheiro.SelecionarIngreidentesVitamina();
        cozinheiro.lavarIngredientes();
        cozinheiro.baterVitaminaLiquidificador();
        cozinheiro.fritaIngredientesLache();

        Atendente atendente = new Atendente();
        atendente.servindoMesa();
        atendente.pegarLancheCozinha();
        atendente.receberPagamento();
        atendente.trocarGas();
        atendente.pegarPedidoBalcao();
        
        Almoxarife almoxarife = new Almoxarife();
        almoxarife.contralarEntrada();
        almoxarife.controlarSaida();
        almoxarife.entregarIngredientes();
        almoxarife.trocarGas();
        

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();
        cliente.consultarSaldoAplicativo();
        cliente.pegarPedidoBalcao();
        
    }
}
