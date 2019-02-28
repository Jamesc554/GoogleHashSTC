public class Slide {
	
	private Photo[] images = null;
	
	public Slide(Photo... photos) {
		this.images = photos;
	}

	public Photo[] getImages() {
		return images;
	}

	public void setImages(Photo[] images) {
		this.images = images;
	}
}
