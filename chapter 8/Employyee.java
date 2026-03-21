public class Employyee {
    private String name; //Data hiding

    public Employyee(String name){
        setName(name);
    }

    public void setName (String name){
        this.name = name;
    }

    public String getName () {
        return this.name;
    }

    public String toString (){
        return "Name : " + getName();
    }
}
