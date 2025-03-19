package Exemple01;

import java.util.ArrayList;
import java.util.List;

// Sujeito
class EstacaoMeteorologica {
    private List<Observador> observadores = new ArrayList<>();
    private float temperatura;

    public void adicionarObservador(Observador o) { observadores.add(o); }
    public void removerObservador(Observador o) { observadores.remove(o); }
    public void setTemperatura(float temp) {
        this.temperatura = temp;
        notificarObservadores();
    }
    private void notificarObservadores() {
        for (Observador o : observadores) {
            o.atualizar(temperatura);
        }
    }
}