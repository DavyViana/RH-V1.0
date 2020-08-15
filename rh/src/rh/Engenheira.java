package rh;

public class Engenheira extends Funcionario {

	private String CREA;
	
	public String getRegistro() {
		return super.getRegistro();
	}
	
	public String getCREA() {
		return this.CREA;
	}
	
	public String getNome() {
		return "Eng. "+ super.getNome() + " CREA: " + 
				this.CREA;
	}
	
	public Engenheira(String nome, String cpf, 
				String registro, String email, String CREA) {
		super(nome, cpf, registro, email);
		this.CREA = CREA;
		// TODO Auto-generated constructor stub
	}
}
