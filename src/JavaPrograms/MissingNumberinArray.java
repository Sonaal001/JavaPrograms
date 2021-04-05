package JavaPrograms;

public class MissingNumberinArray {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9,10,12,13};
		int sum=0;
		int sum1=0;
		int mn = 0;
		int size=a.length;
		for(int i=0;i<size;i++) {
			sum=sum+a[i];
			sum1=sum+i;
			mn=sum1-sum;
		}
		
		System.out.println(mn);
		

	}

}
