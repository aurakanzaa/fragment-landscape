package com.example.aura.modul2_fragment;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ResepListFragment.Listener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

//    public void onShowDetails(View view) {
//        Intent intent = new Intent(this, DetailActivity.class);
//        startActivity(intent);
//    }


    public void itemClicked (long id){
        View fragmentContainer = findViewById(R.id.details_frag);
        if(fragmentContainer != null){
            ResepDetailFragment details = new ResepDetailFragment();

            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            details.setResep(id);

            ft.replace(R.id.details_frag, details);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.addToBackStack(null);

            ft.commit();
        }else{
            Toast.makeText(this, "Item"+id+ "di klik", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this.getApplicationContext(), DetailActivity.class);
            Bundle b = new Bundle();
            b.putDouble("id", id);
            i.putExtras(b);
            startActivity(i);
        }
    }

//    @Override
//    public void onListItemClick(ListView listView, View itemView, int position, long id) {
//
//        super.onListItemClick(listView, itemView, position, id);
//        Toast.makeText(getActivity(), "Item "+position+ " klik", Toast.LENGTH_SHORT).show();
//
//        Intent i = new Intent(itemView.getContext(), DetailActivity.class);
//        Bundle b = new Bundle();
//        String[] names = new String[Resep.resepmakanan.length];
//        b.putInt("id", position);
//        i.putExtras(b);
//        startActivity(i);
//    }



}