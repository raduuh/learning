package com.telenav.firstapplication;

import android.util.Log;

/**
 * Created by raduh on 3/10/2017.
 */

public class Calculator {
 public void sumCalculator() {
        Log.d("Sum", "The sum is " + AddOperation.addOper(1, 1));
    }
   public void diffCalculator(){
        Log.d("Diff","The diff is "+AddOperation.diffOper(1,2));
    }}
