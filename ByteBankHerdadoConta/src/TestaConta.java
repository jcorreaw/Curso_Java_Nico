
public class TestaConta {
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		System.out.println("Saldo da conta corrente: " + cc.getSaldo());
		
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(100.0);
		System.out.println("Saldo da conta poupanca: " + cp.getSaldo());
		
		cc.transfere(50.0, cp);
		
		System.out.println("Novo saldo da conta corrente: " + cc.getSaldo());
		System.out.println("Novo saldo da conta poupanca: " + cp.getSaldo());
		
	}
}
