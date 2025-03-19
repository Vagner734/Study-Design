package Exemple;

public class Singleton {

    //Garanta a existência de apenas uma instância de uma classe e forneça um ponto global de acesso ao seu objeto.
    public static void main(String[] args) {

        var configurantonApi1 = ConfigurantonApi.getInstance();
        var configurantonApi2 = ConfigurantonApi.getInstance();


        System.out.println(configurantonApi1);
        System.out.println(configurantonApi2);
    }
}