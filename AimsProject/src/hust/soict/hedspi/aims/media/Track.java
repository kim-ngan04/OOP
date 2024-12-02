package hust.soict.hedspi.aims.media;

public class Track implements Playable {
    private String title;
    private int length;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void play() {
        System.out.println("Playing track: " + this.title);
        System.out.println("Track length: " + this.length + " minutes");
    }

    @Override
    public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if(!(obj instanceof Track)) {
			return false;
		}
		return ((Track)obj).getTitle() == this.getTitle() && ((Track)obj).getLength() == this.getLength();
 	}

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + length;
        return result;
    }
}
