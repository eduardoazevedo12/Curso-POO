package Aprendendo;

public class Mouse {
    String modelo;
    String nome;
    String cabo;
    String cor;
    boolean ledligado;

    void status(){
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Nome: "+ this.nome);
        System.out.println("Cabo: " +this.cabo);
        System.out.println("Cor: "+this.cor);
        System.out.println("Led: "+ this.ledligado);
    }


    void botaoEsquerdo(){
        System.out.println("1 click com botão esquerdo");
    }
    void botaoDireito(){
        System.out.println("1 click com botão direito");
    }
    void botaoLateralUM(){
        System.out.println("Avançar");

    }
    void botaoLateralDois(){
        System.out.println("Retornar");
    }
    void scrollClick(){
        System.out.println("Abrindo nova aba");

    }
    void scrollCima(){
        System.out.println("Rolando para cima");

    }
    void scrollBaixo(){
        System.out.println("Rolando para baixo");

    }
}