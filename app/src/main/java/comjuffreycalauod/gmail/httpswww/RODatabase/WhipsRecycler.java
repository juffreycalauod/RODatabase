package comjuffreycalauod.gmail.httpswww.RODatabase;

import android.os.Bundle;
import android.support.annotation.Nullable;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import static android.support.v4.view.MenuItemCompat.getActionView;
import static comjuffreycalauod.gmail.httpswww.RODatabase.R.id.action_search;

/**
 * Created by Mr.Darkycible on 8/19/2017.
 */

public class WhipsRecycler extends AppCompatActivity implements SearchView.OnQueryTextListener {





    private  WhipsRecyclerAdapter whipsRecyclerAdapter;






    String [] text_Res;

    int [] img_Res = {R.drawable.bladewhip,R.drawable.bravebattlelariat,R.drawable.carrotwhip,R.drawable.chemetiwhip,
            R.drawable.electriceel,R.drawable.electricwire,R.drawable.gaiawhip,R.drawable.gloriouslariat,R.drawable.iciclewhip,
            R.drawable.lariatwhip,R.drawable.phenomenawhip,R.drawable.queeniswhip,R.drawable.rantewhip,R.drawable.rapturerose,
            R.drawable.redflamewhip,R.drawable.rope,R.drawable.seawitchsfoot,R.drawable.skippingrope,R.drawable.stemofnepenthes,
            R.drawable.tailwhip,R.drawable.valorousbattlelariat,R.drawable.whip,R.drawable.whipofbalance,R.drawable.wirewhip};

    int i = 0;


    ArrayList<DataProvider> arrayList = new ArrayList<>();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.whips_recycler);


        RecyclerView recyclerView;

        RecyclerView.LayoutManager recyclerLayoutManager;
            recyclerView =  findViewById(R.id.recyclerwidget_whips);

        text_Res = getResources().getStringArray(R.array.whips_array);


        for (String name : text_Res)

        {

            DataProvider dataProvider = new DataProvider(img_Res[i],name);


            arrayList.add(dataProvider);

            i++;





        }


        whipsRecyclerAdapter= new WhipsRecyclerAdapter(arrayList,this);
        recyclerView.setHasFixedSize(true);
        recyclerLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(recyclerLayoutManager);
        recyclerView.setAdapter(whipsRecyclerAdapter);






    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_items,menu);
        MenuItem menuitem = menu.findItem(action_search);
        SearchView searchView = (SearchView)getActionView(menuitem);
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

        whipsRecyclerAdapter.setFilter(filterArrayList);



        return true;
    }
}
