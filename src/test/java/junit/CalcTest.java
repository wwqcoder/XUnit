package junit;

import junit5.Calc;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @Date 2020/8/4
 * @Autor weiqi.wang
 **/
public class CalcTest {

    @Test
    void div(){
        assertEquals(Calc.div(2,1),2);
    }
    
    @Test
    void run(){
        String name = System.getenv("name");
        System.out.println(name);
    }
}
