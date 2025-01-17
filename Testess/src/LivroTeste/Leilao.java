package LivroTeste;

import java.util.ArrayList;

public class Leilao {

	private String descricao;
	private ArrayList<Lance> lances;

	public Leilao() {
	}

	public Leilao(String descricao) {
		super();
		this.setDescricao(descricao);
        this.lances = new ArrayList<>(); // Inicializa a lista de lances

	}

	public Leilao(String descricao, ArrayList<Lance> lances) {
		super();
		this.setDescricao(descricao);
		this.lances = lances;
	}

	public void propoe(Lance lance) {
		this.lances.add(lance);

	}

	public ArrayList<Lance> getLances() {
		return lances;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
