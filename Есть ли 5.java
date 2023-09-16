import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        byte f = 0;
        int a = n.nextInt();
        while (a != 0){
            if (f == 0 && a == 5){
                f++;
            }
            a = n.nextInt();
        }
        if (f == 0) {
            System.out.println("NO");
        } else{
            System.out.println("YES");
        }
    }
}
