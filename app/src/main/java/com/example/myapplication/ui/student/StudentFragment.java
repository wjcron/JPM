package com.example.myapplication.ui.student;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentStudentBinding;

public class StudentFragment extends Fragment {

    private FragmentStudentBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        StudentViewModel studentViewModel =
                new ViewModelProvider(this).get(StudentViewModel.class);

        binding = FragmentStudentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textStudent;
        studentViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}