package Revisao;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String op;
        /*CalculoCientifico calculadora = new CalculoCientifico();
        double raiz, exponienciacao;

        String operacao;

        System.out.println("Digite a operacao");
        operacao = ler.nextLine();

        switch (operacao){
            case("+"):
                System.out.println("Digite um numero");
                calculadora.setValor_01(ler.nextDouble());

                System.out.println("Digite um numero");
                calculadora.setValor_02(ler.nextDouble());
                calculadora.somar(calculadora.getValor_01(),calculadora.getValor_02());

          break;
            case("-"):

                System.out.println("Digite um numero");
                calculadora.setValor_01(ler.nextDouble());

                System.out.println("Digite um numero");
                calculadora.setValor_02(ler.nextDouble());
                calculadora.subtracao(calculadora.getValor_01(),calculadora.getValor_02());
            break;
            case("*"):

                System.out.println("Digite um numero");
                calculadora.setValor_01(ler.nextDouble());

                System.out.println("Digite um numero");
                calculadora.setValor_02(ler.nextDouble());
                calculadora.multiplica(calculadora.getValor_01(),calculadora.getValor_02());
            break;
            case("/"):

                System.out.println("Digite um numero");
                calculadora.setValor_01(ler.nextDouble());

                System.out.println("Digite um numero");
                calculadora.setValor_02(ler.nextDouble());
                calculadora.divisao(calculadora.getValor_01(),calculadora.getValor_02());
            break;
            case("raiz quadrada"):

                System.out.println("Digite um numero");
                calculadora.setValor_01(ler.nextDouble());

                 raiz =  calculadora.raizQuadrada(calculadora.getValor_01());
                System.out.println("Raiz Quadrada: "+raiz);
            break;
            case("exponiencição"):

                System.out.println("Digite um numero");
                calculadora.setValor_01(ler.nextDouble());

                System.out.println("Digite um numero");
                calculadora.setValor_02(ler.nextDouble());

                exponienciacao = calculadora.exponenciacao(calculadora.getValor_01(), calculadora.getValor_02());
                System.out.println("Raiz Quadrada: "+exponienciacao);
            break;
            default:
        }*/

        ControllerCalculadora calculadora = new ControllerCalculadora();

        System.out.println("Digite a calculadora desejada: \n2 = simples \n2 = Cientifica");
        op = ler.nextLine();

        if (op.equals("1")) {
            calculadora.calculoSimples(op);
        } else {
            System.out.println("Digite novamente");
        }





    }
}
