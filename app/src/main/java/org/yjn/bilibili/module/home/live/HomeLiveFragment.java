package org.yjn.bilibili.module.home.live;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.yjn.bilibili.R;
import org.yjn.bilibili.base.RxLazyFragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeLiveFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeLiveFragment extends RxLazyFragment {

    public static HomeLiveFragment newInstance() {
        return new HomeLiveFragment();
    }


    @Override
    public int getLayoutResId() {
        return R.layout.fragment_home_live;
    }

    @Override
    public void finishCreateView(Bundle state) {

    }
}