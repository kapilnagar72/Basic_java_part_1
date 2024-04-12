package BasicSA;
public class String2 {
    public static void main(String[]ard)
    {
        /* 
        // concat 
        String s1= new String("vaibhav");
        s1 = s1.cuncat  +("bhandari");
        System.out.println(s1);
        */
        String str1 = "Hello";  
        String str2 = "Java";  
        String str3 = "developer";  
        // Concatenating one string   
        String str4 = str1.concat(str2);          
        System.out.println(str4);  
        // Concatenating multiple strings  
        String str5 = str1.concat(str2).concat(str3);  
        System.out.print(str5);  
        
    }
}
