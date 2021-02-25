import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;


public class Main {
	
	
	private final static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
	private final static BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		String reps = bReader.readLine();
		int repsInt = Integer.parseInt(reps);
		inputOutput(repsInt);
		
	}
	
	public static void inputOutput(int reps) throws IOException {
		String finalOutputString="";
		while(reps>0) {
		String line = bReader.readLine();
		String[] partStrings = line.split(" ");
		double[] array = stringArraytoDouble(partStrings);
		finalOutputString += bubbleSort(array) + "\n";
		reps--;
		}
		bWriter.write(finalOutputString);
		bWriter.flush();
		bReader.close();
		bWriter.close();
		
		
	}
	
	public static String bubbleSort(double[] array) {
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
		
		double average = totalChanges/(i-1); 		//calculate average
		BigDecimal b = BigDecimal.valueOf(average); //Double to BigDecimal
		int decimals = b.scale();					//calculate number of decimals 
		
		String decimalPart = String.valueOf(average);
		String decimalPartS = decimalPart.substring(decimalPart.indexOf('.')); //take out decimal part 
		BigDecimal averageDecimal;
		
		if(decimals==1) {
		averageDecimal = truncateDecimal(average, 1);
		}else if(decimalPartS.charAt(2)=='0') {
			averageDecimal = truncateDecimal(average, 1);
		}else {
			averageDecimal = truncateDecimal(average, 2);
		}
		StringBuilder builder = new StringBuilder();
		for (Double value : array) {
		    builder.append(value + " ");
		}
		String text = builder.toString().trim();
		return (averageDecimal + "-" + text );
		
	}
	 
	public static double[] stringArraytoDouble(String[] splitArr) {
	    double[] intArr = new double[splitArr.length];
	    for (int i  = 0; i < splitArr.length; i++) {
	      intArr[i] = Double.parseDouble(splitArr[i]);
	    }
	    return intArr;
	}
	
	private static BigDecimal truncateDecimal(double x,int numberofDecimals)
	{
	    if ( x > 0) {
	        return new BigDecimal(String.valueOf(x)).setScale(numberofDecimals, BigDecimal.ROUND_FLOOR);
	    } else {
	        return new BigDecimal(String.valueOf(x)).setScale(numberofDecimals, BigDecimal.ROUND_CEILING);
	    }
	}

}
