package Repository;

import java.util.ArrayList;
import java.util.List;

import model.Torcedor;

public class TorcedorRepository {


	public List<Torcedor> listaTorcedor = new ArrayList<Torcedor>();
	
	public Torcedor getTorcedor() {
		return new Torcedor();
	}
	
	public List<Torcedor> GetAllTorcedor(){
		return new ArrayList<Torcedor>();
		
	}
	
	public void setTorcedor(Torcedor torcedor) {
	}


	}

