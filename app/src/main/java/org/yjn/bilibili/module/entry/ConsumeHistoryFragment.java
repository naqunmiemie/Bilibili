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
 * Use the {@link ConsumeHistoryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ConsumeHistoryFragment extends RxLazyFragment {

    public static ConsumeHistoryFragment newInstance() {
        return new ConsumeHistoryFragment();
    }


    @Override
    public int getLayoutResId() {
        return R.layout.fragment_consume_history;
    }

    @Override
    public void finishCreateView(Bundle state) {

    }
}