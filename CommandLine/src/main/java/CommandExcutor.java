import org.apache.commons.cli.*;
import org.apache.log4j.Logger;


/**
 * Created by grant on 2017/1/7.
 */
public class CommandExcutor {
    private static Logger logger =  Logger.getLogger(CommandExcutor.class);

    public static void main(String[] args){
        CommandLineParser parser = new DefaultParser();
        String[] parameters = new String[args.length-1];
        System.arraycopy(parameters, 0, args, 1, args.length-1);
        try{
            Command command = (Command) Class.forName(args[0]).newInstance();
            if (command != null){
                CommandLine commandLine = parser.parse(command.getOptions(), parameters);
                command.parseCommandLine(commandLine);
            }else {
                logger.error("Failed to parse command parameters..");
            }

        }catch (ParseException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (IllegalAccessException e){
            e.printStackTrace();
        }catch (InstantiationException e){
            e.printStackTrace();
        }


    }
}
