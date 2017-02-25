package Attributes;

import message.Message;

/**
 * Created by grant on 2017/1/26.
 */
public class TransferAttributes extends Message {
    /**
     * agent名称。
     * */
    private String agentName;
    /**
     * transfer名称。
     * */
    private String transferName;

    /**
     * object名称。
     * */
    private String objectName;

    /**
     * 构造方法。
     **/
    public TransferAttributes() {
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getTransferName() {
        return transferName;
    }

    public void setTransferName(String transferName) {
        this.transferName = transferName;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }
}
