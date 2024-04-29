package com.example.adaptadoresconclicklistener;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter<String> {
    private Context mContext;
    private ArrayList<String> mDataSet;

    public MyAdapter(Context context, ArrayList<String> dataSet) { //aqui se crea el constructor, recibe el contexto de la aplicación y los datos que se mostrarán en la lista.
        super(context, R.layout.list_item, dataSet);
        this.mContext = context;
        this.mDataSet = dataSet;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = LayoutInflater.from(mContext);
            view = inflater.inflate(R.layout.list_item, parent, false);
        }

        TextView textView = view.findViewById(R.id.textView);
        textView.setText(mDataSet.get(position));

        return view;
    }
}
