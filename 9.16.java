import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int s = n.nextInt();
        System.out.println((6 <= s && s < 10) ? "Утро": (10 < s && s <= 18) ? "День": (18 < s && s <= 22) ? "Вечер": ((22 < s && s <=24) || (0 <= s && s < 6)) ? "Ночь" : "Ошибка!");
    }
}

