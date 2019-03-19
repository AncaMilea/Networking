import java.io.*;
import java.net.*;
public class UDPReceiver{
    public static void main(String [] args){
        String username = "aem1u17";
        try{
            DatagramSocket socket = new DatagramSocket(5005);
            byte[] buf = username.getBytes();

                DatagramPacket packet = new DatagramPacket(buf, buf.length);
                socket.receive(packet);
                System.out.println("receive DatagramPacket "
                        + (new String(packet.getData())).trim());

        } catch(Exception e){System.out.println("error "+e);}
    }
}