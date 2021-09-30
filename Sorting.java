// "static void main" must be defined in a public class.
import java.util.PriorityQueue;
public class Main {
    //Selection Sort
    public static int[] sort1(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
        int min=Integer.MAX_VALUE;
        int minindex=-1;
        for(int j=i;j<n;j++){
            if(arr[j]<min){
                min=arr[j];
                minindex=j;
            }
           int temp=arr[minindex];
           arr[minindex]=arr[i];
           arr[i]=temp;
        }
      }
    return arr;
    }
    //Bubble sort
    public static int[] sort2(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
     return arr;
    }
    //insertion sort
    public static int[] sort3(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int j=i-1;
            int temp=arr[i];
            while(j>=0&&arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    return arr;
    }
    //Heap sort
    public static int[] sort4(int[] arr){
        int n=arr.length;
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            q.add(arr[i]);
        }
        int in=0;
        while(!q.isEmpty()){
            arr[in]=q.peek();
            q.poll();
            in=in+1;
        }
      return arr;
    }
    public static void main(String[] args) {
       int[] arr={5,8,2,4,6,1};
       int[] temp1=sort1(arr);
       int[] temp2=sort2(arr);
       int[] temp3=sort3(arr);
       int[] temp4=sort4(arr);
       for(int i=0;i<temp1.length;i++){
           System.out.print(temp1[i]+" ");
       }
       System.out.println();
       for(int i=0;i<temp2.length;i++){
           System.out.print(temp2[i]+" ");
       }
       System.out.println();
       for(int i=0;i<temp3.length;i++){
           System.out.print(temp3[i]+" ");
       }
       System.out.println();
       for(int i=0;i<temp4.length;i++){
           System.out.print(temp4[i]+" ");
       }
    }
}
//Example
//int[] arr={5,2,4,3,8,6}
//output:
//2,3,4,5,6,8.
