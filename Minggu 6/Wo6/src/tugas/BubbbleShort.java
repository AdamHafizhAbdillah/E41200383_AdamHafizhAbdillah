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
public class BubbbleShort {

    /**
     * @param args the command line arguments
     */
    static void BubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }
    


    public static void main(String[] args) {
        int arr[] = {3, 65, 35, 2, 5, 300, 6};
        System.out.println("Array Sebelum Bubble Sort");

        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        BubbleSort(arr);
        System.out.println("Array sesudah diurutkan : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        

    }
    }
    

