package com.majesthink.adik.appstore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.majesthink.adik.appstore.adapter.ApplicationAdapter;
import com.majesthink.adik.appstore.model.Application;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private List<Application> applicationList = new ArrayList<>();
    RecyclerView recyclerView;
    ApplicationAdapter applicationAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = findViewById(R.id.toolbar);
        mToolbar.inflateMenu(R.menu.toolbar_menu);

        recyclerView = findViewById(R.id.list_recommended);
        applicationAdapter = new ApplicationAdapter(getApplicationContext(), applicationList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(applicationAdapter);

        dataApplication();
    }

    private void dataApplication() {
        Application application = new Application(
                "Netflix", "Netflix Inc", "coba", 21
        );
        applicationList.add(application);
        application = new Application(
                "Whatsapp", "Facebook Inc", "what", 49
        );
        applicationList.add(application);
        application = new Application(
                "Whatsapp", "Facebook Inc", "what", 49
        );
        applicationList.add(application);
        application = new Application(
                "Whatsapp", "Facebook Inc", "what", 49
        );
        applicationList.add(application);
        application = new Application(
                "Whatsapp", "Facebook Inc", "what", 49
        );
        applicationList.add(application);
        application = new Application(
                "Whatsapp", "Facebook Inc", "what", 49
        );
        applicationList.add(application);
        application = new Application(
                "Whatsapp", "Facebook Inc", "what", 49
        );
        applicationList.add(application);
        application = new Application(
                "Whatsapp", "Facebook Inc", "what", 49
        );
        applicationList.add(application);

    }
}
