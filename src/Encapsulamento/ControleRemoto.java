package Encapsulamento;

public class ControleRemoto implements Controlador{
    // atributos
    private int volume;
    private boolean tocando;
    private boolean ligando;

    public ControleRemoto() {
        this.volume=50;
        this.tocando=false;
        this.ligando=false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    private boolean isLigando() {
        return ligando;
    }

    private void setLigando(boolean ligando) {
        this.ligando = ligando;
    }


    @Override
    public void Ligar() {
        setLigando(true);
    }

    @Override
    public void Desligar() {
        setLigando(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligando?"+this.isLigando());
        System.out.println("Está tocando? "+ this.isTocando());
        System.out.println("Volume:" + this.getVolume());
        for( int i=0; i<=this.getVolume(); i+=10){
            System.out.println("|");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu....");
    }

    @Override
    public void maisVolume() {
        if(this.isLigando()){
            this.setVolume(this.getVolume()+1);
            System.out.println("Volume is increased");
        }
    }

    @Override
    public void menosVolume() {
        if(this.isLigando()){
            this.setVolume(this.getVolume()-1);
            System.out.println("Volume is decreased");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.isLigando() && this.getVolume()>0){
            this.setVolume(0);
            System.out.println("Volume is muted...");
        }
    }

    @Override
    public void desligarMudo() {
        if(this.isLigando() && this.getVolume()==0){
            this.setVolume(50);
            System.out.println("Volume is active");
        }
    }

    @Override
    public void play() {
        if(this.isLigando() && !this.isTocando()){
            this.setTocando(true);
            System.out.println("Play!");
        }
    }

    @Override
    public void stop() {
        if(this.isLigando() && this.isTocando()){
            this.setTocando(false);
            System.out.println("Stop!");
        }
    }
}
