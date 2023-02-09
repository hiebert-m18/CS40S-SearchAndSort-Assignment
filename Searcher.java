
/**
 * Write a description of class Searcher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Searcher
{
    /**
     * Constructor for objects of class Searcher
     */
    public Searcher() {}

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int linearSearch(int[] list, int len, int key)
    {
        int index = -1;
        
        for (int i = 0; i < len; i++) {
            if (list[i] == key) {
                index = i;
                break;
            }// end if
        }// end for
        
        return index;
    }// end linearSearch on unordered
    
    // public int linearSearch(int[] list, int len, int key) {
        // int index = -1;
        
        // for (int i = 0; i < len; i++) {
            // if (list[i] == key) {
                // index = i;
                // break;
            // } else if (list[i] > key) {
                // break;
            // }// end if
        // }// end for
        
        // return index;
    // }// end linearSearch on ordered list
    
    public int binarySearch(int[] list, int len, int key)
    {
        int index = -1;
        
        int first = 0;
        int last = len;
        int mid = 0;
        
        while (first <= last) {
            mid = (first+last)/2;
            
            if (list[mid] < key) {
                first = mid + 1;
            } else if (list[mid] > key) {
                last = mid - 1;
            } else {
                index = mid;
                break;
            }// end if
        }// end while
        
        return index;
    }// end binarySearch
}// end Searcher
