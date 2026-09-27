public class BicicletaMontanya extends Bicicleta{

    private  int suspensiones;

    public BicicletaMontanya(String codigoBicicleta, int anoFabricacion, double peso, int suspensiones) {
        super(codigoBicicleta, anoFabricacion, peso);
        setSuspensiones(suspensiones);
    }

    public int getSuspensiones() {
        return suspensiones;
    }

    public void setSuspensiones(int suspensiones) {
        this.suspensiones = suspensiones;
    }
    public double calcularcostomantencion(){
        double costo = 30000;
        if (suspensiones >1){
        costo = costo *1.15;
        }
        return  costo;
    }

}
