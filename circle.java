package circle;

public class circle {
	float radius;

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public float area()
	{
		float phi=22/7;
		float a=phi*this.radius*this.radius;
		return a;
	}

}
