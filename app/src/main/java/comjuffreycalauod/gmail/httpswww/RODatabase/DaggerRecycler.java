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
 * Created by Mr.Darkycible on 8/16/2017.
 */

public class DaggerRecycler extends AppCompatActivity implements SearchView.OnQueryTextListener {




    private DaggerRecyclerAdapter daggerRecyclerAdapter;



    String [] text_Res;

    int [] img_Res = {R.drawable.angelicwingdagger,R.drawable.ashura,R.drawable.assassindagger,R.drawable.asura,
            R.drawable.azoth,R.drawable.bazerald,R.drawable.braveassassinsdamascus,R.drawable.cinquedea,R.drawable.combatknife,
            R.drawable.combatkniferental,R.drawable.cowardiceblade,R.drawable.curseddagger,R.drawable.cutter,R.drawable.dagger,
            R.drawable.daggerofcounter,R.drawable.daggerofhunter,R.drawable.damascus,R.drawable.deserttwilight,R.drawable.dirk,
            R.drawable.dragonkiller,R.drawable.exorciser,R.drawable.fishermansdagger,R.drawable.fortunesword,R.drawable.ginnungagap,
            R.drawable.gladius,R.drawable.gloriousgladius,R.drawable.grimtooth,R.drawable.hakujin,R.drawable.holydagger,
            R.drawable.icepick,R.drawable.ivoryknife,R.drawable.jitte,R.drawable.jujubedagger,R.drawable.kamaitachi,R.drawable.khukri,
            R.drawable.kindledagger,R.drawable.kitchenknife,R.drawable.knife,R.drawable.krierg,R.drawable.mailbreaker,
            R.drawable.maingauche,R.drawable.monlightdagger,R.drawable.murasame,R.drawable.novicecutter,
            R.drawable.novicemaingauche,R.drawable.obsidiandagger,R.drawable.poisonknife,R.drawable.princessknife,
            R.drawable.prinsenseknife,R.drawable.refinedmailbreaker,R.drawable.refinedswordbreaker,R.drawable.sandstorm,
            R.drawable.scalpel,R.drawable.stiletto,R.drawable.sucsamad,R.drawable.swordbreaker,R.drawable.toothblade,
            R.drawable.valorousassassinsdamascus,R.drawable.warriorsbalmung,R.drawable.weederknife,R.drawable.weihna,R.drawable.zenyknife};


    int i = 0;


    ArrayList<DataProvider> arrayList = new ArrayList<>();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dagger_recycler);

        RecyclerView recyclerView;
        RecyclerView.LayoutManager recyclerLayoutManager;




        recyclerView = (RecyclerView) findViewById(R.id.reyclerWidget_dagger);

        text_Res = getResources().getStringArray(R.array.dagger_array);


        for (String name : text_Res)

        {

            DataProvider dataProvider = new DataProvider(img_Res[i],name);


            arrayList.add(dataProvider);

            i++;





        }


        daggerRecyclerAdapter = new DaggerRecyclerAdapter(arrayList,this);
        recyclerView.setHasFixedSize(true);
        recyclerLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(recyclerLayoutManager);
        recyclerView.setAdapter(daggerRecyclerAdapter);






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

        daggerRecyclerAdapter.setFilter(filterArrayList);



        return true;
    }



}
