import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SistemaLocadoraTest {

        @Test
        public void deveDirigirCarroEletrico(){
            LocadoraFactory factory = new FactoryEletrico();
            SistemaLocadora sistema = new SistemaLocadora(factory);
            assertEquals("Dirigindo carro elétrico", sistema.dirigirCarro());
        }

        @Test
        public void deveDirigirCaminhaoEletrico(){
            LocadoraFactory factory = new FactoryEletrico();
            SistemaLocadora sistema = new SistemaLocadora(factory);
            assertEquals("Dirigindo caminhão elétrico", sistema.dirigirCaminhao());
        }

        @Test
        public void deveDirigirCarroCombustao(){
            LocadoraFactory factory = new FactoryCombustao();
            SistemaLocadora sistema = new SistemaLocadora(factory);
            assertEquals("Dirigindo carro movido a combustão", sistema.dirigirCarro());
        }

        @Test
        public void deveDirigirCaminhaoCombustao(){
            LocadoraFactory factory = new FactoryCombustao();
            SistemaLocadora sistema = new SistemaLocadora(factory);
            assertEquals("Dirigindo caminhão movido a combustão", sistema.dirigirCaminhao());
        }
}