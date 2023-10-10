public class String2 {
    public static void main(String[] args) {
        // String Concatination //
         // Various approaches to concatenating a string in java include the following //
        // * + operator
        // * String.concat();

//        String s1 = new String("afzal");
//        s1.concat("ansari");
//        System.out.println(s1);
//
//        String s2 = new String("Md");
//        s2 = s2.concat("afzal");
//        System.out.println(s2);

        // String s1 = "naam";
        // String s2 = s1.concat("hai");
        // String s3 = new String("mera");    // Example of concatenation using .concat();
        // s3 = s3.concat("afzal");
        // System.out.println(s1); //naam
        // System.out.println(s2); //naamhai
        // System.out.println(s3); //meraafzal

        // + operator in String Concatination
       String s1 = "cat";
       String s2 = "cat" + "run";
       String s3 = "cat" + "run" + "away";
       String s4 = s1 + s2;
       System.out.println(s1);
       System.out.println(s2);
       System.out.println(s3);
       System.out.println(s4);
       String str = "afzal" + '@' + 14786; 
        System.out.println(str);
            //here number is consider as string in using the +(plus) operator for string concatination
            
    }
}