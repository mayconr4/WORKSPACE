package Professor;

public class Servicos extends ContaBancaria{
    private double salario;

    public double emprestar(double a, double b ){
        this.salario = salario;
        double total = 0;

        if (b <= salario*3){
            double parcela = b/12;
             total = parcela+(parcela*0.05);

        }else{
            System.out.println("Valor acima do permiido para empréstimo: ");
            b=0;
        }
        return total;

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
