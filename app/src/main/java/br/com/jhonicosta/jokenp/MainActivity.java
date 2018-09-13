package br.com.jhonicosta.jokenp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView escolhaApp, pedra, papel, tesoura;
    private TextView resultado;

    private Game game;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        escolhaApp = findViewById(R.id.escolha_app);
        pedra = findViewById(R.id.pedra);
        papel = findViewById(R.id.papel);
        tesoura = findViewById(R.id.tesoura);
        resultado = findViewById(R.id.resultado);

        pedra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                game = new Game();
                setJogada(game.jogadaCPU());
                resultado.setText(game.jogada(TipoJogadas.PEDRA));
            }
        });

        papel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                game = new Game();
                setJogada(game.jogadaCPU());
                resultado.setText(game.jogada(TipoJogadas.PAPEL));
            }
        });
        tesoura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                game = new Game();
                setJogada(game.jogadaCPU());
                resultado.setText(game.jogada(TipoJogadas.TESOURA));
            }
        });
    }

    private void setJogada(int jogada){
        if(jogada == 0){
            escolhaApp.setImageResource(R.drawable.pedra);
        }
        if(jogada == 1){
            escolhaApp.setImageResource(R.drawable.papel);
        }
        if(jogada == 2){
            escolhaApp.setImageResource(R.drawable.tesoura);
        }
    }

}
