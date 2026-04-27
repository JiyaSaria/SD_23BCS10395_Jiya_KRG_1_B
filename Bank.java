public interface MakeAccount {
    int account_no;
    void make_account();
}
public interface saveToDB{
    void save_to_db();
}
class FixedDeposit implements MakeAccount{
    @java.lang.Override
    public void make_account() {
        System.out.print("Fixed Deposit made");
    }
}
class SavingsAccount implements MakeAccount{
    @java.lang.Override
    public void make_account() {
        System.out.print("Savings Account made");
    }
}

class MongoDb implements saveToDB{
    @java.lang.Override
    public void save_to_db() {
        System.out.print("Data saved to mongoDB");
    }
}
class MySQL implements saveToDB{
    @java.lang.Override
    public void save_to_db() {
        System.out.print("Data saved to MySQL");
    }
}
public class Main{
    public static void main(String[] args){
        FixedDeposit fd = new FixedDeposit();
        fd.make_account();
        MongoDb save = new MongoDb();
        save.save_to_db();
    }
}