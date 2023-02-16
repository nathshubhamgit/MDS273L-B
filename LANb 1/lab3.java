import java.util.*;
public class lab3 {
    static float mean(int arr[]) {
        int sum=0;
        float mean;
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
        mean=sum/n;
        return mean;
    }
    static float median(int arr[]) {
        int n=arr.length;
        float med=0;
        if(n%2!=0){
            med=arr[((n+1)/2)-1];
        }
        else  {
            med=(float)(arr[(n/2)-1]+arr[n/2])/(float)2;
        }
        return med;
    }
    static int md (int arr[]) {
        int n=arr.length;
        int mode=arr[0];
        int cnt=0;
        for(int i=0;i<n;i++){
            int val= arr[i];
            int c=1;
            for (int j=0;j<n;j++){
                if(arr[j]== val){
                    c=c+1;
                }
                if(c> cnt){
                    mode=val;
                    cnt=c;
                }
            }
        }
        return mode;
    }


    public static void main(String[] args) {
            Scanner var=new Scanner(System.in);
            System.out.println("program start");
            System.out.println("no of elements you want to enter?");
            int n=var.nextInt();

            int[] arr = new int[n]; 
            System.out.println("enter your elements"); 

            for(int i=0; i<n; i++)  {  

                arr[i]=var.nextInt();  
            }  
System.out.println("Array elements are: ");  
for (int i=0; i<n; i++)   {  
System.out.println(arr[i]);  
}
System.out.println("type 1 for mean"); 
System.out.println("type 2 for median");
System.out.println("type 3 for mode");
int x=var.nextInt();
switch(x){
    case 1 :
        float mean =mean(arr);
        System.out.println("mean of the elements is = ");
        System.out.println(mean);
    break;

    case 2:
        float med=median(arr);
        System.out.println("median of the elements is = ");
        System.out.println(med);
    break;

    case 3:
        int mode=md(arr);
        System.out.println("mode of the elements is = ");
        System.out.println(mode);
    
    break;
    default:
    System.out.print("invalid entry");
    break;
}
} 
}  



    
    

