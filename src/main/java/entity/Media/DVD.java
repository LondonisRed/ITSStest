package entity.Media;

import java.util.Date;

public class DVD extends Media{
    String discFormat;

    String director;

    String studio;

    String subtitle;

    Date releaseDate;

    String discType;

    int runtime;

    public DVD(String title,String category, int price, int value, int quantity, String imageUrl, String discFormat, String director, String studio, String subtitle, Date releaseDate, String discType, int runtime) {
        super(title,category, price, value, quantity, imageUrl);
        this.discFormat = discFormat;
        this.director = director;
        this.studio = studio;
        this.subtitle = subtitle;
        this.releaseDate = releaseDate;
        this.discType = discType;
        this.runtime = runtime;
    }

    public String getDiscFormat() {
        return discFormat;
    }

    public void setDiscFormat(String discFormat) {
        this.discFormat = discFormat;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }
}
