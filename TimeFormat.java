// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// In Java, the command-line arguments args[0], args[1], ... are represented
		// each by a string. In this program, the single "hh:mm" input is represented
		// by the single command-line string argument args[0]. 
		//   
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        boolean PM = (hours >= 12); // Checking if it's AM/PM
		if(hours > 12) { // If it's higher then 12, then we need to change to format to 12H
			hours %= 12;
		}
		String newTime = ""; // variable for the outprint.
		if(hours < 10) { // Making sure the time is written currectly (with "0" at the start when necessary)
            if(hours == 0) {
                newTime += "00";
            }
			
            else {
                newTime += "0" + hours;
            }
        }
        else {
            newTime += hours;
        }
        newTime += ":";  // Not forgetting the colon
        if(minutes < 10) { // (Same as hours just to minutes) Making sure the time is written currectly (with "0" at the start when necessary)
            if(minutes == 0) {
                newTime += "00";
            }
        else {
                newTime += "0" + minutes;
            }
        }
        else {
            newTime += minutes;
        }
		if(PM) { // Adding the AM/PM at the end respectivly
			newTime += " PM";
		}
		else {
			newTime += " AM";
		}
		System.out.println(newTime);
	}
}
