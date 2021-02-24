import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) {
		

	}
	
	public static void readInput() throws IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String reps = bReader.readLine();
		
		bReader.close();
		bWriter.close();
	}
	
	public static int[] bubbleSort(int[] array, int reps) {
		
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array.length-i; j++) {
				if (array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
			
		}
		return array;
	}
	public static int[] stringArraytoInt(String[] splitArr) {
	    int[] intArr = new int[splitArr.length];
	    for (int i  = 0; i < splitArr.length; i++) {
	      intArr[i] = Integer.parseInt(splitArr[i]);
	    }
	    return intArr;
	  }

}
