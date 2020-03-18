package com.example.maple_stat.ui.calculator.calculator_inner_fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.maple_stat.MainActivity;
import com.example.maple_stat.R;
import com.example.maple_stat.custom.CustomSpinner;

import static android.content.ContentValues.TAG;

public class CalculatorOptionFragment extends Fragment {

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
        View root = inflater.inflate(R.layout.fragment_calculator_option, container, false);

        final CustomSpinner customSpinnerPart = (CustomSpinner) root.findViewById(R.id.custom_spinner_part);
        final CustomSpinner customSpinnerLevel = (CustomSpinner) root.findViewById(R.id.custom_spinner_level);
        final TextView textViewLevel = (TextView) root.findViewById(R.id.textView_level);
        textViewLevel.setVisibility(View.INVISIBLE);
        customSpinnerLevel.setVisibility(View.INVISIBLE);

        fragmentManagerClear();

        customSpinnerPart.setListener(new CustomSpinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int position) {
                if(customSpinnerPart.getSelectedItemPosition()==0){
                    textViewLevel.setVisibility(View.VISIBLE);
                    customSpinnerLevel.setVisibility(View.VISIBLE);

                    if(customSpinnerLevel.getSelectedItemPosition()==-1) {
                        fragmentManagerClear();
                    }else{
                        replaceToWeapon();
                    }

                }else if(customSpinnerPart.getSelectedItemPosition()==1) {
                    textViewLevel.setVisibility(View.INVISIBLE);
                    customSpinnerLevel.setVisibility(View.INVISIBLE);
                    replaceToArmor();
                }
            }
        });

        customSpinnerLevel.setListener(new CustomSpinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int position) {

                if(customSpinnerLevel.getSelectedItemPosition()!=-1){
                    replaceToWeapon();
                }
            }
        });

        return root;
    }
    public void replaceToWeapon(){

        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        Fragment calculatorOptionWeaponFragment = new CalculatorOptionWeaponFragment();
        transaction.replace(R.id.frameLayout_option_replace, calculatorOptionWeaponFragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }

    public void replaceToArmor(){

        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        Fragment calculatorOptionArmorFragment = new CalculatorOptionArmorFragment();
        transaction.replace(R.id.frameLayout_option_replace, calculatorOptionArmorFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
    public void fragmentManagerClear(){
        FragmentManager fm = getChildFragmentManager();
        fm.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
    }
}
