/**
 * A skeleton Java file meant for use with Programming Contests. Also includes a suite
 * of helper functions meant to streamline many common Contest tasks. 
 * 
 * Notes:
 *
 * Problem solving code should be placed within the `run()` method at the bottom of this
 * script. 
 * 
 * The name of this file (ContestProblem.java, by default) *MUST* be the same as the 
 * outer class. If you change the name of the file, be sure to change the name of 
 * the class to match it, and to update where the class gets instantiated in the `main`
 * method. 
 * 
 * The ContestTools class contains several helpful functions that should make reading
 * data in much easier. Once an instance of ContestTools has been instantiated,
 * the relevant methods can be called on that instance. For example, to read in a 
 * line of space-delimited numbers and store them in an List of int's:
 *
 * 		ContestTools tools = new ContestTools();
 * 		String[] line = tools.readLineIntoArray();
 *		List<Integer> numbers = new ArrayList<>();
 * 		for (String s : line) {
 *			numbers.add(tools.parseInt(s));
 *		}
 *
 * The ContestTools class also extends the PrintWriter class, so it can be used for
 * printing as normal (eg. `tools.println("Hello, World!")`).
 *
 * We use a BufferedReader and a BufferedOutputStream for reading and writing,
 * respectively, as Kattis recommends their use over the Scanner class as they
 * are more efficient. As a result, When you are finished with the problem, be sure 
 * that tools.close() is called otherwise some output may not be properly printed, 
 * as it is being buffered.
 *
 *
 *
 * Copyright 2017 Trevor Masters
 * 
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 * 
 *        http://www.apache.org/licenses/LICENSE-2.0
 * 
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *  
 *
 * @author: Trevor Masters
 */

import java.io.BufferedReader;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.io.IOException;

public class ContestProblem {
	static class ContestTools extends PrintWriter {
		private BufferedReader r;
		public ContestTools() {
			super(new BufferedOutputStream(System.out));
			r = new BufferedReader(new InputStreamReader(System.in));
		}
		
		// Closes the inherited PrintWriter, flushing output at the same time.
		public void close() {
			super.flush();
			super.close();
		}
		
		// Returns true if the given string is a number, possibly with a decimal point.
		public boolean isDecimalNumber(String s) { return s.matches("-?\\d+(\\.\\d+)?"); }
		
		// Returns true if the given string is a whole, non-decimal number.
		public boolean isWholeNumber(String s) { return s.matches("-?\\d+"); }
		
		// Returns the given String as an int.
		public int parseInt(String s) { return Integer.parseInt(s); }
		
		// Returns the given String as a double.
		public double parseDouble(String s) { return Double.parseDouble(s); }
		
		// Returns the given String as a long.
		public long parseLong(String s) { return Long.parseLong(s); }
		
		// Returns the given String as a float.
		public float parseFloat(String s) { return Float.parseFloat(s); }
		
		// Returns the given Object as a string. Works with primitives as well.
		public String toString(Object o) { return String.valueOf(o); }
		
		// Returns a String containing an entire line of text from the input, not 
		// including the newline character. Returns null if there is no input left or
		// if the reading fails.
		public String readLine() {
			try {
				return r.readLine();
			} catch (IOException e) {
				return null;
			}	
		}
		
		// Returns a String[] containing an entire line of text from the input, not 
		// including the newline character, separated into separate Strings using " "
		// as a delimiter. Returns null if there is no input left or if the reading fails.
		public String[] readLineIntoArray() {
			return readLineIntoArray(" ");
		}
		
		// Returns a String[] containing an entire line of text from the input, not 
		// including the newline character, separated into separate Strings using the 
		// given delimiter. Returns null if there is no input left or if the reading 
		// fails.
		public String[] readLineIntoArray(String delim) {
			try {
				String line = r.readLine();
				return line==null ? null : line.split(delim);
			} catch (IOException e) {
				return null;
			}		
		}

	}
	
	public static void main(String[] args) {
		ContestProblem stuff = new ContestProblem();
		ContestTools tools = new ContestTools();
		stuff.run(tools);
		// Must close the tool at the end to ensure that any buffered output is printed
		tools.close();
	}
	
	public void run(ContestTools tools) {
		// YOUR CODE GOES HERE
		
		// Example code:
		// 
		// String line;
		// while ((line = tools.readLine()) != null) {
		//  	tools.println("Hello, World!");
		// }
	}
}
