package br.com.java;

import org.json.JSONException;
import org.json.JSONObject;

public class EstudoJSON {

	public static void main(String[] args) throws JSONException {
		// TODO Auto-generated method stub
		adicaoSimplesDeDados();
		adicaoDeUmObjeto();
	}
	
	// Armazenando com objeto do tipo Carro

	private static void adicaoDeUmObjeto() throws JSONException {
		// TODO Auto-generated method stub
		Carro carro = new Carro();
		carro.setId(1l);
		carro.setModelo("celta");
		carro.setPlaca("AAA123");
		
		JSONObject carroJson = new JSONObject();
		carroJson.put("Carro", carro);
		
		System.out.println(carroJson);
		
	}

	private static void adicaoSimplesDeDados() throws JSONException {
		// TODO Auto-generated method stub
		Carro carro = new Carro();
		carro.setId(1l);
		carro.setModelo("celta");
		carro.setPlaca("AAA123");
		
		JSONObject carroJson = new JSONObject();
		carroJson.put("id", carro.getId());
		carroJson.put("Modelo", carro.getModelo());
		carroJson.put("Placa", carro.getPlaca());
		
		System.out.println(carroJson);
		
		System.out.println(carroJson.get("Modelo"));
	}

}
