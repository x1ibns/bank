package repositorios;
import java.util.ArrayList;
import cliente.Cliente;
import interfaces.IRepositorioCliente;

public class RepositorioCliente  implements IRepositorioCliente{
    
    private ArrayList <Cliente> clientes ;
    private static RepositorioCliente instancia ;

    private RepositorioCliente(){
         clientes = new ArrayList<Cliente>(10) ;
    }

    public static RepositorioCliente getInstance(){
        if (instancia == null){
            instancia = new RepositorioCliente();
        }
        return instancia ;
    }

    
    public void cadastrarCliente(Cliente c1) {
        
        if (c1 == null ){
            System.out.println("Cliente não cadastrado ! ");            
        } 

        if(c1 != null){
            for(int i = 0 ; i < clientes.size(); i++){
                if (clientes.get(i).getNome().equals(c1.getNome()) &&
                 (clientes.get(i).getCpf().equals(c1.getCpf()) &&
                  (clientes.get(i).getEndereco().equals(c1.getEndereco()))) ){
                    System.out.println(clientes.get(i).getNome());
                    throw new RuntimeException("Cliente já cadastrado ");
                }
                else{
                clientes.add(c1);
                System.out.println("Cliente cadastrado com sucesso !! ");
                }
            }            
        }               
    }

    public void buscarCliente(Cliente c1) {
        // TODO Auto-generated method stub  ||  
        
    }

    @Override
    public void atualizarCliente(Cliente c1) {
        // TODO Auto-generated method stub
    }

    @Override
    public void removerCliente(Cliente c1) {
        // TODO Auto-generated method stub
    }
    
   
   
    
}
