package interfaces;
import cliente.Cliente;

public interface IRepositorioCliente {
    public void cadastrarCliente (Cliente c1);
    public void buscarCliente(Cliente c1);
    public void atualizarCliente(Cliente c1);
    public void removerCliente(Cliente c1);
}
