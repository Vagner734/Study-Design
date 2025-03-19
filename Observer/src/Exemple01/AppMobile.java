package Exemple01;

// Observadores concretos
class AppMobile implements Observador {
    public void atualizar(float temperatura) {
        System.out.println("App: Nova temperatura = " + temperatura + "°C");
    }
}

class Display implements Observador {
    public void atualizar(float temperatura) {
        System.out.println("Display: Temp = " + temperatura + "°C");
    }
}