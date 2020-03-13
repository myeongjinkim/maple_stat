package com.example.maple_stat.ui.calculator.calculator_fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.example.maple_stat.R;

public class CalculatorOrderFragment extends Fragment {

    public static CalculatorOptionFragment newInstance(){
        CalculatorOptionFragment fragment = new CalculatorOptionFragment();
        return fragment;
    }

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_calculator_order, container, false);

        return root;
    }
}
