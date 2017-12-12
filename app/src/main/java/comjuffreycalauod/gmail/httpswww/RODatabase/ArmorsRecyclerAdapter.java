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
 * Created by Mr.Darkycible on 8/22/2017.
 */

public class ArmorsRecyclerAdapter extends RecyclerView.Adapter<ArmorsRecyclerAdapter.ArmorHolder> {

Context context;


    ArrayList<DataProvider> arrayList = new ArrayList<>();


    public ArmorsRecyclerAdapter (ArrayList<DataProvider> arrayList,Context context)

    {

        this.arrayList = arrayList;
        this.context = context;



    }








    @Override
    public ArmorHolder onCreateViewHolder (ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.armor_layout,parent,false);

        ArmorHolder armorHolder= new ArmorHolder(view);





        return armorHolder;
    }



    @Override
    public void onBindViewHolder(final ArmorHolder holder, int position) {

        final DataProvider dataProvider = arrayList.get(position);
        Glide.with(context).load(dataProvider.getImg_res()).into(holder.imageview);

        holder.textview.setText(dataProvider.getText_res());





        holder.textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(),ArmorDetails.class);
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


    public static class ArmorHolder extends RecyclerView.ViewHolder

    {

        ImageView imageview;
        TextView textview;


        public ArmorHolder(View view)




        {

            super(view);



           imageview  = (ImageView) view.findViewById(R.id.adventurersuit_img);



            textview = (TextView) view.findViewById(R.id.adventurersuit_txt);




        }


    }

    public void setFilter (ArrayList<DataProvider> searchList)


    {
        arrayList = new ArrayList<>();

        arrayList.addAll(searchList);

        notifyDataSetChanged();



    }




}
