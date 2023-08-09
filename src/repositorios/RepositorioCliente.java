package repositorios;

import java.util.ArrayList;
import cliente.Cliente;

public class RepositorioCliente {
    private static ArrayList <Cliente> listaClientes ;
    public static void repositorioCliente(){
        listaClientes = new ArrayList<Cliente>();
    }
    public static  void cadastrarCliente(Cliente c1){
        if(c1 != null){
            
            repositorioCliente();
            try {
                for(int i = 0 ; i < listaClientes.size() ; i++){
                    listaClientes.add(c1);
                    System.out.println("Cliente cadastrado : "+ listaClientes.get(i).getNome()+"cpf : "+listaClientes.get(i).getCpf());
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    public static void  buscarCliente(Cliente c1) {
        
    }
  
    public static void atualizarCliente(Cliente c1) {        
    }

    public static void removerCliente(Cliente c1) {
    }
}
