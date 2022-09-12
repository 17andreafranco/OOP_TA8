package activity;

public class ElectricalAppliance {

	final float PRICE = 100;
	final String COLOR = "white";
	final char ENERGY = 'F';
	final float WEIGHT = 5;

	protected double basePrice = PRICE;
	protected String color = COLOR;
	protected char eneCons = ENERGY;
	protected float weight = WEIGHT;

	public ElectricalAppliance() {

	}

	public ElectricalAppliance(float basePrice, float weight) {
		this.basePrice = basePrice;
		this.weight = weight;
	}

	public ElectricalAppliance(float basePrice, String color, char eneCons, float weight) {

		this.basePrice = basePrice;
		this.color = colorCheck(color);
		this.eneCons = energyCheck(eneCons);
		this.weight = weight;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public String getColor() {
		return color;
	}

	public char getEneCons() {
		return eneCons;
	}

	public float getWeight() {
		return weight;
	}

	/*Comprobación si la letra introducida por el usuario corresponde a un valor
	 correcto de consumo electrico*/

	private char energyCheck(char letter) {

		char letterUp = Character.toUpperCase(letter);

		String energyConsume = "ABCDEF";

		if (energyConsume.indexOf(letterUp) != -1) {
			return letterUp;
		}

		return ENERGY;
	}
	
	/* Comprobación si el color introducida por el usuario corresponde a un valor
	 correcto de las posibles opciones a elejir*/
	private String colorCheck(String color) {

		String colors[] = { "white", "black", "red", "blue", "grey" };

		for (int i = 0; i < colors.length; i++) {
			if (colors[i].equalsIgnoreCase(color)) {
				return color;
			}
		}

		return COLOR;
	}

}
