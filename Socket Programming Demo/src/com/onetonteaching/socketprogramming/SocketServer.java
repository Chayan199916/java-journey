package com.onetonteaching.socketprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
//import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class SocketServer {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		try {
			
			String meString = "I am Bob";
			
			System.out.println("Server is ready...");
			ServerSocket serverSocket = new ServerSocket(9999);
			
			System.out.println("Server is waiting for a connection...");
			Socket socket = serverSocket.accept();
			System.out.println("Connection established...");
			
			BufferedReader bReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String requeString = bReader.readLine();
			System.out.println("Hi, " + requeString.split(" ")[2]);
			
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
			PrintWriter printWriter = new PrintWriter(outputStreamWriter);
			printWriter.println(meString);
			outputStreamWriter.flush();
			
			serverSocket.close();
			
			
			
		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}

}
