package com.example.appnavigationdrawer.ui.home;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.example.appnavigationdrawer.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    ImageView logo;

    /*public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        return root;
    }*/

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        final TextView textView = view.findViewById(R.id.text_home);
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        logo = view.findViewById(R.id.imgtaptap);

        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri tap = Uri.parse("https://www.youtube.com");
                Intent intent = new Intent(Intent.ACTION_VIEW,tap);
                startActivity(intent);
            }
        });

        return view;

    /*@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        logo = view.findViewById(R.id.imgtaptap);

        logo.setOnClickListener(new View.OnClickListener() {
        Intent facebook = getPackageManager().getLaunchIntentForPackage("com.facebook.katana");
                startActivity(facebook);
            @Override
            public void onClick(View v) {
                Uri tap = Uri.parse("com.taptap.global");
                Intent intent = new Intent(Intent.ACTION_VIEW,tap);
                startActivity(intent);
            }
        });

        return view;*/
    }

}