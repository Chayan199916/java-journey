
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class InputOutputDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {

		File filename = new File("Demo.txt");
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename));
		dos.writeUTF("Hye welcome to file handling...");
		//
		// DataInputStream dis = new DataInputStream(new FileInputStream(filename));
		// String s = dis.readUTF();
		// System.out.println(s);
		// dos.close();
		// dis.close();
		String tempString = "";
		String smallestString = "";
		int lineCounter = 0;
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
			while ((tempString = bufferedReader.readLine()) != null) {
				if (lineCounter == 0) {
					smallestString = tempString;
				} else {
					if (tempString.length() < smallestString.length()) {
						smallestString = tempString;
					}
				}
				lineCounter++;
				System.out.println(tempString);
			}
			System.out.println("Total # of lines : " + lineCounter);
			System.out.println("Smallest string : " + smallestString);
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}