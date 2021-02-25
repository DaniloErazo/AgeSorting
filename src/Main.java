import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	
	
	private final static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
	private final static BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		//String reps = bReader.readLine();
		//int repsInt = Integer.parseInt(reps);
		//readInput();
		
		//ask about iterate with bufferedreader 
		/*while() {
			readInput();
			repsInt--;
			System.out.println(repsInt);
		}*/
		
		double[] test = new double[] {3.04, 1.31, 9.58, 9.44, 2.65, 9.13, 0.23, 8.99, 0.86, 4.15};
		double[] finalArray = bubbleSort(test);
		//System.out.println(Arrays.toString(finalArray));
	}
	
	public static void readInput() throws IOException {
		String line = bReader.readLine();
		String[] partStrings = line.split(" ");
		stringArraytoDouble(partStrings);
		
		
	}
	
	public static double[] bubbleSort(double[] array) {
		int i = 0;
		double totalChanges=0;
		for (i = 1; i < array.length; i++) {
			int changes =0;
			for (int j = 0; j < array.length-i; j++) {
				if (array[j]>array[j+1]) {
					double temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					changes++;
				}
			}
			totalChanges+=changes;
			
			
		}
		double average = totalChanges/(i-1);
		StringBuilder builder = new StringBuilder();
		for (Double value : array) {
		    builder.append(value + " ");
		}
		String text = builder.toString();
		System.out.println(average + "-" + text );
		return array;
	}
	 
	public static double[] stringArraytoDouble(String[] splitArr) {
	    double[] intArr = new double[splitArr.length];
	    for (int i  = 0; i < splitArr.length; i++) {
	      intArr[i] = Double.parseDouble(splitArr[i]);
	    }
	    return intArr;
	  }

}
