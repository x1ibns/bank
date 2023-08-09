package repositorios;

import java.util.ArrayList;
import cliente.Cliente;

public class RepositorioCliente {
    private static ArrayList <Cliente> listaClientes ;
    static void repositorioCliente(){
        listaClientes = new ArrayList<Cliente>(100);
    }
    public static  boolean cadastrarCliente(Cliente c1){
        if (c1 != null){
            try {
                for (int i = 0 ; i < listaClientes.size() ; i++){
                    if ((listaClientes.get(i) != null) && (listaClientes.get(i) != c1)){
                        i++ ;
                    }
                    if((listaClientes.get(i) != null) && (listaClientes.get(i).equals(c1))){
                        System.out.println("Cliente ja cadastrado !!");
                    }
                    else{
                        listaClientes.add(c1);
                        System.out.println("Cliente cadastrado ");
                    }
                }
            } catch (Exception e) {
                System.err.println(e);
            }          
            return true;
        }
        return false ;
    }
    public static boolean buscarCliente(Cliente c1) {
        if(c1 != null){
            try {
                for(int i = 0 ; i < listaClientes.size() ; i++){
                    if((listaClientes.get(i) != null) && (listaClientes.get(i) != c1)){
                        i++ ;
                    }
                    if (listaClientes.get(i).equals(c1)){
                        System.out.println("Cliente encontrado");
                    }
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
            return true;
        }        
        return false;
    }
  
    public static void atualizarCliente(Cliente c1) {        
    }

    public static void removerCliente(Cliente c1) {
    }
}
