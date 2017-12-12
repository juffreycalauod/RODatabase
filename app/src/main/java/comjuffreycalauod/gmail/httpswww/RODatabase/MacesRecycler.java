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
 * Created by Mr.Darkycible on 8/19/2017.
 */

public class MacesRecycler extends AppCompatActivity implements SearchView.OnQueryTextListener{



    private  MacesRecyclerAdapter macesRecyclerAdapter;






    String [] text_Res;

    int [] img_Res = {R.drawable.angramanyu,R.drawable.bravebattlemorningstar,R.drawable.chain,R.drawable.club,
            R.drawable.erde,R.drawable.flail,R.drawable.gloriousmorningstar,R.drawable.goldenmace,
            R.drawable.goodmorningstar,R.drawable.grandcross,R.drawable.hollgrehennshammer ,
            R.drawable.irondriver,R.drawable.longmace,R.drawable.lunakaligo,R.drawable.mace,
            R.drawable.maceofmadness,R.drawable.mjolnir,R.drawable.morningstar,R.drawable.nemesis,
            R.drawable.novicemace,R.drawable.quadrillle,R.drawable.redsquarebag,R.drawable.refinedquadrille,
            R.drawable.slash,R.drawable.smasher,R.drawable.spike,R.drawable.stunner,R.drawable.swordmace,
            R.drawable.valorousbattlefieldmmorningstar,R.drawable.veteranhammer,R.drawable.wrench};


    int i = 0;


    ArrayList<DataProvider> arrayList = new ArrayList<>();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mace_recycler);

        RecyclerView recyclerView;
        RecyclerView.LayoutManager recyclerLayoutManager;


        recyclerView = (RecyclerView) findViewById(R.id.recyclerwidget_mace);

        text_Res = getResources().getStringArray(R.array.maces_array);


        for (String name : text_Res)

            {

            DataProvider dataProvider = new DataProvider(img_Res[i],name);


            arrayList.add(dataProvider);

            i++;





        }


        macesRecyclerAdapter = new MacesRecyclerAdapter(arrayList,this);
        recyclerView.setHasFixedSize(true);
        recyclerLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(recyclerLayoutManager);
        recyclerView.setAdapter(macesRecyclerAdapter);






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

        macesRecyclerAdapter.setFilter(filterArrayList);



        return true;
    }



}
