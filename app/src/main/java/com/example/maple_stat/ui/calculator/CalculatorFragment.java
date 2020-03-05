package com.example.maple_stat.ui.calculator;

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
import androidx.navigation.ui.AppBarConfiguration;

import com.example.maple_stat.R;

public class CalculatorFragment extends Fragment {

    private CalculatorViewModel calculatorViewModel;
    private FragmentTransaction ft;
    private CalculatorItemFragment calculatorItemFragment;
    private CalculatorPotentialFragment calculatorPotentialFragment;
    private CalculatorAdditionalFragment calculatorAdditionalFragment;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 화면 전환 프래그먼트 선언 및 초기 화면 설정
        calculatorItemFragment = new CalculatorItemFragment();
        calculatorPotentialFragment = new CalculatorPotentialFragment();
        calculatorAdditionalFragment = new CalculatorAdditionalFragment();

    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        calculatorViewModel =
                ViewModelProviders.of(this).get(CalculatorViewModel.class);
        View root = inflater.inflate(R.layout.fragment_calculator, container, false);


        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_stat, R.id.navigation_efficiency, R.id.navigation_calculator, R.id.navigation_setting)
                .build();

        return root;
    }
}