package com.example.simeonov.myweather.ui;

import android.content.Context;
import android.icu.text.DecimalFormat;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.simeonov.myweather.R;
import com.example.simeonov.myweather.weather.Current;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * Use the {@link CurrentFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CurrentFragment extends Fragment {

    private TextView temp;
    private TextView humidity;
    private TextView summury;
    private TextView windSpeed;
    private double wind;
    private TextView rain;
    private TextView feelsLike;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CurrentFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CurrentFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CurrentFragment newInstance(String param1, String param2) {
        CurrentFragment fragment = new CurrentFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_current, container, false);
        temp = (TextView) view.findViewById(R.id.temperatureView);
        humidity = (TextView) view.findViewById(R.id.humidityPercentTextView);
        summury = (TextView) view.findViewById(R.id.summaryView);
        windSpeed = (TextView) view.findViewById(R.id.speedKmTextView);
        rain = (TextView) view.findViewById(R.id.rainPercentTextView);
        feelsLike = (TextView) view.findViewById(R.id.feelsLikeDegrees);

        // Inflate the layout for this fragment
        return view;
    }


    public void setDetails(Current current) {
        this.temp.setText(String.valueOf(Math.round(current.getTemp())));
        this.humidity.setText(String.valueOf(Math.round(current.getHumidity() * 100)));
        this.summury.setText(current.getSummary());
        wind = Math.round(current.getWindSpeed() * 3.6);
        this.windSpeed.setText(String.format("%.1f", wind));
        this.rain.setText(String.valueOf(Math.round(current.getRain()*100)));
        this.feelsLike.setText(String.valueOf(Math.round(current.getFeelsLike())));
    }
}
