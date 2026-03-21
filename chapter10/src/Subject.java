public class Subject {
    private String code = "";
    private String name = "";
    private Integer credit = 3;

    public Subject() {
    };

    public Subject(String code, String name, Integer credit) {
        setCode(code);
        setName(name);
        setCredit(credit);
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public Integer getCredit() {
        return this.credit;
    }

    public String toString() {
        return getCode() + " : " + getName() + " : " + getCredit() + " : ";
    }
}
