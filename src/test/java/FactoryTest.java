import org.example.creational.factory.MaskFactory;
import org.example.creational.factory.N95MaskFactory;
import org.example.creational.factory.SurgicalMaskFactory;


import org.junit.jupiter.api.Test;

public class FactoryTest {

    @Test
    public void test() {
        MaskFactory factory = new MaskFactory();
        // 输出：这是医用口罩
        System.out.println(factory.create("Surgical"));
        // 输出：这是 N95 口罩
        System.out.println(factory.create("N95"));
    }

    @Test
    public void testFactory() {
        SurgicalMaskFactory surgicalMaskFactory = new SurgicalMaskFactory();
        // 输出：这是医用口罩
        System.out.println(surgicalMaskFactory.create());
        N95MaskFactory N95MaskFactory = new N95MaskFactory();
        // 输出：这是 N95 口罩
        System.out.println(N95MaskFactory.create());
    }

}

