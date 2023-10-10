import org.junit.jupiter.api.Test;
import org.example.structural.adapter.*;
public class AdapterTest {
    @Test
    public void chargeForPhone() {
        HomeBattery homeBattery = new HomeBattery();
        int homeVolt = homeBattery.supply();
        System.out.println("家庭电源提供的电压是 " + homeVolt + "V");

        USBLine usbLine = new USBLine();
        usbLine.charge(homeVolt);
    }

    @Test
    public void chargeForPhoneWithAdapter() {
        HomeBattery homeBattery = new HomeBattery();
        int homeVolt = homeBattery.supply();
        System.out.println("家庭电源提供的电压是 " + homeVolt + "V");

        Adapter adapter = new Adapter();
        int chargeVolt = adapter.convert(homeVolt);
        System.out.println("使用适配器将家庭电压转换成了 " + chargeVolt + "V");

        USBLine usbLine = new USBLine();
        usbLine.charge(chargeVolt);
    }
}
