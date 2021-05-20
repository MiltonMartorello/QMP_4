import java.util.List;
import java.util.Map;

public class Usuario implements Algo{
    String ciudad;

    private Atuendo sugerencia(){
        return SugeridorDeAtuendos.recomendarAtuendo();
    }
}
