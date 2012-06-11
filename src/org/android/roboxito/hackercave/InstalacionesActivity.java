package org.android.roboxito.hackercave;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class InstalacionesActivity extends Activity {
	
	TextView lblTitulo;
	Button btnHome;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.instalaciones);
		Bundle extras = getIntent().getExtras();
		int idTitulo=extras.getInt(HackercaveActivity.TITULO);
		String cadena="";
		btnHome=(Button) findViewById(R.id.btnHome);
		btnHome.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent home=null ;
				home= (new Intent(v.getContext(), HackercaveActivity.class));				
				home.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP | Intent.FLAG_ACTIVITY_CLEAR_TOP);								

				startActivity(home);
	
			}
		});
		WebView wv;
		  
		wv = (WebView) findViewById(R.id.wv1);
		  //wv.loadData("<a href='x'>Hello World! - 1</a>", mimeType, encoding);
		wv.setInitialScale(60);
		  //wv.loadUrl("file:///android_asset/startups/startups.html");

		if(idTitulo==R.id.btnInstalaciones ) {								
			cadena="Instalaciones";
		      wv.loadUrl("file:///android_asset/instalaciones/instalaciones.html");

		}			
		else if(idTitulo==R.id.btnUbicacion ) {								
			cadena="Ubicación";
		      wv.loadUrl("file:///android_asset/ubicacion/ubicacion.html");

		}
		else if(idTitulo==R.id.btnStartups ) {								
			cadena="Startups";
		      wv.loadUrl("file:///android_asset/startups/startups.html");
		}
		else if(idTitulo==R.id.btnIntegrantes ) {								
			cadena="Integrantes";
		      wv.loadUrl("file:///android_asset/integrantes/integrantes.html");
		}
		
		lblTitulo=(TextView) findViewById(R.id.lblTitulo);
		lblTitulo.setText(cadena);
		
		
		
		
		

	}
}
