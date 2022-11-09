public class SelectionSort{

    public static void main(String [] arg) {
        
        int [] arr = {6, 4, 5, 11, 2, 1};
        int min = 0;

        for(int i=0; i<arr.length; i++)
        {   min=i;
            for(int j=1+i; j<arr.length; j++ )
            {
                if(arr[j] < arr[min])
                {
                     min = j;

                }
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }

        for(int ele: arr)
        {
            System.out.println(ele);
        }
    }
}