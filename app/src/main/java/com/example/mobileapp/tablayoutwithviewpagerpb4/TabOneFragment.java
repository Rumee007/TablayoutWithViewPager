package com.example.mobileapp.tablayoutwithviewpagerpb4;


import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * A simple {@link Fragment} subclass.
 */
public class TabOneFragment extends Fragment {
    private Button dateBtn;
    private Calendar calendar;
    private int year, month, day;

    public TabOneFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Toast.makeText(getActivity(), "fragment 1", Toast.LENGTH_SHORT).show();
        View v = inflater.inflate(R.layout.fragment_tab_one, container, false);
        dateBtn = v.findViewById(R.id.showDateBtn);
        dateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(getActivity(),
                        dateSetListener,year,month,day);
                datePickerDialog.show();
            }
        });
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Toast.makeText(getActivity(), "detach f1", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onPause() {
        super.onPause();
        Toast.makeText(getActivity(), "pause f1", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(getActivity(), "destroy f1", Toast.LENGTH_SHORT).show();
    }

    private DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


            calendar.set(year,month,dayOfMonth);
            String date = sdf.format(calendar.getTime());

            Toast.makeText(getActivity(), date, Toast.LENGTH_SHORT).show();
        }
    };
}
