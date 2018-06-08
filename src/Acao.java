import javax.swing.DefaultBoundedRangeModel;
import javax.swing.table.DefaultTableModel;


public class Acao {
	
	// Métodos para cadastro
	public void Cadastrar(String nomeCliente, int numeroCliente) {

		// Criar objeto
		Clientes pc = new Clientes();
		pc.setNomeCliente(nomeCliente);
		pc.setNumeroCliente(numeroCliente);

		// Add ao ArrayList
		Clientes.dadosClientes.add(pc);

	}

	// Método para retornar os dados do cliente cadastrado
	public DefaultTableModel listarClienteCadastrado() {

		// DefaultTableModel
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Nome");
		modelo.addColumn("Pontuação");

		for (int indice = 0; indice < Clientes.dadosClientes.size(); indice++) {

			modelo.addRow(new Object[] { Clientes.dadosClientes.get(indice).getNomeCliente(),
					Clientes.dadosClientes.get(indice).getNumeroCliente() });

		}

		// Retorno
		return modelo;

	}

	// Método para excluir cliente
	public void excluir(int linha) {

		Clientes.dadosClientes.remove(linha);

	}

}
