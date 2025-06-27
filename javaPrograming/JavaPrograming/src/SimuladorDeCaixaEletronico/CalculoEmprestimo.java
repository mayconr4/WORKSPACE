package SimuladorDeCaixaEletronico;

import java.util.Scanner;

public class CalculoEmprestimo extends Emprestimo{
    private double emprestimo;


    public void  fazerEmprestimo(double salario, double valoremprestimo ){
        Usuario usuario = new Usuario();
        Emprestimo emprestimo = new Emprestimo();

        Scanner ler = new Scanner(System.in);
        double verificaSalario;
        double valorParcela;
        double parcelaMensal;

        boolean loop = true;


        while (loop == true) {

            System.out.println("Digite o valor do emprestimo");
            valoremprestimo = ler.nextDouble();
            emprestimo.setEmprestimo(valoremprestimo);

            System.out.println("Digite o seu salario");
            salario = ler.nextDouble();
            verificaSalario = salario * 3;


            if (verificaSalario > valoremprestimo) {
                System.out.println("O seu emprestimo é muito alto para o seu salário: ");
                loop = false;
            }

            parcelaMensal = (salario/100)*30;
            valorParcela =  (valoremprestimo /12) *0.2;


            if(valorParcela > parcelaMensal ){
                System.out.println("Digite um valor menor: ");
                 loop = false;

            } else if (valorParcela < parcelaMensal){
                System.out.println("Quer digitar um novo valor de emprestimo: ");
                valoremprestimo = ler.nextDouble();
                emprestimo.setEmprestimo(valoremprestimo);
                loop = false;

            }


        }


    }

}
