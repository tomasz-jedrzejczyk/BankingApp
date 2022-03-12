import org.junit.Assert;
import org.junit.Test;

public class Testing {

    @Test
    public void methodToSeeIfAccountHaveBalance(){
        BankDetails bankDetails = new BankDetails();
        bankDetails.setBalance(100);
        Assert.assertEquals(100,bankDetails.getBalance());

    }

}
