/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timmyjing
 */
public class BinarySearch {
    public static boolean search(int[] array, int value) {
        
        int low = 0;
        int high = array.length - 1;
        
        while (low <= high) {
            int mid = (high + low) / 2;
            
            if (array[mid] == value) {
                return true;
            }
            
            if (array[mid] > value) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}
