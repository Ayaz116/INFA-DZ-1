import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int s = n.nextInt(), s2 = n.nextInt();
        System.out.println(((s>0 && s2 > 0) || (s<0 && s2 < 0)) ? "Равные знаки": (s==0 || s2==0) ? "Некорректно":"Разные знаки");
    }
}

