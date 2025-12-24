public class Example02_06 {
    long id = 6806021610182L;
    String name = "Nadtwat";
    String surname = "Jitaree";
    int age = 24;

    public Example02_06() {

    }

    public static void main(String[] args) {
        String info;
        Example02_06 person = new Example02_06();
        info = person.name + " " + person.surname;
        info += ", " + person.age + " year old.";
    }
}
