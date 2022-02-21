public class Student extends Person{
    String faculty;
    String matr;

    public Student(String name, String lastname, int age, String faculty, String matr){
        super(name, lastname, age);
        this.faculty = faculty;
        this.matr = matr;
    }

    public String getFaculty() {
        return faculty;
    }
    public String getMatr() {
        return matr;
    }

    @Override
    public void afs() {
        super.afs();
        System.out.println("Facultatea: " + faculty);
        System.out.println("Nr matricol: " + matr);
    }
}
