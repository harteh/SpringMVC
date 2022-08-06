package co.jw.sol.beans;

public class FoodData {
	
//	알러지여부, 전체요리, 메인요리, 디저트
	private String allergy;
	private String entree;
	private String plat;
	private String dessert;
	
	
	public String getAllergy() {
		return allergy;
	}
	public void setAllergy(String allergy) {
		this.allergy = allergy;
	}
	public String getEntree() {
		return entree;
	}
	public void setEntree(String entree) {
		this.entree = entree;
	}
	public String getPlat() {
		return plat;
	}
	public void setPlat(String plat) {
		this.plat = plat;
	}
	public String getDessert() {
		return dessert;
	}
	public void setDessert(String dessert) {
		this.dessert = dessert;
	}

	
}
