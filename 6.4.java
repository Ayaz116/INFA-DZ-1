import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int s = n.nextInt();
        System.out.println(s > 0 ? s*2 : 0);
    }
}

