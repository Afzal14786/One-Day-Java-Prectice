import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        // Steps for Anagram
        /*
         * Step1 : Remove Whitespaces
         * Step2 : convert to lowerCase/ uppercase
         * Step3 : Convert to  an character array
         * Step4 : Sort
         * Step5 : Compare both array
         */
         String str = "Triangle";
         String str1= "Integral";

         str= str.toLowerCase();
         str1=str1.toLowerCase();

         char ar[]=str.toCharArray();
         char arr[]=str1.toCharArray();

         Arrays.sort(ar);
         Arrays.sort(arr);
         if(Arrays.equals(ar, arr))
         {
            System.out.println("It's an anagram");
         }
         else
         {
            System.out.println("It's not an Anagram");
         }
    }
}
