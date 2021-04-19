package nidhal.tp4.studentsapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends ArrayAdapter {

    Activity context;
    String[] items;

    MyAdapter(Activity c, String[] a){
        super(c,R.layout.one_element, a);
        this.context = c;
        this.items = a;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View element = inflater.inflate(R.layout.one_element, null);

        ImageView img = (ImageView) element.findViewById(R.id.image);
        TextView note = (TextView) element.findViewById(R.id.note);

        note.setText(items[position]);
        float valeur = Float.valueOf(items[position]);

        if(valeur >= 10)
            img.setImageResource(R.drawable.icon_mood);
        else
            img.setImageResource(R.drawable.icon_mood_cry);

        return element;

    }
}
