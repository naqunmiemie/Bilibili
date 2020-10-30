package org.yjn.bilibili.module.entry;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.yjn.bilibili.R;
import org.yjn.bilibili.base.RxLazyFragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SettingFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SettingFragment extends RxLazyFragment {

    public static SettingFragment newInstance() {
        return new SettingFragment();
    }


    @Override
    public int getLayoutResId() {
        return R.layout.fragment_setting;
    }

    @Override
    public void finishCreateView(Bundle state) {

    }
}