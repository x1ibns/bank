package repositorios;
import java.util.ArrayList;
import cliente.Cliente;
import interfaces.IRepositorioCliente;

public class RepositorioCliente  implements IRepositorioCliente{
    
    private ArrayList <Cliente> listaClientes ;
    private static RepositorioCliente instancia ;

    private RepositorioCliente(){
         listaClientes = new ArrayList<Cliente>(10) ;
    }

    public static RepositorioCliente getInstance(){
        if (instancia == null){
            instancia = new RepositorioCliente();
        }
        return instancia ;
    }

    
    public boolean cadastrarCliente(Cliente c1) {
        
        if (c1 == null ){
            System.out.println("Cliente não cadastrado ! ");
            return false ;            
        } 

        else{
            for(int i = 0 ; i < listaClientes.size(); i++){
                if (listaClientes.get(i).getNome().equals(c1.getNome()) &&
                 (listaClientes.get(i).getCpf().equals(c1.getCpf()) &&
                  (listaClientes.get(i).getEndereco().equals(c1.getEndereco()))) ){
                    System.out.println(listaClientes.get(i).getNome());
                    System.out.println("Cliente já cadastrado ");
                }
            }
            for(int i = 0 ; i< listaClientes.size(); i++){
                if (listaClientes.get(i) == null){
                    listaClientes.add(c1);
                    System.out.println("Cliente cadastrado com sucesso !! ");
                }
            }
            return true ; 
        }
                       
    }

    public boolean buscarCliente(Cliente c1) {
        // TODO Auto-generated method stub  ||  
        if (c1 != null){
            for( int i  = 0 ; i< listaClientes.size();i++){
                if ((listaClientes.get(i).getNome().equals(c1.getNome()))) {
                    System.out.println("Cliente encontrado : "+listaClientes.get(i).getNome());
                }
                return true ;
            }
           
        } 
        return false;
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
