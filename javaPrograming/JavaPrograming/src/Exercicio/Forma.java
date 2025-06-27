package Exercicio;

public class Forma {
    private String cor;
    private double raio;



    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double calculArea(){
        return Math.PI*raio*raio;
    }


    /*public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }*/

}
