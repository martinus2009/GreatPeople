package ariorick.com.greatpeople;

import android.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import ariorick.com.greatpeople.models.GreatPerson;
import ariorick.com.greatpeople.models.GreatPersonAdapterFiller;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ArrayList<GreatPerson> greatPeople =  new ArrayList<>();
    Button add;
    DialogFragment dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add = (Button) findViewById(R.id.add);
        add.setOnClickListener(this);

        ListView mainList = (ListView) findViewById(R.id.main_list);
        for (int i = 0; i < 15 ; i++) {

            greatPeople.add(new GreatPerson("Гитлер", "Владимирович", "Хуй", "президент",
                    "Президент Российской Федерации", new Date(15, 6, 1998).getTime(), new Date(13, 5, 2035).getTime()));
        }

        SimpleAdapter adapter = GreatPersonAdapterFiller.getAdapter(this, greatPeople);
        mainList.setAdapter(adapter);


    }

    @Override
    public void onClick(View view){
        dialog = new MyDialog();
        dialog.show(getFragmentManager(),"Edit");

    }


}
