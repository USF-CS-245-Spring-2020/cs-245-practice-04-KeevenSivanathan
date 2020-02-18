public class QuickSort implements SortingAlgorithm
{
	int partition(int[] a, int min, int max)
	{
		int pivot = a[max]; 

		for(int i = min; i < max; i++)
		{
			if(a[i] < pivot)
			{
				int temp = a[min];
				a[min] = a[i];
				a[i] = temp; 
				min++;
			}
		}

		int temp = a[min];
		a[min] = pivot;
		a[max] = temp;

		return min; 
	}

	void quickSort(int a[], int min, int max)
	{
		int partition = partition(a,min,max);

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