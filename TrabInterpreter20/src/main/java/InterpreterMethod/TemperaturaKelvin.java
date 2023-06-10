package InterpreterMethod;

public class TemperaturaKelvin {

    public static String formula = "tempCelsius + 273.15";

    public static double converterTemperaturaKelvin(double tempCelsius) {
        String expressao;
        expressao = formula.replace("tempCelsius", Double.toString(tempCelsius));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}
