import java.util.ArrayList;
import java.util.List;

public class Slide {
	
	private List<Photo> images = null;
	
	public Slide(List<Photo> photos) {
		this.images = photos;
	}

	public List<Photo> getImages() {
		return images;
	}

	public void setImages(List<Photo> images) {
		this.images = images;
	}
	
	public List<String> getTags() {
		List<String> allTags = new ArrayList<>();
		
		for (Photo img: this.images) {
			allTags.addAll(img.GetTags());
		}
		return allTags;
	}
}
