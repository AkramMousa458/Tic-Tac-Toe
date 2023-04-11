package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddPlayers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_add_players);

        EditText playerOne, playerTwo;

        playerOne = (EditText) findViewById(R.id.playerOne);
        playerTwo = (EditText) findViewById(R.id.playerTwo);

        Button startGameButton = findViewById(R.id.startGameButton);

        startGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String playerOneName = playerOne.getText().toString();
                String playerTwoName = playerTwo.getText().toString();

                if (playerOneName.isEmpty() || playerTwoName.isEmpty()){
                    Toast.makeText(AddPlayers.this, "Please Enter Player Name", Toast.LENGTH_SHORT).show();
                }else {
                    Intent intent = new Intent(AddPlayers.this, MainActivity.class);
                    intent.putExtra("playerOne", playerOneName);
                    intent.putExtra("playerTwo", playerTwoName);
                    startActivity(intent);
                }

            }
        });
    }
}