package ashishrpa.session_05_assignment_03;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by WINDOWS 8.1 on 10/13/2016.
 */

public class MyAdapter extends BaseAdapter {
    LayoutInflater inflater;
    Context context;
    MentorDetails mentorDetails;


    public MyAdapter(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        //Log.e("MyAdapter size"," " + mentorDetails.al_courses.length);
        return mentorDetails.al_courses.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        inflater = LayoutInflater.from(context);
        if(convertView == null){
            //Log.e("MyAdapter ","NULL");
            convertView = inflater.inflate(R.layout.course_details,parent,false);
            holder = new ViewHolder();
            holder.bindView(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder)convertView.getTag();
            //Log.e("MyAdapter ","NULL");
        }
        holder.textView.setText(mentorDetails.al_courses[position]);
        //Log.e("MyAdapter "," "+mentorDetails.al_courses[position]);
        return convertView;
    }
    public class ViewHolder{
        TextView textView;
        public void bindView(View view){
            textView = (TextView)view.findViewById(R.id.tv_CourseName);
        }
    }
}
