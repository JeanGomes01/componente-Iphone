package iphone;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
	public void tocar() {
		System.out.println("Reproduzindo música...");
	}
	
	public void pausar() {
		System.out.println("Música pausada.");
	}
	
	public void selecionarMusica(String musica) {
		System.out.println("Música selecionada: " + musica);
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo página: " + url);
		
	}

	@Override
	public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
		
	}

	@Override
	public void atualizarPagina() {
        System.out.println("Página atualizada.");
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para: " + numero);
		
	}

	@Override
	public void atender() {
		 System.out.println("Atendendo chamada...");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz...");
	}
	
	public static void main(String[] args) {
		Iphone meuIphone = new Iphone();
		
		// Testando o ReprodutorMusical
		meuIphone.selecionarMusica("Linkin Park - Numb");
		meuIphone.tocar();
		meuIphone.pausar();
		
		// Testando o AparelhoTelefonico
		meuIphone.ligar("91234-5678");
		meuIphone.atender();
		meuIphone.iniciarCorreioVoz();
		
		// Testando o Nevegador da Internet
		
		meuIphone.exibirPagina("https://jean-gomes.vercel.app");
		meuIphone.adicionarNovaAba();
		meuIphone.atualizarPagina();
	}
	
}
