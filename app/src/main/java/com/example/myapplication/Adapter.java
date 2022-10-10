package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    private ArrayList<Data> Dataslist;
    private ArrayList<Data> list;

    public Adapter(ArrayList<Data> Dataslist) {
        this.Dataslist = Dataslist;
        this.list = list;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView matkul, dateline;

        public MyViewHolder(final View view) {
            super(view);
            matkul = view.findViewById(R.id.textView2);
            dateline = view.findViewById(R.id.tgl);
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        String mtkul = Dataslist.get(position).getNamamatkul();
        holder.matkul.setText(mtkul);
        String dateline = Dataslist.get(position).getDikumpul();
        holder.dateline.setText(dateline);

    }

    @Override
    public int getItemCount() {
        return Dataslist.size();
    }
}
