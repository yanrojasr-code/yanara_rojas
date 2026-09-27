import java.util.ArrayList;

public class GestorTallerBicicletas {
    private ArrayList<Bicicleta>bicicletas;
    public GestorTallerBicicletas(){
        bicicletas = new ArrayList<>();
    }
    public void registrarBicicleta (Bicicleta bicicleta){
        bicicletas.add(bicicleta);
        System.out.println("Registrada Correctamente.");
    }

    public ArrayList<Bicicleta> buscarPorCodigo(String codigo){
        ArrayList<Bicicleta> resultado = new ArrayList<>();

        for (Bicicleta bicicleta : bicicletas){
            switch  (bicicleta.getCodigo()){
                case "BIC-E01":
                    resultado.add(bicicleta);
                    break;

            }

        }
        return  resultado;

    }

}
