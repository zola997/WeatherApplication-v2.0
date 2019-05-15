package pnrs.vezbe.projekat_1;

public class Forecast {
    private String mDan,mGrad,mTemp,mPressure,mHumidity;

    public Forecast(String dan,String grad,String Temp,String Pressure,String Humidity){
        mTemp=Temp;
        mPressure=Pressure;
        mHumidity=Humidity;
        mDan=dan;
        mGrad=grad;
    }
     public String getTemp() {
        return mTemp;
    }
    public String getPressure() {
        return mPressure;
    }
    public String getHumidity() {
        return mHumidity;
    }
    public String getDan() { return mDan;
    }
    public String getGrad() { return mGrad;
    }

    public void setTemp(String temp) {
        mTemp=temp;
    }
    public void setPressure(String pressure) {
         mPressure=pressure;
    }
    public void setHumidity(String humidity){ mHumidity=humidity;
    }
    public void setDan(String dan) { mDan=dan;
    }
    public void setGrad(String grad) {  mGrad=grad;
    }

}
