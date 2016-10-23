
import java.util.concurrent.ThreadLocalRandom;

public class QuickSort
{
	public static void main(String[] args)
	{
		int[] array = new int[]{2, 5, -1, 0, 9, -5, 10, -5, -10};
		
		// Call Quick sort.
		quickSort(array, 0, array.length-1);
		
		// Print the array.
		printArray(array);
	}
	
	// Quick sort.
	public static void quickSort(int[] array, int start, int end)
	{
		if(start < end)
		{
			// Partition index. Call randomized partition function.
			int partitionIndex = randomizedPartition(array, start, end);
			
			quickSort(array, start, partitionIndex-1);
			
			quickSort(array, partitionIndex+1, end);
		}
	}
	
	// Randomized partition function.
	private static int randomizedPartition(int[] array, int start, int end)
	{
		// Take a random index between start and end (inclusive) as a pivot index.
		int pivotIndex = ThreadLocalRandom.current().nextInt(start, end + 1);
		
		// Swapping.
		swap(array, pivotIndex, end);
		
		// Partition index. Call partition function.
		int partitionIndex = partition(array, start, end);
		
		return partitionIndex;
	}
	
	// Partition function.
	private static int partition(int[] array, int start, int end)
	{
		// Pivot.
		int pivot = array[end];
		
		// Partition index.
		int partitionIndex = start;
		
		for(int i = start; i < end; i++)
		{
			if(array[i] <= pivot)
			{
				// Swapping.
				swap(array, i, partitionIndex);
				partitionIndex++;
			}
		}
		
		// Swapping.
		swap(array, partitionIndex, end);
		
		return partitionIndex;
	}
	
	// Swapping within the array.
	private static void swap(int[] array, int index1, int index2)
	{
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
	
	// Print array.
	private static void printArray(int[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
	}
	
}
