package com.example.appnavigationdrawer;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link nav_sonidos#newInstance} factory method to
 * create an instance of this fragment.
 */
public class nav_sonidos extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public nav_sonidos() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment nav_sonidos.
     */
    // TODO: Rename and change types and number of parameters
    public static nav_sonidos newInstance(String param1, String param2) {
        nav_sonidos fragment = new nav_sonidos();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    pl.droidsonroids.gif.GifImageView img1, img2, img3, img4;
    Button salir;
    MediaPlayer sond1, sond2, sond3, sond4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_nav_sonidos, container, false);

        img1 = view.findViewById(R.id.mariotubo);
        img2 = view.findViewById(R.id.mariovida);
        img3 = view.findViewById(R.id.bart);
        img4 = view.findViewById(R.id.pacman);
        salir = view.findViewById(R.id.btnSalida);
        sond1 = MediaPlayer.create(getActivity(), R.raw.mariobrostuberia);
        sond2 = MediaPlayer.create(getActivity(), R.raw.mariobrosvida);
        sond3 = MediaPlayer.create(getActivity(), R.raw.caramba);
        sond4 = MediaPlayer.create(getActivity(), R.raw.pacman);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { sond1.start(); }

        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { sond2.start(); }

        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { sond3.start(); }

        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { sond4.start(); }

        });

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.nav_home);
            }
        });

        return view;
    }
}
