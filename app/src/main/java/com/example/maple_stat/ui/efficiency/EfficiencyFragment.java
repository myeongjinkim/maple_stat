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
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.maple_stat.R;

public class EfficiencyFragment extends Fragment {

    private EfficiencyViewModel efficiencyViewModel;
    private ArrayAdapter<CharSequence> adapter1;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        adapter1 = ArrayAdapter.createFromResource(getActivity(),
                R.array.stat_list, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        efficiencyViewModel =
                ViewModelProviders.of(this).get(EfficiencyViewModel.class);
        View root = inflater.inflate(R.layout.fragment_efficiency, container, false);

        Spinner spinner_stat_compare1 = (Spinner) root.findViewById(R.id.stat_compare_r0);
        spinner_stat_compare1.setAdapter(adapter1);

        Spinner spinner_stat_compare2 = (Spinner) root.findViewById(R.id.stat_compare_l0);
        spinner_stat_compare2.setAdapter(adapter1);



        return root;
    }
}