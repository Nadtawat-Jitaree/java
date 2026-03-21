public class Student {
    //Data Hiding
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if (age > 0)
            this.age = age;
        else System.out.println("Error age.");
    }

    public String getName() {
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String toString(){
        return "Name : " + getName() + ", age : " + getAge();
    }
}
