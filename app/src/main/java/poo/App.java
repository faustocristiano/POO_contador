package poo;

public class App {
    

    public static void main(String[] args) {
       
        Contador cont= new Contador();          
        cont.atribuir(500);
        for(int i=0;i<50000;i++){
             cont.incrementar(); 
        }      
        System.out.println(cont.toString());


    }
}
