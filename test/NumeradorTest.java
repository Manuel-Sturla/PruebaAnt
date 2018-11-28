import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumeradorTest {

    @Test
    void probarNumeroEsElCorrecto(){
        Numerador numerador = new Numerador();
        assertTrue(numerador.devolverNumero(15) == 15);
    }

}
