package Repository;

import java.util.ArrayList;
import java.util.List;

import model.Ingresso;

public class IngressoRepository {

	public List<Ingresso> listaIngresso = new ArrayList<Ingresso>();
	
	public Ingresso getIngresso() {
		return new Ingresso();
	}
	
	public List<Ingresso>GetAllIngresso(){
		return new ArrayList<Ingresso>();
	}
	
	public void setIngresso(Ingresso ingresso) {
		
	}
}
