package ThirdScenario;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FloatServer {

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
	            	float value= Float.parseFloat(msg);
	                System.out.println(msg);
	                dos2.writeUTF(String.valueOf(Math.pow(value, 1.5)));
	                
	            }
	            
	            
	}
	        catch (Exception e)
	   {
	       System.out.println("Error in server"+e);
	   }

	}

}
