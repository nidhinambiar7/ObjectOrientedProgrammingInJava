import java.util.*;
class Gen<T>{
         T Ob;
         
         Gen(T o)
         {
            Ob=o;
         }
      
      T getOb()
        {
           return Ob;
        }
 
   
 }

class GenDemo{
         public static void main(String args[]){
                   Gen<Integer> iob;
                   iob=new Gen<Integer>(88);
                  
                   int v=iob.getOb();

                   System.out.println("Autoboxed value is "+v);

                    Gen<Double> dob;
                   dob=new Gen<Double>(8.0);
                  
           double d=dob.getOb();

                   System.out.println("Autoboxed value is "+ d);

                   
   }}