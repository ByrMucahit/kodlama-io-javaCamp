
public class instructor extends User {
	private int howManyTutorialStudentsGot;
	private float averageTimeStudying;
	private float givenRate;
	
	public int getHowManyTutorialStudentsGot() {
		return howManyTutorialStudentsGot;
	}
	public void setHowManyTutorialStudentsGot(int howManyTutorialStudentsGot) {
		this.howManyTutorialStudentsGot = howManyTutorialStudentsGot;
	}
	public float getAverageTimeStudying() {
		return averageTimeStudying;
	}
	public void setAverageTimeStudying(float averageTimeStudying) {
		this.averageTimeStudying = averageTimeStudying;
	}
	public float getGivenRate() {
		return givenRate;
	}
	public void setGivenRate(float givenRate) {
		this.givenRate = givenRate;
	}
}
