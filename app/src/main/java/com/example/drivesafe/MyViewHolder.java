package com.example.drivesafe;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    TextView addr1View, addr2View;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        addr1View = itemView.findViewById(R.id.addr1);
        addr2View = itemView.findViewById(R.id.addr2);
    }
}
