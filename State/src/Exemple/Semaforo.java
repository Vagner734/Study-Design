package Exemple;

// Contexto
class Semaforo {
    private EstadoSemaforo estadoAtual;

    public Semaforo() {
        estadoAtual = new Verde();
    }

    public void setEstado(EstadoSemaforo estado) {
        this.estadoAtual = estado;
    }

    public void proximo() {
        estadoAtual.proximo(this);
    }

    public void mostrarEstado() {
        estadoAtual.mostrarEstado();
    }
}

