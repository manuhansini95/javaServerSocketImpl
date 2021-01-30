package FirstScenario;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Alphclie2 {

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
            	message = dis.readUTF();
            	System.out.println("Server sent : "+ message);
            
            		
            }
           
            
            
    
        }
        catch (Exception ex)
        {
            
        }

	}

}
