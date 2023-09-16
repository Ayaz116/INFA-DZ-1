import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int s = n.nextInt(), s2 = n.nextInt();
        System.out.println(((s-s%10) + (s2%10)) + " " + ((s2-s2%10) + (s%10)));
    }
}

