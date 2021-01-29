import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt(); 
        }
        int count=0;
        int k=0;
        while(k<n)
        {
            if(arr[k]!=k+1)
            {
                for(int j=0;j<n;j++)
                {
                    if(arr[j]==k+1)
                    {
                        int temp=0;
                        temp=arr[j];
                        arr[j]=arr[k];
                        arr[k]=temp;
                        count++;
                    }
                }
               
            }
            k++;
        }

        System.out.println(count);
    }
}