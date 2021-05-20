import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class SugeridorDeAtuendos {


  private Clima clima;
  private int horasVigencia;
  private String ciudad;
  private static SugeridorDeAtuendos sugeridorDeAtuendos;

  public SugeridorDeAtuendos(String unaCiudad) {

    this.clima = new Clima(unaCiudad);;
    this.horasVigencia = 12;
    this.ciudad = unaCiudad;
  }

  // Mensaje del administrador
  public void setHorasVigencia(int horasVigencia) {
    this.horasVigencia = horasVigencia;
  }

  // Instance
  public static SugeridorDeAtuendos getSugeridorDeAtuendos() {
    return sugeridorDeAtuendos;
  }

  // mensaje del usuario
  public Atuendo recomendarAtuendo() {
    actualizarClima(ciudad);
    RepositorioDePrendas.buscarPrendasPara(clima.getTemperatura());
  }

  private void actualizarClima(String unaCiudad) {

    if (!climaVigente()) {
      nuevoClima(unaCiudad);
    }
  }

  private boolean climaVigente() {
    return clima.estasVigenteSegun(horasVigencia);
  }

  private void nuevoClima(String unaCiudad) {
    this.clima = new Clima(unaCiudad);
  }


}
