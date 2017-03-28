package fakecompany.aliniribeiro.com.atmempresaconsultoria;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView services;
    private ImageView company;
    private ImageView contact;
    private ImageView clients;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        services = (ImageView) findViewById(R.id.services);
        company = (ImageView) findViewById(R.id.company);
        contact = (ImageView) findViewById(R.id.contact);
        clients = (ImageView) findViewById(R.id.client);


        services.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ServicesActivity.class));
            }
        });

        company.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CompanyActivity.class));
            }
        });

        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ContactActivity.class));
            }
        });

        clients.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ClientsActivity.class));
            }
        });


    }
}
