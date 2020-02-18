public class MergeSort implements SortingAlgorithm
{
	void merge(int a[], int left, int mid, int right)
	{
		int subArray1 = mid - left + 1; 
		int subArray2 = right - mid; 

		int L[] = new int [subArray1];
		int R[] = new int [subArray2];

		for(int i = 0; i < subArray1; ++i)
		{
			L[i] = a[left + i];
		}

		for(int j = 0; j < subArray2;++j)
		{
			R[j] = a[mid + 1 + j];
		}

		int i = 0;
		int j = 0; 

		int k = left; 

		while (i < subArray1 && j < subArray2)
		{
			if (L[i] <= R[j])
			{
				a[k] = L[i]; 
				i++;
			}

			else
			{
				a[k] = R[j];
				j++;
			}
			k++; 
		}

		while (i < subArray1)
		{
			a[k] = L[i]; 
			i++;
			k++; 
		}

		while (j < subArray2)
		{
			a[k] = R[j];
			j++; 
			k++;
		}
	}

	void mergeSort(int a[], int left, int right)
	{
		if (left < right)
		{
			int mid = (left+right)/2;

			mergeSort(a,left,mid);
			mergeSort(a,mid+1,right);

			merge(a,left,mid,right); 
		}
	}

	public void sort(int a[])
	{
		mergeSort(a,0,a.length-1);
	}
}