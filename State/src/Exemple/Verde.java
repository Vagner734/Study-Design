package Exemple;

// Estados concretos
class Verde implements EstadoSemaforo {
    public void proximo(Semaforo semaforo) {
        System.out.println("Verde -> Amarelo");
        semaforo.setEstado(new Amarelo());
    }
    public void mostrarEstado() {
        System.out.println("Estado atual: Verde");
    }
}

class Amarelo implements EstadoSemaforo {
    public void proximo(Semaforo semaforo) {
        System.out.println("Amarelo -> Vermelho");
        semaforo.setEstado(new Vermelho());
    }
    public void mostrarEstado() {
        System.out.println("Estado atual: Amarelo");
    }
}

class Vermelho implements EstadoSemaforo {
    public void proximo(Semaforo semaforo) {
        System.out.println("Vermelho -> Verde");
        semaforo.setEstado(new Verde());
    }
    public void mostrarEstado() {
        System.out.println("Estado atual: Vermelho");
    }
}