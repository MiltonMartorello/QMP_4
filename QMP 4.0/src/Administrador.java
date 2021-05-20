public class Administrador implements Algo{


  private void configurarHorasDeClima(int horas) {
    SugeridorDeAtuendos.getSugeridorDeAtuendos().setHorasVigencia(horas);
  }
}
