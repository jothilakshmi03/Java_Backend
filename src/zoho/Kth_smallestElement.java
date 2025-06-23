package zoho;

import java.util.PriorityQueue;

public class Kth_smallestElement {
    public static void main(String[]args){
        int[] arr={4,8,7,1,10,2,14};
        int k=8;
        System.out.println(findSmallest(arr,k));
    }
    public static int findSmallest(int[] arr,int k){
        if(arr.length-1<k){
            return -1;
        }
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        for(int num:arr){
            minHeap.add(num);
        }
        for(int i=0;i<k-1;i++){
            minHeap.poll();
        }
        return minHeap.peek();
    }
}
