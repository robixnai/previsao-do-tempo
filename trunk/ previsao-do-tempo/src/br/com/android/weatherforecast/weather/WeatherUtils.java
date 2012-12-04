package br.com.android.weatherforecast.weather;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

/**
 * Utilitarios
 * @author Felipe Cobello
 *
 */
public class WeatherUtils {

	public static int fahrenheitToCelsius(int tFahrenheit) 
	{
		return (int) ((5.0f / 9.0f) * (tFahrenheit - 32));
	}

	public static int celsiusToFahrenheit(int tCelsius) 
	{
		return (int) ((9.0f / 5.0f) * tCelsius + 32);
	}
	
	public static boolean checkInternet(Context ctx) 
	{
	    NetworkInfo info = (NetworkInfo) ((ConnectivityManager) ctx.getSystemService(Context.CONNECTIVITY_SERVICE)).getActiveNetworkInfo();
	    
	    if (info == null || !info.isConnected()) 
	        return false;
	    if (info.isRoaming())
	        return false;
	    return true;
	}
	
	public static void showMessage(Context context, String msg)
	{	
		Toast.makeText(context, (CharSequence) msg, Toast.LENGTH_LONG).show();
	}
	
	public static String captalizeWords(String words)
	{
		char[] caracteres = words.toLowerCase().toCharArray();
		
		for (int i = 0; i < caracteres.length; i++)
		{
			if(i == 0 || caracteres[i-1] == ' ')
			{
				caracteres[i] = Character.toUpperCase(caracteres[i]);
			}
		}
		return new String(caracteres);
	}
	
	public static String trataAcento(String texto)
	{
		//Acento Agudo
		texto = texto.replace("�", "&aacute;");
		texto = texto.replace("�", "&eacute;");
		texto = texto.replace("�", "&iacute;");
		texto = texto.replace("�", "&oacute;");
		texto = texto.replace("�", "&uacute;");
		texto = texto.replace("�", "&Aacute;");
		texto = texto.replace("�", "&Eacute;");
		texto = texto.replace("�", "&Iacute;");
		texto = texto.replace("�", "&Oacute;");
		texto = texto.replace("�", "&Uacute;");
		//Acento Circunflexo
		texto = texto.replace("�", "&acirc;");
		texto = texto.replace("�", "&ecirc;");
		texto = texto.replace("�", "&icirc;");
		texto = texto.replace("�", "&ocirc;");
		texto = texto.replace("�", "&ucirc;");
		texto = texto.replace("�", "&Acirc;");
		texto = texto.replace("�", "&Ecirc;");
		texto = texto.replace("�", "&Icirc;");
		texto = texto.replace("�", "&Ocirc;");
		texto = texto.replace("�", "&Ucirc;");
		//Acento Til
		texto = texto.replace("�", "&atilde;");
		texto = texto.replace("�", "&otilde;");
		texto = texto.replace("�", "&Atilde;");
		texto = texto.replace("�", "&Otilde;");
		return texto;
	}
}
