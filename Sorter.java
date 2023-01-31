
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
    
    public void quickSort(int[] list, int low, int high) {
        if (low < high) {
            int pivotSpot = this.hoare(list, low, high);
            quickSort(list, low, pivotSpot - 1); // first half of list
            quickSort(list, pivotSpot + 1, high); // second half of list
        }// end if
    }// end quickSort
    
    public int lomuto(int[] list, int low, int high) {
        int pivot = list[high];
        
        int pivotSpot = low - 1;
        
        for (int i = low; i < high; i++) {
            if (list[i] <= pivot) {
                pivotSpot += 1;
                this.swap(list, i, pivotSpot);
            }// end if
        }// end for
        
        pivotSpot += 1;
        
        this.swap(list, high, pivotSpot);
        
        return pivotSpot;
    }// end lomuto partition scheme
    
    public int hoare(int[] list, int low, int high) {
        int pivot = list[high];
        int i = low;
        int j = high - 1;
        
        while (i < j) {
            while (list[i] < pivot) {
                i++;
            }// end while
            while (list[j] > pivot) {
                j--;
            }// end while
            if (i < j) {
                this.swap(list, i, j);   
            }// end if
        }// end while
        
        this.swap(list, high, i);
        
        return i;
    }
    
    // public int hoare(int[] list, int low, int high) {
        // int pivot = list[(low + high)/2];
        // int i = low - 1;
        // int j = high + 1;
        
        // while (true) {
            // do {
                // i++;
            // } while (list[i] < pivot);
            // do {
                // j--;
            // } while (list[j] > pivot);
            // if (i >= j) {
                // return j;
            // }
            // this.swap(list, i, j);
        // }// end while
    // }// end hoare
    
    public void swap(int[] l, int m, int n) {
        int tempM = l[m];
        int tempN = l[n];
        l[n] = tempM;
        l[m] = tempN;
    }// end swap
}
