import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {

            int quantNumeros, quantPares=0, quantImpares=0, numero;


            System.out.println("Quantidade de número: ");
            quantNumeros = scan.nextInt();

            int count = 0;
            do{
                System.out.println("Número: ");
                numero = scan.nextInt();
                
                if(numero%2 == 0) quantPares++;  
                else quantImpares++;

                count++;
            }while(count< quantNumeros);

            System.out.println("Quantidade de pares é "+ quantPares);
            
            System.out.println("Quantidade de ímpares é "+ quantImpares);
        }
    }
}
