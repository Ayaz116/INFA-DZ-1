import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Начало");
        for (int i = 9900; i >= 1000; i-=100){
            System.out.print(i + " ");
        }
        System.out.println("\n" + "Конец");
    }
}

