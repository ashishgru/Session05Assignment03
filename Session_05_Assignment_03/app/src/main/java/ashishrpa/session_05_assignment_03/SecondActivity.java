package ashishrpa.session_05_assignment_03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    MentorDetails mentorDetails;
    int currentPosition;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        currentPosition = intent.getIntExtra("clickedPosition",0);
        String courseName = mentorDetails.al_courses[currentPosition];

        String mentorName = mentorDetails.al_MentorNames[currentPosition];
        textView = (TextView)findViewById(R.id.tv_mentorName);
        textView.setText(courseName.toUpperCase() + " is handeled by : " + mentorName.toUpperCase());
    }
}
