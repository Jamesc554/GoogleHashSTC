import java.util.List;

public class Photo {
    private int id;
    private boolean horizontal;
    private List<String> tags;

    public Photo(int id, boolean horizontal, List<String> tags){
        this.id = id;
        this.horizontal = horizontal;
        this.tags = tags;
    }

    public int GetID(){
        return id;
    }

    public boolean isHorizontal() {
        return horizontal;
    }

    public List<String> GetTags() {
        return tags;
    }

    @Override
    public String toString() {
        return id + " " + horizontal + " " + tags.toString();
    }
}
