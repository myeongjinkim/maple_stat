package com.example.maple_stat.ui.setting;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.example.maple_stat.R;

public class SettingCharacterFragment extends Fragment {

    public static SettingCharacterFragment newInstance(){
        SettingCharacterFragment fragment = new SettingCharacterFragment();
        return fragment;
    }

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_setting_character, container, false);

        return root;
    }
}
