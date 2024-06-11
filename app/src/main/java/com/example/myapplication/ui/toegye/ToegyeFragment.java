package com.example.myapplication.ui.toegye;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentToegyeBinding;

public class ToegyeFragment extends Fragment {

    private FragmentToegyeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ToegyeViewModel toegyeViewModel =
                new ViewModelProvider(this).get(ToegyeViewModel.class);

        binding = FragmentToegyeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textToegye;
        toegyeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        NavController navController = Navigation.findNavController(view);

        binding.toegye1f.setOnClickListener(v -> navController.navigate(R.id.action_nav_toegye_to_nav_toegye1f));
        binding.toegye2f.setOnClickListener(v -> navController.navigate(R.id.action_nav_toegye_to_nav_toegye2f));
        binding.toegye3f.setOnClickListener(v -> navController.navigate(R.id.action_nav_toegye_to_nav_toegye3f));
        binding.toegye4f.setOnClickListener(v -> navController.navigate(R.id.action_nav_toegye_to_nav_toegye4f));
        binding.toegye5f.setOnClickListener(v -> navController.navigate(R.id.action_nav_toegye_to_nav_toegye5f));
        binding.toegye6f.setOnClickListener(v -> navController.navigate(R.id.action_nav_toegye_to_nav_toegye6f));
        binding.toegye7f.setOnClickListener(v -> navController.navigate(R.id.action_nav_toegye_to_nav_toegye7f));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}