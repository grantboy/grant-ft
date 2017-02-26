package State;

import Transfer.ITransfer;

/**
 * Created by Administrator on 2017/2/26/026.
 */
public class Pending implements IState {
    public void handleStart() {
        /* 处于PENDING状态的任务不处理start操作 */
    }

    @Override
    public void handleStart(ITransfer transfer) {

    }

    @Override
    public void handleStop(ITransfer transfer) {

    }

    @Override
    public void handleSuspend(ITransfer transfer) {

    }

    @Override
    public void handleResume(ITransfer transfer) {

    }

    public void handleEnd(ITransfer transfer) {

    }
}
