package abc;
import java.io.*;
import java.util.*;
public class TwoDimRaggedArrayUtility {

	public TwoDimRaggedArrayUtility() {}
	
	public static double[][] readFile(java.io.File file)
            throws java.io.FileNotFoundException{
		double[][]data = new double [6][];
		String str;
		String[] array;
		int i = 0;
		try {
			Scanner sc = new Scanner(file);   
		    //System.out.println("Just read <" + str + ">");
			while ( sc.hasNext() ) {
				str = sc.nextLine();
				array = str.split(" ");
				int size = array.length;	
				data[i] = new double[size];
				
				for (int x=0; x < size; x++) {
					data[i][x] = Double.parseDouble(array[x]);	
				}
				
				i++;
			}
			
			sc.close();
		}
		catch(Exception ep) {
			ep.printStackTrace();
		}
		
		return data;
	}
	
	
	public static void writeToFile(double[][] data, java.io.File outputFile)
			throws java.io.FileNotFoundException{
		
		try {
			
			PrintWriter pwFile = new PrintWriter(outputFile);
			for (int i = 0; i < data.length; i++) {
				for (int x = 0; x < data[i].length; x++) {
					pwFile.print(data[i][x]);
					pwFile.print(" ");
				}
				pwFile.println("");
			}
			pwFile.close(); 
		}
		catch (Exception ep) {
			ep.printStackTrace();
		}
		
	}
	
	public static double getTotal(double[][] data) {
		
		double total = 0;
		for (int i = 0; i < data.length; i++) {
			for (int x = 0; x < data[i].length; x++) {
				total += data[i][x];
			}
		}
		
		return total;
		
	}
	
	public static double getAverage(double[][] data) {
		
		double total = 0;
		int count = 0;
		double average;
		for (int i = 0; i < data.length; i++) {
			for (int x = 0; x < data[i].length; x++) {
				total += data[i][x];
				count += 1;
			}
		}
		average = total / count;	
		return average;
		
	}

	public static double getRowTotal(double[][] data, int row) {
		
		double total = 0;
		for(int i = 0; i < data[row].length; i++)
			total += data[row][i];	
		
		return total;
	}
	
	public static double getColumnTotal(double[][] data, int col) {
		
		double total = 0;
		for (int i = 0; i < data.length; i++) {
			
			if( col <= data[i].length -1)
				total += data[i][col];		
		}
		
		return total;
	}
	
	
	public static double getHighestInRow(double[][] data, int row) {
		
		double value = data[row][0];
		for(int i = 0; i < data[row].length; i++) {
			if (data[row][i] > value)
				value = data[row][i];
		}
				
		return value;
		
	}

	public static int getHighestInRowIndex(double[][] data, int row) {
		
		int index = 0;
		for (int i=0; i < data[row].length; i++) {
			if(data[row][i] > data[row][index])
				index = i;
		}
				
		return index;		
	}

	public static double getLowestInRow(double[][] data, int row) {
		
		double value = data[row][0];
		for(int i = 0; i < data[row].length; i++) {
			if (data[row][i] < value)
				value = data[row][i];
		}
		
		return value;
	}
	
	public static int getLowestInRowIndex(double[][] data, int row) {
		
		int index = 0;
		for (int i=0; i < data[row].length; i++) {
			if(data[row][i] < data[row][index])
				index = i;
		}
				
		return index;		
	}
	

	public static double getHighestInColumn(double[][] data, int col) {
		
		double value = -1.0;
		for(int i = 0; i < data.length; i++) {
			if (col < data[i].length) {
				if (data[i][col] > value)
					value = data[i][col];
			}
		}
		
		return value;
	}
	
	public static int getHighestInColumnIndex(double[][] data, int col) {
		
		int index = -1;
		double maxval = -1.0;
		for(int i = 0; i < data.length; i++) {
			if (col < data[i].length ) {
				if (data[i][col] > maxval) {
					index = i;
					maxval = data[i][col];
			}
		 }
		}
		return index;
	}
	
	public static double getLowestInColumn(double[][] data, int col) {
		
		double value = 1000000000.0;
		for(int i = 0; i < data.length; i++) {
			if (col < data[i].length ) {
				if (data[i][col] < value)
					value = data[i][col];
			}
		}
		
		return value;
	}

	public static int getLowestInColumnIndex(double[][] data, int col) {
	
	int index = -1;
	double minval=10000000000.0;
	for(int i = 0; i < data.length; i++) {
		if (col < data[i].length) {
			if (data[i][col] < minval) {
				index = i;
				minval = data[i][col];
			}
		}
	}
	
	return index;
}
	
	public static double getHighestInArray (double[][] data) {
		double value = data[0][0];
		for (int i = 0; i< data.length; i++) {
			for(int x = 0; x < data[i].length; x++) {
				if (data[i][x] > value)
					value = data[i][x];
			}
		}
		return value;
	}
	
	public static double getLowestInArray (double[][] data) {
		double value = data[0][0];
		for (int i = 0; i< data.length; i++) {
			for(int x = 0; x < data[i].length; x++) {
				if (data[i][x] < value)
					value = data[i][x];
			}
		}
		return value;
	}
	
		
}
