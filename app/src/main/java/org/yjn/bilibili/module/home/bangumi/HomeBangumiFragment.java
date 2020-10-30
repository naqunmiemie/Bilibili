package org.yjn.bilibili.module.home.bangumi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.yjn.bilibili.R;
import org.yjn.bilibili.base.RxLazyFragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeBangumiFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeBangumiFragment extends RxLazyFragment {

    public static HomeBangumiFragment newInstance() {
        return new HomeBangumiFragment();
    }

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_home_bangumi;
    }

    @Override
    public void finishCreateView(Bundle state) {

    }
}