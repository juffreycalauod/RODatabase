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

public class FootgearRecycler extends AppCompatActivity  implements SearchView.OnQueryTextListener {



    private  FootgearRecyclerAdapter footgearRecyclerAdapter;





    String [] text_Res;

    int [] img_Res = {R.drawable.airboss,R.drawable.angelsreincarnation,R.drawable.armyboots,R.drawable.battleboots,R.drawable.battlegreaves,R.drawable.beachsandals,
            R.drawable.blackleatherboots,R.drawable.boots,R.drawable.bunnyslipper,R.drawable.combatboots,R.drawable.cyrstalpumps,R.drawable.diabolousboots,
            R.drawable.fishersboots,R.drawable.freyjaboots,R.drawable.friccosshoes,R.drawable.gloriousmassproductionshoes,R.drawable.gloriousshoes,R.drawable.goibnesgreaves,
            R.drawable.goldenshoes,R.drawable.greaves,R.drawable.highfashionsandals,R.drawable.highheels,R.drawable.ironboots,R.drawable.noviceshoes,R.drawable.noviceslippers,
            R.drawable.pawofcat,R.drawable.redstockingboots,R.drawable.refreshshoes,R.drawable.safetyboots,R.drawable.sandals,R.drawable.shackles,R.drawable.shadowwalk,
            R.drawable.shoes,R.drawable.sleipnir,R.drawable.sprintshoes,R.drawable.tidalshoes,R.drawable.valkyrianshoes,R.drawable.valleyshoes,R.drawable.variantshoes,
            R.drawable.vidarsboots,R.drawable.vitaltreeshoes};



    int i = 0;


    ArrayList<DataProvider> arrayList = new ArrayList<>();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.footgear_recycler);

        RecyclerView recyclerView;
        RecyclerView.LayoutManager recyclerLayoutManager;

        recyclerView = (RecyclerView) findViewById(R.id.recyclerwidget_footgear);

        text_Res = getResources().getStringArray(R.array.footgear_array);


        for (String name : text_Res)

        {

            DataProvider dataProvider = new DataProvider(img_Res[i],name);


            arrayList.add(dataProvider);

            i++;





        }


        footgearRecyclerAdapter= new FootgearRecyclerAdapter(arrayList,this);
        recyclerView.setHasFixedSize(true);
        recyclerLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(recyclerLayoutManager);
        recyclerView.setAdapter(footgearRecyclerAdapter);






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

        footgearRecyclerAdapter.setFilter(filterArrayList);



        return true;
    }

}
