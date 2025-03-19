package Exemple02;

// Teste

public class TesteAdapter {
    public static void main(String[] args) {
        APIPagamentoAntiga apiAntiga = new APIPagamentoAntiga();
        ProcessadorPagamento adaptador = new AdaptadorPagamento(apiAntiga);
        adaptador.processarPagamento(150.00f); // Usa a API antiga internamente
    }
}