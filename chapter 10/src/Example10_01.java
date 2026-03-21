public class Example10_01 {
    public static void main(String[] args) {
        Student std = new Student("6806021610182", "Nadtawat", "Jitaree");
        std.setSubject(new Subject("060243103", "Computer Programing 1", 3));
        std.setSubject(new Subject("060243104", "Computer Programing 2", 3));
        std.setSubject(new Subject("060243105", "Computer Programing 3", 3));
        std.setSubject(new Subject("060243106", "Computer Programing 4", 3));
        std.setSubject(new Subject("060243107", "Computer Programing 5", 3));
        std.setSubject(new Subject("060243108", "Computer Programing 6", 3));
        std.setSubject(new Subject("060243109", "Computer Programing 7", 3));
        std.setSubject(new Subject("060243110", "Computer Programing 8", 3));
        System.out.println(std);
    }
}
