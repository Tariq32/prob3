

    public class Problem3 {
        public static void main(String args[]){
            //first step
            int[] arr={2, 3, 9, 17, 32, 40, 73, 40, 21, 10};
            //second step
            System.out.println("Before Shifting :");
            for(int i=0;i<arr.length;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            // third step
            int temp=arr[0];
            for(int i=0;i<arr.length-1;i++)
            {
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=temp;
            System.out.println("After Shifting :");
            for(int i=0;i<arr.length;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }


    }


