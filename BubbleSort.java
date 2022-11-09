public class BubbleSort{

    public static void main(String [] args) {
        int [] arr= {45, 20, 25, 30, 45, 35, 21};

        for(int i=0; i < arr.length; i++)
        {
            for(int j=1; j<arr.length-1; j++)
            {
                if(arr[i]>arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

        for(int ele: arr)
        {
            System.out.println(ele);
        }


    }
}