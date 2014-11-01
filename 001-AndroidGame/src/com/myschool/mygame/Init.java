package com.myschool.mygame;

import android.app.Application;
/*
 *  La classe Application est fournie par le SDK Android
 *
 * Elle est automatiquement instanciée au lancement de l'application.
 * L'objet Application peut être récupéré dans n'importe-qu'elle activité 
 * à l'aide de la méthode this.: où à l'aide de l'instruction:
 *      this.getApplicationContext();
 *
 * Il est possible de créer une classe fille, pour stocker les méthodes et les variables
 * Communes à toutes les activités. C'est ce qui est fait ici.
 * 
 * Pour que le système Android instancie cette classe fille et non la classe Application,
 * Il suffit de lui indiquer en mettant à jour le fichier AndroidManifest :
 * 
 * 		<application
 *         .
 *         .
 *         android:name="Init"
 *         .
 *         .
 *
 */
public class Init extends Application {
String charName;
}
