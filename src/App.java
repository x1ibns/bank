import java.util.ArrayList;
import java.util.Scanner;
import cliente.Cliente;
import repositorios.RepositorioCliente;

public class App {
    
    static Scanner scan = new Scanner(System.in);
    static ArrayList repositorio ; //0.getInstance();
 
    public static void main(String[] args)  {
        repositorio = new ArrayList <RepositorioCliente>();
        int op ;
        do{
            
            System.out.println("\nWelcome to Silvas Bank \n\nEscolha uma opcao para continuar \n\n1 cadastrar : \n2 buscar : \n3 atualizar : \n4 remover : ");
            op = scan.nextInt();
            Cliente c1 = new Cliente(); 
            switch(op ){
                case (1) : {
                    cadastrar(c1);
                    break ;
                }
                case (2) : {
                    buscar(c1);
                    break ;
                }
                case (3) : {
                    atualizar(c1);
                    break ;
                }
                case (4) : {
                    remover(c1);
                    break ;
                }
                case (0):{
                    System.exit(-1);
                }
                default : {
                    System.err.println("Opcao inválida ");
                }
            }        
        }while(op != 0);

    }
    public static void cadastrar(Cliente c1){
        String nome , cpf , rua , bairro, cidade , estado ;
        
        System.out.println("Digite o nome do cliente : ");
        nome = scan.next();
        c1.setNome(nome);   

        System.out.println("Digite o cpf do cliente : ");
        cpf = scan.next();
        c1.setCpf(cpf);

        System.out.println("Digite o nome da rua : ");
        rua = scan.next();

        System.out.println("Digite o nome do bairro : ");
        bairro = scan.next();

        System.out.println("Digite o nome da cidade : ");
        cidade = scan.next();

        System.out.println("Digite o nome do estado : ");
        estado = scan.next();

        c1.setEndereco(rua,bairro,cidade,estado);

        RepositorioCliente.cadastrarCliente(c1);
       

    }
    public static void buscar(Cliente c1){
        String cpf ;

        System.out.println("Digite o cpf do cliente : ");
        cpf = scan.next();
        c1.setCpf(cpf);
        
        System.out.println(repositorio.contains(c1));    
    }
    public static void atualizar(Cliente c1){}
    public static void remover(Cliente c1){}
}
