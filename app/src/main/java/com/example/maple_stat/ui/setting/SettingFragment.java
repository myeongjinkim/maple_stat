package com.example.maple_stat.ui.setting;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import com.example.maple_stat.R;
import com.example.maple_stat.SettingActivity;
import com.example.maple_stat.databinding.FragmentSettingBinding;

public class SettingFragment extends Fragment {

    public FragmentSettingBinding binding;
    private SettingViewModel settingViewModel;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_setting, container, false);


        binding = DataBindingUtil.bind(root);
        binding.setFragment(this);

        return root;
    }

    public void pressCharacterButton(View view){

        ((SettingActivity) getActivity()).changeFragment(R.string.character_setting);
    }

    public void pressItemButton(View view){

        ((SettingActivity) getActivity()).changeFragment(R.string.item_setting);
    }

    public void pressPetButton(View view){

        ((SettingActivity) getActivity()).changeFragment(R.string.pet_setting);
    }

    public void pressHyperButton(View view){

        ((SettingActivity) getActivity()).changeFragment(R.string.hyper_setting);
    }

    public void pressEtcButton(View view){

        ((SettingActivity) getActivity()).changeFragment(R.string.etc_setting);
    }

    public void pressLinkButton(View view){

        ((SettingActivity) getActivity()).changeFragment(R.string.link_setting);
    }

    public void pressUnionButton(View view){

        ((SettingActivity) getActivity()).changeFragment(R.string.union_setting);
    }

    public void pressFarmButton(View view){

        ((SettingActivity) getActivity()).changeFragment(R.string.farm_setting);
    }
}