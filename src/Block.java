import java.util.Date;

public class Block {
    /* == Public hashes == */
    public String hash;
    public String previousHash;

    private String data;
    private long timeStamp;

    public String calculateHash() {
        return StringUtil.applySha256(
                previousHash +
                        timeStamp +
                        data
        );
    }

    public Block(String data, String previousHash){
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        this.hash = calculateHash();
    }

}
