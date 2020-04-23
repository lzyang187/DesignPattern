package decorator;

import java.io.*;

/**
 * @author: cyli8
 * @date: 2019-05-13 18:22
 */
public class Test {
    public static void main(String[] args) {
        //点一杯浓缩咖啡，不需要调料
        Espresso espresso = new Espresso(AbstractBeverage.MIDUME);
        System.out.println(espresso.getDesc() + "价格为：" + espresso.cost());
        //另一位顾客需要浓缩咖啡加奶泡和摩卡调料
        Whip whip = new Whip(espresso);
        Mocha mocha = new Mocha(whip);
        System.out.println(mocha.getDesc() + "价格为：" + mocha.cost());

        //io
//        int c;
//        try {
//            InputStream is = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
//            while ((c = is.read()) >= 0) {
//                System.out.println(c);
//            }
//            is.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
