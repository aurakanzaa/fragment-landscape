package com.example.aura.modul2_fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ResepDetailFragment extends Fragment {


    private long resepId;

    public ResepDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_resep_detail, container, false);
    }

    public void setResep(long id){
        this.resepId = id;
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();

        if(view != null){
            TextView title = view.findViewById(R.id.textTitle);
            Resep resepmakanan = Resep.resepmakanan[(int) resepId];
            title.setText(resepmakanan.getName());

            TextView description = view.findViewById(R.id.textDescription);
            description.setText(resepmakanan.getDescription());
        }
    }
}
