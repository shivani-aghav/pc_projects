package java_8.features;

import java.text.DecimalFormat;

public class Regex {

	public static void main(String[] args) {
		DecimalFormat chosenFormat = new DecimalFormat("#,###.##"); 
        
        double var = 14097867.02828; // we want 1,409,756,867 
        String format = chosenFormat.format(var);
        String replace = format.replace(",", " ");
        String replace2 = replace.replace(".", ",");
        System.out.println(replace2);
        
        }
}
