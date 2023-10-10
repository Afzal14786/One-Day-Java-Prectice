public class String1 {
    public static void main(String[] args) {
       String brand1 = "Sahil";
       System.out.println(brand1);

       String brand2 = brand1.concat("Lohawala");
       System.out.println(brand2);

    //    StringBuilder brand = new StringBuilder("PWSKILLS  ");
    //    System.out.println(brand);
    //    brand.append("Alakpanday");
    //    System.out.println(brand);
    //    String brand = "FJ";
    //    System.out.println(brand);
    //    String brand1 = new String("Store");
    //    System.out.println(brand1);

        String name = "Afzal";
        String name1 = "Afzal";
        System.out.println(name); // different variables bt value is same,
        // object of this String created once a time because its object created in the String Constant Pool
        System.out.println(name1); // Both variable has same object address because
        // both variables are refer to the same object

        // Dublicates objects are not allowed in the String Constant Pool //
        System.out.println(name==name1); //false

        String name2 = new String("Ansari"); // Here, we create string using new keyword,
        // thats why its object will allocate outside the "String Constant Pool" with two different object location.
        // Each variable has saperate object locaton in Outside the String Constant Pool.
        // Each variable has its own object location.
        String name3 = new String("Ansari");
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name2==name3); //true

        // Different ways to comparision of a String
        // To compare 2 strings in java we use following approach
        // *    == operator
        // To compare referance of the object we use following approach
        // *    equals()

        String s1 = "Afzal";
        String s2 = new String("Afzal");
        System.out.println(s1==s2); // Output false because refreances are refer to the two different objects
        System.out.println(s1.equals(s2)); //Output true because objects are same, means value of two String objects are same,
        // so its become true.

        System.out.println();

        String naam = "Afzal";
        String naam1= "Afzal";
        String naam2 = "afzal";
        System.out.println(naam==naam1); //true because both referances has same objects
        System.out.println(naam==naam2); // false because both refer to different object values
        System.out.println(naam.equals(naam1)); // true because the value of the referance object is same
        System.out.println(naam.equals(naam2)); // false because the value of the object in different

        String n = "naam";
        String n1 = new String("naam");
        String n2 = new String("Naam");
        System.out.println(n==n1);
        System.out.println(n==n2);
        System.out.println(n1==n2);
        System.out.println(n.equals(n2));
        System.out.println(n.equals(n1));
        System.out.println(n1.equals(n2)); // false because Naam & naam is different in java

        System.out.println();
        String nm = new String("naam");
        String nm1 = new String("NAAM");
        String nm2 = new String("nAAm");
        System.out.println(nm.equalsIgnoreCase(nm1));
        System.out.println(nm.equalsIgnoreCase(nm2));
        System.out.println(nm1.equalsIgnoreCase(nm2));
    }
}