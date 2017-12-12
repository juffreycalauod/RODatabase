package comjuffreycalauod.gmail.httpswww.RODatabase;

import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;

import com.crashlytics.android.Crashlytics;

import java.util.ArrayList;

import io.fabric.sdk.android.Fabric;

import static comjuffreycalauod.gmail.httpswww.RODatabase.R.id.action_search;

/**
 * Created by Mr.Darkycible on 8/8/2017.
 */

public class BowsRecycler extends AppCompatActivity implements SearchView.OnQueryTextListener


{



    RecyclerView recyclerView;
    BowsRecyclerAdapter recyclerweaponBow;
    RecyclerView.LayoutManager recyclerLayoutManager;



    String [] text_Res;

    int [] img_Res  = {R.drawable.arbalest,R.drawable.ballista,R.drawable.bow,R.drawable.bravebattlecrossbow,
            R.drawable.burningbow,R.drawable.compositebow,R.drawable.crossbow,
            R.drawable.cursedlyre,R.drawable.doublebound,R.drawable.dragonwing,R.drawable.earthbow,
            R.drawable.falkenblitz,R.drawable.frozenbow,R.drawable.gakkungbow,R.drawable.glorioushunterbow,
            R.drawable.greatbow,R.drawable.gustbow,R.drawable.hunterbow,R.drawable.ixionwings,R.drawable.kkakung,
            R.drawable.lunabow,R.drawable.minstrel,R.drawable.nephentes,R.drawable.novicecompo,R.drawable.orcharcherbow,
            R.drawable.repepatingcrossbow,R.drawable.roguemaster,R.drawable.rudra,R.drawable.valorous};

    ArrayList<DataProvider> arraylist = new ArrayList<>();


    int i = 0;

    //Variables Declartion top

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.bow_recycler);

        recyclerView = (RecyclerView) findViewById(R.id.recyycler1_view);

        text_Res = getResources().getStringArray(R.array.bows_weapons);

        for(String name: text_Res)

        {

            DataProvider dataprovider = new DataProvider(img_Res[i],name);


            arraylist.add(dataprovider);

            i++;



        }

        recyclerweaponBow = new BowsRecyclerAdapter(arraylist,this);
        recyclerView.setHasFixedSize(true);
        recyclerLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(recyclerLayoutManager);
        recyclerView.setAdapter(recyclerweaponBow);




    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_items, menu);
        MenuItem menuitem = menu.findItem(action_search);

        SearchView searchView = (SearchView) MenuItemCompat.getActionView(menuitem);
        searchView.setOnQueryTextListener(this);



        return true;
    }

    @Override
    public boolean onQueryTextSubmit(String query) {




        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {


        newText = newText.toLowerCase();

        ArrayList<DataProvider>  filterarrayList = new ArrayList<>();

        for( DataProvider dataProvider : arraylist)

        {

            String searchText = dataProvider.getText_res() .toLowerCase();
            if(searchText.startsWith(newText))

                filterarrayList.add(dataProvider);





        }

        recyclerweaponBow.setFilter(filterarrayList);





        return false;
    }
}
