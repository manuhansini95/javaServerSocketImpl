package ThirdScenario;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Floatclie1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
        {
            Socket S1 = new Socket("127.0.0.1",6666);
            DataInputStream dis= new DataInputStream(S1.getInputStream());
            DataOutputStream dos=new DataOutputStream(S1.getOutputStream());
           
            String message="";
            while(!message.equals("Stop"))
            {
            	System.out.println("Enter Message You want to send : ");
            	Scanner scaner= new Scanner(System.in);
            	message = String.valueOf( scaner.nextFloat());
            	dos.writeUTF(message);	
            }
           
            
            
    
        }
        catch (Exception ex)
        {
            
        }

	}

}
