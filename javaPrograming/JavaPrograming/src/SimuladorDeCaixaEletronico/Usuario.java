package SimuladorDeCaixaEletronico;

public class Usuario {

    //o que tenho
    // o que faco
    // e como estou
    private double salario;
    private double saldo;
    private String opcao;


    public Usuario(){

    }

    public Usuario(double salario, double saldo){
        this.salario = salario;
        this.saldo = saldo;
        this.opcao = getOpcao();

    }


    public double getSalario() {
        return salario;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getOpcao() {
        return opcao;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setOpcao(String opcao) {
        this.opcao = opcao;
    }
}
