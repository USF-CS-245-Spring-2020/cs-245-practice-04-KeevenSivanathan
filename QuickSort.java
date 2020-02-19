public class QuickSort implements SortingAlgorithm
{
	/*Partition - takes last element as pivot and then places it in the correct position.
	   Elements smaller than the pivot, will be placed to the left of the pivot. While elements
	   greater than the pivot will be placed on the right of the pivot. 
	*/

	int partition(int[] a, int min, int max)
	{
		int pivot = a[max]; 
		int i = (low-1); 

		for(int j = min; j < max; j++)
		{
			if(a[i] < pivot)
			{
				i++; 

				int temp = a[i];
				a[i] = a[j];
				a[j] = temp; 
				
			}
		}

		int temp = a[i+1];
		a[i+1] = a[j];
		a[j] = temp;

		return i+1; 
	}

	void quickSort(int a[], int min, int max)
	{
		int partition = partition(a,min,max); //Places the pivot in the correct position. 

		if(partition-1 > min)
		{
			quickSort(a,min,partition-1);
		}

		if(partition+1 < max)
		{
			quickSort(a, partition+1,max);
		}
	}

	public void sort(int a[])
	{
		quickSort(a,0,a.length-1);
	}
}