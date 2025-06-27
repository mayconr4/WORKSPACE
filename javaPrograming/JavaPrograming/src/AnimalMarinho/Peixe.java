package AnimalMarinho;

import AnimaisDiversos.AcaoAquatica;
import ClassesAbstratas.Animal;

public class Peixe extends Animal implements AcaoAquatica {


    private String nadando;

    public  Peixe(){

    }

    public Peixe (String nadando){
        this.nadando = nadando;
    }

    @Override
    public void pularParaFora(){

    }

    @Override
    public void irParaoFundo(){

    }

    @Override
    public void brincarTreinador(){

    }
}
