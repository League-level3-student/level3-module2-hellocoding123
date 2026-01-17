package _01_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
    public BubbleSorter() {
        type = "Bubble";
    }

    /* 
     * Use the bubble sorting algorithm to sort the array.
     * You can use display.updateDisplay() to show the current
     * progress on the graph.
     */
    @Override
    void sort(int[] array, SortingVisualizer display) {
        int swaps;
        int temp;
        int t = 0;
        
        while(!(isSorted(array))) {
        	for(int i = 0; i < array.length - 1 - t; i++) {
        		if(array[i] > array[i+1]) {
        			temp = array[i];
        			array[i] = array[i+1];
        			array[i+1] = temp;
        		}
        		display.updateDisplay();
        	}
        	
        	t++;
        }
        
       
    }
    public boolean isSorted(int[] array) {
    	for(int i = 0; i < array.length - 1; i++) {
			if(!(array[i] <= array[i+1])) {
    			return false;
    		}
		}
    	
    	return true;
    }
}
