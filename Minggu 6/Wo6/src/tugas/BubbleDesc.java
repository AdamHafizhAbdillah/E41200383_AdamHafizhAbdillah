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
public class BubbleDesc {

    /**
     * @param args the command line arguments
     */
   static void BubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        int move = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    move++;
                }
            }
        }
        show(arr);
        System.out.println();
        System.out.println("Swap sebanyak : " + move);

    }

    public static void main(String[] args) {
        int arr[] = {3, 65, 35, 2, 5, 300, 6};
        System.out.println("Array Sebelum Bubble Sort");
        show(arr);
        

//        for (int i = 0; i < arr.length; i++) 
//        {
//            System.out.print(arr[i] + " ");
//        }
        System.out.println();

        System.out.println("Array sesudah diurutkan : ");
        BubbleSort(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }

    }

    static void show(int[] arr) {
       int n = arr.length -1;
        for (int i = n; i > 0; i--) {
            System.out.print(arr[i]+" ");
            
        }

        }
    }
    

