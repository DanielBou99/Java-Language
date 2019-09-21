package Tanque;

public class Vip {
	
	private float volumeMax;
	private float volumeMin;
	private float volumeAtual;
	private boolean bomba;
	
	public Vip( float volumeAtual) {
		this.volumeAtual = volumeAtual;
	}
	
	public void encher(float litros) {
		this.volumeAtual += litros;
		if (this.volumeAtual > this.volumeMax) {
			this.bomba = false;
		}
	}

	public float getVolumeMax() {
		return volumeMax;
	}

	public void setVolumeMax(float volumeMax) {
		this.volumeMax = volumeMax;
		if (this.volumeAtual > volumeMax) {
			this.bomba = false;
		}
	}

	public float getVolumeMin() {
		return volumeMin;
	}

	public void setVolumeMin(float volumeMin) {
		this.volumeMin = volumeMin;
		if (this.volumeAtual < volumeMin) {
			this.bomba = true;
		}
	}

	public float getVolumeAtual() {
		return volumeAtual;
	}
	
	public void esvaziar(float litros) {
		this.volumeAtual -= litros;
		if (this.volumeAtual < this.volumeMin) {
			this.bomba = true;
		}
	}
	
	public String exibirInfos() {
		String infos = "Volume atual: " + this.volumeAtual + "\nVolume Max: " + this.volumeMax + "\nVolume Min: " + this.volumeMin;
		return infos;
	}
	
	public boolean getBomba() {
		return this.bomba;
	}
}
