package Revisao;

public class Calculo {
    private double valor_01;
    private double valor_02;
    private double total;


    public double getValor_02() {
        return valor_02;
    }

    public void setValor_02(double valor_02) {
        this.valor_02 = valor_02;
    }

    public double getValor_01() {
        return valor_01;
    }

    public void setValor_01(double valor_01) {
        this.valor_01 = valor_01;
    }

    public void  somar (double a, double b){
        this.valor_01 = a;
        this.valor_02 = b;

        this.total = valor_01+valor_02;
        System.out.println("Toatal; "+total);
    }

    public void  subtracao (double a, double b){
        this.valor_01 = a;
        this.valor_02 = b;

        this.total = valor_01-valor_02;
        System.out.println("Toatal; "+total);
    }

    public void  multiplica (double a, double b){
        this.valor_01 = a;
        this.valor_02 = b;

        this.total = valor_01*valor_02;
        System.out.println("Toatal; "+total);
    }

    public void  divisao (double a, double b){
        this.valor_01 = a;
        this.valor_02 = b;

        this.total = valor_01/valor_02;
        System.out.println("Toatal; "+total);
    }

}
