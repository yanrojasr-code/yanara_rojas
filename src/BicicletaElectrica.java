public class BicicletaElectrica extends  Bicicleta implements  ConGarantiaExtendida{

    private  int autonomia;
    private  boolean bateriacertificada;
    private  boolean garantiaextendida;

    public BicicletaElectrica(String codigo, int anoFabricacion, double peso, int autonomia, boolean bateriacertificada, boolean garantiaextendida) {
        super(codigo, anoFabricacion, peso);

        setAutonomia(autonomia);
        setBateriacertificada(bateriacertificada);
        setGarantiaextendida(garantiaextendida);

    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public boolean isBateriacertificada() {
        return bateriacertificada;
    }

    public void setBateriacertificada(boolean bateriacertificada) {
        this.bateriacertificada = bateriacertificada;
    }

    public boolean isGarantiaextendida() {
        return garantiaextendida;
    }

    public void setGarantiaextendida(boolean garantiaextendida) {
        this.garantiaextendida = garantiaextendida;
    }

    public double calcularcostomantencion(){
        double costo = 45000;
        if (bateriacertificada == false){
            costo = costo + (costo * 0.25);
        }
        return  costo;
    }

    @Override
    public boolean tieneGarantiaExtendida() {
        return garantiaextendida;
    }

    @Override
    public void activarGarantiaExtendida() {
        garantiaextendida = true;

    }
}


