import java.util.ArrayList;
import java.util.List;

public class Atuendo {

  List<Prenda> prendas = new ArrayList<>();

  private void agregarPrenda(Prenda prenda) {
    esPrendaVaida();
    prendas.add(prenda);
  }

  // este metodo validaría que una prenda sea valida y con la categoria disponible
  private boolean esPrendaVaida() {
    return true;
  }
}
