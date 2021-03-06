package lago;

public class Rio implements Runnable {
	private int id;
	private Lago l;
	private int verter;
	private Peterson s;

	public Rio(int id, Lago l, int verter) {
		this.id = id;
		this.l = l;
		this.verter = verter;
	}

	public void run() {
		for (int i = 0; i < verter; i++)
			if (id == 0) {
				s.preProt0();
				l.incRio0();
				s.postProt0();
			}
			else {
				s.preProt1();
				l.incRio1();
				s.postProt1();
			}
	}
}
