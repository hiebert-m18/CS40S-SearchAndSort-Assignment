
/**
 * Write a description of class Sorter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sorter
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Sorter
     */
    public Sorter()
    {
        //
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void bubbleSort(int[] list, int len)
    {
        for (int j = 0; j < len; j++) {
            for (int i = 1; i < (len-j); i++) {
                if (list[i] < list[i-1]) {
                    this.swap(list, i, i-1);
                }// end if
            }// end for   
        }// end for
    }// end bubbleSort
    
    public void selectionSort(int[] list, int len)
    {
        int index = 0;
        for (int j = 0; j < len; j++) {
            index = 0;
            
            for (int i = 0; i < len-j; i++) {
                if (list[i] > list[index]) {
                    index = i;
                }// end if
            }// end for
            
            this.swap(list, index, len-(j+1));
        }// end for
    }// end selectionSort
    
    public void swap(int[] l, int m, int n) {
        int tempM = l[m];
        int tempN = l[n];
        l[n] = tempM;
        l[m] = tempN;
    }// end swap
}
