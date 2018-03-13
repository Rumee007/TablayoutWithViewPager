package com.example.mobileapp.tablayoutwithviewpagerpb4;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class TabThreeFragment extends Fragment {


    public TabThreeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Toast.makeText(getActivity(), "fragment 3", Toast.LENGTH_SHORT).show();
        return inflater.inflate(R.layout.fragment_tab_three, container, false);
    }
    @Override
    public void onDetach() {
        super.onDetach();
        Toast.makeText(getActivity(), "detach f3", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPause() {
        super.onPause();
        Toast.makeText(getActivity(), "pause f3", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(getActivity(), "destroy f3", Toast.LENGTH_SHORT).show();
    }
}
