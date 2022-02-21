public class Person {
    private String name;
    private String lastname;
    private int age;

    public Person(String name, String lastname, int age){
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public String getLastname() {
        return lastname;
    }
    public int getAge() {
        return age;
    }

    public void afs(){
        System.out.println("Nume: " + name);
        System.out.println("Prenume: " + lastname);
        System.out.println("Varsta: " + age);
    }
}
