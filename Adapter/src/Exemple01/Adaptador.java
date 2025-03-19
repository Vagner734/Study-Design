package Exemple01;

class Adaptador implements NovoSistema {
    private VelhoSistema velhoSistema;

    public Adaptador(VelhoSistema velhoSistema) {
        this.velhoSistema = velhoSistema;
    }

    @Override
    public void operacaoNova() {
        velhoSistema.operacaoAntiga();
    }
}
