package lanchonete;

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
    }
    public void prepararLache(){
        System.out.println("PREPARANDO LACHE NATURAL");
    }
    public void prepararVitamina(){
        System.out.println("PREPARANDO SUCO");
    }
    public void prepararCombo(){
        prepararLache();
        prepararVitamina();
    }
    public void selecionarIngredientesLache(){
        System.out.println("SELECIONANDO INGREDIENTES DO LACHE NATURAL");
    }
    public void SelecionarIngreidentesVitamina(){
        System.out.println("SELECIONANDO INGREDIENTES DO SUCO");
    }
    public void lavarIngredientes(){
        System.out.println("LAVANDO IGREDIENTES");
    }
    public void baterVitaminaLiquidificador(){
        System.out.println("BATENDO VITAMINA NO LIQUIDIFICADOR");
    }
    public void fritaIngredientesLache(){
        System.out.println("FRITANDO A CARNE E O OVO");
    }
    public void pedirParaTrocarGas(Atendente meuAmigo){
        meuAmigo.trocarGas();
    }
    public void pedirParaTrocarGas(Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }
    public void pedirIgredientes(Almoxarife meuAmigo){
        meuAmigo.entregarIngredientes();
    }
}
