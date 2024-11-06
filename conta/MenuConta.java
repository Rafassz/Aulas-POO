package conta;

public class MenuConta {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		Conta conta2 = new Conta();
		
		conta.setTitular("Rodrigo");
		
		System.out.println(conta.getTitular());
		
		
		/*conta.imprimir();
		
		conta2.imprimir();*/
	}

}
