package com.example.myapplication.ui.limgok;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentLimgokBinding;

public class LimgokFragment extends Fragment {

    private FragmentLimgokBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        LimgokViewModel limgokViewModel =
                new ViewModelProvider(this).get(LimgokViewModel.class);

        binding = FragmentLimgokBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textLimgok;
        limgokViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}