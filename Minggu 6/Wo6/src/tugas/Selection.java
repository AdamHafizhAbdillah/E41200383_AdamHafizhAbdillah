/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author User
 */
public class Selection {

    /**
     * @param args the command line arguments
     */
    void sort(int arr[]) {
        int n = arr.length;
        int move = 0;

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
            move++;
        }
        
        System.out.println("Sorted Array : ");
        printArray(arr);
        System.out.println("Mengalami " + move + " Swap");
        
        
    }

    static void show(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");

        }
    }

    // Tampilkan
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String args[]) {
        Selection ob = new Selection();
        int arr[] = {11, 4, 5, 9, 8, 1, 2};
        System.out.println("Unsorted Array");
        show(arr);
        System.out.println();
        ob.sort(arr);
       
        

    }
    
}
