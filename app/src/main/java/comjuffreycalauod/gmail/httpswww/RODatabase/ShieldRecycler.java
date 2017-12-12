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

public class ShieldRecycler extends AppCompatActivity implements SearchView.OnQueryTextListener{

    private  ShieldRecyclerAdapter shieldRecyclerAdapter;





    String [] text_Res;

    int [] img_Res = {R.drawable.advancedarmguard,R.drawable.ahuramazdah,R.drawable.angelicguard,R.drawable.armguard,R.drawable.bradiumshield,R.drawable.buckler,
            R.drawable.crackedbuckler,R.drawable.crossshield,R.drawable.exorcismbible,R.drawable.flamethrower,R.drawable.guard,R.drawable.guyakshield,R.drawable.holyguard,
            R.drawable.magicbible,R.drawable.memorybook,R.drawable.mirrorshield,R.drawable.neovalkyrjasshield,R.drawable.noviceguard,R.drawable.noviceshield,
            R.drawable.orleansserver,R.drawable.plaltinumshield,R.drawable.sacredmission,R.drawable.secularmission,R.drawable.shadowguard,
            R.drawable.shellofresistance,R.drawable.shield,R.drawable.shieldofnaga,R.drawable.stonebuckler,R.drawable.strongshield,R.drawable.thornybuckler,R.drawable.tournamentshield,R.drawable.valkyrjasshield};



    int i = 0;


    ArrayList<DataProvider> arrayList = new ArrayList<>();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shield_recycler);


        RecyclerView recyclerView;
        RecyclerView.LayoutManager recyclerLayoutManager;
        recyclerView =  findViewById(R.id.recyclerwidget_shield);

        text_Res = getResources().getStringArray(R.array.shields_array);


        for (String name : text_Res)

        {

            DataProvider dataProvider = new DataProvider(img_Res[i],name);


            arrayList.add(dataProvider);

            i++;





        }


        shieldRecyclerAdapter = new ShieldRecyclerAdapter(arrayList,this);
        recyclerView.setHasFixedSize(true);
        recyclerLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(recyclerLayoutManager);
        recyclerView.setAdapter(shieldRecyclerAdapter);






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

        shieldRecyclerAdapter.setFilter(filterArrayList);



        return false;
    }




}
