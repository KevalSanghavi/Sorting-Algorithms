
public class InsertionSort
{
	public static void main(String[] args)
	{
		int[] array = new int[]{1, -5, 7, 3, 6, -1, 10, 0, -10};
		
		// Call Insertion sort.
		insertionSort(array);
		
		// Print the array.
		printArray(array);
	}
	
	// Insertion sort.
	public static void insertionSort(int[] array)
	{
		for(int i = 1; i < array.length; i++)
		{
			int value = array[i];
			int holeIndex = i;
			
			while(holeIndex > 0 && array[(holeIndex-1)] > value)
			{
				// Shift element.
				array[holeIndex] = array[holeIndex-1];
				holeIndex--;
			}
			
			// Insert the value at its correct position within sorted sub array part.
			array[holeIndex] = value;
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
