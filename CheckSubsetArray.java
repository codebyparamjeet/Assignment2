public class CheckSubsetArray
{
    public static void main(String [] arg)
    {

        int [] arr1 = {1, 2, 3};
        int [] arr2 = {1, 3};

        if(checkSubSet(arr1, arr2))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("No");
        }
    }

    static boolean checkSubSet(int [] arr1, int [] arr2)
    {
        int j=0;

        for(int i=0; i<arr2.length; i++)
    {
        for(j=0; j<arr1.length; j++)
        {
            if(arr2[i] == arr1[j])
            {
                break;
            }
        }
        if(j == arr1.length)
        {
            return false;
        }
    }
    return true;
    }
}