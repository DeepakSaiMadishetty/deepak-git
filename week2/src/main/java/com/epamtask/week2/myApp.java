package com.epamtask.week2;
import com.epamtask.week2.sweets.*;
import java.util.ArrayList;

public class myApp {

	private giftCntrl giftController;

    ArrayList<Sweet> sweets;

    public myApp() {
        giftController = new giftCntrl();
    }

    private void process() {
    	int noOfTimes = (int) (Math.random() * 10);
        giftController.generateGift(noOfTimes);
    }
    public void start() {
        process();
     }

}
