public class Student {
    private String id = "";
    private String name = "";
    private String surname = "";
    private Subject subjects[] = new Subject[8];
    private int index = 0;

    public Student() {
    };

    public Student(String id, String name, String surname) {
        setId(id);
        setName(name);
        setSurname(surname);
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSubject(Subject sub) {
        if (index < subjects.length) {
            this.subjects[index] = sub;
            index++;
        }
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public Subject getSubject(int index) {
        return subjects[index];
    }

    public String toStudent() {
        return getId() + " : " + getName() + " : " + getSurname();
    }

    public String toString() {
        String output = "";
        output = toStudent() + "\n";
        for (int n = 0; n < subjects.length; n++) {
            output += "Subject" + (n + 1) + " : " + subjects[n].toString() + "\n";
        }
        return output;
    }
}
