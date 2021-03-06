package project.team6.umbuy.data_model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class Advertisement {

    @SerializedName("advertisementId")
    private int advertisementId;
    @SerializedName("userId")
    private String userId;
    @SerializedName("title")
    private String title;
    @SerializedName("description")
    private String description;
    @SerializedName("price")
    private double price;
    @SerializedName("created_on")
    private Date created_on;
    @SerializedName("last_updated")
    private Date last_updated;
    @SerializedName("deleted_on")
    private Date deleted_on;
    @SerializedName("imageUrl")
    private String imageUrl;
    @SerializedName("category")
    private String category;

    public int getAdvertisementId() {
        return advertisementId;
    }

    public String getUserId() {
        return userId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getCreated_on() {
        return created_on.toString();
    }

    public Date getLast_updated() {
        return last_updated;
    }

    public Date getDeleted_on(){ return deleted_on; }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getCategory() {
        return category;
    }


    public Advertisement(int advertisementId, String userId, String title, String description,
                         double price, Date created_on, Date last_updated, Date deleted_on, String imageUrl,
                         String category){
        this.advertisementId = advertisementId;
        this.userId = userId;
        this.title = title;
        this.description = description;
        this.price = price;
        this.created_on = created_on;
        this.last_updated = last_updated;
        this.deleted_on = deleted_on;
        this.imageUrl = imageUrl;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Advertisement{" +
                "advertisementId=" + advertisementId +
                ", userId=" + userId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", created_on=" + created_on +
                ", last_updated=" + last_updated +
                ", imageUrl='" + imageUrl + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}

