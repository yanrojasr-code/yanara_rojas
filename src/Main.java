import  java.util.ArrayList;
public  class Main {
    public static  void main(String[] args){

        BicicletaElectrica bicicleta1 = new BicicletaElectrica("BIC-E01",2023,22.5,60,false,false);
        BicicletaElectrica bicicleta2 = new BicicletaElectrica("BIC-E02",2022,24.0, 45,true,false);
        BicicletaMontanya bicicleta3  = new BicicletaMontanya("BiC-M01",2021,13.5,2);
        BicicletaMontanya bicicleta4  = new BicicletaMontanya("BIC-M02",2020,12, 1);

        bicicleta1.activarGarantiaExtendida();

        GestorTallerBicicletas gestor = new GestorTallerBicicletas();

        gestor.registrarBicicleta(bicicleta1);
        gestor.registrarBicicleta(bicicleta2);
        gestor.registrarBicicleta(bicicleta3);
        gestor.registrarBicicleta(bicicleta4);
        System.out.println("--------------------------------------------------------------------");
        ArrayList<Bicicleta> resultado = gestor.buscarPorCodigo("BIC-E01");
        for (Bicicleta bicicleta : resultado);
        System.out.println("TIPO: BICICLETA ELECTRICA | " + "CODIGO: " + bicicleta1.getCodigo());
        System.out.println("PESO:" + bicicleta1.getPeso() + " | AÑO: " + bicicleta1.getAnoFabricacion());
        System.out.println("AUTONOMIA: " + bicicleta1.getAutonomia() + " | BATERIA CERTIFICADA: " + bicicleta1.isBateriacertificada());
        System.out.println("GARANTIA EXTENDIDA : " + bicicleta1.isGarantiaextendida() + " | COSTO MANTENCIO: " + bicicleta1.calcularcostomantencion() );;

        System.out.println("----------------------------------------------------------------------");
        System.out.println("=========LISTADO DE BICICLETA ========== ");
        System.out.println( bicicleta1);
        System.out.println(bicicleta2);
        System.out.println(bicicleta3);
        System.out.println(bicicleta4);












    }
}