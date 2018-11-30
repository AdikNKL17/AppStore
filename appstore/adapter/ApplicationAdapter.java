package com.majesthink.adik.appstore.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.majesthink.adik.appstore.DetailActivity;
import com.majesthink.adik.appstore.R;
import com.majesthink.adik.appstore.model.Application;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class ApplicationAdapter extends RecyclerView.Adapter<ApplicationAdapter.ApplicationHolder>{

    Context context;
    List<Application> applicationList;

    @NonNull
    @Override
    public ApplicationHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_vertical, viewGroup, false);

        return new ApplicationHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ApplicationHolder applicationHolder, int position) {

        final Application application = applicationList.get(position);

        applicationHolder.appName.setText(application.getApp_name());
        applicationHolder.appDeveloper.setText(application.getApp_developer());
        applicationHolder.appSize.setText(Integer.toString(application.getApp_size()));

        applicationHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("APP_NAME", application.getApp_name());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return applicationList.size();
    }

    public class ApplicationHolder extends RecyclerView.ViewHolder {

        RoundedImageView appIcon;
        TextView appName, appDeveloper, appSize;
        public ApplicationHolder(@NonNull View itemView) {
            super(itemView);

            appIcon = itemView.findViewById(R.id.app_icon);
            appName = itemView.findViewById(R.id.app_name);
            appDeveloper = itemView.findViewById(R.id.app_developer);
            appSize = itemView.findViewById(R.id.app_size);
        }
    }

    public ApplicationAdapter (Context context, List<Application> applicationList){
        this.context = context;
        this.applicationList = applicationList;
    }
}
