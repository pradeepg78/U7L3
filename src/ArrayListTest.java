import java.util.ArrayList;
import java.util.Arrays; // you need this to use Arrays.asList()

public class ArrayListTest
{
    public static void main(String[] args)
    {
        ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        //COMPLETE ME!
        for (int i = 1; i < nums.size() - 1; i++)
        {
            int c = nums.get(i);
            int n = nums.get(i + 1);
            nums.set(i - 1, c + n);
        }
        System.out.println(nums);
    }
}


