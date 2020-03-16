package com.example.maple_stat.ui.calculator.calculator_inner_fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.example.maple_stat.R;
import com.example.maple_stat.custom.CustomSpinner;

import static android.content.ContentValues.TAG;

public class CalculatorOptionFragment extends Fragment {

    private ArrayAdapter<CharSequence> adapter1;

    public static CalculatorOptionFragment newInstance(){
        CalculatorOptionFragment fragment = new CalculatorOptionFragment();
        return fragment;
    }

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        adapter1 = ArrayAdapter.createFromResource(getActivity(),
                R.array.stat_list, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_calculator_option, container, false);

        CustomSpinner customSpinnerKind = (CustomSpinner) root.findViewById(R.id.custom_spinner_kind);

        CustomSpinner customSpinnerLevel = (CustomSpinner) root.findViewById(R.id.custom_spinner_level);

        Log.i(TAG,"select:"+customSpinnerLevel.getSelectedItem() +" num: " + customSpinnerLevel.getSelectedItemPosition());

        return root;
    }
}
