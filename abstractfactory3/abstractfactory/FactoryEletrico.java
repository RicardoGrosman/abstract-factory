package abstractfactory;

public class FactoryEletrico implements LocadoraFactory{
    @Override
    public CarroEletrico criarCarro(){
        return new CarroEletrico();
    }

    @Override
    public CaminhaoEletrico criarCaminhao(){
        return new CaminhaoEletrico();
    }
}
