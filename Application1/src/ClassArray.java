
public class ClassArray {

	int arr1[] = new int[10];
	
	
	public void func1(){
		arr1[0] = 20;
		arr1[4] = 62;
		arr1[2] = 8;
		System.out.println(arr1[4]);
		System.out.println(arr1[8]);
	}
	
	public void func2(){
		String strarray[] = {"kiran","kumar","BS"};
		System.out.println(strarray[1]);
	}
	
	public void func3(){
		int list[] = {3,54,6,8,34,24};
		int sum = 0;
		for(int i = 0;i<list.length;i++){
			sum += list[i];
		}
		
		int sum2 = 0;
		for(int x:list){
			sum2+=x;
		}
		
		System.out.println(sum);
		System.out.println(sum2);
	}
	
	public void func4(){
		int firstArr[][] = {{1,2,3,4},{5,6,7},{8,9}};
		
		for(int row=0;row<firstArr.length;row++){
			for(int col=0;col<firstArr[row].length;col++){
				System.out.print(firstArr[row][col]+"\t");
			}
			System.out.println();
		}
	}
}
