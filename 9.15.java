import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int s = n.nextInt();
        System.out.println((s >= 1 && s <= 2) ? "Зима" : (s>=3 && s <= 5) ? "Весна": (s>=6 && s <= 8) ? "Лето": (s>=9&&s<=11) ? "Осень": s == 12 ? "Зима": "ошибка");

    }
}

