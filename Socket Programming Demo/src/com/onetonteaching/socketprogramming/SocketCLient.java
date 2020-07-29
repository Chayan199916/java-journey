package com.onetonteaching.socketprogramming;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;



public class SocketCLient {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		String ip = "localhost";
		int port = 9999; // 0-1023 not available ; total 65535
		
		try {
			
			Socket socket = new Socket(ip, port);
			String meString = "I am Alie";
			
//			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
//			PrintWriter printWriter = new PrintWriter(outputStreamWriter);
//			printWriter.println(meString);
//			outputStreamWriter.flush();
			
			DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
			dataOutputStream.writeUTF(meString);
			dataOutputStream.flush();
			
			System.out.println("Message sent...");
			
//			BufferedReader bReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//			String reString = bReader.readLine();
			
			DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
			String reString = (String)dataInputStream.readUTF();
			
			System.out.println("Hi, " + reString.split(" ")[2]);
			
			dataOutputStream.close();
			socket.close();
			
			
		} catch (UnknownHostException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		

	}

}
