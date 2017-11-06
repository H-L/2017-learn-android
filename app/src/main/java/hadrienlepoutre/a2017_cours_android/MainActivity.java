package hadrienlepoutre.a2017_cours_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int integer = 1;
        long myLong = 1l;
        float myFloat = 0.3f;
        boolean myBool = true;

        int[] myArray = {1,2,3,4};

        myArray[0] = 2;
        myArray[1] = 2;
        myArray[2] = 2;
        myArray[3] = 2;

        int[][] myDoubleArray = {{1,2}, {3,4}};

        boolean[] myBooleanArray = {true, true, false, myBool};

        myDoubleArray[1][0] = 10;
        
        int[] myArrayFromVar = {1, 20, integer}; 
        // myArrayFromVar[3] = 50; 
        // Not Working !!

        List<String> myList = new ArrayList<>();
        String myName = "Hadrien";
        String myNickname = "Ash";
        
        myList.add(myName);
        myList.add(myNickname);
        myList.add(0, "Hash");
        myList.remove(0);
        // Replace a value by index
        myList.set(0, "Hadrien");
        
        List<Integer> myFakeList = new ArrayList<>();

        // Dictionnaire
        Map<String, Integer> myDictionnary = new HashMap<>();
        myDictionnary.put("Test", 1);
        myDictionnary.put("Toto", 23);

        myDictionnary.remove("Test");

        List<Boolean> weekEnd = new ArrayList<>();
        weekEnd.add(false);
        weekEnd.add(false);
        weekEnd.add(false);
        weekEnd.add(false);
        weekEnd.add(false);
        weekEnd.add(true);
        weekEnd.add(true);

        int countDaysTillWeekEnd = 0;

        for (int index = 0; index < weekEnd.size() ; index++){
            boolean actualDay = weekEnd.get(index);
            if (actualDay == true){
                ++countDaysTillWeekEnd;
            }
        }
    }
}
