package JavaPrograms;

public class LargestElement {

	public static void main(String[] args) {
		/*int temp;
		int[] a= {100,4,7,8,10,46,3};
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		System.out.println("Largest is: "+a[0]);
		System.out.println("Second Largest is: "+a[1]);*/

		System.out.println("*********************************");
		int[] a= {100,4,7,8,10,46,3,101};
		int max=a[0];
		int temp = 0;
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				temp=max;
				max=a[i];
				//a[i]=temp;
			}
			else if(temp<a[i] && a[i]!=max )
			{
				temp=a[i];
			}
		}
		System.out.println(max);
		System.out.println(temp);
		
		
	}

}
