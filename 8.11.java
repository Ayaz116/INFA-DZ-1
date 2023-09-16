import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int stud = n.nextInt(), stul = n.nextInt();
        System.out.println(stud > stul ? ("Количество студентов которым не хватит стульев: " + (stud - stul)):
                stul > stud ? (("Количество лишних стульев: ") + (stul - stud)): "Каждому студенту достанется по стулу");
    }
}

