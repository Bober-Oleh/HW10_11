package NewHomework;

public abstract class Candy implements Comparable<Candy> {
	private String kind; // вид конфеты
	private int weight; // вес конфеты
	private int sugar; // высота коробки

	// Конструктор, используемый при указании всех измерений
	public Candy(String k, int w, int s) {
		this.kind = k;
		this.weight = w;
		this.sugar = s;

	}

	public String getKind() {
		return kind;
	}

	public int getWeight() {
		return weight;
	}

	public int getSugar() {
		return sugar;
	}
	public void setKinde(String kind) {
		this.kind = kind;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	@Override
	public String toString() {
		return "Name: " + this.kind + "\t" + "Weight: " + this.weight + "\t" 
						+ "Sugar: " + this.sugar;
	}

	@Override
	public int compareTo (Candy o) {
		return this.kind.compareTo(o.kind);
	}
}