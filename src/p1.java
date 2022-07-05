
import java.util.ArrayList;
import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        // write your code here
        int n;
        Scanner scan=new Scanner(System.in).useDelimiter("[,\\s+]");;
        boolean is_not_correct=true;
        do{
            System.out.println("Enter Integer n , grearter than 0 : ");
            n=scan.nextInt();
            if(n>0)
            {
                is_not_correct=false;
            }
        }while(is_not_correct);

        System.out.println("Enter "+n+" Integers : ");
        int[] arr=new int[n];
        int j=0;
        while (scan.hasNext()&&(j<n))
        {   if(scan.hasNextInt()){
            arr[j]=scan.nextInt();
            j++;}
        else
            scan.next();
        }
        System.out.println("Your entered: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        //max valu
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("\nMaximum value: "+max);
        //minimum value
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("\nMinimum value: "+min);
        // Average
        double avg=0;
        for(int i=0;i<arr.length;i++)
        {
            avg=avg+arr[i];
        }
        avg=avg/n;
        System.out.println("\nAverage: " + avg);
        // greater than avg
        ArrayList<Integer> avg_arr=new ArrayList<>();
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]>avg)
            {
                avg_arr.add(arr[i]);
            }
        }
        System.out.println("\nElement greater the average:");
        for(int i=0;i<avg_arr.size();i++)
        {
            System.out.print(avg_arr.get(i)+" ");
        }
        //greater than 2
        ArrayList<Integer> gr_two=new ArrayList<>();
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]>2)
            {
                gr_two.add(arr[i]);
            }
        }
        System.out.println("\nElement greater the 2:");
        for(int i=0;i<gr_two.size();i++)
        {
            System.out.print(gr_two.get(i)+" ");
        }
        //reverse array
        System.out.println("\nArray in reverse order:");
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }

    }


}
