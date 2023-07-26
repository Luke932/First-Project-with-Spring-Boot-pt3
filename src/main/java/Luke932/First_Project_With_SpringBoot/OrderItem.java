package Luke932.First_Project_With_SpringBoot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Scope("prototype")
public class OrderItem {
	private Item item;
	private List<String> variations;
	private String note;
	private Margherita name;
	private double price;

	public OrderItem(Item item) {
		this.item = item;
		this.variations = new ArrayList<>();
		this.note = "";
	}

	public void addVariation(String variation) {
		variations.add(variation);
	}

	public OrderItem(Margherita margherita1, double price) {
		this.name = margherita1;
		this.price = price;
	}

	public void removeVariation(String variation) {
		variations.remove(variation);
	}

	public void addNote(String note) {
		this.note += note;
	}

	public void removeNote() {
		this.note = "";
	}
}