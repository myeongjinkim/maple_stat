package com.example.maple_stat.ui.setting.setting_inner_fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.maple_stat.R;
import com.example.maple_stat.databinding.FragmentSettingCharacterNormalBinding;

public class SettingCharacterNormalFragment extends Fragment {
    public FragmentSettingCharacterNormalBinding binding;

    public static SettingCharacterNormalFragment newInstance(){
        SettingCharacterNormalFragment fragment = new SettingCharacterNormalFragment();
        return fragment;
    }

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_setting_character_normal, container, false);

        binding = DataBindingUtil.bind(root);
        binding.setFragment(this);

        return root;
    }
}
