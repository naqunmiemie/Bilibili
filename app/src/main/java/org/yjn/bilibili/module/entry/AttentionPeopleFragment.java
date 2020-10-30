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
 * Use the {@link AttentionPeopleFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AttentionPeopleFragment extends RxLazyFragment {

    public static AttentionPeopleFragment newInstance() {
        return new AttentionPeopleFragment();
    }


    @Override
    public int getLayoutResId() {
        return R.layout.fragment_attention_people;
    }

    @Override
    public void finishCreateView(Bundle state) {

    }
}