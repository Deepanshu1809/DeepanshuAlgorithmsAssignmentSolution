package part2;

public class StockPriceSearchingAndCompare {
	
	
	public static boolean StockPriceAvailable(double[] arr , double value){
		
		int left = 0;
		int right = arr.length - 1;
		int mid = (left + right) / 2;

		while (left <= right) {

			if (value < arr[mid]) {
				right = mid - 1;
			} else if (value > arr[mid]) {
				left = mid + 1;

			} else {
				return true;
			}
			mid = (left + right) / 2;
		}

		
		return false;
	}
	
	public static int CompanyCountOfIncreasedStocks(boolean[] arr) {
		int count =0 ;
		for (int i = 0; i < arr.length; i++) {
			if( arr[i] == true )
			count++;
			
		}
		return count;
	}

}
