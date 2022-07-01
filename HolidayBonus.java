package abc;

public class HolidayBonus {
	
	public HolidayBonus() {}
	
	public static double[] calculateHolidayBonus(double[][] data, double high, double low, double other) {
		
		int i, j;
		double[][] array = new double [data.length][];
		double [] bonusArray = new double[data.length];
		for(i = 0; i < data.length; i++) {
			array[i] = new double [data[i].length];
			
		}
		
		
	
		for ( i = 0; i<data.length; i++ ) {
			bonusArray[i] = 0.0;
			for ( j = 0; j<data[i].length; j++ ) {
				int maxInCol = TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, i);
			    int minInCol = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, i);
			    if ( data[i][j] == maxInCol ) {
			    	 bonusArray[i] = high;
			    } else if (  data[i][j] == minInCol ) {
			         bonusArray[i] = low;
			    } else {  
			    	 bonusArray[i] = other;	 
			    }
			}
		}
		
		
		
		return bonusArray;
	}
	
	
	public static double calculateTotalHolidayBonus(double[][] data, double high, double low, double other){
		
		double[][] array = new double [data.length][];
		double total = 0.0;
		int i, j;
		for(i = 0; i < data.length; i++) {
			array[i] = new double [data[i].length];		
		}
		
		for ( i = 0; i<data.length; i++ ) {
			for ( j = 0; j<data[i].length; j++ ) {
				int maxInCol = TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, i);
			    int minInCol = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, i);
			    if ( data[i][j] == maxInCol ) {
			    	 total += high;
			    } else if (  data[i][j] == minInCol ) {
			         total += low;
			    } else {  
			    	 total += other;	 
			    }
			}
		}
		
				
		return total;
	}

	
}
