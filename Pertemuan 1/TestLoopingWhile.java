public class TestLoopingWhile{

  public static void main(String arg[]){

    int i=0;
    
    while (i<10){
      int j=0;

      while (j<i+1){
        System.out.print('*');
        j++;
   }

   System.out.println();
   i++;
   
  }
 } 
}   

/*
Kode di atas digunakan untuk mencoba statement looping while
*/