import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by grant on 2017/1/29.
 */
public class Server {
    private int port;
    /**
     * 构造方法。
     * */
    public Server() {
    }

    public Socket wait(int port){
        this.port = port;

        try{
            ServerSocket serverSocket = new ServerSocket(port);
            return serverSocket.accept();
        }catch(UnknownHostException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }

        return null;
    }

    public void send(Socket socket, String dataString){
        try{
            PrintWriter output = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));
            output.write(dataString);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public byte[] receive(Socket socket){
        try{
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String receive = input.readLine();
            return receive.getBytes();
        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }

    public int getPort() {
        return port;
    }
}


