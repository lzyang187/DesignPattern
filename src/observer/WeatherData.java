package observer;

import java.util.LinkedList;

/**
 * @author: cyli8
 * @date: 2019-04-17 20:42
 */
public class WeatherData {
    private float mTemp;
    private float mPressure;
    private LinkedList<OnListener> mListenerList;

    public void addListener(OnListener listener) {
        if (mListenerList == null) {
            mListenerList = new LinkedList<>();
        }
        mListenerList.add(listener);
    }

    public void removeListener(OnListener listener) {
        if (mListenerList != null) {
            mListenerList.remove(listener);
        }
    }

    public void notifyChange() {
        if (mListenerList != null) {
            for (OnListener onListener : mListenerList) {
                onListener.onChanged(mPressure, mTemp);
            }
        }
    }

    public void setMeasurements(float pressure, float temp) {
        mPressure = pressure;
        mTemp = temp;
        notifyChange();
    }
}
