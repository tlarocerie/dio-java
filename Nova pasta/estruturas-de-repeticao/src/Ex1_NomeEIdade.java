import java.util.Scanner;

public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        
        try (Scanner scan = new Scanner(System.in)) {
            String nome;
            int idade; 


            
                System.out.println("Nome: ");
                nome = scan.next();
                
                System.out.println("Idade: ");
                idade = scan.nextInt();
            

            System.out.println("Seu nome é "+ nome);
            System.out.println("Sua idade é "+ idade);
        }
        

    }
}
