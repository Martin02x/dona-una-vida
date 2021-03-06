package pe.edu.upc.donacion.models.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "distritos")
public class Distrito {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nombre", length = 25, nullable = false)
	private String nombre;
	
	@OneToMany(mappedBy = "distrito")
	private List<Hospital> hospitales;
	
	@OneToMany(mappedBy = "distrito")
	private List<Donante> donantes;
}