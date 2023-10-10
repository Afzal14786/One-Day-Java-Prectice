package JVMarchitecture;

class Demo {
    // static void disp(){
    //     System.out.println("Static disp() method");
    // }

    // void disp1(){
    //     System.out.println("Non-Static disp1() method");
    // }

    static int a;
    static int b;

    int m;
    int n;
    static{
        a=20;
        b=30;
        System.out.println("Control in static block");
    }
    {
        m=30;
        n=40;
        System.out.println("Non-Static block");
    }
    static void disp(){
        System.out.println("Value of static var " + a);
        System.out.println("Value of static var " + b);
    }

        void disp1(){
        System.out.println("Value of instance var " + m);
        System.out.println("Value of instance var " + n);
    }
}

public class arch1 {
    public static void main(String[] args) {
        // Demo.disp();
        // // Demo.disp1();  give an error
        // Demo d = new Demo();
        // d.disp1();

        Demo d = new Demo();
        Demo.disp();
        d.disp1();
    }
}