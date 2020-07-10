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
import com.example.maple_stat.databinding.FragmentSettingCharacterGuildBinding;

import static android.content.ContentValues.TAG;

public class SettingCharacterGuildFragment extends Fragment {
    public FragmentSettingCharacterGuildBinding binding;

    public static SettingCharacterGuildFragment newInstance(){
        SettingCharacterGuildFragment fragment = new SettingCharacterGuildFragment();
        return fragment;
    }

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_setting_character_guild, container, false);

        binding = DataBindingUtil.bind(root);
        binding.setFragment(this);

        return root;
    }
    public void pressCharacterGuildActive1Button(View view) {
        Log.i(TAG,"1");
    }
    public void pressCharacterGuildActive2Button(View view) {
        Log.i(TAG,"2");
    }
    public void pressCharacterGuildActive3Button(View view) {
        Log.i(TAG,"3");
    }
    public void pressCharacterGuildActive4Button(View view) {
        Log.i(TAG,"4");
    }
}
