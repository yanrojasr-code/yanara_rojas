public  abstract class  Bicicleta {
    private String codigoBicicleta;
    private  int anoFabricacion;
    private  double peso;


    public Bicicleta(String codigoBicicleta, int anoFabricacion, double peso) {
        setCodigoBicicleta(codigoBicicleta);
        setAnoFabricacion(anoFabricacion);
        setPeso(peso);

    }

    public String getCodigoBicicleta() {
        return codigoBicicleta;
    }

    public void setCodigoBicicleta(String codigoBicicleta) {
        this.codigoBicicleta = codigoBicicleta;
    }

    public int getAnoFabricacion() {
        return anoFabricacion;
    }

    public void setAnoFabricacion(int anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "codigoBicicleta='" + codigoBicicleta + '\'' +
                ", anoFabricacion=" + anoFabricacion +
                '}';
    }
}
