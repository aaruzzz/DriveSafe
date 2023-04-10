package com.example.drivesafe;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    TextView addr1View, addr2View, percentage_View, total_distance_View, total_time_View, highest_speed_View, total_alerts_View, performance_percentage_View, performance_status_View, date_and_time_View;
//    ImageView drawableView;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        addr1View = itemView.findViewById(R.id.addr1);
        addr2View = itemView.findViewById(R.id.addr2);
        percentage_View = itemView.findViewById(R.id.card_percentage);
        total_distance_View = itemView.findViewById(R.id.card_distance_in_km);
        total_time_View = itemView.findViewById(R.id.card_time);
        highest_speed_View = itemView.findViewById(R.id.card_highest_speed);
        total_alerts_View = itemView.findViewById(R.id.card_total_alert);
        performance_percentage_View = itemView.findViewById(R.id.card_performance_percent);
        performance_status_View = itemView.findViewById(R.id.card_performance_status);
        date_and_time_View = itemView.findViewById(R.id.card_date_and_time);
//        drawableView = itemView.findViewById(R.id.progressbar2);
    }
}
