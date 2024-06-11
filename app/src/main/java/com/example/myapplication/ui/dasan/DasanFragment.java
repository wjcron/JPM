package com.example.myapplication.ui.dasan;

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

import com.example.myapplication.databinding.FragmentDasanBinding;

public class DasanFragment extends Fragment {

    private FragmentDasanBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DasanViewModel dasanViewModel =
                new ViewModelProvider(this).get(DasanViewModel.class);

        binding = FragmentDasanBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textDasan;
        dasanViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;

    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        NavController navController = Navigation.findNavController(view);

        binding.dasan1f.setOnClickListener(v -> navController.navigate(R.id.action_nav_dasan_to_nav_dasan1f));
        binding.dasan2f.setOnClickListener(v -> navController.navigate(R.id.action_nav_dasan_to_nav_dasan2f));
        binding.dasan3f.setOnClickListener(v -> navController.navigate(R.id.action_nav_dasan_to_nav_dasan3f));
        binding.dasan4f.setOnClickListener(v -> navController.navigate(R.id.action_nav_dasan_to_nav_dasan4f));
        binding.dasan5f.setOnClickListener(v -> navController.navigate(R.id.action_nav_dasan_to_nav_dasan5f));

    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}