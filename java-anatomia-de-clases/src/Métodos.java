public class Métodos {
    
    public double somar(int num1, int num2){
        //LOGICA - FINALIDADE DO MÉTODO
        return num1 + num2;
    }

    public void imprimir(String texto){
        //LOGICA - FINALIDADE DO MÉTODO
        //AQUI NÃO PRECISA RETORNAR NADA
        // POIS NÃO SERÁ RETORNADO NADA
    }

    // throws Exeption : indica que o método ao ser ultilizado
    //poderá lançar uma exceção
    public double dividir(int dividendo, int divisor) throws Exception{
        //LOGICA - FINALIDADE DO MÉTODO
        if(divisor == 0){
            throw new Exception("Divisão por zero não permitida");
        }
        return dividendo / divisor;
    }

    //este método não pode ser visto por outras classes no projeto
    private void metodoPrivado(){
        //LOGICA - FINALIDADE DO MÉTODO
        //AQUI NÃO PRECISA RETORNAR NADA
        // POIS NÃO SERÁ RETORNADO NADA
    }

    //alguns esquívosos estruturais
    public void validar(){
        //este método deveria retornar um booleano
        //no caso true or false
    }

    public void calcularEnviar(){
        //um método deve ter apenas uma finalidade clara e objetiva
    }

    public void gravarCliente(String nome, String email, String telefone){
        //este método tem a finalidade de gravar
        //informações de um cliente, por que não criar
        //um objeto cliente e passar ele como parâmetro?
        //veja abaixo
    }

    public void gravarCliente(Cliente cliente){}
        //ou
    public void gravar(Cliente cliente){}
    

}
