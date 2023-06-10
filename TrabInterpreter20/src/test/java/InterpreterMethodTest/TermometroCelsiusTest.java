package InterpreterMethodTest;

import InterpreterMethod.TermometroCelsius;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TermometroCelsiusTest {

    @Test
    void deveCalcularExpressaoComFormula() {
        TermometroCelsius termometroCelsius = new TermometroCelsius();
        termometroCelsius.setTempCelsius(27.0);

        assertEquals(300.15, termometroCelsius.converterTemperaturaKelvin());
    }

}