import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int s = n.nextInt();
        System.out.println(s/10 > s%10 ? "Первая цифра больше" : "Вторая цифра больше");
    }
}

