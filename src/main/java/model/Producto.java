package model;



public class Producto {
	
	private String codigoProducto;
	private String nombre;
	private String gama;
	private String dimensiones;
	private String proveedor; 
	private String descripcion; 
	private int cantidadStock;
	private double precioVenta;
	private double precioProveedor;
	
	
	public Producto(String codigoProducto) {
		super();
		this.codigoProducto = codigoProducto;
		
	}
	
	public Producto(String codigoProducto, String nombre, String gama, String dimensiones, String proveedor,
			String descripcion, int cantidadStock, double precioProveedor, double precioVenta) {
		super();
		this.codigoProducto = codigoProducto;
		this.nombre = nombre;
		this.gama = gama;
		this.dimensiones = dimensiones;
		this.proveedor = proveedor;
		this.descripcion = descripcion;
		this.cantidadStock = cantidadStock;
		this.precioVenta = precioProveedor;
		this.precioProveedor = precioVenta;
	}

	public String getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getGama() {
		return gama;
	}


	public void setGama(String gama) {
		this.gama = gama;
	}


	public String getDimensiones() {
		return dimensiones;
	}


	public void setDimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
	}


	public String getProveedor() {
		return proveedor;
	}


	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantidadStock() {
		return cantidadStock;
	}


	public void setCantidadStock(int cantidadStock) {
		this.cantidadStock = cantidadStock;
	}


	public double getPrecioVenta() {
		return precioVenta;
	}


	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}


	public double getPrecioProveedor() {
		return precioProveedor;
	}


	public void setPrecioProveedor(double precioProveedor) {
		this.precioProveedor = precioProveedor;
	}


	@Override
	public String toString() {
		return "Producto:  ID: " + this.codigoProducto + " Nombre del producto: " + this.nombre + " Gama: " + this.gama+ " Dimensiones del producto: " 
				+ this.dimensiones+ " Proveedor del producto: " + this.proveedor + " Descripcion del producto: " + this.descripcion+ " Cantidad Stock del producto: " + this.cantidadStock
				+ "Precio proveedor:"  + this.precioProveedor + " Precio Venta: " + this.precioVenta;
	}
				
			

		 
}
