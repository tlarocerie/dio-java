import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {

            int numero;
            int maior=0;
            int count = 0;
            int soma=0;

            do{
                System.out.println("\nNumero: ");
                numero= scan.nextInt();

                soma = soma + numero;

                if(numero > maior) maior = numero;
                count++;
                
            }while(count < 5);

            System.out.println("Maior: " + maior);
            System.out.println("Media: " + (soma/count));
        }

    }
}
