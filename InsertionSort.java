public class InsertionSort implements SortingAlgorithm
{
	public void sort(int[] a)
	{
		int n = a.length; 

		for(int i = 1; i < n; ++i)
		{
			int key = a[i]; 
			int j = i - 1; 

			while(j >= 0 && a[j] > key) //Move elements that are greater than key , to one position ahead of current position
			{
				a[j+1] = a[j];
				j = j - 1; 
			}

			a[j+1] = key; 
		}
	}
}