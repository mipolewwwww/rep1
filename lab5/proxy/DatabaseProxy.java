package lab5.proxy;


public class DatabaseProxy implements Database {
    private RealDatabase rd;
    private boolean hasaccess;

    public DatabaseProxy(boolean hasaccess){
        this.rd =new RealDatabase();
        this.hasaccess = hasaccess;
    }
    @Override
    public void query(String sql){
        if (hasaccess){
            rd.query(sql);
        } else {
            System.out.println("Ad");
        }
    }
}
