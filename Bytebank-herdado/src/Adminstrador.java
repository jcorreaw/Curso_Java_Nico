
public class Adminstrador extends Funcionario implements Autenticavel {

	private AutenticadorUtil autenticador;

	public Adminstrador() {
		this.autenticador = new AutenticadorUtil();
	}
	
	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 50;
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
