package com.example.myapplication.ui.yulgok;

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
import com.example.myapplication.databinding.FragmentYulgokBinding;

public class YulgokFragment extends Fragment {

    private FragmentYulgokBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        YulgokViewModel yulgokViewModel =
                new ViewModelProvider(this).get(YulgokViewModel.class);

        binding = FragmentYulgokBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textYulgok;
        yulgokViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        NavController navController = Navigation.findNavController(view);

        binding.yulgok1f.setOnClickListener(v -> navController.navigate(R.id.action_nav_yulgok_to_nav_yulgok1f));
        binding.yulgok2f.setOnClickListener(v -> navController.navigate(R.id.action_nav_yulgok_to_nav_yulgok2f));
        binding.yulgok3f.setOnClickListener(v -> navController.navigate(R.id.action_nav_yulgok_to_nav_yulgok3f));
        binding.yulgok4f.setOnClickListener(v -> navController.navigate(R.id.action_nav_yulgok_to_nav_yulgok4f));
        binding.yulgok5f.setOnClickListener(v -> navController.navigate(R.id.action_nav_yulgok_to_nav_yulgok5f));
        binding.yulgok6f.setOnClickListener(v -> navController.navigate(R.id.action_nav_yulgok_to_nav_yulgok6f));
        binding.yulgok7f.setOnClickListener(v -> navController.navigate(R.id.action_nav_yulgok_to_nav_yulgok7f));
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}