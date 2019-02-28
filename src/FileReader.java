import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    public static List<Photo> LoadPhotos(String fileName) throws Exception {
        File file = new File(fileName);
        FileInputStream inputStream = new FileInputStream(file);
        InputStreamReader streamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        List<Photo> photos = new ArrayList<>();

        String line;
        int index = 0;
        int numImages = 0;
        while ((line = bufferedReader.readLine()) != null) {
            if (index == 0){
                String.valueOf(line);
            } else {
                String[] properties = line.split(" ");
                int numTags = Integer.parseInt(properties[1]);
                boolean horizontal = (properties[0].equals("H"));
                List<String> tags = new ArrayList<>();
                for (int i = 0; i < numTags; i++){
                    tags.add(properties[i+2]);
                }
                Photo p = new Photo(index, horizontal, tags);
                photos.add(p);
            }
            index++;
        }
        bufferedReader.close();

        return photos;
    }

}
