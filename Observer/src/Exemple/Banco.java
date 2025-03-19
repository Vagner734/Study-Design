package Exemple;

public class Banco implements Observer {

    @Override
    public void notify(Cotacao cotacao) {
        // some cool stuff here
        System.out.println("Banco: " + cotacao);

    }

}
