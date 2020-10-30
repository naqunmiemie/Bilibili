package org.yjn.bilibili.module.home.recommend;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.yjn.bilibili.R;
import org.yjn.bilibili.base.RxLazyFragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeRecommendedFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeRecommendedFragment extends RxLazyFragment {

    public static HomeRecommendedFragment newInstance() {
        return new HomeRecommendedFragment();
    }

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_home_recommended;
    }


    @Override
    public void finishCreateView(Bundle state) {

    }
}