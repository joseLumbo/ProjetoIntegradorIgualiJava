package br.com.generation.igualijava;



public class Cadastro {
	

	// Atributos
	private String nome;
	private String identiGenero; 
	private String OrientSexo;
	private String etnia;
	private double renda;

	// Métodos de ação --> getters and setters
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getIdentiGenero() {
			return identiGenero;
		}
		public void setIdentiGenero(String identiGenero) {
			this.identiGenero = identiGenero;
		}
		public String getOrientSexo() {
			return OrientSexo;
		}
		public void setOrientSexo(String orientSexo) {
			OrientSexo = orientSexo;
		}
		public String getEtnia() {
			return etnia;
		}
		public void setEtnia(String etnia) {
			this.etnia = etnia;
		}
		public double getRenda() {
			return renda;
		}
		public void setRenda(double renda) {
			this.renda = renda;
		}
	}