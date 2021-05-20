import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;

import java.util.List;
import java.util.Map;

public class Clima {

  private int probabilidadLluvia;
  private int temperatura;
  LocalDate horaClima;

  public Clima(String ciudad) {
    Map<String, Object> condicionesClimaticas = consultarClima(ciudad).get(0);
    this.horaClima = LocalDate.now();
    this.temperatura = condicionesClimaticas.get("Temperature").get("Value"); // No entiendo porque esto no funciona pero imagino que trae el Value dentro del Temperature
    this.probabilidadLluvia = (int) condicionesClimaticas.get("PrecipitationProbability");

  }

  public int getProbabilidadLluvia() {
    return probabilidadLluvia;
  }

  public int getTemperatura() {
    return temperatura;
  }

  private List<Map<String, Object>> consultarClima(String ciudad){
    AccuWeatherAPI apiClima = new AccuWeatherAPI();
    List<Map<String, Object>> condicionesClimaticas = apiClima.getWeather(ciudad);
    condicionesClimaticas.get(0).get("PrecipitationProbability"); //Devuelve un número del 0 al 1
    return condicionesClimaticas;
  }

  boolean estasVigenteSegun(int cantidadDeHorasPosible) {
    LocalDateTime horaActual = LocalDateTime.now();
    Duration vigencia = Duration.between(horaClima, horaActual);
    return vigencia.toHours() < cantidadDeHorasPosible;
  }
}
