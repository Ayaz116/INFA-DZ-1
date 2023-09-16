import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int max = 0, a = n.nextInt();
        while (a != 0){
            if (max < a){
                max = a;
            }
            a = n.nextInt();

        }
        System.out.println(max);

    }
}
