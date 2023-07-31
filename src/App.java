import java.util.Scanner;

import cliente.Cliente;

public class App {
    
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Welcome to Silvas Bank ");
        int op = scan.nextInt(); 
        Cliente c1 = new Cliente();
        switch(op ){
            case (1) : {
                cadastrar();
                break ;
            }
            case (2) : {
                buscar();
                break ;
            }
            case (3) : {
                atalizar();
                break ;
            }
            case (4) : {
                remover();
                break ;
            }
        }

    }
    public static void cadastrar(){

    }
    public static void buscar(){}
    public static void atalizar(){}
    public static void remover(){}
}
