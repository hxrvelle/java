package lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int[] nums = {360, 64, 57, 220, 33, 21};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if((nums[i] > max) && (nums[i] % 2 != 0)) {
                max = nums[i];
            }
        }
        System.out.println(max);
    }
}
