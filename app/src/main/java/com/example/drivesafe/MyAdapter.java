package com.example.drivesafe;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context context;
    List<Item> items;

    public MyAdapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.cardview,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.addr1View.setText(items.get(position).getAddr1());
        holder.addr2View.setText(items.get(position).getAddr2());
        holder.percentage_View.setText(items.get(position).getPercentage());
        holder.total_distance_View.setText(items.get(position).getTotalDistance());
        holder.total_time_View.setText(items.get(position).getTotalTime());
        holder.highest_speed_View.setText(items.get(position).getHighestSpeed());
        holder.total_alerts_View.setText(items.get(position).getTotalAlerts());
        holder.performance_percentage_View.setText(items.get(position).getPerformancePercentage());
        holder.performance_status_View.setText(items.get(position).getPerformanceStatus());
        holder.date_and_time_View.setText(items.get(position).getDateandTime());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
