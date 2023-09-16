import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int s = n.nextInt();
        System.out.println(s%2==0? "Up to "  + (s/10*10+10): "Down to " + (s/10*10);
    }
}

