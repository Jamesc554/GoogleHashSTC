import java.util.List;

public class Slideshow {
	private List<Slide> slidesList = null;
	
	public Slideshow(Slide slides) {
		this.slidesList.add(slides);
	}
	
	public void addSlide(Slide img) {
		this.slidesList.add(img);
	}
	
}
