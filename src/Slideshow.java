import java.util.List;

public class Slideshow {
	private List<Slide> slidesList = null;
	
	public Slideshow(List<Slide> slides) {
		slidesList = slides;
	}
	
	public void addSlide(Slide img) {
		this.slidesList.add(img);
	}
	
	public Slide getSlide(int index) {
		return this.slidesList.get(index);
	}
	
	static int scoreSlides(Slide sld1, Slide sld2) {
		int uncommonA = 0;
		int uncommonB = 0;
		int common = 0;
		
		for (String tag: sld1.getTags()) {
			if (sld2.getTags().contains(tag)) {
				common++;
			} else {
				uncommonA++;
			}
		}

		uncommonB = sld2.getTags().size() - common;
		
		
		return Math.min(uncommonA, Math.min(uncommonB, common));
	}
	
	static int scoreSlides(Slide sld1, Slide sld2, Slide sld3) {
		
		
		
		return 1;
	}

	public int GetTotalScore(){
		int totalScore = 0;
		for (int i = 0; i < slidesList.size() - 1; i++){
			totalScore += scoreSlides(slidesList.get(i), slidesList.get(i+1));
		}

		return totalScore;
	}
	
}
