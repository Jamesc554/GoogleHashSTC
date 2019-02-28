import java.util.List;

public class Slideshow {
	private List<Slide> slidesList = null;
	
	public Slideshow(Slide slides) {
		this.slidesList.add(slides);
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
		//List<String>tags1 = sld1.getTags();
		//List<String>tags2 = sld2.getTags();
		
		for (String tag: sld1.getTags()) {
			if (sld2.getTags().contains(tag)) {
				common++;
			} else if () {
				
			}
		}
		
		
		return 1;
	}
	
	static int scoreSlides(Slide sld1, Slide sld2, Slide sld3) {
		
		
		
		return 1;
	}
	
}
