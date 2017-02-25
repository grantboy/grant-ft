package Command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Administrator on 2017/2/25/025.
 */
public class CreateBroker implements Command{
    private static final Logger logger = LoggerFactory.getLogger(CreateBroker.class);
    /**
     * 构造方法.
     * */
    public CreateBroker() {
    }

    /**
     * 创建Broker命令的处理方法.
     * */
    public void processCommand() {
        logger.debug("Start create broker.");
    }
}
