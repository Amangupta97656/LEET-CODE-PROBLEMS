class Bank {
    long[] accounts;
    int len;
    public Bank(long[] balance) {
        len = balance.length;
        accounts = balance;
    }
    
    public boolean transfer(int account1, int account2, long money) {

        if(!isValid(account1) || !isValid(account2)){
            return false;
        }
        if(accounts[account1-1] >= money){
            accounts[account1-1]-=money;
            accounts[account2-1]+=money;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean deposit(int account, long money) {
        if(!isValid(account)){
            return false;
        }

        accounts[account-1]+=money;
        return true;
    }
    
    public boolean withdraw(int account, long money) {
        if(!isValid(account)){
            return false;
        }

        if(accounts[account-1]>=money){
            accounts[account-1]-=money;
            return true;
        }
        return false;
    }

    private boolean isValid(int account){
        if(account>=1 && account<=len){
            return true;
        }
        return false;
    }
}
