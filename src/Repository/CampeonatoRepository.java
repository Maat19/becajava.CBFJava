package Repository;

import java.util.ArrayList;
import java.util.List;

import model.Campeonato;

public class CampeonatoRepository {

	public List<Campeonato> listaCampeonato = new ArrayList<Campeonato>();
	
	public Campeonato getCampeonato() {
		return new Campeonato();
	}
	
	public List<Campeonato> GetAllCampeoanto(){
		return new ArrayList<Campeonato>();
	}
	
	public void setCampeonato(Campeonato campeoanto) {
		
	}
}
