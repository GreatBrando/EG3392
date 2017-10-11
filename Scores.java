
public class Scores {
	
	private int scores[];
	
	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}

	public Scores(int[] scores){
		this.scores = scores;
	}
	
	public int getAverage(){
		int sum = 0;
		
		for(int score: scores){
			if(score< 0 || score>100){
				throw new IllegalArgumentException("Score Invalid");
			}
			sum += score;
		}
		return sum/scores.length;
	}
	
}
