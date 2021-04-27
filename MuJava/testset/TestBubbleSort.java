import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class TestBubbleSort {
	@Test
	public void test() {
		int arr[] = new int[]{1,6,2,2,5};
		int array[] = new int[]{1, 2, 2, 5, 6};
        arr = BubbleSort.BubbleSort(arr);
//        for (int i = 0;i < arr.length;i ++) {
//        	assertEquals(array[i], arr[i]);
//        }
        System.out.println(Arrays.toString(array)+" "+Arrays.toString(arr));
        assertEquals(Arrays.toString(array), Arrays.toString(arr));
	}
}
