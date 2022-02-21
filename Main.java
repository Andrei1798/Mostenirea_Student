import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner rText = new Scanner(System.in);
        Scanner rNum = new Scanner(System.in);
        System.out.println("Cati Studenti doriti sa introduceti ?");
        System.err.print("> ");
        int num = rNum.nextInt();
        Student[] students = new Student[num];
        for (int i = 0; i < num; i++) {
            System.out.println();
            System.out.print("Numele : ");
            String name = rText.nextLine();
            System.out.print("Prenumele : ");
            String lastname = rText.nextLine();
            System.out.print("Varsta : ");
            int age = rNum.nextInt();
            System.out.print("Facultatea : ");
            String faculty = rText.nextLine();
            System.out.print("Nr matricol : ");
            String num_matrix = rText.nextLine();

            students[i] = new Student(name, lastname, age, faculty, num_matrix);
        }
        int c = 0;
        for (int i = 0; i < students.length; i++) {
            String currentName = students[i].getName();
            System.out.println(students[i].getName());
            System.out.println(students[i].getLastname());
            if (currentName.equals("Ion")) {
                c++;
            }
        }
        System.out.println("Studenti cu numele Ion sunt : " + c);
        rNum.close();
        rText.close();
    }
}