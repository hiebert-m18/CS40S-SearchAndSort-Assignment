/* **********************************************************
 * Programmer:    your name here
 * Class:        CS20S
 * 
 * Assignment:    program information class
 *
 * Description:    class to print banners and closing messages
 *
 * 
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class ProgramInfo
 {  // begin class

    // *********** class constants **********

    // ********** instance variable **********

    // ********** constructors ***********
     public ProgramInfo(){
         
     } // end default constructor

    // ********** accessors **********
     
     public String getBanner(String name, String a){
         String bannerOut = "";
         
        bannerOut = "*******************************************\n";
        bannerOut += "Name:       " + name + "\n";
        bannerOut += "Class:        CS40S\n";
        bannerOut += "Assignment:    " + a + "\n";
        bannerOut += "*******************************************\n\n";         
         
        return bannerOut;
     } // end getBanner
     
     public String getClosingMessage(){
         String closing = "end of processing.\n";
         
         return closing;
     }

    // ********** mutators **********
 
 }  // end class