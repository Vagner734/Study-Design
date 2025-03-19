package Exemple;

public class Main {
    public static void main(String[] args) {

        ServidorCotacao servidorCotacao = new ServidorCotacao();

        servidorCotacao.registerObserver(
                cotacao -> System.out.println("Banco: " + cotacao));

        servidorCotacao.registerObserver(
                cotacao -> {
                    System.out.println("Investidor: " + cotacao);
                } );

        servidorCotacao.novaCotacao( new Cotacao( "BRL", 1));

    }
}