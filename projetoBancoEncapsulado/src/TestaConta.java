
public class TestaConta {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 23334);
		
		conta.deposita(100);
		
		System.out.println(conta.getSaldo());
		
		conta.setAgencia(570);
		
		System.out.println(conta.getAgencia());
		
		System.out.println("O numero de contas criadas é: " + Conta.getTotal());
		
	}
}
