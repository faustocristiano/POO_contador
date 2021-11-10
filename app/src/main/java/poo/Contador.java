package poo;

public class Contador {

    //atributos    
    private int valorAtual;

    //metodos
    public void atribuir (int i){
        valorAtual+=i;
    }

    public void incrementar() {
        valorAtual++;
    }

    public String toString(){
        return "Contador: " + valorAtual;
    }
    
}
