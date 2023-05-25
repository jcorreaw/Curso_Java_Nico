
public class TestaFuncionario {

	public static void main(String[] args) {
		
		Gerente joao = new Gerente();
		joao.setNome("Joao Carlos");
		joao.setSalario(2600.00);
		joao.setCpf("19266133760");
			
		System.out.println(joao.getNome());
		System.out.println(joao.getSalario());
		System.out.println(joao.getCpf());
		System.out.println(joao.getBonificacao());
		

	}

}
