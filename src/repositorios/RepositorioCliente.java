package repositorios;

import java.util.ArrayList;
import cliente.Cliente;

public class RepositorioCliente {
    
    private static ArrayList <Cliente> listaClientes = new ArrayList<Cliente>(10);
    public static void RepositorioCliente(){
        
    }
    public static  void cadastrarCliente(Cliente c1){
                    
        try{
            for(int i = 0 ; i < listaClientes.size() ; i++){
                
                System.out.println("Cliente cadastrado : "+ listaClientes.get(i).getNome());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void  buscarCliente(Cliente c1) {
        
        try {
            System.out.println(listaClientes.contains(c1));
            
            for(int i = 0 ; i < listaClientes.size() ;i++){
                
                if (listaClientes.get(i).getCpf().equals(c1.getCpf()) == true){
                    System.out.println("Cliente encontrado : "+listaClientes.get(i).getNome());
                }
                if(listaClientes.get(i).getCpf().equals(c1.getCpf()) != true){
                    System.out.println("Cliente nao encontrado : ");
                }
                
            }
            
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println(e);
        }
    }
  
    public static void atualizarCliente(Cliente c1) {        
    }

    public static void removerCliente(Cliente c1) {
    }
}
