package transport;

public class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private int maximumSpeed;

    private static final String defaultValue = "default";
    private static final String defaultColor = "белый";
    private static final int defaultYear = 2000;

    public Transport(String brand, String model, int year, String country, String color, int maximumSpeed) {
        if (brand == null || brand.isBlank()) {
            this.brand = defaultValue;
        } else {
            this.brand = brand;
        }
        if (model == null || model.isBlank()) {
            this.model = defaultValue;
        } else {
            this.model = model;
        }
        if (year <= 0) {
            this.year = defaultYear;
        } else {
            this.year = year;
        }
        if (country == null || country.isBlank()) {
            this.country = defaultValue;
        } else {
            this.country = country;
        }
        setColor(color);
        setMaximumSpeed(maximumSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setColor(String color) {
        if (color == null || color.isBlank()) {
            this.color = defaultColor;
        } else {
            this.color = color;
        }
    }
    public void setMaximumSpeed(int maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", maximumSpeed=" + maximumSpeed +
                '}';
    }
}
