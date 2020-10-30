package org.yjn.bilibili.module.home.discover;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.yjn.bilibili.R;
import org.yjn.bilibili.base.RxLazyFragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeDiscoverFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeDiscoverFragment extends RxLazyFragment {

    public static HomeDiscoverFragment newInstance() {
        return new HomeDiscoverFragment();
    }

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_home_discover;
    }

    @Override
    public void finishCreateView(Bundle state) {

    }
}