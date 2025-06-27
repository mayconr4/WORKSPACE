package Revisao;

import java.util.Scanner;

public class Contratacao {

    public static void main(String[] args) {
        int op;

        AgenciaEmprego contrata = new AgenciaEmprego();
        Scanner ler = new Scanner(System.in);

        System.out.println("Escolha o profissional: \n1 - Predreiro \n2 - Eletricista \n3 - Gesseiro:  \n4 - Azuleigista");
        op = ler.nextInt();
        switch (op){
            case(1):
                System.out.println("Digite o valor da diaria: ");
                contrata.pedreiro(ler.nextDouble());

                contrata.pedreiro(contrata.getSalario());
                break;
            case(2):
                System.out.println("Digite o valor da diaria: ");
                contrata.eltrecista(ler.nextDouble());

                //contrata.setSalario(ler.nextInt());

                contrata.eltrecista(contrata.getSalario());
                break;
            case(3):
                System.out.println("Digite o valor da diaria: ");
                contrata.gesseiro(ler.nextDouble());
                //contrata.setSalario(ler.nextInt());

                contrata.gesseiro(contrata.getSalario());
                break;
            case(4):
                System.out.println("Digite o valor da diaria: ");
                contrata.azuleigista(ler.nextDouble());
                //contrata.setSalario(ler.nextInt());

                contrata.azuleigista(contrata.getSalario());
                break;
            default:{
                System.out.println("digite novamente: ");
            }
        }

    }
}
