package Encapsulamento;

public class Encapsulamento {
    public static  void main(String[] args) throws Exception {
        Controlador c =new ControleRemoto();
        c.Ligar();

        c.maisVolume();

        c.abrirMenu();
    }
}
