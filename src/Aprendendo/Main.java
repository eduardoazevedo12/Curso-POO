package Aprendendo;

public class Main {
    public static void main(String[] args) {
        Caneta c1= new Caneta();
        c1.cor = "azul";
        c1.ponta= 0.5F;
        c1.tampar();
        c1.rabiscar();

        //c1.status();


        Caneta c2= new Caneta();

        c2.cor = "preta";
        c2.ponta= 0.7F;
        c2.destampar();
        c2.rabiscar();

        Mouse m1= new Mouse();
        m1.modelo="M7";
        m1.nome="Chromatic";
        m1.cabo= "USB";
        m1.cor= "Preto";
        m1.ledligado =true;
        m1.status();
        m1.botaoEsquerdo();

        Pessoa p1= new Pessoa();
        p1.nome= "Euaro";
        p1.idade= 23;
        p1.altura= 1.65F;
        p1.peso= 84;
        p1.sexo= "Masculino";

    }
}