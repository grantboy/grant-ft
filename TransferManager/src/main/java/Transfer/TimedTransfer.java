package Transfer;

import Enums.TransferType;
import State.IState;

/**
 * Created by Administrator on 2017/2/26/026.
 */
public class TimedTransfer extends Transfer implements ITransfer{


    @Override
    public void start() {

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
    }

    @Override
    public String getTransferName() {
        return null;
    }

    @Override
    public void setState(IState state) {

    }

    @Override
    public TransferType getTransferType() {
        return null;
    }
}
