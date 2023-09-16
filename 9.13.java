import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int s = n.nextInt();
        System.out.println((s/100 > s%100/10 && s%100/10 > s%10) ? "Опущенное число":"Ровное число");

    }
}

