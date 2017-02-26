package Transfer;

import Enums.TransferType;

/**
 * Created by Administrator on 2017/2/26/026.
 */
public class ManualTransfer extends Transfer implements ITransfer{
    @Override
    public void start() {
        runTransfer(this);
    }

    @Override
    public void stop() {

    }

    @Override
    public void suspend() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void end() {

    }

    @Override
    public void handleTransfer() {
        //TODO：加入调度器。
    }

    @Override
    public String getTransferName() {
        return null;
    }

    @Override
    public TransferType getTransferType() {
        return getTransferType();
    }
}
