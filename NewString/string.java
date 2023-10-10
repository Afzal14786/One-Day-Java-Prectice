public class string{
    public static void main(String[] args) {
        // System.out.println("Hello World!");
        // Reversing a stirng //

        // String str = "name";
        // String str1 = " ";
        // for(int i=str.length()-1; i>=0; i--){
        //     str1 = str1 + str.charAt(i);        //case 1 (Character reverse)
        // }
        // System.out.println("before reversing " + str);
        // System.out.println("after reversing  " + str1);

        // // Case 2: _ Character interchange //
        
        // String chr = "Md Afzal Ansari";
        // String chr1 = " ";
        // String chr2[] = chr.split(" ");
        // for(int i=chr2.length-1; i>=0; i--){
        //     chr1 = chr1 + chr2[i] + " ";
        // }
        // System.out.println("before interchange " + chr);
        // System.out.println("after interchange " + chr1);

        // //Case 3: _ 
        String sr = "Md Afzal Ansari";
        String sr1 = " ";
        String arr[] = sr.split(" ");

        for(String elem:arr)
        {
            for(int i=elem.length()-1; i>=0; i--)
            {
                sr1 = sr1+ elem.charAt(i);
            }
            sr1=sr1+ " ";
        }
        System.out.println("before reversing " + sr);
        System.out.println("after reversing " + sr1);

        // String name = "Mumbai Indians";
        // String name1 = " ";
        // String arrs[] = name.split(" ");

        // for(String element:arrs)
        // {
        //     for(int i=element.length()-1; i>=0; i--)
        //     {
        //         name1 = name1 + element.charAt(i);
        //     }
        //     name1 =name1 + " ";
        // }
        // System.out.println("Before Reversing " + name);
        // System.out.println("After Reversing " + name1);
    }
}