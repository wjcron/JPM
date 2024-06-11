package com.example.myapplication.ui.hongji;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentHongjiBinding;

public class HongjiFragment extends Fragment {

    private FragmentHongjiBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HongjiViewModel hongjiViewModel =
                new ViewModelProvider(this).get(HongjiViewModel.class);

        binding = FragmentHongjiBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHongji;
        hongjiViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}