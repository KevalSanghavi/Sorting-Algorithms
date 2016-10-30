
public class HeapSort
{
	public static void main(String[] args)
	{
		int[] array = new int[]{1, -5, 7, 3, 6, -1, 10, 0, -14, 15};
		
		// Call Heap sort.
		heapSort(array);
		
		// Print the array.
		printArray(array);
	}
	
	// Heap sort.
	public static void heapSort(int[] array)
	{
		/*
		Heapsort Algorithm:
		Heapsort(array):
			Build a max heap from an unordered array
			For 1 to n:
				Find max element: array[0]
			  	Swap the first and last elements in the heap: array[0] and array[n-1]. Now max element is at the end of the heap
			  	Discard the last node from the heap. Decrement the heap size
			  	New root (after the swapping) may violate max heap property, but its children 
					... are max heaps. Run max heapify (Heap: shift-down operation) to fix this
		*/
		
		// Size of the array.
		int arraySize = array.length;
		
		// Size of a heap.
		int heapSize = arraySize;
		
		// Build max heap from an unordered array.
		buildMaxHeap(array);
		
		for(int i = 0; i < arraySize; i++)
		{
			// Swapping. Swap the first and last elements in the heap.
			// After this, the max element will be at the end of the heap.
			swap(array, 0, heapSize-1);
			
			// Discard the last node from the heap. Decrement the heap size.
			heapSize--;
			
			// Run max heapify on a new root.
			maxHeapify(array, heapSize, 0);
		}
	}
	
	// Build max heap function.
	private static void buildMaxHeap(int[] array)
	{
		/*
		BuildMaxHeap Algorithm:
		BuildMaxHeap(array):
			int heapSize = array.length
			For i: n/2 down to 1:
				maxHeapify(array, heapSize, i)
		*/
		
		// Size of a heap.
		int heapSize = array.length;
		
		// For indices n/2 down to 1.
		// Here, the array index starts from 0 (and not from 1), so here it will be (n/2)-1 down to 0.
		for(int index = (heapSize/2 - 1); index >= 0; index--)
		{
			// Call maxHeapify on the index.
			maxHeapify(array, heapSize, index);
		}
	}
	
	// Max heapify function on the index.
	// Heap: shift-down operation on the index.
	private static void maxHeapify(int[] array, int heapSize, int index)
	{
		// Index of the left child: 2i+1.
		int leftChildIndex = (2*index)+1;
		
		// Index of the right child: 2i+2.
		int rightChildIndex = (2*index)+2;
		
		if(leftChildIndex < heapSize && rightChildIndex < heapSize)
		{
			// Find index of the bigger child.
			int maxChildIndex = getMaxIndex(array, leftChildIndex, rightChildIndex);
			
			if(array[index] < array[maxChildIndex])
			{
				// Swapping.
				swap(array, index, maxChildIndex);
				
				// Call maxHeapify on the maxChildIndex.
				maxHeapify(array, heapSize, maxChildIndex);
			}
		}
		else if(leftChildIndex < heapSize)
		{
			if(array[index] < array[leftChildIndex])
			{
				// Swapping.
				swap(array, index, leftChildIndex);
				
				// Call maxHeapify on the leftChildIndex.
				maxHeapify(array, heapSize, leftChildIndex);
			}
		}
	}
	
	// Get an index among two indices which has the bigger element in the array.
	private static int getMaxIndex(int[] array, int index1, int index2)
	{
		if(array[index1] >= array[index2])
			return index1;
		else
			return index2;
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
			System.out.print(array[i] + "  ");
		}
	}
	
}
