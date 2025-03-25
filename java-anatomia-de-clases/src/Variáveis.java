public class Variáveis {
    public static void main(String[] args) {
        
        final String BR = "Brasil"; // variável constante/não mutável
        String celular = "Xiomi"; // variável mutável

        //usando para valores decimais
        double PI = 3.1415; // variável constante/não mutável
        final double troco = 0.50; // variável mutável

        //usando para valores inteiros
        int idade = 25; // variável mutável
        int ESTADOS_BRASIL = 27; // variável constante/não mutável, por convenção, variáveis constantes são escritas em letras maiúsculas usando _ para separar as palavras

        //usando para valores booleanos, ou seja, verdadeiro ou falso
        boolean isTrue = true; // variável mutável
        final boolean arExiste = true; // variável constante/não mutável
  
        String meuNome= "Gabriel";
        System.out.println("Meu nome é " + meuNome);

        int minhaIdade = 19;
        System.out.println("Minha idade é " + minhaIdade);

        double meuPeso = 70.5;
        double meuAltura = 1.75;
            System.out.println("Meu peso é " + meuPeso + " e minha altura é " + meuAltura);

        boolean souBonito = true;
            System.out.println("Eu sou bonito? " + souBonito);

    }
    
}
