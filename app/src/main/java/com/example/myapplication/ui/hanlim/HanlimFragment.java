package com.example.myapplication.ui.hanlim;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentHanlimBinding;

public class HanlimFragment extends Fragment {

    private FragmentHanlimBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HanlimViewModel hanlimViewModel =
                new ViewModelProvider(this).get(HanlimViewModel.class);

        binding = FragmentHanlimBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHanlim;
        hanlimViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}