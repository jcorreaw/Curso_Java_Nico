
public class TestaSitemaInterno {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		Adminstrador adm = new Adminstrador();
		adm.setSenha(22222);
		
	
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
		
	}

}
