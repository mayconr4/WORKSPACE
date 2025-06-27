package Revisao;

public class AgenciaEmprego {

    private double salario;
    private final double DIARIA =  250.00;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void pedreiro(double a){
        if (a > DIARIA){
            System.out.println("Vu trabalhar");
        } else{
            System.out.println("Não vou rabalhar");
        }
    }

    public  void eltrecista(double a ){
        if (a > DIARIA){
            System.out.println("Vu trabalhar");
        } else{
            System.out.println("Não vou rabalhar");
        }
    }

    public  void gesseiro(double a ){
        if (a > DIARIA){
            System.out.println("Vu trabalhar");
        } else{
            System.out.println("Não vou rabalhar");
        }
    }

    public  void azuleigista(double a ){
        if (a > DIARIA){
            System.out.println("Vu trabalhar");
        } else{
            System.out.println("Não vou rabalhar");
        }
    }

}
