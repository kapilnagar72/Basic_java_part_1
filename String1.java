package BasicSA;
public class String1 {
    public static void main (String[]args){
      //  String brand = "vaibhav.software"; //not changeable .immutable
        //System.out.println(brand);
        StringBuilder brand = new StringBuilder ("vaibhav.software");     // mutable
        System.out.println(brand);
        brand.append("viabhav.developer");
        System.out.println(brand);    
        
        

        StringBuffer brand1 = new StringBuffer("java developer");
        System.out.println(brand1);
        brand1.append("vaibhav.com");
        System.out.println(brand1);
}
}