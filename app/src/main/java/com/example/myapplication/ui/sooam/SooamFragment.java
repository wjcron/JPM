package com.example.myapplication.ui.sooam;

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
import com.example.myapplication.databinding.FragmentSooamBinding;

public class SooamFragment extends Fragment {

    private FragmentSooamBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SooamViewModel sooamViewModel =
                new ViewModelProvider(this).get(SooamViewModel.class);

        binding = FragmentSooamBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textSooam;
        sooamViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;

    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        NavController navController = Navigation.findNavController(view);

        binding.sooam1f.setOnClickListener(v -> navController.navigate(R.id.action_nav_sooam_to_nav_sooam1f));
        binding.sooam2f.setOnClickListener(v -> navController.navigate(R.id.action_nav_sooam_to_nav_sooam2f));
        binding.sooam3f.setOnClickListener(v -> navController.navigate(R.id.action_nav_sooam_to_nav_sooam3f));
        binding.sooam4f.setOnClickListener(v -> navController.navigate(R.id.action_nav_sooam_to_nav_sooam4f));
        binding.sooam5f.setOnClickListener(v -> navController.navigate(R.id.action_nav_sooam_to_nav_sooam5f));

    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}

