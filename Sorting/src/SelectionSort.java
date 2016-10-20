
public class SelectionSort
{
	public static void main(String[] args)
	{
		int[] array = new int[]{1, -5, 7, 3, 6, -1, 10, 0, -10, 11};
		
		// Call Selection sort.
		selectionSort(array);
		
		// Print the array.
		printArray(array);
	}
	
	// Selection sort.
	public static void selectionSort(int[] array)
	{
		for(int i = 0; i < (array.length-1); i++)
		{
			int minIndex = i;
			
			for(int j = (i+1); j < array.length; j++)
			{
				if(array[j] < array[minIndex])
				{
					minIndex = j;
				}
			}
			
			if(minIndex != i)
			{
				// Swap.
				int temp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = temp;
			}
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
