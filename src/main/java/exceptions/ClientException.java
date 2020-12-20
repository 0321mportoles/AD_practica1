package exceptions;

import model.Cliente;

public class ClientException extends Exception{
	Cliente cliente;
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	public ClientException(Cliente c) {
		super();
		this.cliente = c;
	}

	public Cliente getCliente() {
		return cliente;
	}

}

