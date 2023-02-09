public class MealTm {
    private String foodNameId;
    private String foodPriceId;
    private String foodTypeId;

    public MealTm() {
    }

    public MealTm(String foodNameId, String foodPriceId, String foodTypeId) {
        this.foodNameId = foodNameId;
        this.foodPriceId = foodPriceId;
        this.foodTypeId = foodTypeId;
    }

    public String getFoodNameId() {
        return foodNameId;
    }

    public void setFoodNameId(String foodNameId) {
        this.foodNameId = foodNameId;
    }

    public String getFoodPriceId() {
        return foodPriceId;
    }

    public void setFoodPriceId(String foodPriceId) {
        this.foodPriceId = foodPriceId;
    }

    public String getFoodTypeId() {
        return foodTypeId;
    }

    public void setFoodTypeId(String foodTypeId) {
        this.foodTypeId = foodTypeId;
    }
}
