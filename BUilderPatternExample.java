package com.vrg.design.creational;

class Vechile {
	private String engine;
	private int wheel;
	private int airbags;

	public String getEngine() {
		return this.engine;
	}

	public int getWheel() {
		return this.wheel;
	}

	public int getAirbags() {
		return this.airbags;
	}

	private Vechile(VechileBuilder builder) {
		this.engine = builder.engine;
		this.wheel = builder.wheel;
		this.airbags= builder.airbags;
	}
	
	static class VechileBuilder {
		
		private String engine;
		private int wheel;
		private int airbags;

		public VechileBuilder(String engine, int wheel) {
			this.engine = engine;
			this.wheel = wheel;
		}

		public VechileBuilder setAirbags(int airbags) {
			this.airbags = airbags;
			return this;
		}

		public Vechile build() {
			return new Vechile(this);
		}

	}//static class VechileBuilder
}//class Vechile



public class BUilderPatternExample {

	public static void main(String[] args) {
		Vechile car = new Vechile.VechileBuilder("15000", 4).setAirbags(4).build();
		Vechile bike = new Vechile.VechileBuilder("250", 2).build();
		
		System.out.println(car.getEngine());
		System.out.println(car.getWheel());
		System.out.println(car.getAirbags());
		
		System.out.println("---------------------");
		System.out.println(bike.getEngine());
		System.out.println(bike.getWheel());
		System.out.println(bike.getAirbags());

	}

}
