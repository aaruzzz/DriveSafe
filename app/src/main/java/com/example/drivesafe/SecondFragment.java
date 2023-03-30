package com.example.drivesafe;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.drivesafe.databinding.FragmentSecondBinding;

import java.util.ArrayList;
import java.util.List;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentSecondBinding.inflate(inflater, container, false);


        RecyclerView recyclerView = binding.recyclerview;

        List<Item> items = new ArrayList<Item>();

        items.add(new Item("Home", "Barcelona"));
        items.add(new Item("Kathmandu", "London"));
        items.add(new Item("Chabahil", "Bhaktapur"));
        items.add(new Item("Home", "Barcelona"));



        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        recyclerView.setAdapter(new MyAdapter(getContext().getApplicationContext(),items ));
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        binding.dashboardtext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_ThirdFragment);
            }
        });

        binding.bottomtoolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_ReportFragment);
            }
        });

        binding.menubar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_MenuFragment);
            }
        });



        binding.bottomtoolbar.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){

                case R.id.dashboard_bottom_nav:
                     break;
                case R.id.report_bottom_nav:
                    NavHostFragment.findNavController(SecondFragment.this)
                            .navigate(R.id.action_SecondFragment_to_ReportFragment);
                    break;
                case R.id.profile_bottom_nav:
                    NavHostFragment.findNavController(SecondFragment.this)
                            .navigate(R.id.action_SecondFragment_to_ProfileFragment);
                    break;
            }
            return true;
        });


//        binding.bottomtoolbar.setOnItemSelectedListener(item -> {
//            switch (item.getItemId()){
//
//                case R.id.dashboard_bottom_nav:
//                    replaceFragment(new SecondFragment());
//                    break;
//                case R.id.report_bottom_nav:
//                    replaceFragment(new ReportFragment());
//                    break;
//                case R.id.profile_bottom_nav:
//                    replaceFragment(new ProfileFragment());
//                    break;
//            }
//            return true;
//        });
    }

//    private void replaceFragment(Fragment fragment){
//        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        fragmentTransaction.replace(R.id.dashboard_fragment,fragment);
//        fragmentTransaction.commit();
//    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}