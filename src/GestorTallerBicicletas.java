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


            switch  (codigo){
                case "BIC-E01":
                    System.out.println("======= BUSQUEDA POR EL CODIGO: BIC-E01=============" );
                    resultado.add(bicicletas.get(0));
                    break;
                case "BIC-E02":
                    System.out.println("======= BUSQUEDA POR EL CODIGO: BIC-E02" );

                        resultado.add(bicicletas.get(1));
                        break;
                case "BIC-M01":
                    resultado.add(bicicletas.get(2));
                    break;
                case "BIC-M02":
                    resultado.add(bicicletas.get(3));
                    break;
            }

        return  resultado;

    }

}
