package Repository;

import java.util.ArrayList;
import java.util.List;

import model.Partida;

public class PartidaRepository {

	public List<Partida> ListaPartida = new ArrayList<Partida>();
	
	public Partida getPatida() {
		return new Partida();
	}
	public List<Partida> GetAllPartida(){
		return new ArrayList<Partida>();
	}
	
	public void SetPartida(Partida partida) {
		
	}
	
}
