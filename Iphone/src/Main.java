public class Main {
    public static void main(String[] args) {
        // Testando ReprodutorMusical
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        reprodutorMusical.selecionarMusica("Imagine - John Lennon");
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        
        // Testando AparelhoTelefonico
        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        aparelhoTelefonico.ligar("123-456-7890");
        aparelhoTelefonico.atenderTelefone();
        aparelhoTelefonico.iniciarCorreioVoz();
        
        // Testando NavegadorInternet
        NavegadorInternet navegadorInternet = new NavegadorInternet();
        navegadorInternet.exibirPaginas("https://www.example.com");
        navegadorInternet.adicionarAba();
        navegadorInternet.atualizarPagina();
    }
}
