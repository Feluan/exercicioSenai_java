import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade;

        System.out.print("Digite sua idade: ");
        idade = ler.nextInt();

        if(idade < 18){
            System.out.println("Menor de idade, proibido a entrada.");
        }
        ler.close();
    }
}
