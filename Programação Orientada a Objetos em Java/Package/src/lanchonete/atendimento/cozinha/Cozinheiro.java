package lanchonete.atendimento.cozinha; 

public class Cozinheiro {
    
    public void adicionarLancheNoBalcao() {
        System.out.println("ADCIONANDO LANCHE NATURAL");
    }

    public void adicionarSucoNoBalcao(){
        System.out.println("ADCIONANDO SUCO NO BALCÃO");
    }

    public void adcionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
        prepararCombo(); 
    }

    private void prepararLache(){
        System.out.println("PREPARANDO LACHE NATURAL");
    }

    private void prepararVitamina(){
        System.out.println("PREPARANDO SUCO");
    }

    public void prepararCombo(){
        prepararLache();
        prepararVitamina();
    }

    private void selecionarIngredientesLache(){
        System.out.println("SELECIONANDO INGREDIENTES DO LACHE NATURAL");
    }

    private void selecionarIngreidentesVitamina(){
        System.out.println("SELECIONANDO INGREDIENTES DO SUCO");
    }

    private void lavarIngredientes(){
        System.out.println("LAVANDO IGREDIENTES");
    }

    private void baterVitaminaLiquidificador(){
        System.out.println("BATENDO VITAMINA NO LIQUIDIFICADOR");
    }

    private void fritaIngredientesLache(){
        System.out.println("FRITANDO A CARNE E O OVO");
    }

    private void pedirParaTrocarGas(Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }

    private void pedirIgredientes(Almoxarife meuAmigo){
        meuAmigo.entregarIngredientes();
    }
}
