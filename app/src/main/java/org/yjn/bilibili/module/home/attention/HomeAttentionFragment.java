package org.yjn.bilibili.module.home.attention;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.yjn.bilibili.R;
import org.yjn.bilibili.base.RxLazyFragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeAttentionFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeAttentionFragment extends RxLazyFragment {

    public static HomeAttentionFragment newInstance() {
        return new HomeAttentionFragment();
    }


    @Override
    public int getLayoutResId() {
        return R.layout.fragment_home_attention;
    }

    @Override
    public void finishCreateView(Bundle state) {

    }
}