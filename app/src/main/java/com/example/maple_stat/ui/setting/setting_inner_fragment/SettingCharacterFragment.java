package com.example.maple_stat.ui.setting.setting_inner_fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import com.example.maple_stat.R;
import com.example.maple_stat.SettingActivity;
import com.example.maple_stat.databinding.FragmentSettingCharacterBinding;

public class SettingCharacterFragment extends Fragment {

    public FragmentSettingCharacterBinding binding;

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

        binding = DataBindingUtil.bind(root);
        binding.setFragment(this);
        ((SettingActivity) getActivity()).setActionBarTitle(R.string.character_setting);

        return root;
    }
    public void pressCharacterNormalButton(View view){

        ((SettingActivity) getActivity()).changeFragment(R.string.character_normal_setting);
    }

    public void pressCharacterAbilityButton(View view){

        ((SettingActivity) getActivity()).changeFragment(R.string.character_ability_setting);
    }

    public void pressCharacterTendencyButton(View view){

        ((SettingActivity) getActivity()).changeFragment(R.string.character_tendency_setting);
    }

    public void pressCharacterSymbolButton(View view){

        ((SettingActivity) getActivity()).changeFragment(R.string.character_symbol_setting);
    }

    public void pressCharacterGuildButton(View view){

        ((SettingActivity) getActivity()).changeFragment(R.string.character_guild_setting);
    }

    public void pressCharacterBlessingButton(View view){

        ((SettingActivity) getActivity()).changeFragment(R.string.character_blessing_setting);
    }

    public void pressCharacterLabelButton(View view){

        ((SettingActivity) getActivity()).changeFragment(R.string.character_cash_setting);
    }

    public void pressCharacterTitleButton(View view){

        ((SettingActivity) getActivity()).changeFragment(R.string.character_title_setting);
    }




}
