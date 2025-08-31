interface SortingStrategy {
    void sort(int[] array);
}

class BubbleSort implements SortingStrategy {
    public void sort(int[] array) {
        // Implement bubble sort logic
        System.out.println("Sorted using Bubble Sort.");
    }
}

class QuickSort implements SortingStrategy {
    public void sort(int[] array) {
        // Implement quick sort logic
        System.out.println("Sorted using Quick Sort.");
    }
}

class Sorter {
    private SortingStrategy sortingStrategy;

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void sort(int[] array) {
        sortingStrategy.sort(array);
    }
}
