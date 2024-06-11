package com.example.myapplication.ui.junsan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentJunsanBinding;

public class JunsanFragment extends Fragment {

    private FragmentJunsanBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        JunsanViewModel junsanViewModel =
                new ViewModelProvider(this).get(JunsanViewModel.class);

        binding = FragmentJunsanBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textJunsan;
        junsanViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}