package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_2751 {
    //힙 정렬 복습
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        heapSort(array);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]+"\n");
        }
        System.out.println(sb.toString());


    }

    static void heapSort(int[] array) {
        int length = array.length;
        for (int i = length/2 - 1; i >= 0; i--) {
            heapify(array, i, length);
        }

        for (int i = length - 1; i > 0; i--) {
            swap(array, 0, i);
            heapify(array, 0, i);
        }

    }

    static void heapify(int[] array, int index, int length) {
        int parent = index;
        int left = 2*index + 1;
        int right = 2*index + 2;

        if (left < length && array[parent] < array[left]) {
            parent = left;
        }

        if (right < length && array[parent] < array[right]) {
            parent = right;
        }

        if (parent != index) {
            swap(array, index, parent);
            heapify(array, parent, length);
        }
    }

    static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
}
