import java.util.*;
  // fibonach]--->
public class code
  { 
    public static void main(String[] args) {
    
      int n=5;
      //step 1:
      

      //Step2:.base condition to noramal form
     int  pre2=0;
     int  pre1=1;
     int pre=0;

      //step 3: function call to loop
      for(int i=2;i<n+1;i++)
      {
     pre=pre1+pre2;
        pre2=pre1;
        pre1=pre;
      }
     //last block contain answer
      System.out.println(pre);

    }
  }
  