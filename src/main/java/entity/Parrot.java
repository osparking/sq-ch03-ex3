package entity;

import lombok.Data;

@Data
public class Parrot {
	private String name;
	private Integer count = 0;

	@Override
	public String toString() {
		return "Parrot [name=" + name + "]";
	}

	public Parrot() {
		super();
		System.out.println("Parrot count: " + ++count);
	}
	
}
