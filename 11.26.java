import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int x = n.nextInt();
        System.out.println("Начало");
        for (int i = -Math.abs(x) + 1; Math.abs(i) < x; i++){
            System.out.print(i + " ");
        }
        System.out.println("\n" + "Конец");
    }
}

