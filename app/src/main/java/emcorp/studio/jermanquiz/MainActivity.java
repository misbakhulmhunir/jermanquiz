package emcorp.studio.jermanquiz;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnMenuBelajar, btnMenuPercobaan, btnMenuLatihan, btnMenuTentang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        btnMenuBelajar = (Button)findViewById(R.id.btnMenuBelajar);
        btnMenuPercobaan = (Button)findViewById(R.id.btnMenuPercobaan);
        btnMenuLatihan = (Button)findViewById(R.id.btnMenuLatihan);
        btnMenuTentang = (Button)findViewById(R.id.btnMenuTentang);

        btnMenuBelajar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,MenuBelajarActivity.class);
                startActivity(i);
                finish();
            }
        });

        btnMenuPercobaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,HomePercobaanActivity.class);
                startActivity(i);
                finish();
            }
        });

        btnMenuLatihan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,LatihanActivity.class);
                startActivity(i);
                finish();
            }
        });

        btnMenuTentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,MenuTentangActivity.class);
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle(R.string.app_name);
        builder.setIcon(R.drawable.ic_logo);
        builder.setMessage("Jadi ingin keluar?")
                .setCancelable(false)
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        System.exit(0);
                        finish();
                    }
                })
                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();

    }
}
