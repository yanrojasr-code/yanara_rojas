public  abstract class  Bicicleta {
    private String codigo;
    private  int anoFabricacion;
    private  double peso;


    public Bicicleta(String codigo, int anoFabricacion, double peso) {
        setCodig(codigo);
        setAnoFabricacion(anoFabricacion);
        setPeso(peso);

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodig(String codigo) {
        this.codigo = codigo;
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
        return "CODIGO: " + codigo + '\'' +
                ", ANIOFABRICACION: " + anoFabricacion +
                '}';
    }
}
