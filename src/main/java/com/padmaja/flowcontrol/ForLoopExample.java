package com.padmaja.flowcontrol;
import java.lang.String;

public class ForLoopExample {
    public int tablesExample() {
        int multiArr[][] = new int[2][3];
        for(int i=0; i<multiArr.length ; i++){
            for(int j=0; j<multiArr[i].length;j++){
                multiArr[i][j]=i+j;
                System.out.println(multiArr[i][j]);
            }

        }
        return 0;

    }

}