package Exemple;

// Teste
public class TesteState {
    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();
        semaforo.mostrarEstado(); // Estado atual: Verde
        semaforo.proximo();       // Verde -> Amarelo
        semaforo.mostrarEstado(); // Estado atual: Amarelo
        semaforo.proximo();       // Amarelo -> Vermelho
        semaforo.mostrarEstado(); // Estado atual: Vermelho
        semaforo.proximo();       // Vermelho -> Verde
        semaforo.mostrarEstado(); // Estado atual: Verde
    }
}