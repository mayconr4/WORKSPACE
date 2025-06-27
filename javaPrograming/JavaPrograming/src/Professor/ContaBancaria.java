package Professor;

public class ContaBancaria {
    private double saldo;
    private double saque;
    private double deposito;

    public ContaBancaria(){

    };

    public ContaBancaria(double saque, double deposito){
        super();
        this.saque = saque;
        this.deposito = deposito;

    };

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double sacar(double a ){
        if(a<=this.saldo){
        this.saldo = this.saldo-a;
        } else {
            System.out.println("Saldo insufisciente: ");
        }
        return this.saldo;
    }

    public double depositar(double a ){

        this.saldo = this.saldo+a;
        System.out.println("Saldo atual: "+this.saldo);
        return this.saldo=a;
    }

    public void exibirSaldo(){
        System.out.println("Saldo atualizado: "+this.saldo);
    }

}
