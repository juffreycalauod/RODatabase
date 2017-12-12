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

public class TwoHandSwordsRecycler extends AppCompatActivity implements SearchView.OnQueryTextListener {





   private  TwoHandSwordsRecyclerAdapter TwoHandSwordsRecyclerAdapter;





    String [] text_Res;

    int [] img_Res = {R.drawable.atlas,R.drawable.balmung,R.drawable.bastardsword,R.drawable.bloodyeater,
            R.drawable.braveassaulterskatzbalger,R.drawable.broadsword,R.drawable.claymore,R.drawable.deathguidance,
            R.drawable.dragonslayer,R.drawable.executionersword,R.drawable.gloriousclaymore,R.drawable.katana,
            R.drawable.katzbalger,R.drawable.krasnaya,R.drawable.masamune,R.drawable.muramasa,R.drawable.musclecutter,
            R.drawable.schweizersabel,R.drawable.slayer,R.drawable.taegoolyeon,R.drawable.twohandedsword,
            R.drawable.valorous,R.drawable.veteransword,R.drawable.violetfear,R.drawable.zweihander};

    int i = 0;


    ArrayList<DataProvider> arrayList = new ArrayList<>();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two_handedswords_recycler);

        RecyclerView recyclerView;
        RecyclerView.LayoutManager recyclerLayoutManager;

        recyclerView = (RecyclerView) findViewById(R.id.recycleridget_twohandedswords);

        text_Res = getResources().getStringArray(R.array.twohandswords_array);


        for (String name : text_Res)

        {

            DataProvider dataProvider = new DataProvider(img_Res[i],name);


            arrayList.add(dataProvider);

            i++;





        }


       TwoHandSwordsRecyclerAdapter = new TwoHandSwordsRecyclerAdapter(arrayList,this);
        recyclerView.setHasFixedSize(true);
        recyclerLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(recyclerLayoutManager);
        recyclerView.setAdapter(TwoHandSwordsRecyclerAdapter);






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

        TwoHandSwordsRecyclerAdapter.setFilter(filterArrayList);



        return true;
    }
}
