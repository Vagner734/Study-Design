package Exemple02;

// Adaptador

class AdaptadorPagamento implements ProcessadorPagamento {
    private APIPagamentoAntiga apiAntiga;

    public AdaptadorPagamento(APIPagamentoAntiga api) {
        this.apiAntiga = api;
    }

    public void processarPagamento(float valor) {
        String numeroFicticio = "1234-5678-9012-3456"; // Simulação
        apiAntiga.pagarComCartao(numeroFicticio);
        System.out.println("Valor de " + valor + " adaptado.");
    }
}

