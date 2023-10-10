public class Test {
    int a;
    int x =3643;
    String name;    //this two variables are instance variable

    public static void main(String[] args) {
        // all the variables under main method, known as local variables
        int num =90;
        int x;

		 if(args.length>0)
		 {
	             x=108543;
		 }
         else
         {
            x = 30;
         }
         System.out.println(x);

        Test obj2 = new Test();
        Test obj =new Test();
        Test obj1 =new Test();

        obj.name ="Md Afzal Ansari";
        obj.a =20;

        System.out.println(obj.name);
        System.out.println(obj.a);

        System.out.println(obj1.name);
        System.out.println(obj1.a);
        System.out.println(obj2.x);
    }
}
