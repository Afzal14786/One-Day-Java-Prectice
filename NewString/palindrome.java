public class palindrome {
    public static void main(String[] args) {
        String naam = "madam";
        String naa ="";
    
        for(int i=naam.length()-1; i>=0; i--)
        {
            naa = naa+naam.charAt(i);
        }
        if(naam.equals(naa))
        {
            System.out.println("Given String is a palindrome");
        }
        else
        {
            System.out.println("Given String is Not a palindrome");
        }
    }
}
