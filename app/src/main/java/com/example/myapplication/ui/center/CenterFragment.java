package com.example.myapplication.ui.center;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.myapplication.R;

import com.example.myapplication.databinding.FragmentCenterBinding;

public class CenterFragment extends Fragment {

    private FragmentCenterBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        CenterViewModel centerViewModel =
                new ViewModelProvider(this).get(CenterViewModel.class);

        binding = FragmentCenterBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textCenter;
        centerViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;

    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        NavController navController = Navigation.findNavController(view);

        binding.center1f.setOnClickListener(v -> navController.navigate(R.id.action_nav_center_to_nav_center1f));
        binding.center2f.setOnClickListener(v -> navController.navigate(R.id.action_nav_center_to_nav_center2f));
        binding.center3f.setOnClickListener(v -> navController.navigate(R.id.action_nav_center_to_nav_center3f));
        binding.center4f.setOnClickListener(v -> navController.navigate(R.id.action_nav_center_to_nav_center4f));

    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}