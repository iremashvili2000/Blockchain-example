import java.lang.reflect.Array;
import java.util.Arrays;

class BlockchainExauntitledmple {

    public static void main(String[] args){
        /*
        Blockchain

         */
        Transaction transaction1=new Transaction("goga","gio",100L);
        Transaction transaction2=new Transaction("gio","sandro",1000L);
        Transaction transaction3=new Transaction("elene","ana",10L);
        Block firstBlock=new Block(0, Arrays.asList(transaction1,transaction2));
        System.out.println(firstBlock.hashCode());
        Block secondBlock= new Block(firstBlock.hashCode(),Arrays.asList(transaction3));
        System.out.println(secondBlock.hashCode());
    }
}
