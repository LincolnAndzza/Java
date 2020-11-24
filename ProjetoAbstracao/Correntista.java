public class Correntista {
	private int id;
	private int transferencia;
	
	public Correntista(int id, String nome, String cpf, 
	int transferencias) {
		this.setId(id);
		this.setNome(nome);
		this.setCpf(cpf);
		this.setTransferencia(transferencia);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getTransferencia() {
		return transferencia;
	}

	public void setTransferencia(int transferencia) {
		this.transferencia = transferencia;
	}
}
