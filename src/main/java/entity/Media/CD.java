package entity.Media;

import java.util.Date;

public class CD extends Media{

    String artist;

    String recordLabel;

    String musicType;

    Date releasedDate;

    public CD(String title,String category, int price, int value, int quantity, String imageUrl, String recordLabel, String musicType, String artist, Date releasedDate) {
        super(title,category, price, value, quantity, imageUrl);
        this.recordLabel = recordLabel;
        this.musicType = musicType;
        this.artist = artist;
        this.releasedDate = releasedDate;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getRecordLabel() {
        return recordLabel;
    }

    public void setRecordLabel(String recordLabel) {
        this.recordLabel = recordLabel;
    }

    public String getMusicType() {
        return musicType;
    }

    public void setMusicType(String musicType) {
        this.musicType = musicType;
    }

    public Date getReleasedDate() {
        return releasedDate;
    }

    public void setReleasedDate(Date releasedDate) {
        this.releasedDate = releasedDate;
    }
}
