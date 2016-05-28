package com.example.repositorio;

import java.util.Arrays;
import java.util.List;

import com.example.dominio.Alumno;

public class AlumnoRepositorio {
	Alumno[] data = {
		new Alumno("Juan", "Perez", 16),
		new Alumno("Maria", "Castro", 14),
		new Alumno("Jose", "Ruiz", 18),
	};

	public List<Alumno> listarordepromedio() {

	List<Alumno> alumnos=Arrays.asList(data);
	Collections.sort(alumnos , new Comparator<Alumno>() {
	@Override
		public int compare(Alumno a1,Alumno a2) {
			return a1.promedio.compareTo(a2.promedio);
		}
	});
		return alumnos;
	}

	List<Alumno> alumnos=Arrays.asList(data);
	Collections.sort(alumnos , new Comparator<Alumno>() {
	@Override
		public int compare(Alumno a1,Alumno a2) {
			return a1.apellidoPaterno.compareTo(a2.apellidoPaterno);
		}
	});
		return alumnos;
	}

	List<Alumno> alumnos=Arrays.asList(data);
	Collections.sort(alumnos , new Comparator<Alumno>() {
	@Override
		public int compare(Alumno a1,Alumno a2) {
			return a1.nombres.compareTo(a2.nombres);
		}
	});
		return alumnos;
	}
	
	public List<Alumno> listar() {
		return Arrays.asList(data);
	}


}
