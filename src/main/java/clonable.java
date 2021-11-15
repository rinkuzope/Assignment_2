
public class clonable implements Cloneable {
    private String name;
    private int age;

    public clonable(String name, int age) {
        this.age = age;
        this.name = name;

    }

    public void Display() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return (clonable)super.clone();
    }


    public static void main(String[] args) {
        try{
        clonable c = new clonable("Rinku", 22);
        clonable c1 = (clonable) c.clone();
        System.out.println("============= Cloning (✿◠‿◠)  ============================");
        c.Display();
        c1.Display();
        System.out.println("=============After changing values (ง︡'-'︠)ง ============================");
        c.name = "Baka"; c.age = 21;
            c.Display();
            c1.Display();
        }
        catch(CloneNotSupportedException c)
        {
            System.out.println(c.getMessage());
        }
    }
}


