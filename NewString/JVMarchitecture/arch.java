package JVMarchitecture;

public class arch {
    static int age;
    static String name;

    static{
        // age=18;
        System.out.println("Static Block first execuate " + age);
        System.out.println(age); //default value =18;
        System.out.println(name); // default value = null;
    }
    static void disp(){
        System.out.println("Static display method");
    }
    public static void main(String[] args) {
        System.out.println("Main method second executation");
        // disp();
    }
}