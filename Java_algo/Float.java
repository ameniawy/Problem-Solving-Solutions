
public class Float {
	public static int mult(int x,int y){
		if(x>y){
			return 1;
		}
		else return x * mult(x+1,y);
	}
	
	public static int[] partition(int []a){
		int i =0; int j= a.length-1;
		while(i<j){
			if(a[i]%2!=0){
				if(a[j]%2!=0){
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
					i++;j--;
				}
				else j--;
			}
			else if(a[j]%2!=0){
				if(a[i]%2!=0){
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
					i++;j--;
				}
				else i++;
			}
			else {
				i++;j--;
			}
			
		}
		return a;
		
	}
	public static void main(String[]args){
		
		int [] a= {1,4,5,6,2,10};
		
		int [] b = partition(a);
		
		for(int i=0;i<b.length;i++){
			System.out.print("|"+b[i]+"|");
		}
		
	}

}
