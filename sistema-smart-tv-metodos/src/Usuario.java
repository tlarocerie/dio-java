public class Usuario {
    public static void main(String[] args) throws Exception {
       
        SmartTv smartTv = new SmartTv();

        System.out.println("A Tv está ligada? " + smartTv.status);
        System.out.println("Qual o canal? " + smartTv.canal);
        System.out.println("Qual o volume? " + smartTv.volume);


        smartTv.ligar();

        System.out.println("A tv ainda está ligada? "+ smartTv.status);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        System.out.println("Qual o volume atual? " + smartTv.volume);


        smartTv.aumentarCanal();
        System.out.println("Qual o canal atual? " + smartTv.canal);
        
        smartTv.mudarCanal(13);

        System.out.println("mudou o canal atual? " + smartTv.canal);
    }
}
