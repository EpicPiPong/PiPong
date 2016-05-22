
public class Movable {

	double x, y, velx, vely;
	
	
	public Movable (double x, double y, double velx, double vely){
		this.x=x;
		this.y=y;
		this.velx=velx;
		this.vely=vely;
		}
	
	public void update(){
		System.out.println("xold="+x);
		System.out.println("yold="+y);
		this.x=velx+x;
		this.y=vely+y;
		System.out.println("x="+x);
		System.out.println("y="+y);
		
	}
	
	
	
	
}
