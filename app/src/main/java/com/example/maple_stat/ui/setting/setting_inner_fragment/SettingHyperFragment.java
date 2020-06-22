package com.example.maple_stat.ui.setting.setting_inner_fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import com.example.maple_stat.R;
import com.example.maple_stat.databinding.FragmentSettingHyperBinding;

public class SettingHyperFragment extends Fragment {

    public FragmentSettingHyperBinding binding;

    public static SettingHyperFragment newInstance(){
        SettingHyperFragment fragment = new SettingHyperFragment();
        return fragment;
    }

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_setting_hyper, container, false);

        binding = DataBindingUtil.bind(root);
        binding.setFragment(this);

        return root;
    }
}