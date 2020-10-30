package model;

public class Jogador {
	
	public int Id;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getClubeId() {
		return ClubeId;
	}
	public void setClubeId(int clubeId) {
		ClubeId = clubeId;
	}
	public int getPosicaoId() {
		return PosicaoId;
	}
	public void setPosicaoId(int posicaoId) {
		PosicaoId = posicaoId;
	}
	public String Nome;
	public int ClubeId;
	public int PosicaoId;
	

}
