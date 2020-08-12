public class SortArrayByParity {
   // https://leetcode.com/problems/sort-array-by-parity/
   // sort-array-by-parity
   // 905. Sort Array By Parity
    public int[] sortArrayByParity(int[] A) {
        int lengthOfArray =A.length;
        int i=0;
        int j = lengthOfArray-1;
        while(i<=j){
            if(A[i]%2==0&&A[j]%2!=0){
                i++;j--;
            }else if(A[i]%2==0&&A[j]%2==0){
                i++;
            } else if(A[i]%2!=0&&A[j]%2!=0){
                j--;
            }else {
                int temp =A[i];
                A[i]=A[j];
                A[j]=temp;
                j--;
                i++;
            }
        }
        return A;
    }
}
