
public class MergeSort
{
	public static void main(String[] args)
	{
		int[] array = new int[]{1, -5, 0, 7, 2, -3, -1, 10};
		
		// Call Merge sort.
		mergeSort(array);
		
		// Print the array.
		printArray(array);
	}
	
	// Merge sort.
	public static void mergeSort(int[] array)
	{
		if(array.length < 2)
		{
			return;
		}
		
		int mid = array.length/2;
		
		int[] left = new int[mid];
		int[] right = new int[array.length - mid];
		
		for(int i = 0; i < left.length; i++)
		{
			left[i] = array[i];
		}
		for(int j = 0; j < right.length; j++)
		{
			right[j] = array[(j+mid)];
		}
		
		mergeSort(left);
		mergeSort(right);
		merge(left, right, array);
	}
	
	// Merge function.
	private static void merge(int[] left, int[] right, int[] array)
	{
		// Length of the left and the right.
		int leftLength = left.length, rightLength = right.length;
		
		// Indices: i, j and k for the left, the right and the array respectively.
		int i = 0, j = 0, k = 0;
		
		while(i < leftLength && j < rightLength)
		{
			if(left[i] <= right[j])
			{
				array[k] = left[i];
				i++;
			}
			else
			{
				array[k] = right[j];
				j++;
			}
			k++;
		}
		
		while(i < leftLength)
		{
			array[k] = left[i];
			i++;
			k++;
		}
		
		while(j < rightLength)
		{
			array[k] = right[j];
			j++;
			k++;
		}
	}
	
	// Print array.
	private static void printArray(int[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + "  ");
		}
	}
	
}
