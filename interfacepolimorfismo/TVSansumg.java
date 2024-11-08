package interfacepolimorfismo;

public class TVSansumg implements ControleRemoto {

	private boolean ligado = false;
	private int canalAtual = 1;

	@Override
	public void ligar() {
		ligado = true;
		System.out.println("TV Sansumg ligada.");
	}

	@Override
	public void desligar() {
		ligado = false;
		System.out.println("TV Sansumg desligada.");

	}

	@Override
	public void mudarCanal(int canal) {
		if (ligado == true) {
			canalAtual = canal;
			System.out.println("TV Sansumg	 mudando para o canal: " + canalAtual);
		} else {
			System.out.println("TV Sansumg está desligada.");
		}
	}
}
