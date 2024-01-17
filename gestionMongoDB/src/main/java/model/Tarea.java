package model;

import java.util.Date;

import org.bson.types.ObjectId;

import com.google.gson.Gson;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tarea {
	private String _id;
	private String nombre;
	private String descripcion;
	private String estado;
	private Date fecha_vencimiento;
	private ObjectId id_proyecto;

	public String toJson() {
		return new Gson().toJson(this);
	}

	public static Proyecto fromJson(String json) {
		return new Gson().fromJson(json, Proyecto.class);
	}
}
