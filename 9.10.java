import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int s1 = n.nextInt(), s2 = n.nextInt(), s3 = n.nextInt();
        if ((s1 > s2) && (s1 > s3)){
            if (s1 > s3) {
                if (s2 > s3) {
                    System.out.println("Первое больше всех Третье меньше всех Второе по середине");
                } else {
                    System.out.println("Первое больше всех Второе меньше всех Третье по середине");
                }
            }
        } else if (s2 > s3){
            if (s1 > s3) {
                System.out.println("Второе больше всех Третье меньше всех Первое по середине");
            } else {
                System.out.println("Второе больше всех Первое меньше всех Третье по середине");
            }
        } else{
            if (s1 > s2){
                System.out.println("Третье больше всех Второе меньше всех Первое по середине");
            }else {
                System.out.println("Третье больше всех Первое меньше всех Второе по середине");
            }

        }
    }
}

