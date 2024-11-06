package conta;

public class Conta {
	
	private String titular;
	private int numero_conta;
	private int agencia;
	private String tipo;
	private float saldo;
	
	
	/*public Conta(String titular, int numero_conta, int agencia, String tipo, float saldo) {
		this.titular = titular;
		this.numero_conta = numero_conta;
		this.agencia = agencia;
		this.tipo = tipo;
		this.saldo = saldo;
	}*/
	
	//Pegar uma informação
	public String getTitular() {
		return titular;
	}

	//Guardar uma informação
	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero_conta() {
		return numero_conta;
	}

	public void setNumero_conta(int numero_conta) {
		this.numero_conta = numero_conta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public void imprimir() {
		System.out.println("\nTitular: " + titular);
		System.out.println("Numero da conta: " + numero_conta);
		System.out.println("Numero da agenciar: " + agencia);
		System.out.println("Tipo da conta: " + tipo);
		System.out.println("Slado da conta: " + saldo);
	}
	
	
	
	
	
	
}
