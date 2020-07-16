package com.example.favorite.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.favorite.R;
import com.example.favorite.heart.CoffeeAdapter;
import com.example.favorite.heart.CoffeeItem;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private ArrayList<CoffeeItem> coffeeItems = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        RecyclerView recyclerView = root.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new CoffeeAdapter(coffeeItems, getActivity()));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        coffeeItems.add(new CoffeeItem(R.drawable.cup_alina, "Latte", "0", "0"));
        coffeeItems.add(new CoffeeItem(R.drawable.cup_alina, "Kapucino", "1", "0"));
        coffeeItems.add(new CoffeeItem(R.drawable.cup_alina, "Raf", "2", "0"));

        return root;
    }
}
