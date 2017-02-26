package State;

import Transfer.ITransfer;

/**
 * Created by Administrator on 2017/2/26/026.
 */
public interface IState {
    void handleStart(ITransfer transfer);
    void handleStop(ITransfer transfer);
    void handleSuspend(ITransfer transfer);
    void handleResume(ITransfer transfer);
    void handleEnd(ITransfer transfer);
}
