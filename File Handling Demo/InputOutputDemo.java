
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class InputOutputDemo{

    public static void main(String[] args) throws Exception {
        
        File filename = new File("Demo.txt");
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename));
        dos.writeUTF("Hye welcome to file handling...");

        DataInputStream dis = new DataInputStream(new FileInputStream(filename));
        String s = dis.readUTF();
        System.out.println(s);
        dos.close();
        dis.close();

    }

}