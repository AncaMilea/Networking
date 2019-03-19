import java.io.*;
import java.net.*;
public class tcpsend{
    public static void main(String [] args){
        String username = "aem1u17";
        try{
            Socket socket = new Socket("svm-km2-nets.ecs.soton.ac.uk",5002);
            PrintWriter out = new PrintWriter(socket.getOutputStream());
            out.println(username); out.flush();
            System.out.println(username);
            Thread.sleep(1000);
        }catch(Exception e){System.out.println("error"+e);}
    }
}