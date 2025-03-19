package Exemple01;

// Teste
public class TesteObserver {
    public static void main(String[] args) {
        EstacaoMeteorologica estacao = new EstacaoMeteorologica();
        AppMobile app = new AppMobile();
        Display display = new Display();

        estacao.adicionarObservador(app);
        estacao.adicionarObservador(display);
        estacao.setTemperatura(25.5f); // Notifica ambos
        estacao.removerObservador(app);
        estacao.setTemperatura(30.0f); // Notifica apenas o display
    }
}
