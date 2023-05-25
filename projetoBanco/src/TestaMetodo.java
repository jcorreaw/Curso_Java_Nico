
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		System.out.println("Saldo apos o deposito:  " + contaDoPaulo.saldo);
		
		boolean conseguiuRetirar = contaDoPaulo.saca(20);
		System.out.println("Saldo apos o saque: " + contaDoPaulo.saldo);
		System.out.println("Resultado da operação: " + conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		System.out.println("Saldo da marcela: " + contaDaMarcela.saldo);
		
		boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDoPaulo);
		
		if (sucessoTransferencia) {
			System.out.println("Transferencia com sucesso");
		} else {
			System.out.println("Faltou dinheiro");
		}
		
		System.out.println("Saldo da Marcela apos a tarsnferencia: " + contaDaMarcela.saldo);
		
		System.out.println("Saldo do Paulo apos a transferencia: " + contaDoPaulo.saldo);
		
		contaDoPaulo.titular = "Paulo";
		contaDaMarcela.titular = "Marcela";
	}

}
