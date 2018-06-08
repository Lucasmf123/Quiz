import java.util.ArrayList;

public class Clientes {

	// Atributos
	private String nomeCliente;
	private int numeroCliente;

	// ArrayList
	public static ArrayList<Clientes> dadosClientes = new ArrayList<>();

	// Métodos magicos

	public String getNomeCliente() {
		return nomeCliente;

	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;

	}

	public int getNumeroCliente() {
		return numeroCliente;

	}

	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;

	}

}