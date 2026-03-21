public class Student {
    public String name;
    public Integer age;

    public Student(String n, int a) {
        name = n;
        age = a;
    }

    public void displayInfo() {
        System.out.println("My name is " + name + "\nMy age is " + age + " years old");
    }
}