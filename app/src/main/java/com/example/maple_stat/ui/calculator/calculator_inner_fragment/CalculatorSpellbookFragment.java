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

    public CustomSpinner customSpinnerPart;
    public CustomSpinner customSpinnerLevel;

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

        customSpinnerPart = (CustomSpinner) root.findViewById(R.id.custom_spinner_part);
        customSpinnerLevel = (CustomSpinner) root.findViewById(R.id.custom_spinner_level);
        final TextView textViewLevel = (TextView) root.findViewById(R.id.textView_level);
        textViewLevel.setVisibility(View.INVISIBLE);
        customSpinnerLevel.setVisibility(View.INVISIBLE);

        fragmentManagerClear();

        customSpinnerPart.setListener(new CustomSpinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int position) {
                if(customSpinnerPart.getSelectedItemPosition()!=-1){
                    textViewLevel.setVisibility(View.VISIBLE);
                    customSpinnerLevel.setVisibility(View.VISIBLE);
                    replace();
                }
            }
        });
        customSpinnerLevel.setListener(new CustomSpinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int position) {
                replace();
            }
        });

        return root;
    }

    public void replace(){
        if(customSpinnerLevel.getSelectedItemPosition()!=-1){
            if(customSpinnerPart.getSelectedItemPosition()==0){
                replaceToWeapon();
            }else if(customSpinnerPart.getSelectedItemPosition()==1) {
                replaceToArmor();
            }
        }
    }

    public void replaceToWeapon(){
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        Fragment calculatorSpellbookWeaponFragment = new CalculatorSpellbookWeaponFragment();
        transaction.replace(R.id.frameLayout_spellbook_replace, calculatorSpellbookWeaponFragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }

    public void replaceToArmor(){
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        Fragment calculatorSpellbookArmorFragment = new CalculatorSpellbookArmorFragment();
        transaction.replace(R.id.frameLayout_spellbook_replace, calculatorSpellbookArmorFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
    public void fragmentManagerClear(){
        FragmentManager fm = getChildFragmentManager();
        fm.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
    }
}
