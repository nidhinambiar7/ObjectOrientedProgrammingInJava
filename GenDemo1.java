class TwoGen<T, V>
{
         T ob1;
         V ob2;
          
         TwoGen(T o1, V o2)
         {
          ob1=o1;
          ob2=o2;
         }
 
        T getob1()
        {
          return ob1;
        }
       
       V getob2()
       {
         return ob2;
       }
}


class GenDemo1{
            public static void main(String args[])
         {
         TwoGen<Integer, Double>tgob;
         tgob=new TwoGen<Integer, Double>(88, 3.14);

         int v=tgob.getob1();
         System.out.println("Autoboxed value is "+v);
         double d=tgob.getob2();
         System.out.println("Autoboxed value is "+d);
}
}