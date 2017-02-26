package Manager;

import Enums.TransferType;
import Transfer.ITransfer;

import java.util.List;

/**
 * Created by Administrator on 2017/2/26/026.
 */
public interface ITransferFactory {
    ITransfer createTransfer(TransferType transferType);
    void deleteTransfer(String tansferName);
    List<ITransfer> getAllTransfer();

}
