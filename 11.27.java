import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int x = n.nextInt();
        System.out.println("Начало");
        for (int i = 10; i <= 99; i++){
            System.out.print((i/10 + i % 10) == x ? i + " ": "");
        }
        System.out.println("\n" + "Конец");
    }
}

