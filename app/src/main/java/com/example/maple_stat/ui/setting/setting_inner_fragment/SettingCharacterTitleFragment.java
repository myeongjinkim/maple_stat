package com.example.maple_stat.ui.setting.setting_inner_fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.maple_stat.R;
import com.example.maple_stat.databinding.FragmentSettingCharacterTitleBinding;

import static android.content.ContentValues.TAG;

public class SettingCharacterTitleFragment extends Fragment {
    public FragmentSettingCharacterTitleBinding binding;

    public static SettingCharacterTitleFragment newInstance(){
        SettingCharacterTitleFragment fragment = new SettingCharacterTitleFragment();
        return fragment;
    }

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_setting_character__title, container, false);

        binding = DataBindingUtil.bind(root);
        binding.setFragment(this);

        return root;
    }

    public void pressCharacterTitleDeleteButton(View view) {
        Log.i(TAG,"지우기");
    }

    public void pressCharacterTitleAddButton(View view) {
        Log.i(TAG,"더하기");
    }
}
