package opensource;

public class problem_3_1 {

   public static void main(String[] args) {
	   /*      int sum = 0;, i = 0;	//(2)번

      while (i < 100) {
          sum = sum + i;
          i += 2;
      }
      */
/*	  int sum = 0;	//(3)번 
      for(int i=0; i<100; i+=2) {
          sum = sum + i;
   }*/
	   int sum = 0, i = 0;	//(4)번
	      do {
	         sum = sum + i;
	         i += 2;
	      }while(i < 100);
	   
      System.out.println(sum);

}
}