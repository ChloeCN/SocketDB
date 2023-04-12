package COM.mkdirDB.tm.impl;

import COM.mkdirDB.tm.TransactionManager;

import java.util.Random;

public class TransactionManagerImpl implements TransactionManager {
    //XID文件头长度
    private static final int LEN_XID_HEADER_LENGTH = 8;

    //每个事务的占用长度
    private static final int XID_FIELD_SIZE = 1;

    //事务状态
    private static final byte FIELD_TRAN_ACTIVE = 0;

    public static final byte FIELD_TRAN_COMMITTED = 1;

    public static final byte FIELD_TRAN_ABORTED = 2;

    //永久为commited状态的事务
    public static final long SUPER_XID = 0;

    public static final String XID_SUFFIX = ".xid";


    @Override
    public long begin() {
        return 0;
    }

    @Override
    public void commit(long xid) {

    }

    @Override
    public void abort(long xid) {

    }

    @Override
    public boolean isActive(long xid) {
        return false;
    }

    @Override
    public boolean isCommited(long xid) {
        return false;
    }

    @Override
    public void close() {

    }
}
