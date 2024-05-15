package Chapter04;

public class ProfilePrint {

    byte age;
    String name;
    boolean isMarried;
    public void setAge(byte age) {
        this.age = age;
    }

    public byte getAge(){
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
       return name;
    }

    public void setMarried(boolean flag) {
        this.isMarried = flag;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public static void main(String[] args) {

        ProfilePrint p = new ProfilePrint();
        p.setAge((byte) 20);
        p.setName("Kim");
        p.setMarried(true);

        System.out.println("name: " + p.getName());
        System.out.println("age: " + p.getAge());
        System.out.println("married: " + p.isMarried());
    }
}
