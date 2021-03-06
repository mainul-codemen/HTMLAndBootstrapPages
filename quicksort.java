public class QuickSortMain(){

public void quickssort(int[] arr,left,right){
	if (left >= right) {
		return;
	}
	int mid = left + right / 2;
	int pivot = arr[mid];
	int index = partition(arr,left,right,pivot);
	quicksort(arr,left,index-1);
	quicksort(arr,index,right);

}


public int partition(,arr,left,right,pivot){
	while(left <= right){
		while(arr[left] < pivot){
		left++;
	}
	while (arr[right] > pivot) {
		right--;
	}
	else{
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
		left++;
		right--;
	}
	}
	
	return left;
}





	public static void main(String[] args) {
		QuickSortMain quicksort = new QuickSortMain();
		int[] arr = {12,9,66,7,8,1};
		quicksort(arr,0, arr.length);
		System.out.print(Arrays.toString(arr));
	}
}
