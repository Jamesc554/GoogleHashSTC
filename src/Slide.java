import java.util.ArrayList;
import java.util.List;

public class Slide {
	
	private Photo[] images;
	
	public Slide(Photo... photos) {
		this.images = photos;
	}

	public Photo[] getImages() {
		return images;
	}

	public void setImages(Photo... images) {
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
