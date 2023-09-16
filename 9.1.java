import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int a,s;
        for (int i = 0; i < 5; i++){
            a = n.nextInt();
            s = n.nextInt();
            System.out.println(a <= 10 ? "Для этого значения а: " + a + " Всегда будет false": 0);
        }

    }
}

