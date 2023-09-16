import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int s = n.nextInt();
        System.out.println((s <= 3600) ? s/60 + " Минут " + s % 60 + " Секунд": "Расчет не производится");
    }
}

