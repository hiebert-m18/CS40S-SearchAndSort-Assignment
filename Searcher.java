
/**
 * A class to search lists of ints
 */
public class Searcher
{
    public Searcher() {}
    
    /**
     * Linear Search for Unordered Lists
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
    
    /**
     * Linear Search for Ordered Lists
     */
    public int linearSearchVariation(int[] list, int len, int key) {
        int index = -1;
        
        for (int i = 0; i < len; i++) {
            if (list[i] == key) {
                index = i;
                break;
            } else if (list[i] > key) {
                break;
            }// end if
        }// end for
        
        return index;
    }// end linearSearch on ordered list
    
    /**
     * Binary Search for Ordered Lists
     */
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
