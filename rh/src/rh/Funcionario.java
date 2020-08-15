package rh;

public class Funcionario extends Pessoa {
	
	private String registro;
	private String email;

	public Funcionario(String nome, String cpf, 
			String registro, String email) {
		super(nome, cpf);
		this.email = email;
		this.registro = registro;
		
	}

	public String getRegistro() {
		
		return this.registro;
	}
}
