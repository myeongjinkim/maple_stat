package com.example.maple_stat.ui.calculator.calculator_inner_fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.maple_stat.R;
import com.example.maple_stat.custom.CustomSpinner;

public class CalculatorSpellbookFragment extends Fragment {

    public static CalculatorSpellbookFragment newInstance(){
        CalculatorSpellbookFragment fragment = new CalculatorSpellbookFragment();
        return fragment;
    }

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_calculator_spellbook, container, false);

        final CustomSpinner customSpinnerPart = (CustomSpinner) root.findViewById(R.id.custom_spinner_part);
        final CustomSpinner customSpinnerLevel = (CustomSpinner) root.findViewById(R.id.custom_spinner_level);
        final TextView textViewLevel = (TextView) root.findViewById(R.id.textView_level);
        textViewLevel.setVisibility(View.INVISIBLE);
        customSpinnerLevel.setVisibility(View.INVISIBLE);

        FragmentManager fm = getChildFragmentManager();
        fm.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);


        customSpinnerPart.setListener(new CustomSpinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int position) {
                customSpinnerLevel.setVisibility(View.VISIBLE);
                textViewLevel.setVisibility(View.VISIBLE);
            }
        });

        customSpinnerLevel.setListener(new CustomSpinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int position) {
                FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
                if(customSpinnerLevel.getSelectedItemPosition()!=-1){
                    Fragment calculatorSpellWeaponArmorFragment = new CalculatorSpellbookWeaponArmorFragment();
                    transaction.replace(R.id.frameLayout_spellbook_replace, calculatorSpellWeaponArmorFragment);
                    transaction.addToBackStack(null);
                    transaction.commit();
                }
            }
        });

        return root;
    }
}
