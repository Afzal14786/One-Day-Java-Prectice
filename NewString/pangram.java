public class pangram {
    public static void main(String[] args) {
        // boolean flag = false;
        // String pan= "THE QUICK BROWN FOX JUMPS OVER LAZY DOG";
        // pan=pan.replace(" ", "");
        
        // char arr[] = pan.toCharArray();
        // int ar[] = new int[26];

        // for(int i=0; i<arr.length; i++)
        // {
        //     ar[arr[i]-65]++;
        // }
        // for(int i=0; i<ar.length;i++)
        // {
        //     if(ar[i]==0)
        //     {
        //         System.out.println("It's not a pangram");
        //         flag =true;
        //     }
        // }
        // if(flag==false)
        // {
        //     System.out.println("It's a pangram");
        // }
        boolean flag = false;
        String str = "the quick brown fox jumps over lazy dog";
        str = str.replace(" ", "");
        str =str.toUpperCase();
        char arr[] = str.toCharArray();
        int ar[] = new int[26];
        
        for(int i=0;i<arr.length;i++)
        {
            ar[arr[i]-65]++;
        }
        for(int i=0; i<ar.length;i++)
        {
            if(ar[i]==0)
            {
                System.out.println("It's not a panagram");
                flag = true;
            }
        }
        if(flag==false)
        {
            System.out.println("It's a panagram");
        }
    }
}