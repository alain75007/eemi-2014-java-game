package com.myschool.mygame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

/**
 *  Notre classe MainActivity est fille de ActionBarActivity
 *  
 */
public class MainActivity extends ActionBarActivity {

	/** 
	 * @Override indique au compilateur que la méthode onCreate remplace une 
	 * méthode de la classe parente 
	 * 
	 * Pour connaitre la liste des méthodes remplaçable, selectionnez utilisez
	 * le menu Source->Override/Implement Methods...
	 * 
	 */
    @Override
    /**
     * La méthode onCreate est exécutée lorsque l'activité est crée
     * 
     * @param  savedInstanceState un objet qui contient l'état de l'activité avant d'avoir été mise en pause
     *                           cela peut servir pour restaurer son état
     * @see    android.support.v7.app.ActionBarActivity#onCreate(android.os.Bundle)
     */
    protected void onCreate(Bundle savedInstanceState) {
    	
    	/**
    	 *  On appele la méthode parente afin que les actions par défaut soient exécutées
    	 * Pour connaitre la liste des méthodes que l'on peut remplacer
    	 *   
    	 */
        super.onCreate(savedInstanceState); 
        
        /**
         *  On indique ici quel layout afficher : 
         *  
         **/
        setContentView(R.layout.activity_main);
    }

    /**
     * Cette méthode permet de générer le menu option de l'android à l'aide
     * d'une tableau de chaîne de caractère (fichier res/menu/main.xml)
     * 
     * @see android.app.Activity#onCreateOptionsMenu(android.view.Menu)
     * 
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
    	// Création du menu :
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    /**
     * Cette méthode est exécutée lorsque l'utilisateur clique sur un item du menu options
     * 
     * @param item: return l'objet MenuItem représantant l'item choisi.
     * 
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
    /**
     *  Dans le layout (activity_main.xml), nous avons indiqué pour chaque boutons 
     * représentant un guerrier, qu'il fallait
     * démarrer la méthode onBtnClick lorsque  l'utilisateur clique sur le bouton
     * 
     */
    public void onBtnClick(View myButton) {
    	
    	/**
    	 *  On récupère la vue correspondant à l'image centrale 
    	 *  
    	 */
    	View charImage = findViewById(R.id.act_main_view_character_image);
    	
    	/* On configure l'image de l'ImageView, selon le bouton cliqué */
    	switch (myButton.getId()) {
    	case R.id.act_game_view_charName: 
			 ((ImageView) charImage).setImageResource(R.drawable.ic_launcher);
        	//Toast.makeText(this, "Button 1 Click", Toast.LENGTH_SHORT).show();
		    //((TextView) findViewById(R.id.act_main_view_btn_go)).setText("toto");

        	break;
		case R.id.act_main_view_btn_2:
			 ((ImageView) charImage).setImageResource(R.drawable.ic_archer);
			 //Toast.makeText(this, "Button 1 Click", Toast.LENGTH_SHORT).show();
			 break;
    	}
    }
    
    /**
     *  Dans le layout (activity_main.xml), nous avons indiqué, pour le bouton 
     * d'id act_main_view_btn_go, qu'il fallait
     * démarrer la méthode goBtnClick lorque que l'utilisateur clique sur le
     * bouton
     * 
     */
    public void goBtnClick(View button) {
    	/* On récupère l'objet View où l'utilisateur entre un nom de personnage */
    	View charName = findViewById(R.id.act_main_view_character_name);
    	
    	/* On teste si le champ est vide */
    	if (((EditText) charName).getText().toString().equals("")) {
    		/**
    		 *  Si oui, on envoit un message court de notification 
    		 *
    		 **/
    		Toast.makeText(this, "Spécifiez un nom de personnage!!!", Toast.LENGTH_SHORT).show();
    	}
    	else {
    		/**
    		 *  Non, on stocke le nom du personnage dans l'objet Init 
    		 *  
    		 */
    		Init init = (Init) this.getApplicationContext();
    		init.charName =((EditText) charName).getText().toString();

    		/**
    		 *  Puis on crée un objet Intent que l'on utilisera pour demander 
    		 * au système Android de démarrer l'activité GamaActivity 
    		 * 
    		 */
    		Intent intent = new Intent(this, GameActivity.class);
    		
    		/**
    		 *  On demande au système Android de démarrer l'activité GameActivity, 
    		 *  
    		 */
    		startActivity(intent);	
    	}
    	
    }
}
