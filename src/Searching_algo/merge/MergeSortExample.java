package Searching_algo.merge;

import java.util.Scanner;

public class MergeSortExample {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter array size:- ");
            int n=sc.nextInt();
            int [] arr=new int[n];
            System.out.print("Enter array ele:- ");
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            mergeSort(arr);

            // Print sorted array (not as a string)
            for (int ele : arr) {
                System.out.print(ele + " ");
            }

        }

        // Merge Sort function
        private static void mergeSort(int[] arr) {
            int n = arr.length;
            if (n == 1) return; // base case: single element is sorted

            // Step 1: split array
            int[] a = new int[n / 2];
            int[] b = new int[n - n / 2];

            // Step 2: copy into a and b
            int idx = 0;
            for (int i = 0; i < a.length; i++) a[i] = arr[idx++];
            for (int i = 0; i < b.length; i++) b[i] = arr[idx++];

            // Step 3: recursive sort
            mergeSort(a);
            mergeSort(b);

            // Step 4: merge sorted halves
            merge(a, b, arr);
        }

        // Merge function
        public static void merge(int[] a, int[] b, int[] c) {
            int i = 0, j = 0, k = 0;
            while (i < a.length && j < b.length) {
                if (a[i] <= b[j]) c[k++] = a[i++];
                else {
                    c[k++] = b[j++];}
            }
            while (i < a.length) c[k++] = a[i++];
            while (j < b.length) c[k++] = b[j++];
        }
    }


