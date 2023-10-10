        //Method Overloading//

class Calc
{                   
    public char add(char n1, char n2, char n3)
    {
        char result = n1;
        return result;
    }
    public int add(int n1, int n2, int n3)
    {
        int result = n1 + n2 + n3;
        return result;
    }
    public double add(double n1, double n2)
    {
        double result = n1 + n2;
        return result;
    }
            // Automatic promotion is Overloading//

    public void show(int n)
    {
        System.out.println("int " + n);
    }
    public void show(double n)
    {
        System.out.println("double " + n);
    }
    public void show(short n)
    {
        System.out.println("short " + n);
    }
    public void show(byte n)
    {
        System.out.println("byte " + n);
    }
    public void show(char n)
    {
        System.out.println("char " + n);
    }
    public void show(long n)
    {
        System.out.println("long " + n);
    }
}

public class method {
    public static void main(String[] args) {
        
        Calc calculator = new Calc();
        int b;
        char h = 'a';
        calculator.show(h);
        char result = calculator.add('A', 'B', 'C');
        int res = calculator.add(5,8,6);
        double res2 = calculator.add(2.6, 8.9);

        System.out.println(result);
        System.out.println(res);
        System.out.println(res2);
    }
}
