public class MergeSort implements SortingAlgorithm
{
	void merge(int a[], int left, int mid, int right)
	{
		//Finds the size of the two subarrays to be merged. 
		int subArray1 = mid - left + 1; 
		int subArray2 = right - mid; 

		//Creates two temporary arrays
		int L[] = new int [subArray1];
		int R[] = new int [subArray2];

		//Copies data to temporary arrays
		for(int i = 0; i < subArray1; ++i)
		{
			L[i] = a[left + i];
		}

		for(int j = 0; j < subArray2;++j)
		{
			R[j] = a[mid + 1 + j];
		}

		//Initial indexes of 1st and 2nd subarray
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

		//Copies remaining elements on the left 
		while (i < subArray1)
		{
			a[k] = L[i]; 
			i++;
			k++; 
		}

		//Copies remaining elements on the right
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
			int mid = (left+right)/2; //Finds the midpoint of the array

			mergeSort(a,left,mid); //Sort first half 
			mergeSort(a,mid+1,right); //Sort second half

			merge(a,left,mid,right); //Merge sorted halves
		}
	}

	public void sort(int a[])
	{
		mergeSort(a,0,a.length-1);
	}
}