package com.example.maple_stat.ui.setting;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.maple_stat.R;
import com.example.maple_stat.SettingActivity;
import com.example.maple_stat.databinding.FragmentSettingBinding;
import com.example.maple_stat.ui.calculator.calculator_inner_fragment.CalculatorPotentialArmorFragment;
import com.google.android.material.appbar.AppBarLayout;

import static android.content.ContentValues.TAG;

public class SettingFragment extends Fragment {

    private SettingViewModel settingViewModel;
    public FragmentSettingBinding binding;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_setting, container, false);

        binding = DataBindingUtil.bind(root);
        binding.setFragment(this);

        return root;
    }

    @Override
    public void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ((SettingActivity) activity).setActionBarTitle(R.string.title_setting);
        }
    }

    public void pressCharacterButton(View view){

        /*FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        Fragment settingCharacterFragment = new SettingCharacterFragment();
        transaction.replace(R.id.replace, settingCharacterFragment);
        transaction.addToBackStack(null);
        transaction.commit();*/
        Toast.makeText(getActivity(), "Character", Toast.LENGTH_SHORT).show();



    }

    public void pressItemButton(View view){
        Toast.makeText(getActivity(), "Item", Toast.LENGTH_SHORT).show();

    }

    public void pressPetButton(View view){

        Toast.makeText(getActivity(), "Pet", Toast.LENGTH_SHORT).show();

    }

    public void pressHyperButton(View view){

        Toast.makeText(getActivity(), "Hyper", Toast.LENGTH_SHORT).show();

    }

    public void pressEtcButton(View view){

        Toast.makeText(getActivity(), "Etc", Toast.LENGTH_SHORT).show();

    }

    public void pressLinkButton(View view){

        Toast.makeText(getActivity(), "Link", Toast.LENGTH_SHORT).show();

    }

    public void pressUnionButton(View view){

        Toast.makeText(getActivity(), "Union", Toast.LENGTH_SHORT).show();

    }

    public void pressFarmButton(View view){

        Toast.makeText(getActivity(), "Farm", Toast.LENGTH_SHORT).show();
    }
}