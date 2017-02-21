
public class Problem87 {
	public static void main(String[] args) {
		double[][] points = new double[][] {
			{-1, 0, 3},    {-1, -1, -1},
			{4, 1, 1},     {2, 0.5, 9},
			{3.5, 2, -1},  {3, 1.5, 3},
			{-1.5, 4, 2},  {5.5, 4, -0.5}
		};
		int point1 = 0;
		int point2 = 1;
		double shortestDis = pointDistance(points[point1][0], points[point1][1], points[point1][2],
				points[point2][0], points[point2][1], points[point2][2]);

		for (int i = 0; i < points.length; i++){
			for (int j = i + 1; j < points.length; j++){
				double distance = pointDistance(points[i][0], points[i][1], points[i][2],
						points[j][0], points[j][1], points[j][2]);

				if (shortestDis > distance) {
					point1 = i;
					point2 = j;
					shortestDis = distance;
				}
			}
		}
		System.out.println("The two closest points are (" + points[point1][0] + ", " + points[point1][1] + ") and (" +points[point2][0] + ", " + points[point2][1] + ")");
	}
	public static double pointDistance(
			double x1, double y1, double z1, double x2, double y2, double z2) {
		return Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)) + ((z2 - z1) * (z2 - z1)));
	}
}

