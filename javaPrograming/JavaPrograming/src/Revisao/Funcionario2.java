package Revisao;

import java.util.Scanner;

public class Funcionario2 {

    public static void main(String[] args) {
        Pessoa2 funcionario = new Pessoa2();
        String nome ,d;
        int b;
        double c;

        Scanner ler = new Scanner(System.in);

        System.out.println("digite o seu nome: ");
        nome = ler.nextLine();

        System.out.println("digite a sua idade: ");
        b = ler.nextInt();

        System.out.println("digite a sua altura: ");
        c = ler.nextDouble();

        System.out.println("digite o seu genero: ");
        d = ler.nextLine();

        funcionario.setNome(nome);
        funcionario.setIdade(b);
        funcionario.setAltura(c);
        funcionario.setGenero(d);

        System.out.println(funcionario.getNome()+funcionario.getIdade()+funcionario.getAltura()+funcionario.getGenero());
    }
}
