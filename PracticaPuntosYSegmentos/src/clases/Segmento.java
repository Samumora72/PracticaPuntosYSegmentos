package clases;

	public class Segmento {
		public Punto a;
		public Punto b;
		public Segmento(Punto a, Punto b) {
			if(a.toString() == b.toString()) {
				throw new IllegalArgumentException("Los puntos no pueden ser exactamente iguales");
			}
			this.a = a;
			this.b = b;
		}
		public Segmento() {
			this.a = new Punto(0, 0);
			this.b = new Punto(1, 1);
		}
		public void seta(Punto a) {
			this.a = a;
		}
		public Punto geta() {
			return this.a;
		}
		public void setb(Punto b) {
			this.b = b;
		}
		public Punto getb() {
			return this.b;
		}
		public String toString() {
			return "[ " + this.a + "," + this.b + " ]";
		}
		
		
		public double Distancia() {
			return Math.sqrt(Math.pow((b.x - a.x), 2)+ Math.pow((b.y - b.x), 2));
		
	

    }
}

	
	
	 

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	

