package ashishrpa.session_05_assignment_03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    Bundle bundle;
    ListView listView;
    MentorDetails mentorDetails;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView = (ListView)findViewById(R.id.lv_courseListView);
        //Log.e("MainActivity","before adapter");
        myAdapter = new MyAdapter(getApplicationContext());
        listView.setAdapter(myAdapter);
        //Log.e("MainActivity","after adapter");
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "BEFORE " + position,Toast.LENGTH_SHORT).show();
                bundle = new Bundle();
                bundle.putInt("clickedPosition",position);
                intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }

        });


    }
}
