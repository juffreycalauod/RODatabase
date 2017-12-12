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
 * Created by Mr.Darkycible on 8/17/2017.
 */

public class TwoHandedAxesRecycler extends AppCompatActivity implements SearchView.OnQueryTextListener{



    private  TwoHandedAxesRecyclerAdapter twoHandedAxesRecyclerAdapter;





    String [] text_Res;

    int [] img_Res = {R.drawable.battleaxe,R.drawable.berdysz,R.drawable.bloodyaxe,R.drawable.bradiumstonehammer,
            R.drawable.braveinsanebbattleaxe,R.drawable.buster,R.drawable.celestialaxe,R.drawable.doomslayer,
            R.drawable.giantaxe,R.drawable.glorioustwohandedaxe,R.drawable.greataxe,R.drawable.guillotine,R.drawable.hammer,
            R.drawable.heartbreaker,R.drawable.hurricanesfury,R.drawable.lightepsilon,R.drawable.novicebattleaxe,
            R.drawable.refinedbloodyaxe,R.drawable.refinedgreataxe,R.drawable.sabbath,R.drawable.slaughter,R.drawable.tomahawk,
            R.drawable.twohandedaxe,R.drawable.valorousinsanebattleaxe,R.drawable.veteranaxe};


    int i = 0;


    ArrayList<DataProvider> arrayList = new ArrayList<>();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.twohandedaxe_recycler);


        RecyclerView recyclerView;
        RecyclerView.LayoutManager recyclerLayoutManager;
        recyclerView =  findViewById(R.id.recyclerwidget_twohandedaxe);

        text_Res = getResources().getStringArray(R.array.twohandedaxes_array);


        for (String name : text_Res)

        {

            DataProvider dataProvider = new DataProvider(img_Res[i],name);


            arrayList.add(dataProvider);

            i++;





        }


        twoHandedAxesRecyclerAdapter= new TwoHandedAxesRecyclerAdapter(arrayList,this);
        recyclerView.setHasFixedSize(true);
        recyclerLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(recyclerLayoutManager);
        recyclerView.setAdapter(twoHandedAxesRecyclerAdapter);






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

        twoHandedAxesRecyclerAdapter.setFilter(filterArrayList);



        return true;
    }


}
