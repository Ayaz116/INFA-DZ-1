import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int  a = n.nextInt();
        int s = a;
        while (a != 0){
            a = n.nextInt();
            s += a;
        }
        System.out.println(s);
    }
}