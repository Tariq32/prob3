

    public class Reverse
    {
        public static void main(String[] args)
        {

            System.out.println(isExactReverse("ba", "a"));
            System.out.println(isExactReverse("desserts", "stressed"));
            System.out.println(isExactReverse("apple", "apple"));
            System.out.println(isExactReverse("regal", "lager"));
            System.out.println(isExactReverse("war", "raw"));
            System.out.println(isExactReverse("pal", "slap"));


        }
        public static boolean isExactReverse(String x, String y)
        {
            char[] arr=new char[x.length()];
            //To be completed
            for (int i = 0; i < x.length(); i++) {
                arr[i] = x.charAt(i);
            }
            String reverse="";
            for(int i=arr.length-1;i>=0;i--)
            {
                reverse= reverse+String.valueOf(arr[i]);
            }
            if(reverse.equals(y))
            {
                return true;
            }
            return false;
        }

    }


