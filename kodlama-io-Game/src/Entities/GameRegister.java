package Entities;

public class GameRegister {
	private String nameOfGame;
	private float price;
	private String content;
	private String[] labels;
	private String producedBy;
	
	public String getNameOfGame() {
		return nameOfGame;
	}
	public void setNameOfGame(String nameOfGame) {
		this.nameOfGame = nameOfGame;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String[] getLabels() {
		return labels;
	}
	public void setLabels(String[] labels) {
		this.labels = labels;
	}
	public String getProducedBy() {
		return producedBy;
	}
	public void setProducedBy( String producedBy) {
		this.producedBy = producedBy;
	}
}
