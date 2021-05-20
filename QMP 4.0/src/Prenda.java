public class Prenda {

  int colorPrincipal;
  int colorSecundario;
  TipoPrenda tipoPrenda;
  Categoria categoria;

  public boolean abrigaPara(int temperatura) {
    return temperatura > tipoPrenda.getAbrigo();
  }
}
