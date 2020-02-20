public class QuickSort implements SortingAlgorithm
{
	/*Partition - takes last element as pivot and then places it in the correct position.
	   Elements smaller than the pivot, will be placed to the left of the pivot. While elements
	   greater than the pivot will be placed on the right of the pivot. 
	*/

	int partition(int[] a, int min, int max)
	{
		int pivot = a[max]; 
		int i = (min-1); 

		for(int j = min; j < max; j++)
		{	
			//Element in array is less than pivot
			if(a[j] < pivot)
			{
				i++; 

				//Swap elements
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp; 
				
			}
		}

		//Element in array is greater than pivot
		//Swap elements
		int temp = a[i+1];
		a[i+1] = a[max];
		a[max] = temp;

		return i+1; 
	}

	void quickSort(int a[], int min, int max)
	{
		int partition = partition(a,min,max); //Places the pivot in the correct position. 

		if(partition-1 > min)
		{
			//Recursively calls quicksort on the left side of the partitioned array
			quickSort(a,min,partition-1);
		}

		if(partition+1 < max)
		{
			//Recursively calls quicksort on the right side of the partitioned array
			quickSort(a, partition+1,max);
		}
	}

	public void sort(int a[])
	{
		//Calls quicksort function for an array from beginning to end. 
		quickSort(a,0,a.length-1);
	}
}