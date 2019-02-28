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

	public int[] GetUncommonCommonTags(Slide s){
		int[] amounts = new int[3];
		for(String tag : s.getTags()){
			if (getTags().contains(tag)){
				amounts[0]++;
			} else {
				amounts[1]++;
			}
		}

		for (String tag : getTags()){
			if (!s.getTags().contains(s)){
				amounts[2]++;
			}
		}
		return amounts;
	}
}
