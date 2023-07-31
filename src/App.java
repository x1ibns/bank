import java.util.Scanner;
import cliente.Cliente;
import repositorios.RepositorioCliente;

public class App {
    
    static Scanner scan = new Scanner(System.in);
    static RepositorioCliente clientes = new RepositorioCliente();
 
    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Welcome to Silvas /n/Escolhauma opcao para continuar /n1 cadastrar ;/n2 buscar :/n3 atualizar :/n4 remover :");
        int op = scan.nextInt();
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
        }

    }
    public static void cadastrar(Cliente c1){
        String nome , cpf , rua , bairro, cidade , estado ;
        

        nome = scan.next();
        c1.setNome(nome);

        cpf = scan.next();
        c1.setCpf(cpf);
        rua = scan.next();
        bairro = scan.next();
        cidade = scan.next();
        estado = scan.next();
        c1.setEndereco(rua,bairro,cidade,estado);

        clientes.cadastrarCliente(c1) ;

    }
    public static void buscar(Cliente c1){}
    public static void atualizar(Cliente c1){}
    public static void remover(Cliente c1){}
}
