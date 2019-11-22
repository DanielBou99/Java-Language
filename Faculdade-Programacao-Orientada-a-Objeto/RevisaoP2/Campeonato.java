package RevisaodaP2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Campeonato {

	ArrayList<Time> times = new ArrayList<Time>();
	
	public void addTime(Time time) {
		times.add(time);
	}
	public void removeTime(String nome) {
		Time time = new Time(nome);
		if (!this.times.remove(time)) {
			throw new TimeException("Time não encontrado.");
		}
	}
	public Time getTime(String time) {
		for (Time x: this.times) {
			if (time.compareTo(x.getNome()) == 0) {
				return x;
			}
		}
		throw new TimeException("Time não encontrado.");
	}
	public List<Time> getClassificacao() {
		for (Time x: this.times) {
			x.calcularPontos();
		}
		ArrayList<Time> timesOrdenados = new ArrayList<Time>(this.times);
		Collections.sort(timesOrdenados, new Comparator() {
			public int compare(Object o1, Object o2) {
			Time p1 = (Time) o1;
			Time p2 = (Time) o2;
			return p1.getPontos() - p2.getPontos();
			}
		});
		return Collections.unmodifiableList(timesOrdenados);
	}
	
	
	public void printar() {
		for (Time x: this.times) {
			System.out.println("Nome: " + x.getNome());
		}
	}
	
}