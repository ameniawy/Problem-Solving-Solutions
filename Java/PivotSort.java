
public class PivotSort {
	public static void toPivot(int array[],int pivot, int size){
		int length=size-1;
		int temp=0;
		for(int i=0;i<length;i++){
			if(array[i]>pivot && array[length]<=pivot){
				temp = array[i];
				array[i]=array[length];
				array[length]=temp;
				length--;
			}
			else if(array[i]>pivot){
				length--;
				
			}
			
		}
		for(int i=0;i<size;i++){
			System.out.print(array[i]+" ");
		}
	}
	
	public static void main(String[] args){
		int array [] = {5,4,3,7,9,1,2,12,4};
		toPivot(array,5,9);
		
	
	}
}
