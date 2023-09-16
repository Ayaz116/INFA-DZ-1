import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int s = n.nextInt();
        System.out.println((s == 1|| s == 2) ? "Неудовлетворительно" : s == 3 ? "Удовлетворительно" : s == 4 ? "Хорошо": s == 5 ? "Отлично": "Ошибка");

    }
}

