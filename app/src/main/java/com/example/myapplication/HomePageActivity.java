package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.HashMap;
import java.util.Map;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.home_page);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Map<Integer, String[]> map = getMaps();

        ConstraintLayout game1  = findViewById(R.id.game1);
        ConstraintLayout game2  = findViewById(R.id.game2);
        ConstraintLayout game3 = findViewById(R.id.game3);
        LinearLayout game4  = findViewById(R.id.game4);
        LinearLayout game5  = findViewById(R.id.game5);
        LinearLayout game6  = findViewById(R.id.game6);
        LinearLayout game7  = findViewById(R.id.game7);
        LinearLayout game8  = findViewById(R.id.game8);
        LinearLayout game9  = findViewById(R.id.game9);
        LinearLayout game10  = findViewById(R.id.game10);
        LinearLayout game11  = findViewById(R.id.game11);
        LinearLayout game12  = findViewById(R.id.game12);

        game1.setClickable(true);
        game2.setClickable(true);
        game3.setClickable(true);
        game4.setClickable(true);
        game5.setClickable(true);
        game6.setClickable(true);
        game7.setClickable(true);
        game8.setClickable(true);
        game9.setClickable(true);
        game10.setClickable(true);
        game11.setClickable(true);
        game12.setClickable(true);

        game1.setOnClickListener(v -> {
            Intent intent = new Intent(HomePageActivity.this, Game1Activity.class);
            intent.putExtra("iron",map.get(1));
            startActivity(intent);
        });
        game2.setOnClickListener(v -> {
            Intent intent = new Intent(HomePageActivity.this, Game2Activity.class);
            intent.putExtra("iron",map.get(2));
            startActivity(intent);
        });
        game3.setOnClickListener(v -> {
            Intent intent = new Intent(HomePageActivity.this, Game3Activity.class);
            intent.putExtra("iron",map.get(3));
            startActivity(intent);
        });
        game4.setOnClickListener(v -> {
            Intent intent = new Intent(HomePageActivity.this, Game4Activity.class);
            intent.putExtra("iron",map.get(4));
            startActivity(intent);
        });
        game5.setOnClickListener(v -> {
            Intent intent = new Intent(HomePageActivity.this, Game5Activity.class);
            intent.putExtra("iron",map.get(5));
            startActivity(intent);
        });
        game6.setOnClickListener(v -> {
            Intent intent = new Intent(HomePageActivity.this, Game6Activity.class);
            intent.putExtra("iron",map.get(6));
            startActivity(intent);
        });
        game7.setOnClickListener(v -> {
            Intent intent = new Intent(HomePageActivity.this, Game7Activity.class);
            intent.putExtra("iron",map.get(7));
            startActivity(intent);
        });
        game8.setOnClickListener(v -> {
            Intent intent = new Intent(HomePageActivity.this, Game8Activity.class);
            intent.putExtra("iron",map.get(8));
            startActivity(intent);
        });
        game9.setOnClickListener(v -> {
            Intent intent = new Intent(HomePageActivity.this, Game9Activity.class);
            intent.putExtra("iron",map.get(9));
            startActivity(intent);
        });
        game10.setOnClickListener(v -> {
            Intent intent = new Intent(HomePageActivity.this, Game10Activity.class);
            intent.putExtra("iron",map.get(10));
            startActivity(intent);
        });
        game11.setOnClickListener(v -> {
            Intent intent = new Intent(HomePageActivity.this, Game11Activity.class);
            intent.putExtra("iron",map.get(11));
            startActivity(intent);
        });
        game12.setOnClickListener(v -> {
            Intent intent = new Intent(HomePageActivity.this, Game12Activity.class);
            intent.putExtra("iron",map.get(12));
            startActivity(intent);
        });


    }

    protected Map<Integer,String[]> getMaps(){
        Map<Integer, String[]> map = new HashMap<>();

        map.put(1,new String[]{"Forza Horizon",  "Forza is a top-tier racing franchise developed by Turn 10 Studios and Playground Games. Forza Motorsport focuses on realistic track racing, while Forza Horizon delivers an open-world arcade-style experience with stunning visuals, diverse environments, and a massive collection of cars."});
        map.put(2,new String[]{"Apex Legends",  "Apex Legends is a free-to-play battle royale hero shooter developed by Respawn Entertainment. Players compete in squads of three or duos, selecting from a roster of unique \"Legends,\" each with special abilities. The game features fast-paced movement, advanced gunplay, and a revolutionary ping system for communication. With regular seasonal updates introducing new Legends, weapons, and maps, Apex Legends continues to be a top contender in the battle royale genre."});
        map.put(3,new String[]{"Marvel Rivals",  "Marvel Rivals is an upcoming hero-based shooter that pits Marvel's iconic characters against each other in fast-paced, team-based battles. Developed by NetEase, the game blends Overwatch-style abilities with destructible environments and cooperative mechanics. Players can choose from a roster of heroes and villains, each bringing unique superpowers and playstyles, making for dynamic and action-packed matches."});
        map.put(4,new String[]{"Halo",  "Halo is a legendary first-person shooter franchise developed by Bungie and later 343 Industries. It follows the story of Master Chief, a supersoldier fighting against alien factions such as the Covenant and the Flood. The series is known for its gripping campaign, expansive lore, and tight multiplayer gameplay that has defined console shooters for decades. Halo Infinite, the latest installment, brings open-world exploration and a refined multiplayer experience."});
        map.put(5,new String[]{"Mortal Kombat",  "Mortal Kombat is a legendary fighting game franchise known for its brutal combat, iconic characters, and over-the-top fatalities. Developed by NetherRealm Studios, the series has evolved with deep mechanics, cinematic storylines, and intense competitive play. Mortal Kombat continues to push the boundaries of fighting games with its detailed animations and engaging gameplay."});
        map.put(6,new String[]{"God of War",  "God of War follows Kratos, a former Greek god, on a journey of vengeance and redemption. The latest entries in the series shift to Norse mythology, focusing on his relationship with his son, Atreus. Developed by Santa Monica Studio, the game blends brutal combat with emotional storytelling, earning widespread acclaim for its deep narrative and fluid gameplay."});
        map.put(7,new String[]{"Naruto",  "Naruto games, particularly the Naruto: Ultimate Ninja Storm series, bring the world of the beloved anime to life through fast-paced arena battles. Players control their favorite ninjas, performing flashy jutsus and ultimate moves in beautifully animated fights that stay true to the source material."});
        map.put(8,new String[]{"Street Fighter",  "Street Fighter is one of the most influential fighting game franchises, developed by Capcom. Known for its iconic characters like Ryu, Chun-Li, and Ken, it features precise inputs, special moves, and competitive depth. Street Fighter is a staple in esports and continues to evolve with new mechanics and refined gameplay."});
        map.put(9,new String[]{"Spiderman",  "Spider-Man is an open-world superhero game developed by Insomniac Games. It lets players swing through New York City as Peter Parker, battling classic villains, solving crimes, and uncovering a gripping story. The game’s fluid traversal system, engaging combat, and deep character development make it one of the best superhero games ever created."});
        map.put(10,new String[]{"Tekken",  "Tekken is a popular 3D fighting game series developed by Bandai Namco. It features deep combat mechanics, diverse characters, and a strong competitive scene. With its mix of martial arts styles and an ongoing story about the Mishima family feud, Tekken remains a favorite among fighting game enthusiasts."});
        map.put(11,new String[]{"Last of Us",   "The Last of Us is a cinematic action-adventure game developed by Naughty Dog, following Joel and Ellie as they struggle to survive in a post-apocalyptic world overrun by a fungal infection. The game is known for its emotional storytelling, realistic characters, and intense stealth-based combat. Its sequel, The Last of Us Part II, continues the story with even greater depth and complexity."});
        map.put(12,new String[]{"FC 25",   "EA FC is the premier football simulation series, now rebranded as EA Sports FC after FIFA’s license ended. The game offers realistic football gameplay, featuring official teams, leagues, and players, along with various modes like Career Mode, Ultimate Team, and Pro Clubs."});


        return map;
    }

}