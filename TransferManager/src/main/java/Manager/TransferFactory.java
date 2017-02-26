package Manager;

import Enums.TransferType;
import Transfer.*;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by Administrator on 2017/2/26/026.
 */
public class TransferFactory implements ITransferFactory{
    private static final List<ITransfer> transferList = new ArrayList<ITransfer>();

    public TransferFactory() {
    }

    @Override
    public ITransfer createTransfer(TransferType transferType) {
        ITransfer transfer = null;
        synchronized (transferList){
            switch (transferType){
                case IMMEDIATE:{
                    transfer = new ImmediateTransfer();
                    break;
                }
                case TEMPORARY:{
                    transfer = new TemporaryTransfer();
                    break;
                }
                case MANUAL:{
                    transfer = new ManualTransfer();
                    break;
                }
                case TIMED:{
                    transfer = new TimedTransfer();
                    break;
                }
                default:{
                    break;
                }
            }

            transferList.add(transfer);
        }

        return transfer;
    }

    @Override
    public void deleteTransfer(String transferName) {
        synchronized (transferList){
            for (ITransfer transfer: transferList) {
                if (transfer.getTransferName().equals(transferName)){
                    transferList.remove(transfer);
                    //TODO:删除持久化文件.
                }
            }
        }
    }

    @Override
    public List<ITransfer> getAllTransfer() {
        return transferList;
    }
}
