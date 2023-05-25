
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(2919, 21);
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(2919, 030340);
		
		System.out.println(Conta.getTotal());
		
	}
}
