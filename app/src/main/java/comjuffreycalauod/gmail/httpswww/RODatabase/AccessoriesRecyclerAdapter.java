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
 * Created by Mr.Darkycible on 8/28/2017.
 */

public class AccessoriesRecyclerAdapter extends RecyclerView.Adapter<AccessoriesRecyclerAdapter.AccessoriesHolder> {

    Context context;


    ArrayList<DataProvider> arrayList = new ArrayList<>();


    public AccessoriesRecyclerAdapter (ArrayList<DataProvider> arrayList, Context context)

    {

        this.arrayList = arrayList;
        this.context = context;




    }








    @Override
    public AccessoriesHolder onCreateViewHolder (ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.accessories_layout,parent,false);

        new AccessoriesHolder(view);


        return new AccessoriesHolder(view) ;
    }



    @Override
    public void onBindViewHolder(final AccessoriesHolder holder, int position) {

     final   DataProvider dataProvider = arrayList.get(position);
        Glide.with(context).load(dataProvider.getImg_res()).into(holder.imageview);
        holder.textview.setText(dataProvider.getText_res());




        holder.textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent intent = new Intent(v.getContext(),Accessories_details.class);
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


    public static class AccessoriesHolder extends RecyclerView.ViewHolder

    {

        ImageView imageview;
        TextView textview;


        public AccessoriesHolder (View view)




        {

            super(view);



            imageview = view.findViewById(R.id.academyofbadge_img);
            textview =  view.findViewById(R.id.academyofbadge_txt);




        }


    }

    public void setFilter (ArrayList<DataProvider> searchList)


    {
        arrayList = new ArrayList<>();
        arrayList.addAll(searchList);

        notifyDataSetChanged();



    }



}
