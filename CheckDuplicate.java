public class CheckDuplicate{

    public static void main(String [] args)
    {
        int [] arr = {15, 2, 16, 15, 2, 100, 101, 100, 101, 16};

        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}