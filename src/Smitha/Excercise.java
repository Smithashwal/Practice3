package Smitha;

public class Excercise {
	
	public void oddEven() {
		
		
		for(int i=0;i<=10;i=i+2) {
			System.out.println(i);
		}
		
		for(int i=1;i<=10;i=i+2) {
			System.out.println(i);
		}
	}
	
	public void combine() {
	    char[] even1= {'a','c','e'};
		char[] odd1= {'b','d','f'};
		
		for(int i=0;i<even1.length;i++) {
			System.out.println(even1[i]);
			System.out.println(odd1[i]);
		}
	}

	public void consequentAdd() {
		
		int result=0;
		
		for (int i=0;i<=10;i++) {
			result =result +i;
			System.out.println("the result is " + result);
		}
	}
	
	public void greatest() {
		int[] array= {1,8,6,4,9,11,19,2};
		int max=0;
		
		for(int i=0;i<array.length;i++) {
			if(max<array[i]) {
				max= array[i];
			}
		}
		System.out.println(max);
	}
	
	public void least() {
		int[] array= {1,8,6,4,9,11,19,2};
		int min=100;
		
		for(int i=0;i<array.length;i++) {
			if(min>array[i]) {
				min= array[i];
			}
		}
		System.out.println(min);
	}
	
	public static void main(String[] args) {
       Excercise obj = new Excercise();
       //obj.oddEven();
       
       //obj.combine();
       
       //obj.consequentAdd();
       
       //obj.greatest();
       
       obj.least();
       
	}

}
