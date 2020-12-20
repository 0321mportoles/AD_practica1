package interfazDao;

import java.util.List;

import exceptions.ClientNotFound;
import exceptions.DuplicateException;
import model.Cliente;

public interface InterfazClienteDao {
	
	public boolean anadeCliente(Cliente c) throws DuplicateException;
	public Cliente MostrarCliente(int id) throws ClientNotFound;
	public List<Cliente> MostrarTodosClientes();
	public List<Cliente> buscarPorTexto(String texto);
	public void actualizar(Cliente cliente, String[] params);
	public void eliminar(Cliente cliente);
}
