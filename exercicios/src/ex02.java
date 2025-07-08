import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade;

        System.out.print("Digite sua idade: ");
        idade = ler.nextInt();
        if(idade < 18){
            System.out.println("Menor de idade, proibido a entrada.");
        }
        else {
            System.out.println("Maior de idade, entrada liberada.");
            ler.close();
        }
    }
}
