package solid.lsp.exercise;

public class Point2D {

	protected final int x;
	protected final int y;
	
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (getClass() != obj.getClass())
			return false;
		Point2D other = (Point2D) obj;
		return x == other.x && y == other.y;
	}
	
	public double distance (Point2D other) {
		int distX = x - other.x;
		int distY = y - other.y;
		return Math.sqrt( distX * distX + distY * distY);
	}

	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}
	
	
}
