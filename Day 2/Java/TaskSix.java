public class TaskSix{
public static int [] arrays = int [] array{
	
	int [] array = new int[array.length / 2];
	int[] even = 0;
	int sum = 0;
	for(int index = 0; index <= array.length; index++){
		if(index % 2 == 0){
		sum += array[index];
		}
		}
	return sum;
	}
}