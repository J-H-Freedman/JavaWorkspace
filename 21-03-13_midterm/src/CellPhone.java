
public class CellPhone {
    private String manufacturer;
    private String model;
    private double retailPrice;

    // Accessors
    public String getManufacturer() {
        return manufacturer;
    }
    public String getModel() {
        return model;
    }
    public double getRetailPrice() {
        return retailPrice;
    }

    // Mutators
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    /**
     * Is this phone the same model as the parameter?
     * @param otherModel the model in question
     * @return if this phone is the same model
     */
    private boolean isSameModel ( String otherModel ){
        boolean isSame = false;
        //Provide your code here.
        if (this.model.equals(otherModel))
            isSame = true;

        return isSame;
    }

    /**
     * Compare two objects to see if they hold the equal data
     * @param otherObject the compared object
     * @return are they are equal or not
     */
    private boolean equals ( CellPhone otherObject ){
        boolean equal = false;
        //Provide your code here.
        if (this.model.equals(otherObject.getModel()) &&
            this.manufacturer.equals(otherObject.getManufacturer()) &&
            this.retailPrice== otherObject.getRetailPrice())
        {
            equal = true;
        }

        return equal;
    }

    public static void main(String[] args) {
        // Create two objects of Cell Phone class with the same model (=X),
        // manufacturer (=Apple) and retail Price (=600) with the suggested values.
        CellPhone phone1 = new CellPhone();
        phone1.setManufacturer("Apple");
        phone1.setModel("X");
        phone1.setRetailPrice(600);

        CellPhone phone2 = new CellPhone();
        phone2.setManufacturer("Apple");
        phone2.setModel("X");
        phone2.setRetailPrice(600);

        // Print if they are equal or not by using equals method's return in a decision structure.
        System.out.println("Are these the same kind of cell phone? " + phone1.equals(phone2));

    }

} // This is where the class ends