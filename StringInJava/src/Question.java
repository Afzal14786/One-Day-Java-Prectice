public class Question {
    public static void main(String[] args) {
        // Prectice Question for String //
        // Reversing String Different cases

        // caseI => "afzal" (Input)
        //Output=> "lazfa"

        String str1 = "afzal ansari";
        String str2 = " ";

        String arr[]=str1.split(" ");
//        for (int i = str1.length()-1; i>=0; i--){
//            str2 = str2 + str1.charAt(i);
//        }
        for (int i =arr.length-1; i>=0; i--){
           str2 = str2 + arr[i] + " ";
        }
        System.out.println("Before reversing" + str1);
        System.out.println("After reversing" + str2);
    }
}
