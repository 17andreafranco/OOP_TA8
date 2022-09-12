package activity;

import java.security.SecureRandom;

public class Password {

	private int length = 8;
	private String password = "";

	public Password() {

	}

	public Password(int length) {
		this.length = length;
	}

	/*
	 * Generación de una clave aleatoria segun la longitud introducida por el
	 * usuario al generar el objeto
	 */

	public void randomPassword() {

		final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

		SecureRandom random = new SecureRandom();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < this.length; i++) {
			int randomIndex = random.nextInt(chars.length());
			sb.append(chars.charAt(randomIndex));
		}

		this.password = sb.toString();

		System.out.println(this.password);

	}

}
