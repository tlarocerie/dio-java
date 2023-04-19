public class SmartTv {
    boolean status = false;
    int canal=1;
    int volume=25;

    public void ligar(){
        status = true;
    }
    
    public void desligar(){
        status = false;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void aumentarCanal(){
        canal++;
    }
    
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}
