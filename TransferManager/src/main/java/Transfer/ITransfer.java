package Transfer;

import Enums.TransferType;
import State.IState;

/**
 * Created by Administrator on 2017/2/26/026.
 */
public interface ITransfer {
    void start();
    void stop();
    void suspend();
    void resume();
    void end();
    void handleTransfer();
    String getTransferName();
    void setState(IState state);
    TransferType getTransferType();
    
}
