import java.io.*;
import java.net.*;
public class udpsend {
    public static void main(String [] args){
        String username = "aem1u17";
        try{
            InetAddress address = InetAddress.getByName("svm-km2-nets.ecs.soton.ac.uk");
            DatagramSocket socket = new DatagramSocket();

            byte[] buf = username.getBytes();
            DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 5005);
            socket.send(packet);
            System.out.println("send DatagramPacket " + new String(packet.getData()) + " " + packet.getAddress() + ":" + packet.getPort());
            Thread.sleep(2000);

        }catch(Exception e){System.out.println("error");}
    }
}
