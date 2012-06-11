package org.android.roboxito.hackercave;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.*;
import org.android.roboxito.hackercave.InstalacionesActivity; 

public class HackercaveActivity extends Activity {
    /** Called when the activity is first created. */
	
	Button btnInstalaciones,
			btnUbicacion,
			btnStartups,
			btnIntegrantes;
	static HackercaveActivity app;
	
	public static final String TITULO ="titulo";
	public static String cadena;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        app=this;
        final String mimeType = "text/html";
        final String encoding = "utf-8";
        
        btnInstalaciones=(Button) findViewById(R.id.btnInstalaciones);
        btnUbicacion=(Button) findViewById(R.id.btnUbicacion);
        btnStartups=(Button) findViewById(R.id.btnStartups);
        btnIntegrantes=(Button) findViewById(R.id.btnIntegrantes);
        
        OnClickListener cl=new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent ventana=null ;
				ventana= (new Intent(app.getBaseContext(), InstalacionesActivity.class));				
				ventana.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP | Intent.FLAG_ACTIVITY_CLEAR_TOP);								
				ventana.putExtra(TITULO, v.getId());				
				startActivity(ventana);
				Log.v("app", "inicio");
			}
		}; 
        
        btnInstalaciones.setOnClickListener(cl);        
        btnUbicacion.setOnClickListener(cl);
        btnStartups.setOnClickListener(cl);        
        btnIntegrantes.setOnClickListener(cl);
//        
//        WebView wv;
//        
//        wv = (WebView) findViewById(R.id.wv1);
//        //wv.loadData("<a href='x'>Hello World! - 1</a>", mimeType, encoding);
//        wv.setInitialScale(60);
//        //wv.loadUrl("file:///android_asset/startups/startups.html");
//        wv.loadUrl("file:///android_asset/inicio/inicio.html");
//        
    }
}