package comjuffreycalauod.gmail.httpswww.RODatabase;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * Created by Mr.Darkycible on 8/16/2017.
 */

public class DaggerRecyclerAdapter extends RecyclerView.Adapter<DaggerRecyclerAdapter.DaggerHolder>


{

    Context context;
    ArrayList<DataProvider> arrayList = new ArrayList<>();


    public DaggerRecyclerAdapter(ArrayList<DataProvider> arrayList, Context context)

    {

        this.arrayList = arrayList;
        this.context = context;



    }








    @Override
    public DaggerHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.dagger_layout,parent,false);

         new DaggerHolder(view);





        return new DaggerHolder(view);
    }

    @Override
    public void onBindViewHolder(final DaggerHolder holder, int position) {

       final DataProvider dataProvider = arrayList.get(position);

        Glide.with(context).load(dataProvider.getImg_res()).into(holder.imageview);
        holder.textview.setText(dataProvider.getText_res());


        holder.textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent intent = new Intent(v.getContext(),Dagger_details.class);
                intent.putExtra("NAME",dataProvider.getText_res());
                intent.putExtra("IMG",dataProvider.getImg_res());
                intent.putExtra("POSITION",holder.getAdapterPosition());
                v.getContext().startActivity(intent);


            }
        });



    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }


    public static class DaggerHolder extends RecyclerView.ViewHolder

    {

        ImageView imageview;
        TextView textview;


        public DaggerHolder (View view)




        {

            super(view);



            imageview = view.findViewById(R.id.angelicWingDagger);
            textview =  view.findViewById(R.id.angelicWingDaggerText);




        }


    }

    public void setFilter (ArrayList<DataProvider> searchList)


    {

        arrayList = new ArrayList<>();

        arrayList.addAll(searchList);

        notifyDataSetChanged();



    }


}
