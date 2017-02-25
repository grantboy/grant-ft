import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by grant on 2017/1/29.
 */
public class Client {
    private String ip;
    private int port;
    private Socket socket;

    /**
     * 构造方法。
     * */
    public Client(String ip, int port) {
        this.ip = ip;
        this.port = port;


    }

    public void init(){
        try{
            InetAddress inetAddress = InetAddress.getByAddress(ip.getBytes());
            OutputStream outputStream = socket.getOutputStream();
        }catch (UnknownHostException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
