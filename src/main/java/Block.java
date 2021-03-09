import java.util.List;

public class Block {
    private int previousHash;
    private List<Transaction> transactions;


    public Block(int previousHash, List<Transaction> transactions) {
        this.previousHash = previousHash;
        this.transactions = transactions;
    }


    public int getPreviousHash() {
        return previousHash;
    }

    public void setPreviousHash(int previousHash) {
        this.previousHash = previousHash;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public int hashCode() {
        int result=previousHash;
        result=31*result+(transactions!=null ? transactions.hashCode():0);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj)return true;
        if(obj==null || getClass() != obj.getClass())return false;

        Block block =(Block) obj;
        if(previousHash !=block.previousHash)return false;
        return transactions!=null ? transactions.equals(block.transactions):block.transactions==null;
    }
}
