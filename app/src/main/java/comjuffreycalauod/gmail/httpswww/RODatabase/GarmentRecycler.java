package comjuffreycalauod.gmail.httpswww.RODatabase;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import static comjuffreycalauod.gmail.httpswww.RODatabase.R.id.action_search;

/**
 * Created by Mr.Darkycible on 8/23/2017.
 */

public class GarmentRecycler extends AppCompatActivity implements SearchView.OnQueryTextListener{


     private GarmentRecyclerAdapter garmentRecyclerAdapter;





    String [] text_Res;

    int [] img_Res = {R.drawable.ancientcape,R.drawable.angeliccardigan,R.drawable.asprika,R.drawable.beachmanteau,R.drawable.captainssmanteau,R.drawable.cheapundershirt,
            R.drawable.cloakofsurvival,R.drawable.coatofdragonscale,R.drawable.commandersmanteau,R.drawable.crestoftherider,R.drawable.diabolusmanteau,
            R.drawable.dragonbreath,R.drawable.dragonnmanteau,R.drawable.eaglewing,R.drawable.falconmuffler,R.drawable.fishersmuffler,R.drawable.flamemanteauofnaghtsieger,
            R.drawable.freyjacape,R.drawable.gloriusmuffler,R.drawable.goibnesspaulders,R.drawable.heavenlymaidenrobe,R.drawable.hood,R.drawable.leatheroftendrilion,
            R.drawable.manteau,R.drawable.mithrilmagiccape,R.drawable.morpheussshawl,R.drawable.morriganesmanteau,R.drawable.muffler,R.drawable.musika,R.drawable.neomuffler,R.drawable.novicemanteau,R.drawable.nydhorggsshadowgarb,R.drawable.pauldron
            ,R.drawable.ragamuffinmanteau,R.drawable.riderinsignia,R.drawable.ruffler,R.drawable.sheriffsmanteau,R.drawable.skeletonmanteau,R.drawable.skinofventus,R.drawable.sombernovicehood,
            R.drawable.survivorsmanteau,R.drawable.sylphidmanteau,R.drawable.ulfhedinn,R.drawable.undershirt,R.drawable.valismanteau,R.drawable.valkyrianmanteau,R.drawable.woolscarf};



    int i = 0;


    ArrayList<DataProvider> arrayList = new ArrayList<>();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.garment_recycler);


        RecyclerView recyclerView;
        RecyclerView.LayoutManager recyclerLayoutManager;



        recyclerView = (RecyclerView) findViewById(R.id.recyclerwidget_garment);

        text_Res = getResources().getStringArray(R.array.garments_array);


        for (String name : text_Res)

        {

            DataProvider dataProvider = new DataProvider(img_Res[i],name);


            arrayList.add(dataProvider);

            i++;





        }


        garmentRecyclerAdapter = new GarmentRecyclerAdapter(arrayList,this);
        recyclerView.setHasFixedSize(true);
        recyclerLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(recyclerLayoutManager);
        recyclerView.setAdapter(garmentRecyclerAdapter);






    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_items,menu);
        MenuItem menuitem = menu.findItem(action_search);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(menuitem);
        searchView.setOnQueryTextListener(this);






        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {

        newText = newText.toLowerCase();


        ArrayList<DataProvider> filterArrayList = new ArrayList<>();

        for(DataProvider dataProvider: arrayList)

        {
            String searchText = dataProvider.getText_res().toLowerCase();

            if(searchText.startsWith(newText))

            {

                filterArrayList.add(dataProvider);

            }


        }

        garmentRecyclerAdapter.setFilter(filterArrayList);



        return true;
    }





}
