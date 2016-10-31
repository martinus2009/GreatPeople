package ariorick.com.greatpeople.models;

import android.content.Context;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;



public abstract class GreatPersonAdapterFiller {

    public static SimpleAdapter getAdapter(Context context, ArrayList<GreatPerson> greatPeople){

        ArrayList<HashMap<String, String>> myArrList = new ArrayList<>();
        HashMap<String, String> map;

        for (GreatPerson person: greatPeople){
            map = new HashMap<>();
            map.put("Name", person.name + " " + person.surname);
            map.put("Description", person.activityField);
            myArrList.add(map);
        }

        return new SimpleAdapter(context, myArrList, android.R.layout.simple_list_item_2,
                new String[] {"Name", "Description"},
                new int[] {android.R.id.text1, android.R.id.text2});


    }

}
