package br.com.caraoucoroa.cursoandroid.allinedelara.caraocoroa;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DetalheActivity extends AppCompatActivity {

    private ImageView bntVoltar;
    private ImageView moeda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        moeda = (ImageView) findViewById(R.id.imagemId);
        Bundle extra = getIntent().getExtras();

        if(extra!=null){
            String opcaoEscolhida = extra.getString("opcao");

            if(opcaoEscolhida.equals("cara")){
                moeda.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_cara));
            }else{
                moeda.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_coroa));
            }
        }

        bntVoltar = (ImageView) findViewById(R.id.btnVoltarId);
        bntVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DetalheActivity.this, MainActivity.class));
            }
        });
    }
}
