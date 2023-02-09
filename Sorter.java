
/**
 * A class to sort lists of ints
 */
public class Sorter
{
    public Sorter() {}

    /**
     * Bubble Sort
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
    
    /**
     * Selection Sort
     */
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
    
    /**
     * Quick Sort method
     */
    public void quickSort(int[] list, int low, int high) {
        hoareQuickSort(list, low, high);
    }// end quickSort
    
    /**
     * Quick Sort with Hoare Partition Scheme
     */
    private void hoareQuickSort(int[] list, int low, int high) {
        if (low < high) {
            int pivotSpot = this.hoare(list, low, high);
            hoareQuickSort(list, low, pivotSpot); // first half of list (slightly different for hoare than for lomuto)
            hoareQuickSort(list, pivotSpot + 1, high); // second half of list
        }// end if
    }// end hoareQuickSort
    
    /**
     * Quick Sort with Lomuto Partition Scheme
     */
    private void lomutoQuickSort(int[] list, int low, int high) {
        if (low < high) {
            int pivotSpot = this.lomuto(list, low, high);
            lomutoQuickSort(list, low, pivotSpot - 1); // first half of list
            lomutoQuickSort(list, pivotSpot + 1, high); // second half of list
        }// end if
    }// end lomutoQuickSort
    
    /**
     * Lomuto Partition Scheme
     */
    private int lomuto(int[] list, int low, int high) {
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
    
    /**
     * Hoare Partition Scheme
     */
    private int hoare(int[] list, int low, int high) {
        int pivot = list[(low + high)/2];
        int i = low - 1;
        int j = high + 1;
    
        while (true) {
            do {
                i++;
            } while (list[i] < pivot);
    
            do {
                j--;
            } while (list[j] > pivot);
    
            if (i >= j) {
                return j;
            }// end if
    
            this.swap(list, i, j);
        }// end while
    }// end hoare partition scheme
    
    /**
     * Swap method
     */
    private void swap(int[] l, int m, int n) {
        int tempM = l[m];
        int tempN = l[n];
        l[n] = tempM;
        l[m] = tempN;
    }// end swap
}
