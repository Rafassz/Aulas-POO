package objeto;

public class Gato {

	// ATRIBUTOS//

	String nome;
	int idade;
	String cor;
	String raca;

	// METODOS E FUNÇÕES//

	public void miar() {
		System.out.println("Miauuuuuuu");
	}

	public void comer() {
		System.out.println("Comendo a Ração");
	}

	public void dormir() {
		System.out.println("Dormiu na caixa de Sapato");
	}

	public void imprimir() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Cor: " + cor);
		System.out.println("Raça: " + raca);
	}

}
