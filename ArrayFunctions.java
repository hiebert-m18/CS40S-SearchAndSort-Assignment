
import java.util.Random;

/* **********************************************************
 * Programmer:          Hiebert
 * Class:               CS40S
 * 
 * Assignment:          A2 Sorting and Searching
 *
 * Description:         class to do some standard array work, load and print to name
 ************************************************************/
 
 // import files here as needed
  
 public class ArrayFunctions
 {  // begin class

    // *********** class constants **********

    // ********** instance variable **********
     
     int maximumSize = 0;
     int actualSize = 0;
     
     int[] list = new int[maximumSize];

    // ********** constructors ***********

     public ArrayFunctions(int maxSize){
         actualSize = maxSize;
     } // end constructor
     
    // ********** accessors **********
     
     public void printList(int[] list, int len){
         for(int i = 0; i < len; i++)
             System.out.println(i + ". " + list[i]);
     } // end print array

    // ********** mutators **********
     
     public int loadList(int[] list){
        Random rnd = new Random();
        
        // load the array with random numbers 
        
        for(int i = 0; i < actualSize; i++){
            list[i] = rnd.nextInt(100)+1;
        } // end for i 
        
         return actualSize;
     } // end loadLIst
 
 }  // end class