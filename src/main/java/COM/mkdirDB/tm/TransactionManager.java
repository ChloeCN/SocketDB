package COM.mkdirDB.tm;

import COM.mkdirDB.tm.impl.TransactionManagerImpl;

import java.io.File;
import java.lang.reflect.Field;

public interface TransactionManager {
    long begin();
    void commit(long xid);
    void abort(long xid);
    boolean isActive(long xid);
    boolean isCommited(long xid);
    void close();

    public static TransactionManagerImpl create(String path){
        File file = new File(path + TransactionManagerImpl.XID_SUFFIX);
        try {
            if (!file.createNewFile()){

            }
        }catch (Exception e){

        }
        return new TransactionManagerImpl();
    }
}
