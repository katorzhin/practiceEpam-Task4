import org.junit.Assert;
import org.junit.Test;
import com.epam.rd.java.basic.practice4.Part1;

public class Part1Test {

    private static final String FILE_NAME = "part1.txt";
    private static final String ENCODING = "cp1251";

    @Test
    public void part1Test(){

        final String expectedString = Part1.part1(FILE_NAME, ENCODING);
        System.out.print(expectedString);
        Assert.assertNotNull(expectedString);

    }

    @Test
    public void readFromFileTest(){

        final String expectedString = Part1.readFromFile(FILE_NAME, ENCODING);
        System.out.println(expectedString);
        Assert.assertNotNull(expectedString);

    }

}