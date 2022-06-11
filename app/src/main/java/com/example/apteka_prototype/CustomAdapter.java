package com.example.apteka_prototype;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    private Context context;
    private Activity activity;
    private ArrayList drug_id, drug_name, drug_type, drug_dose;

    CustomAdapter(Activity activity, Context context, ArrayList drug_id, ArrayList drug_name, ArrayList drug_type,
                  ArrayList drug_dose){
        this.activity = activity;
        this.context = context;
        this.drug_id = drug_id;
        this.drug_name = drug_name;
        this.drug_type = drug_type;
        this.drug_dose = drug_dose;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(view);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {

        holder.drug_name_txt.setText(String.valueOf(drug_name.get(position)));
        holder.drug_type_txt.setText(String.valueOf(drug_type.get(position)));
        holder.drug_dose_txt.setText(String.valueOf(drug_dose.get(position)));
        //Recyclerview onClickListener
        holder.mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, UpdateActivity.class);
                intent.putExtra("id", String.valueOf(drug_id.get(position)));
                intent.putExtra("name", String.valueOf(drug_name.get(position)));
                intent.putExtra("type", String.valueOf(drug_type.get(position)));
                intent.putExtra("dose", String.valueOf(drug_dose.get(position)));
                activity.startActivityForResult(intent, 1);
            }
        });


    }

    @Override
    public int getItemCount() {
        return drug_id.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView book_id_txt, drug_name_txt, drug_type_txt, drug_dose_txt;
        LinearLayout mainLayout;

        MyViewHolder(@NonNull View itemView) {
            super(itemView);
            drug_name_txt = itemView.findViewById(R.id.book_title_txt);
            drug_type_txt = itemView.findViewById(R.id.book_author_txt);
            drug_dose_txt = itemView.findViewById(R.id.book_pages_txt);
            mainLayout = itemView.findViewById(R.id.mainLayout);
            Animation translate_anim = AnimationUtils.loadAnimation(context, R.anim.translate_anim);
            mainLayout.setAnimation(translate_anim);
        }

    }

}
