import java.util.Scanner;

public class Problem1{
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        num = entrada.nextInt();

        int aux = 0;
        for (int i = 0; i < num; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                aux += i;
            }
        }

        System.out.println(aux);

        entrada.close();
    }
}