package State;

import Transfer.ITransfer;

/**
 * Created by Administrator on 2017/2/26/026.
 */
public class Stopped implements IState{

    @Override
    public void handleStart(ITransfer transfer) {
        switch (transfer.getTransferType()){
            case IMMEDIATE:{
                break;
            }
            case MANUAL:{
                transfer.setState(new Running());
                break;
            }
            case TEMPORARY:{
                /* 临时任务不会进入此分支 */
                break;
            }
            case TIMED:{
                transfer.setState(new Schedule());
                break;
            }
            default:{
                break;
            }
        }
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

    @Override
    public void handleEnd(ITransfer transfer) {

    }
}
