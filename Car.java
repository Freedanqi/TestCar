import java.io.*;
public class Car {
   public static void main(String[] args) {

      BCar bc = new BCar("4","red","2000","BMW");
      bc.Run(-2,0);
      
      DCar dc = new DCar("4","blue","2500","Benz");
      dc.Run(1.1,0);
      
   }
} 

interface Horn {
   public void  Honking();
}

abstract class OCar {
	
   private String tirenum;
   private String color;
   private String weight;
 
   OCar(String tirenum,String color,String weight) {
      this.tirenum=tirenum;
      this.color=color;
      this.weight=weight;
   }
 
   public abstract void Run(int a,int i);
   public abstract void Run(double a,double i);

}
   
class BCar extends OCar implements Horn {
   private String trademark1;
   BCar(String tirenum,String color,String weight,String B) {
      super(tirenum,color,weight);
      trademark1=B;
      System.out.println("\n"+"The car is "+B+" "+tirenum+" "+color+" "+weight);
   }
   public void  Honking() {
      System.out.println("didi.di..di...di....di.....");
   }

   public void Run(double a,double i) {
      System.out.println("duoyu 0 !");
   }
   public void Run(int a,int i) {
     
      System.out.print("v= ");
      System.out.print(i);
      System.out.print(" a= ");
      System.out.print(a);
      System.out.println();

      if(i!=0) {
         System.out.println("The car is very crazy!"+"\n"); 
      }
      if(i==0) {
	      
         if(a==0) {
            System.out.println("The car lacks energy!"); 
	 }
	 if(a>0) {
            System.out.println("The car is accelerating!");
	 }

	 if(a<0) {
            System.out.println("The car is slowing!");
	 }
         System.out.println();
      }
   }
}
	
class DCar extends OCar implements Horn{
   private String trademark2;
   DCar(String tirenum,String color,String weight,String D) {
      super(tirenum,color,weight);
      trademark2=D;
      System.out.println("\n"+"The car is "+D+" "+tirenum+" "+color+" "+weight);
   }
   public void  Honking() {
      System.out.println("dada.da..da...da....da.....");
   }
   public void Run(int a,int i) {
      System.out.println("duoyu 1 !");
   }

   public void Run(double a,double i) {
     
      System.out.print("v= ");
      System.out.print(i);
      System.out.print(" a= ");
      System.out.print(a);
      System.out.println();
      if(i!=0) {
         System.out.println("The car is very crazy!"+"\n"); 
      }
      if(i==0) {
         if(a==0) {
            System.out.println("The car lacks energy!"); 
	 }
	 if(a>0) {
            System.out.println("The car is accelerating!");
	 }

	 if(a<0) {
            System.out.println("The car is slowing!");
	 }
         System.out.println();
      }
   }
}

