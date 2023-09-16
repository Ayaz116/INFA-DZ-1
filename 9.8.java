import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int s1=0, s2 =0, s = n.nextInt();
        for (int i = 0; i<3; i++){
            s1 += s % 10;
            s /= 10;
        }
        for (int i = 0; i<3; i++){
            s2 += s % 10;
            s /= 10;
        }
        System.out.println(s1 == s2 && s1%2 == 0 ? "Счастливый": "Несчастливый");
    }
}

