package abstractfactory;

public class FactoryCombustao implements LocadoraFactory{

    @Override
    public CarroCombustao criarCarro(){
        return new CarroCombustao();
    }

    @Override
    public CaminhaoCombustao criarCaminhao(){
        return new CaminhaoCombustao();
    }

}
