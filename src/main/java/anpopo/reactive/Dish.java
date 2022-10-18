package anpopo.reactive;

public class Dish {

    private String description;
    private boolean delivered = false;

    public static Dish deliver(Dish dish) {
        Dish deliveredDish = new Dish(dish.description);  // 함수형 프로그래밍에선 변환된 상태를 가진 객체를 선호
        deliveredDish.delivered = true;
        return deliveredDish;
    }
    public Dish(String description) {
        this.description = description;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDelivered() {
        return delivered;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Dish{");
        sb.append("description='").append(description).append('\'');
        sb.append(", delivered=").append(delivered);
        sb.append('}');
        return sb.toString();
    }
}
