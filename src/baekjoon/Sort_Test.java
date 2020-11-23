package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sort_Test {
    public static void main(String[] args) throws IOException {
        
        //2750번
        //삽입정렬로 품
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        int[] arr = new int[N];
//        for(int i=0; i<N; i++) {
//            arr[i] = Integer.parseInt(br.readLine());
//        }
//        int tmp = 0;
//        for(int i=1; i<N; i++) {
//            for(int j=0; j<i; j++) {
//                if(arr[i] < arr[j]) {
//                    tmp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = tmp;
//                }
//            }
//        }
//        for(int i=0; i<N; i++) {
//            System.out.println(arr[i]);
//        }


        //1427번
        //힙 정렬로 해결
        int N = Integer.parseInt(br.readLine());
        String strN = String.valueOf(N);
        int len = strN.length();
        int[] arr = new int[len];
        for(int i=0; i<len; i++) {
            arr[i] = strN.charAt(i)-'0';
        }
        heapSort(arr);
        for(int i=0; i<len; i++) {
            System.out.print(arr[i]);
        }




    }

    static void heapSort(int[] arr) {
        int len = arr.length;
        for(int i=len/2-1; i>=0; i--) {
            heapify(arr, i, len);
        }

        for(int i=len-1; i>0; i--) {
            swap(i, 0, arr);
            heapify(arr, 0, i);
        }


    }

    static void heapify(int[] arr, int index, int len) {
        int parent = index;
        int leftNode = 2*index+1;
        int rightNode = 2*index+2;

        if(leftNode < len && arr[parent] > arr[leftNode]) {
            parent = leftNode;
        }

        if(rightNode < len && arr[parent] > arr[rightNode]) {
            parent = rightNode;
        }

        if(parent != index) {
            swap(parent, index, arr);
            heapify(arr, parent, len);
        }

    }

    static void swap(int index1, int index2, int[] arr) {
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }
}
