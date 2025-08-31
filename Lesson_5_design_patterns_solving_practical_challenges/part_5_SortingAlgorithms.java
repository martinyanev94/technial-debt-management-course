public interface SortStrategy {
    void sort(int[] numbers);
}

public class BubbleSort implements SortStrategy {
    public void sort(int[] numbers) {
        // Bubble sort algorithm implementation
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }
}

public class QuickSort implements SortStrategy {
    public void sort(int[] numbers) {
        // Quick sort algorithm implementation
        quickSort(numbers, 0, numbers.length - 1);
    }

    private void quickSort(int[] numbers, int low, int high) {
        // Implementation of quick sort logic here
    }
}

public class SortContext {
    private SortStrategy sortStrategy;

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void sort(int[] numbers) {
        sortStrategy.sort(numbers);
    }
}
