import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.println("Начало");
        for (int i = 200; i <= 888; i+=2){
            System.out.print((i/100 %2 == 0 && i%100/10%2==0) ? i + " ": "");
        }
        System.out.println("\n" + "Конец");
    }
}

