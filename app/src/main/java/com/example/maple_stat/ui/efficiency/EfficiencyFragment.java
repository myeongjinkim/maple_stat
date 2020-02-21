package com.example.maple_stat.ui.efficiency;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.maple_stat.R;

public class EfficiencyFragment extends Fragment {

    private EfficiencyViewModel efficiencyViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        efficiencyViewModel =
                ViewModelProviders.of(this).get(EfficiencyViewModel.class);
        View root = inflater.inflate(R.layout.fragment_efficiency, container, false);

        Spinner spinner_stat1 = (Spinner) root.findViewById(R.id.my_stat1);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(getActivity(),
                R.array.my_stat, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner_stat1.setAdapter(adapter1);

        Spinner spinner_stat2 = (Spinner) root.findViewById(R.id.my_stat2);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(getActivity(),
                R.array.my_stat, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner_stat2.setAdapter(adapter2);
        return root;
    }
}