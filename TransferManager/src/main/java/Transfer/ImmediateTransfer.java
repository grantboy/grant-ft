package Transfer;

import Enums.TransferType;
import State.IState;

/**
 * Created by Administrator on 2017/2/26/026.
 */
public class ImmediateTransfer extends Transfer implements ITransfer{
    public void start() {

    }

    public void stop() {

    }

    public void suspend() {

    }

    public void resume() {

    }

    public void end() {

    }

    @Override
    public void handleTransfer() {
        runTransfer(this);
    }

    @Override
    public String getTransferName() {
        return null;
    }

    @Override
    public void setState(IState state) {
        setState(state);
    }

    @Override
    public TransferType getTransferType() {
        return getTransferType();
    }
}
