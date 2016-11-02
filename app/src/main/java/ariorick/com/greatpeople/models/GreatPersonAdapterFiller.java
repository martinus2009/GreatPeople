package ariorick.com.greatpeople.models;

import android.content.Context;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;



public abstract class GreatPersonAdapterFiller {

    public static SimpleAdapter getAdapter(Context context, ArrayList<GreatPerson> greatPeople){

        ArrayList<HashMap<String, String>> maps = new ArrayList<>();
        HashMap<String, String> map;

        for (GreatPerson person: greatPeople){
            map = new HashMap<>();
            map.put("Name", person.name + " " + person.surname);
            map.put("Description", person.activityField);
            maps.add(map);
        }

        return new SimpleAdapter(context, maps, android.R.layout.simple_list_item_2,
                new String[] {"Name", "Description"},
                new int[] {android.R.id.text1, android.R.id.text2});


    }

}
