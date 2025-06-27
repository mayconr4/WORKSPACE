package ClassesAbstratas;

public abstract   class  Animal {
    private String nome ;
    private int idade;

    public Animal(){

    }


    public Animal(String nome){
        this.nome = nome;
    }

    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }


    public int getIdade()
    {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public  void nadar(String  a){
        if(a.equals("sim")){
            System.out.println("Vou nadar");
        }
    }
}
