package com.Leetcode;

public class FindSmallestLetter {
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        char target = 'j';
        char ans=main(arr,target);
        System.out.println(ans);
    }
    static char main(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
//            if (letters[mid] == target)
//                return letters[mid];
            if (letters[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        if(start>=letters.length-1){
            start=0;
        }
        return letters[start];
    }
}
