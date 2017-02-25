import message.Message;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Options;

/**
 * Created by grant on 2017/1/7.
 */
public abstract class Command {
    /**
     * 命令选项。
     * */
    private Options options;

    /**
     * 参数消息。
     * */
    private Message message;
    /**
     * 构造方法。
     * */
    public Command() {
        options = new Options();
    }

    /**
     * 解析命令。
     * */
    public abstract void parseCommandLine(CommandLine commandLine);

    /**
     * 执行命令。
     * */
    public abstract void processCommand();

    public Options getOptions() {
        return options;
    }

    public void setOptions(Options options) {
        this.options = options;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}
