import java.util.Date;

public class Student extends Person {
    private Date data;
    private int num;
    private String email;

    public Student(String name, Date dataN) {
        super(name);
        //this.data = dataN;
        this.setData(dataN);
    }

    public Student(String name, Date dataN, int num) {
        this(name, dataN);
        this.setNum(num);


    }


    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }


    @Override
    public String toString() {
        return super.toString()+" data: "+this.data;
    }

    public static void main(String[] args) {

        System.out.println(new Student("Jordi", new Date()));
        System.out.println(new Student("Joan", new Date()));
        System.out.println(new Student("Pere", new Date()));
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
