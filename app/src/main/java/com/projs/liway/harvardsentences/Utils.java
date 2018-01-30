package com.projs.liway.harvardsentences;

import android.content.Context;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by Liway on 1/29/2018.
 * helper class related to reading from txt file
 */

public final class Utils {

    private static final String LOG_TAG = "Utils";
    private Utils(){
    }

    /**
     * returns a String containing raw file contents
     */
    public static String readFileFromRaw(Context context, int resFile){

        String rawFileString = "";
        try{
            InputStream is = context.getResources().openRawResource(resFile);

            if(is != null){
                InputStreamReader inputStreamReader = new InputStreamReader(is);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                StringBuilder stringBuilder = new StringBuilder();
                String line;
                while((line = bufferedReader.readLine()) != null){
                    stringBuilder.append(line + '\n' + '\n');
                }

                is.close();
                rawFileString = stringBuilder.toString();
            }
        } catch (IOException e) {
            Log.e(LOG_TAG, "IO exception when reading file from raw");
        }

        return rawFileString;
    }

    public static int randomNum(int n){
        Random random = new Random();
        return random.nextInt(n);
    }


}
