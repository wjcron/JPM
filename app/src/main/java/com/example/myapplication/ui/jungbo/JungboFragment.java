package com.example.myapplication.ui.jungbo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentJungboBinding;

public class JungboFragment extends Fragment {

    private FragmentJungboBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        JungboViewModel jungboViewModel =
                new ViewModelProvider(this).get(JungboViewModel.class);

        binding = FragmentJungboBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textJungbo;
        jungboViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}