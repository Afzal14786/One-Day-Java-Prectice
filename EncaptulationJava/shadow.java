class student
{
    private int age;
    private String name;

    student(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    // public void setAge(int age) {
    //     this.age = age;
    // }
    
    // public void setName(String name) {
    //     this.name = name;
    // }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
   
    public void show()
    {
        System.out.println(name + ":" + age);
    }
}
public class shadow {
    public static void main(String[] args) {
        
        student std = new student("Afzal",10);
        // std.setName("afzal");
        // std.setAge(20);
        String name = std.getName();
        int age = std.getAge();
        System.out.println(name);
        System.out.println(age);
    }
}