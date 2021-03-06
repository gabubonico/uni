package lago;

public class Presa implements Runnable {
	private int id;
	private Lago l;
	private int drenar;
	private Peterson s;

	public Presa(int id, Lago l, int drenar) {
		this.id = id;
		this.l = l;
		this.drenar = drenar;
	}

	public void run() {
		for (int i = 0; i < drenar; i++)
			if (id == 0) {
				s.preProt0();
				l.decPresa0();
				s.postProt0();
			}
			else {
				s.preProt1();
				l.decPresa1();
				s.postProt1();
			}
	}
}
