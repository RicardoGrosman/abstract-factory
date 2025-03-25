package test;

import abstractfactory.FactoryCombustao;
import abstractfactory.FactoryEletrico;
import abstractfactory.LocadoraFactory;
import abstractfactory.SistemaLocadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LocadoraTest {

    @Test
    void deveDirigirCarroEletrico(){
        LocadoraFactory factory = new FactoryEletrico();
        SistemaLocadora sistema = new SistemaLocadora(factory);
        assertEquals("Dirigindo carro elétrico", sistema.dirigirCarro());
    }

    @Test
    void deveDirigirCaminhaoEletrico(){
        LocadoraFactory factory = new FactoryEletrico();
        SistemaLocadora sistema = new SistemaLocadora(factory);
        assertEquals("Dirigindo caminhão elétrico", sistema.dirigirCaminhao());
    }

    @Test
    void deveDirigirCarroCombustao(){
        LocadoraFactory factory = new FactoryCombustao();
        SistemaLocadora sistema = new SistemaLocadora(factory);
        assertEquals("Dirigindo carro movido a combustão", sistema.dirigirCarro());
    }

    @Test
    void deveDirigirCaminhaoCombustao(){
        LocadoraFactory factory = new FactoryCombustao();
        SistemaLocadora sistema = new SistemaLocadora(factory);
        assertEquals("Dirigindo caminhão movido a combustão", sistema.dirigirCaminhao());
    }

}
