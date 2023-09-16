import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int k = n.nextInt();
        int m = n.nextInt();
        for (int i=k; i < m+1; i++){

            if (k % 3 == 0){
                System.out.print(k + " ");
            }

        }
    }
}
