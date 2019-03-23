package general;
public class Amphibians implements Mammals,Fish
 {
     public void eat()
   {          
   System.out.println("Amphibians eating");
   }
       public void travel()
   {
      System.out.println("Amphibians traveling");
   } 

/*Main Method*/
   public static void main(String args[])
 {
      Amphibians a = new Amphibians();
      a.eat();
      a.travel();
   }
}