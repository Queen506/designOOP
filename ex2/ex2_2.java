package ex2;

import java.util.List;

interface SortingAlgorithm {
    void sort(List<Integer> items);
}

// Selection Sort
class SelectionSort implements SortingAlgorithm {
    @Override
    public void sort(List<Integer> items) {
        System.out.println("Selection sort is sorting the items...");
    }
}

// Merge Sort
class MergeSort implements SortingAlgorithm {
    @Override
    public void sort(List<Integer> items) {
        System.out.println("Merge sort is sorting the items...");
    }
}

// Insertion Sort
class InsertionSort implements SortingAlgorithm {
    @Override
    public void sort(List<Integer> items) {
        System.out.println("Insertion sort is sorting the items...");
    }
}

public class ex2_2 {
    public static void main(String[] args) {

        List<Integer> itemsToSort = List.of(5, 3, 8, 1, 2);

        // Selection Sort
        SortingAlgorithm selectionSort = new SelectionSort();
        selectionSort.sort(itemsToSort);

        // Merge Sort
        SortingAlgorithm mergeSort = new MergeSort();
        mergeSort.sort(itemsToSort);

        // Insertion Sort
        SortingAlgorithm insertionSort = new InsertionSort();
        insertionSort.sort(itemsToSort);
    }
}
