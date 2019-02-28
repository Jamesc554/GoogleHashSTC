import java.util.List;

public class Slide {
	
	private List<Photo> images = null;
	
	public Slide(Photo... photos) {
		this.images = photos;
	}

	public List<Photo> getImages() {
		return images;
	}

	public void setImages(List<Photo> images) {
		this.images = images;
	}
}
