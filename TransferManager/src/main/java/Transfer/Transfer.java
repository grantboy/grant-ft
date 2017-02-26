package Transfer;

import Enums.EndMode;
import Enums.StopMode;
import State.IState;
import State.Stopped;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * Created by Administrator on 2017/2/26/026.
 */
public abstract class Transfer implements Runnable{
    private static final ExecutorService transferThreadPool = Executors.newCachedThreadPool();
    private EndMode endMode;
    private StopMode stopMode;
    private IState state;
    public Transfer() {
        state = new Stopped();
    }

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }

    @Override
    public void run(){

    }

    public void runTransfer(Transfer transfer){
        transferThreadPool.submit(transfer);
    }
}
