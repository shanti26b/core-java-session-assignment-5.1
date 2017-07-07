package Assignment5;

public class Array {
	public static void main(String []args){
	int [] arr1 = new int[10];
		System.out.println("Enter Even numbers are 1to10");
		for(int i=0;i<10;i++){
			arr1[i] = i+1;
		}
		
		for(int i=0;i<10;i++){
			if(arr1[i] % 2 == 0){
				System.out.println(arr1[i]);	
			}
		}
		
	}
}
	
	
		