import java.util.ArrayList;
import java.util.List;

public class RepositorioDePrendas {

  RepositorioDePrendas repositorioDePrendas = new RepositorioDePrendas();

  List<Prenda> prendas = new ArrayList<>();

  public static List<Prenda> buscarPrendasPara(int temperatura) {
    return prendas.stream().filter(prenda -> prenda.abrigaPara(temperatura)); // no pude resolver esto. creo que necesito una abstraccion sugerencia
  }

  public List<Prenda> getPrendas() {
    return prendas;
  }

  private void agregarPrenda(Prenda prenda) {
    prendas.add(prenda);
  }


}
