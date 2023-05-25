
public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticadorUtil autenticador;

	public double getBonificacao() {
		return super.getSalario();
	}

	public Gerente() {
		this.autenticador = new AutenticadorUtil();
		}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
}