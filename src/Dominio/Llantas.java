package Dominio;

public class Llantas {
	private long codigoDeBarra;
	private String marca;
	private String medidas;
	private float precio;
	private int exitencia;
	
	public Llantas(long codigoDeBarra, String marca, String medidas, float precio, int exitencia) {
		this.codigoDeBarra = codigoDeBarra;
		this.marca = marca;
		this.medidas = medidas;
		this.precio = precio;
		this.exitencia = exitencia;
	}

	@Override
	public String toString() {
		return "Llantas [codigoDeBarra=" + codigoDeBarra + ", marca=" + marca + ", medidas=" + medidas + ", precio="
				+ precio + ", exitencia=" + exitencia + "]";
	}

	public long getCodigoDeBarra() {
		return codigoDeBarra;
	}

	public void setCodigoDeBarra(long codigoDeBarra) {
		this.codigoDeBarra = codigoDeBarra;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMedidas() {
		return medidas;
	}

	public void setMedidas(String medidas) {
		this.medidas = medidas;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getExitencia() {
		return exitencia;
	}

	public void setExitencia(int exitencia) {
		this.exitencia = exitencia;
	}
	
	
	
	
}
