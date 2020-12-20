package exceptions;

import model.Cliente;

public class PossibleDuplicateClientException extends ClientException{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PossibleDuplicateClientException(Cliente c) {
		super(c);
	}

	public String getMessage() {
		return "El cliente con " + 
				"nombre: " + this.cliente.getNombreCliente() + 
				", apellido: " + this.cliente.getApellidoContacto() + 
				" o telefono: " + this.cliente.getTelefono() + 
				" podría estar duplicado";
	}
}
