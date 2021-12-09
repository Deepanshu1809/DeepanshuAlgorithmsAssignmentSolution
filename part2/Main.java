package part2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int noOFCompanies;
		int Option;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the no of companies");
		noOFCompanies = sc.nextInt();
		double[] currentStock = new double[noOFCompanies];
		boolean[] StockIncreased = new boolean[noOFCompanies];
		
		stockprices sp = new stockprices();
		StockPriceSearchingAndCompare spsc = new StockPriceSearchingAndCompare();
		
		for (int i = 1; i <= noOFCompanies; i++) {
			System.out.println("Enter the current stock price of the company " + i);
			currentStock[i-1] = sc.nextDouble();
			System.out.println("Whether company's stock price rose today compare to yesterday?");
			StockIncreased[i-1] = sc.nextBoolean();	
		}
		
		sp.sort(currentStock, 0, currentStock.length-1);
		do{
		PrintOptions();
		Option = sc.nextInt();
		
		switch (Option) {
		case 0 :
		break;
		case 1 : 
			System.out.println("Stock Prices in ascending order are :");
			sp.StockPriceInASC(currentStock);
			break;
			
		case 2 : 
			System.out.println("Stock Prices in descending order are :");
			sp.StockPriceInDESC(currentStock);
			break;
			
		case 3 :
			System.out.println("Total no of companies whose stock price rose today :");
			System.out.println(spsc.CompanyCountOfIncreasedStocks(StockIncreased));
			break;
			
		case 4 : 
			System.out.println("Total no of companies whose stock price declined today :");
			System.out.println(noOFCompanies-spsc.CompanyCountOfIncreasedStocks(StockIncreased));
			break;
			
		case 5 : 
			System.out.println("enter the key value");
			double value = sc.nextDouble();
			if(spsc.StockPriceAvailable(currentStock, value)){
				System.out.println(" Stock of value " + value +  " is present");
			}else {
				System.out.println("Value not found");
			}
			break;
			
		default :
			System.out.println("Enter the valid Option :");
			
		}
		
		}while(Option!= 0);
		System.out.println("Exited Successfully !!!");
	}
	
	public static void PrintOptions() {
		System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.println("Enter the operation that you want to perform\n"
				+ "1. Display the companies stock prices in ascending order\n" + 
				"2. Display the companies stock prices in descending order\n" + 
				"3. Display the total no of companies for which stock prices rose today\n" + 
				"4. Display the total no of companies for which stock prices declined today\n" + 
				"5. Search a specific stock price\n" + 
				"6. press 0 to exit");
		System.out.println("----------------------------------------------------------------------------------------------------");
	}

}
