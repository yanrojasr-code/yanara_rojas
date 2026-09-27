import  java.util.ArrayList;
public  class Main {
    public static  void main(String[] args){

        BicicletaElectrica bicicleta1 = new BicicletaElectrica("BIC-E01",2023,22.5,60,false,false);
        BicicletaElectrica bicicleta2 = new BicicletaElectrica("BIC-E02",2022,24.0, 45,false,true);
        BicicletaMontanya bicicleta3  = new BicicletaMontanya("BiC-M01",2021,13.5,2);
        BicicletaMontanya bicicleta4  = new BicicletaMontanya("BIC-M02",2020,12, 1);

        bicicleta1.activarGarantiaExtendida();

        GestorTallerBicicletas gestor = new GestorTallerBicicletas();

        gestor.registrarBicicleta(bicicleta1);
        gestor.registrarBicicleta(bicicleta2);
        gestor.registrarBicicleta(bicicleta3);
        gestor.registrarBicicleta(bicicleta4);

        System.out.println("=========LISTADO DE BICICLETA ========== ");

        System.out.println( bicicleta1);
        System.out.println(bicicleta2);
        System.out.println(bicicleta3);
        System.out.println(bicicleta4);










    }
}