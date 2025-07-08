import java.util.Scanner;

public class ex05 {
    public static void main(String[] var0) {
        Scanner sc = new Scanner(System.in);
        double altura, altura2 = 0;

        System.out.print("Digite sua altura: ");
        altura = sc.nextDouble();
        System.out.print("Digite a altura da outra pessoa: ");
        altura2 = sc.nextDouble();
        if(altura > altura2){
            System.out.println("a pessoa 1 é maior que a pessoa 2");
        }
        else {
            System.out.println("a pessoa 2 é menor que a pessoa 1");
        }
        sc.close();
    }
}
