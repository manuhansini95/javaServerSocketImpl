package FirstScenario;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Alphserver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
	    {
	           ServerSocket SE= new ServerSocket(6666);
	            
	            Socket S1=SE.accept();
	            DataInputStream dis=new DataInputStream(S1.getInputStream());
	            DataOutputStream dos = new DataOutputStream(S1.getOutputStream());
	            
	            Socket S2=SE.accept();
	            DataInputStream dis2=new DataInputStream(S2.getInputStream());
	            DataOutputStream dos2 = new DataOutputStream(S2.getOutputStream());
	            
	            System.out.println("Server Listening!");
	            String msg="";
	            while(!msg.equals("Stop"))
	            {
	            	msg = dis.readUTF();
	            	String value= msg;
	                System.out.println(msg);
	                int charValue = value.charAt(0);
	                dos2.writeUTF(String.valueOf((char) (charValue - 1)));
	                
	            }
	            
	            
	}
	        catch (Exception e)
	   {
	       System.out.println("Error in server"+e);
	   }

	}

}
