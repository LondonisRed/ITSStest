package entity.Media;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import entity.DB;


public class Media {
    protected Statement stm;

    int id;

    String category;

    String title;

    int price;

    int value;

    int quantity;

    String imageUrl;

    
    public Media() throws SQLException, ClassNotFoundException{
        stm = DB.getConnection().createStatement();
    }

     public Media(String title,String category, int price, int value, int quantity, String imageUrl) {
        this.category = category;
        this.title=title;
        this.price = price;
        this.value = value;
        this.quantity = quantity;
        this.imageUrl = imageUrl;
    }


    public List getAllMedia() throws SQLException, ClassNotFoundException{
        Statement stm = DB.getConnection().createStatement();
        ResultSet res = stm.executeQuery("select * from media");
        ArrayList medium = new ArrayList<>();
        while (res.next()) {
            Media media = new Media()
                .setId(res.getInt("id"))
                .setTitle(res.getString("title"))
                .setQuantity(res.getInt("quantity"))
                .setCategory(res.getString("category"))
                .setMediaURL(res.getString("imageUrl"))
                .setPrice(res.getInt("price"));
            medium.add(media);
        }
        return medium;
    }

    public int getId() {
        return this.id;
    }

    private Media setId(int id){
        this.id = id;
        return this;
    }

    public Media setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return this.category;
    }

    public Media setCategory(String category) {
        this.category = category;
        return this;
    }

    public int getPrice() {
        return this.price;
    }

    public Media setPrice(int price) {
        this.price = price;
        return this;
    }

    public String getImageURL(){
        return this.imageUrl;
    }

    public Media setMediaURL(String url){
        this.imageUrl = url;
        return this;
    }

    public Media setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public int getQuantity(){
        return this.quantity;
    }

}
