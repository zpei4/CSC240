public class Sorting {
    public static void selectionSort(Student[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j].compareTo(list[maxIndex]) > 0) {
                    maxIndex = j;
                }
            }
            Student temp = list[maxIndex];
            list[maxIndex] = list[i];
            list[i] = temp;
        }
    }
}
