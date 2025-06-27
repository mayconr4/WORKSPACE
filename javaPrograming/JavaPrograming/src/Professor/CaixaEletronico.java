package Professor;

import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();
        Servicos servico = new Servicos();

        System.out.println("Digite o valor do déposito");
        conta.depositar(ler.nextDouble());
        conta.exibirSaldo();
        System.out.println("Digite o valor do saque");
        conta.sacar(ler.nextDouble());
        conta.exibirSaldo();

        System.out.println("Digite o seu salário:");
        servico.setSalario(ler.nextDouble());
        System.out.println("Digite o valor do emprestimo: ");
        conta.depositar(servico.emprestar(servico.getSalario(), ler.nextDouble()));
        conta.exibirSaldo();
    }
}
