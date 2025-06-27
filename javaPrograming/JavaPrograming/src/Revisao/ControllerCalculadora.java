package Revisao;

import java.util.Scanner;

public class ControllerCalculadora {

    public void calculoSimples(String a){
        Calculo calculo = new Calculo();
        Scanner ler= new Scanner(System.in);

        switch(a){

            case("+"):
                System.out.println("Digite um numero");
                calculo.setValor_01(ler.nextDouble());

                System.out.println("Digite um numero");
                calculo.setValor_02(ler.nextDouble());

                calculo.somar(calculo.getValor_01(),calculo.getValor_02());

                break;
            default:
                throw new IllegalArgumentException("Unexpected values"+a);
        }
    }

    public  void calculoCientifico(String a){
        CalculoCientifico calculo = new CalculoCientifico();
        Scanner ler = new Scanner(System.in);

        switch(a){
            case "r":

            System.out.println("Digite um numero");
            calculo.setValor_01(ler.nextDouble());

              calculo.raizQuadrada(calculo.getValor_01());

            break;
            case("e"):

                System.out.println("Digite um numero");
                calculo.setValor_01(ler.nextDouble());

                System.out.println("Digite um numero");
                calculo.setValor_02(ler.nextDouble());

                calculo.exponenciacao(calculo.getValor_01(), calculo.getValor_02());

                break;
            default:
                throw new IllegalArgumentException("Unexpected values"+a);
        }

    }
}
