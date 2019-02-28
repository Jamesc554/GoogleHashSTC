import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

    public static void main(String[] args) throws Exception{
        System.out.println("Hello, Charles!");
        List<Slide> slides = new ArrayList<>();
        HashMap<String, Integer> tagCount = new HashMap<>();
        List<Photo> verticalPhotos = new ArrayList<>();

        List<Photo> photos = FileReader.LoadPhotos("c_memorable_moments.txt");

        for(Photo p : photos){
            for(String tag : p.GetTags()){
                if (tagCount.containsKey(tag)){
                    int amount = tagCount.get(tag) + 1;
                    tagCount.remove(tag);
                    tagCount.put(tag, amount);
                } else {
                    tagCount.put(tag, 1);
                }
            }

            if (p.isHorizontal()){
                Slide s = new Slide(p);
                slides.add(s);
            } else {
                verticalPhotos.add(p);
            }
        }

        for (int i = 0; i < verticalPhotos.size() / 2; i++){
            Slide s = new Slide(verticalPhotos.get(i), verticalPhotos.get(i+1));
            slides.add(s);
        }

        tagCount.entrySet().forEach(entry -> {
            System.out.println("Tag: " + entry.getKey() + " Amount: " + entry.getValue());
        });

        List<Slide> newSlides = new ArrayList<>();
        for (Slide slide : slides){
            if (newSlides.contains(slide))
                continue;

            Slide bestSlide = null;
            for (Slide nSlide : slides){
                if (slide == nSlide || newSlides.contains(nSlide))
                    continue;

                if (bestSlide == null){
                    bestSlide = nSlide;
                } else {
                    if (Slideshow.scoreSlides(slide, nSlide) > Slideshow.scoreSlides(slide, bestSlide)){
                        bestSlide = nSlide;
                    }
                }
            }
            newSlides.add(slide);
            newSlides.add(bestSlide);
            System.out.println(slides.size());
            System.out.println(newSlides.size());
        }

        for (Slide s : newSlides){
            if (slides.contains(s)){
                slides.remove(s);
            }
        }

        newSlides.addAll(slides);



        Slideshow ss = new Slideshow(newSlides);
        System.out.println(ss.GetTotalScore());
    }
}
