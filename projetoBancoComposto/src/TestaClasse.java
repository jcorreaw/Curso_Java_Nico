
public class TestaClasse {
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo";
		paulo.cpf = "222.222.222-22";
		paulo.profissao = "Programador";
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);
		System.out.println(contaDoPaulo.getSaldo());
		
		contaDoPaulo.titular = paulo;
		System.out.println(contaDoPaulo.titular.nome);
				
	}
}
