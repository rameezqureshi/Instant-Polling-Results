package com.example.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class tabviewlayout extends Fragment{

    int position;
    private TextView textView;


    public static Fragment getInstance(int position) {
        Bundle bundle = new Bundle();
        bundle.putInt("pos", position);
        tabviewlayout tabFragment = new tabviewlayout();
        tabFragment.setArguments(bundle);
        return tabFragment;
    }
    //private Button awesomeButton;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // onInflate(R.layout.fragment_tab);
        position = getArguments().getInt("pos");

            }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_tab, container, false);
        Button button = (Button) view.findViewById(R.id.rank);
        Button button1 = (Button) view.findViewById(R.id.rate);
        Button button2 = (Button) view.findViewById(R.id.poll);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // do something
                Intent myIntent = new Intent(getActivity(), RankFragment.class);
                startActivity(myIntent);

            }
        });
        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // do something
                Intent myIntent = new Intent(getActivity(), RateFragment.class);
                startActivity(myIntent);

            }
        });
        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // do something
                Intent myIntent = new Intent(getActivity(), PollFragment.class);
                startActivity(myIntent);

            }
        });
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView = (TextView) view.findViewById(R.id.textView);

        textView.setText("Fragment " + (position + 1));

    }
    }