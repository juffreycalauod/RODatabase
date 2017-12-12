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
 * Created by Mr.Darkycible on 8/22/2017.
 */

public class GunsReycler extends AppCompatActivity implements SearchView.OnQueryTextListener {


    private GunsRecyclerAdapter gunsRecyclerAdapter;





    String [] text_Res;

    int [] img_Res = {R.drawable.blackrose,R.drawable.branch,R.drawable.butcher,R.drawable.crimsonbolt,R.drawable.cyclone,
            R.drawable.destroyer,R.drawable.drifter,R.drawable.dusk,R.drawable.edenrevolverxi,R.drawable.edenrevolverxii,R.drawable.garrison,
            R.drawable.gatekeeper,R.drawable.gatekeeperdd,R.drawable.gloriousgatlinggun,R.drawable.gloriousgrenadelauncher,R.drawable.gloriouspistol,
            R.drawable.gloriousrifle,R.drawable.gloriousshotgun,R.drawable.goldlux,R.drawable.inferno,R.drawable.junglecarbine,R.drawable.leveractionrifle,
            R.drawable.longbarrel,R.drawable.rollingstone,R.drawable.sixshooter,R.drawable.soldiergatlinggun,R.drawable.soldiergrenadelauncher,R.drawable.soldierrevolver,
            R.drawable.soldierrifle,R.drawable.soldiershotgun,R.drawable.thunderp,R.drawable.wastelandoutlaw};
    int i = 0;


    ArrayList<DataProvider> arrayList = new ArrayList<>();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guns_recycler);


        RecyclerView recyclerView;
        RecyclerView.LayoutManager recyclerLayoutManager;
        recyclerView = (RecyclerView) findViewById(R.id.recyclerwidget_guns);

        text_Res = getResources().getStringArray(R.array.guns_array);


        for (String name : text_Res)

        {

            DataProvider dataProvider = new DataProvider(img_Res[i],name);


            arrayList.add(dataProvider);

            i++;





        }


        gunsRecyclerAdapter = new GunsRecyclerAdapter(arrayList,this);
        recyclerView.setHasFixedSize(true);
        recyclerLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(recyclerLayoutManager);
        recyclerView.setAdapter(gunsRecyclerAdapter);






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

        gunsRecyclerAdapter.setFilter(filterArrayList);



        return true;
    }
}
