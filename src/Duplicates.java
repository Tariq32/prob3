public class Duplicates {


        public static void main(String[] args)
        {

            System.out.println(seperateDuplicatesChars("Hello"));
            System.out.println(seperateDuplicatesChars("Bookkeeper"));
            System.out.println(seperateDuplicatesChars("Yellowwood door"));
            System.out.println(seperateDuplicatesChars("Chicago Cubs"));

        }

        public static String seperateDuplicatesChars(String str)
        {
            char[] arr=new char[str.length()];
            //To be completed
            for (int i = 0; i < str.length(); i++) {
                arr[i] = str.charAt(i);
            }
            for(int i=0;i< arr.length;i++)
            {
                for(int j=i+1;j< arr.length;j++)
                {
                    if(arr[i]==arr[j])
                    {
                        arr[i]='-';
                    }
                }
            }
            String changed="";
            for(int i=0;i<arr.length;i++)
            {
                changed=changed+arr[i];
            }
            return changed;

        }
    }


