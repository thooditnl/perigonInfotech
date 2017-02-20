package com.java.practise.swapnumbers;

/**
 * Created by THOODI on 12/29/2016.
 */
public class Flight {
    int flightnumber;

    public Flight(int flightnumber) {
        this.flightnumber = flightnumber;
    }

    public int getFlightnumber() {
        return flightnumber;
    }

    public void setFlightnumber(int flightnumber) {
        this.flightnumber = flightnumber;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightnumber=" + flightnumber +
                '}';
    }
}
