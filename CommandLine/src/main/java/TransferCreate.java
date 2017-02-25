import Attributes.TransferAttributes;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import sun.plugin2.message.Message;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.rmi.server.RMIClientSocketFactory;

/**
 * Created by grant on 2017/1/8.
 */
public class TransferCreate extends Command{
    /**
     * 构造方法。
     * */
    public TransferCreate() {
        System.out.print("TransferCreate command has been created.\n");
        Options options = getOptions();
        options.addOption("an", "agentname", true, "The name of the agent.");
        options.addOption("tn", "transfername", true, "The name of the transfer.");
        options.addOption("on", "objectname", true, "The name of the object which will be transmitted.");
    }

    /**
     * 解析命令。
     *
     * @param commandLine
     */
    public void parseCommandLine(CommandLine commandLine) {
        System.out.print("Start to parse commandline.\n");
        TransferAttributes transferAttributes = new TransferAttributes();
        Option[] options = commandLine.getOptions();
        for(Option option:options){
            switch(option.getLongOpt()){
                case "agentname":{
                    transferAttributes.setAgentName(option.getValue());
                    break;
                }
                case "transfername": {
                    transferAttributes.setTransferName(option.getValue());
                    break;
                }
                case "objectname":{
                    transferAttributes.setObjectName(option.getValue());
                    break;
                }
                default: {
                    break;
                }
            }
        }
        setMessage(transferAttributes);
    }

    /**
     * 执行命令。
     */
    public void processCommand() {

        TransferAttributes transferAttributes = (TransferAttributes)getMessage();
        try{


            output.println(transferAttributes.getTransferName().getBytes());


        }catch(UnknownHostException  e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
