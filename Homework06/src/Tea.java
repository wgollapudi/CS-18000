/**
 *Tea class
 *
 *Purdue University -- CS18000 -- Fall 2023 -- Homework 06 -- Challenge
 *
 *@author Walker Gollapudi
 *@version September 28, 2023
 */

public class Tea {
    private String name;
    private double price;
    private int stockAvailable;
    private String type;
    private int caffeineLevel;
    private int steepTemperature;
    private double steepTime;

    private void assignTypeDependentProperties() {
        switch (this.type) {
            case "Black" -> {
                this.caffeineLevel = 5;
                this.steepTemperature = 212;
                this.steepTime = 4.5;
            }
            case "Oolong" -> {
                this.caffeineLevel = 4;
                this.steepTemperature = 200;
                this.steepTime = 2.0;
            }
            case "Green" -> {
                this.caffeineLevel = 3;
                this.steepTemperature = 185;
                this.steepTime = 2.5;
            }
            case "White" -> {
                this.caffeineLevel = 2;
                this.steepTemperature = 160;
                this.steepTime = 1.5;
            }
            case "Herbal" -> {
                this.caffeineLevel = 1;
                this.steepTemperature = 212;
                this.steepTime = 5.0;
            }
        }
    }
    public Tea(String name, double price, String type, int stockAvailable) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.stockAvailable = stockAvailable;

        this.assignTypeDependentProperties();
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStockAvailable() {
        return stockAvailable;
    }

    public String getType() {
        return type;
    }

    public int getCaffeineLevel() {
        return caffeineLevel;
    }

    public int getSteepTemperature() {
        return steepTemperature;
    }

    public double getSteepTime() {
        return steepTime;
    }

    public void restock(int quantity) {
        if (quantity < 0) {
            System.out.println("Error, invalid order");
            return;
        }
        this.stockAvailable += quantity;
    }

    public double purchaseTea(int quantity) {
        if (quantity < 0) {
            System.out.println("Error, invalid order");
            return 0;
        }

        int teaSold;
        if (quantity > this.stockAvailable) {
            teaSold = this.stockAvailable;
            this.stockAvailable = 0;
        } else {
            teaSold = quantity;
            this.stockAvailable -= quantity;
        }
        return (teaSold * this.price);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Tea Name : " + name + '\n' +
                "Type: " + type + '\n' +
                "Stock Available: " + stockAvailable + '\n' +
                "Price: $" + price + '\n' +
                "Steep Time: " + steepTime + '\n' +
                "Steep Temperature: " + steepTemperature + '\n' +
                "Caffeine Level: " + caffeineLevel;
    }
}

