import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int s = 6;
        boolean f = false;
        for (int i = 0; i < 12; i ++){
            System.out.println((" ".repeat(6-s)) + ("0".repeat(s*2)));
            if (s == 2)
                f = true;
            if (f)
                s+=1;
            else s-=1;
        }
    }
}
