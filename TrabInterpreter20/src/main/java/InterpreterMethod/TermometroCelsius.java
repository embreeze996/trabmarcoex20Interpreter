package InterpreterMethod;

public class TermometroCelsius {
    private double tempCelsius;

    public double getTempCelsius() {
        return tempCelsius;
    }

    public void setTempCelsius(double tempCelsius) {
        this.tempCelsius = tempCelsius;
    }


    public double converterTemperaturaKelvin() {
        return TemperaturaKelvin.converterTemperaturaKelvin(this.tempCelsius);
    }
}
