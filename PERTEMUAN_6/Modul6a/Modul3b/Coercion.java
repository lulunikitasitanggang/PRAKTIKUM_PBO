public class Coercion
{
    public static void main(String[] args)
    {
        
        int output1 = 'a';
        System.out.println(output1); 

        double x = 15.5;
        int output2 = (int) x;
        System.out.println(output2); 
       
        int y = 25;
        double output3 = (double) y;
        System.out.println(output3); 
       
        int z = 78;
        char output4 = (char) z;
        System.out.println(output4); 
        
        char a = 'a';
        double output5 = a;
        System.out.println(output5); 
    }
}