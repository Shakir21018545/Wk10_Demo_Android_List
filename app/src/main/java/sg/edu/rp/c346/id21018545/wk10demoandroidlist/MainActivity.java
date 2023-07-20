package sg.edu.rp.c346.id21018545.wk10demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    //ArrayList<String> items = new ArrayList();
    ArrayList<AndroidVersion> items = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lv);

        //items.add("Pie: 9.0");
        //items.add("Oreo: 8.0-8.1");
        //items.add("Nougat: 7.0-7.1.2");

        items.add(new AndroidVersion("Pie", "9.0"));
        items.add(new AndroidVersion("Oreo", "8.0 - 8.1"));
        items.add(new AndroidVersion("Nougat", "7.0 - 7.1.2"));

        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,items);
        //lv.setAdapter(adapter);

        ArrayAdapter<AndroidVersion> adapter = new CustomAdapter(this, R.layout.row,items);
        lv.setAdapter(adapter);
    }
}