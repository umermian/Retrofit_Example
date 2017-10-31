package com.example.popie.retrofit_example;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by popie on 10/31/2017.
 */

public class GitHubRepoAdapter extends ArrayAdapter<GitHubRepo> {
    private Context context;
    private List<GitHubRepo> values;


    public GitHubRepoAdapter(Context context, List<GitHubRepo> values) {

        super(context, R.layout.activity_main, values);


        this.context = context;

        this.values = values;

    }


    @Override

    public View getView(int position, View convertView, ViewGroup parent) {

        View view = LayoutInflater.from(context).inflate(R.layout.list_view, null);

        TextView textView = (TextView) view.findViewById(R.id.listViewText);

        GitHubRepo item = values.get(position);

        String message = item.getName();

        textView.setText(message);

        return view;

    }
}
