package com.example.myapplication.ui.car;

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

import com.example.myapplication.databinding.FragmentCarBinding;

public class CarFragment extends Fragment {

    private FragmentCarBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
       CarViewModel carViewModel =
                new ViewModelProvider(this).get(CarViewModel.class);

        binding = FragmentCarBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textCar;
        carViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        return root;

    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        NavController navController = Navigation.findNavController(view);

        binding.car1f.setOnClickListener(v -> navController.navigate(R.id.action_nav_car_to_nav_car1f));
        binding.car3f.setOnClickListener(v -> navController.navigate(R.id.action_nav_car_to_nav_car3f));
        binding.car4f.setOnClickListener(v -> navController.navigate(R.id.action_nav_car_to_nav_car4f));
        binding.car5f.setOnClickListener(v -> navController.navigate(R.id.action_nav_car_to_nav_car5f));
        binding.car6f.setOnClickListener(v -> navController.navigate(R.id.action_nav_car_to_nav_car6f));
        binding.car7f.setOnClickListener(v -> navController.navigate(R.id.action_nav_car_to_nav_car7f));
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}