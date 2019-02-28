import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception{
        System.out.println("Hello, Charles!");

        List<Photo> photos = FileReader.LoadPhotos("b_lovely_landscapes.txt");

        for(Photo p : photos){
            System.out.println(p.toString());
        }
    }
}
