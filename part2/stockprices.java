package part2;

public class stockprices {

	
	public static void sort(double[] arr , int left, int right) {
		if (left<right) {
			int mid = (left+right)/2;
			
			sort(arr, left, mid);
			sort(arr, mid+1, right);
			
			merge(arr, left, mid, right);
			
			
		}
	}
	
	public static void merge(double[] arr , int left , int mid , int right) {
		
		int l1 = mid+1-left;
		int l2 = right-mid;
		
		double[] larr = new double[l1];
		double[] rarr = new double[l2];
		
		for (int i = 0; i < rarr.length; i++) {
			rarr[i]= arr[mid+1+i];
		}
		for (int i = 0; i < larr.length; i++) {
			larr[i]= arr[left+i];
		}
		
		int i , j , k;
		 i=0 ;
		 j=0;
		 k=left;
		 
		 while (i<l1 && j<l2) {
			 if (larr[i]<rarr[j]) {
				 arr[k] = larr[i];
				 i++;
				 k++;
			 }else {
				 arr[k] = rarr[j];
				 j++;
				 k++;
			 }
		 }
		 
		 while (i<l1) {
			 arr[k] = larr[i];
			 i++;
		 }
		 while(j<l2) {
			 arr[k] = rarr[j];
			 j++;
		 }
		 
	}
	
	public static void StockPriceInASC(double[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			
		}
		System.out.println();
		
	}

	public static void StockPriceInDESC(double[] arr) {
		
		for (int i = arr.length-1; i >=0 ; i--) {
			System.out.print(arr[i] + " ");
			
		}
		System.out.println();
		
	}
}
