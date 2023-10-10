class student
{
    private int age;
    private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void display()
    {
        System.out.println(name +":"+ age);
    }
}
public class encaptulation {
    public static void main(String[] args) {
        // Building of data and corresponding methods into a single unit is called "Encaptulation".
        // If any java class follows data hiding and abstraction then such class isreferred as "Encaptulation class".
        // Encaptulation = Data Hiding + Data Abstraction.
        student std =new student();
        student std1 =new student();
        student std2 =new student();
        // std.age=20;
        // std.name="Afzal";   //ehwn we use private keyword, and if we try to get the object then we get error//
        std1.setAge(23);
        std1.setName("Md Afzal");
        std.setAge(24);
        std.setName("Rabbani");

        std2.setName("Rekha");
        std2.setAge(20);

        std2.display();
        std1.display(); 
        std.display(); 
    }
}