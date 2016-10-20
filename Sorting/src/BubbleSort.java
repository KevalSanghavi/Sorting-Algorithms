
public class BubbleSort
{
	public static void main(String[] args)
	{
		int[] array = new int[]{1, -5, 7, 3, 6, -1, 10, 0, -10, 11};
		
		// Call Bubble sort.
		bubbleSort(array);
		
		// Print the array.
		printArray(array);
	}
	
	// Bubble sort.
	public static void bubbleSort(int[] array)
	{
		for(int i = 0; i < (array.length-1); i++)
		{
			boolean swapFlag = false;
			
			for(int j = 0; j < (array.length-i-1); j++)
			{
				if(array[j] > array[j+1])
				{
					// Swap.
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					
					swapFlag = true;
				}
			}
			
			// If there was at least one swap in last pass then continue, otherwise stop.
			if(swapFlag == false)
			{
				break;
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
