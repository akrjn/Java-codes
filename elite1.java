package elite; 
public class elite1 { 
     
  public static void main(String args[]) { 
       
     // Initializing String  
     String Str = new String("Welcome to geeksforgeeks"); 
       
     // Testing if regex is present 
     System.out.print("Does String contains regex (.*)geeks(.*) ? : " ); 
     System.out.println(Str.matches("(.*)W(.*)")); 
       
     // Testing if regex is present 
     System.out.print("Does String contains regex geeks ? : " ); 
     System.out.println(Str.matches("Welcome")); 
       
  } 
} 