package com.example.myapplication.ui.saenghwal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentSaenghwalBinding;

public class SaenghwalFragment extends Fragment {

    private FragmentSaenghwalBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SaenghwalViewModel saenghwalViewModel =
                new ViewModelProvider(this).get(SaenghwalViewModel.class);

        binding = FragmentSaenghwalBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textSaenghwal;
        saenghwalViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}