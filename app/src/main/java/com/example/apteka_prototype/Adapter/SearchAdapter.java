package com.example.apteka_prototype.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.apteka_prototype.Model.Rejestr;
import com.example.apteka_prototype.R;
import android.content.Context;

import java.util.ConcurrentModificationException;
import java.util.List;

class SearchViewHolder extends RecyclerView.ViewHolder{

    public TextView nazwa, rodzaj, moc, postac, substancja;

    public SearchViewHolder(View itemView) {
        super(itemView);
        nazwa = (TextView)itemView.findViewById(R.id.nazwa);
        rodzaj = (TextView)itemView.findViewById(R.id.rodzaj);
        moc = (TextView)itemView.findViewById(R.id.moc);
        postac = (TextView)itemView.findViewById(R.id.postac);
        substancja = (TextView)itemView.findViewById(R.id.substancja);


    }
}
public class SearchAdapter extends RecyclerView.Adapter<SearchViewHolder> {

    private Context context;
    private List<Rejestr> rejestr;

    public SearchAdapter(Context context, List<Rejestr> rejestr){

        this.context = context;
        this.rejestr = rejestr;

    }


    @Override
    public SearchViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.layout_item,parent,false);
        return new SearchViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(SearchViewHolder holder, int position) {

        holder.nazwa.setText(rejestr.get(position).getNazwa());
        holder.rodzaj.setText(rejestr.get(position).getRodzaj());
        holder.moc.setText(rejestr.get(position).getMoc());
        holder.postac.setText(rejestr.get(position).getPostac());
        holder.substancja.setText(rejestr.get(position).getSubstancja());

    }

    @Override
    public int getItemCount() {
        return rejestr.size();
    }
}


