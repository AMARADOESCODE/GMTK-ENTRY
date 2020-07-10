import java.io.*;
import java.util.ArrayList;

class Arrayify {
	public static void main(String args[])
	{
		ArrayList<Double> inivars = new ArrayList<Double>();
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("inivars.txt"));
			String line = reader.readLine();
			while (line != null) {			
				String svalue = line.substring(line.indexOf(" ")+1);
				svalue.trim();
				double dvalue = Double.parseDouble(svalue);
				inivars.add(dvalue);
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			System.out.println("Error.");
		}
	inivars.forEach(System.out::println);
	}
}

			
			
		