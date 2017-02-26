package Enums;

/**
 * Created by Administrator on 2017/2/26/026.
 */
public enum  TransferType {
    IMMEDIATE("immediate"),
    MANUAL("manual"),
    TEMPORARY("temporary"),
    TIMED("timed"),
    ;
    private String transferType;
    TransferType(String transferType) {
        this.transferType = transferType;
    }
}
