public class SistemaLocadora {
    private Carro carro;
    private Caminhao caminhao;

    public SistemaLocadora(LocadoraFactory factory){
        this.carro = factory.criarCarro();
        this.caminhao = factory.criarCaminhao();
    }

    public String dirigirCarro(){
        return this.carro.dirigir();
    }
    public String dirigirCaminhao(){
        return this.caminhao.dirigir();
    }
}
