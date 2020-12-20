package interfazDao;

import java.util.List;

import model.Producto;

public interface InterfazProductoDao {
	
	public boolean anadeProducto(Producto producto);
	public Producto MostrarProducto(int id);
	public List<Producto> MostrarTodosProductos();
	public boolean editaProducto(Producto original, Producto nuevo);
	public void eliminar(Producto producto);
}
