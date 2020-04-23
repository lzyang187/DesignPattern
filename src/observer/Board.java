package observer;

/**
 * @author: cyli8
 * @date: 2019-04-17 21:26
 */
public class Board implements OnListener {
    @Override
    public void onChanged(float pressure, float temp) {
        System.out.println("气象变化：" + pressure + " " + temp);
    }
}

class Test {
    public static void main(String[] args) {
        Board board = new Board();
        WeatherData data = new WeatherData();
        data.addListener(board);
        data.setMeasurements(2, 3);
    }
}
