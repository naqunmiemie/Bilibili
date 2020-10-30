package org.yjn.bilibili.module.home.region;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.yjn.bilibili.R;
import org.yjn.bilibili.base.RxLazyFragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeRegionFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeRegionFragment extends RxLazyFragment {

    public static HomeRegionFragment newInstance() {
        return new HomeRegionFragment();
    }


    @Override
    public int getLayoutResId() {
        return R.layout.fragment_home_region;
    }

    @Override
    public void finishCreateView(Bundle state) {

    }
}