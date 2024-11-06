package objeto;

public class Menu {
	
	public static void main(String[] args) {
		
		Gato gato1 = new Gato();
		Gato gato2 = new Gato();
		
		System.out.println("\nCadastre seu Gato");
		gato1.nome = "Bugadinho";
		gato1.idade = 1;
		gato1.cor = "tricolor";
		gato1.raca = "Vira-Lata";
		
		gato1.imprimir();
		
		System.out.println("\nO que o gato1 está fazendo? ");
		
		gato1.dormir();
		
		//Gato 2
		
		System.out.println("\nCadastre seu Gato");
		gato2.nome = "Carniça";
		gato2.idade = 2;
		gato2.cor = "Laranja";
		gato2.raca = "Vira-Lata";
		
		gato2.imprimir();
		
		System.out.println("\nO que o gato2 está fazendo?");
		
		gato2.comer();
		
		
	}

}
