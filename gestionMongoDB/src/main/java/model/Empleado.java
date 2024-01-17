package model;


import com.google.gson.Gson;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Empleado {
	private String _id;
	private String nombre;
	private String puesto;

	public String toJson() {
		return new Gson().toJson(this);
	}

	public static Proyecto fromJson(String json) {
		return new Gson().fromJson(json, Proyecto.class);
	}
}
