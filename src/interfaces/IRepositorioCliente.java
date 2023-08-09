package interfaces;
import cliente.Cliente;

public interface IRepositorioCliente {
     boolean cadastrarCliente (Cliente c1);
    public boolean buscarCliente(Cliente c1);
    public void atualizarCliente(Cliente c1);
    public void removerCliente(Cliente c1);
}
