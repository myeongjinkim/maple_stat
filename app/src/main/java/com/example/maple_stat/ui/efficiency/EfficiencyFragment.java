package com.example.maple_stat.ui.efficiency;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.maple_stat.R;
import com.example.maple_stat.custom.CustomSpinner;
import com.example.maple_stat.databinding.FragmentEfficiencyBinding;


import static android.content.ContentValues.TAG;

public class EfficiencyFragment extends Fragment {

    private EfficiencyViewModel efficiencyViewModel;
    private ArrayAdapter<CharSequence> adapter1;
    public FragmentEfficiencyBinding binding;

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


        CustomSpinner customSpinnerKind_left0 = (CustomSpinner) root.findViewById(R.id.stat_compare_l0);

        CustomSpinner customSpinner_right0 = (CustomSpinner) root.findViewById(R.id.stat_compare_r0);


        binding = DataBindingUtil.bind(root);
        binding.setFragment(this);
        return root;
    }

    public void pressDeleteButton(View view) {
        Log.i(TAG,"지우기");
    }

    public void pressAddButton(View view) {
        Log.i(TAG,"더하기");
    }

}