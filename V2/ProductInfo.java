package PMS.V2;

import java.util.UUID;

/* 
 * File: ProductInfo
 * Copy: Copyright (c) 2023 Samuel W. Messer
 * BlazerID: swmesser
 * Vers: 1.0.0 Oct 19, 2023 SWM - Original Coding
 * Desc: Driver for testing concepts
 */

//Interfaces for ProductInfo
interface Exportable {
    String toCustom();
    String toCSV();
    String toXML();
}




// "Heirarchial"
//Package needs the following
//  <Category>Info class --> abstract
// <Subcategory>Info class --> final
//      ResistorInfo
//      CapacitoryInfo
//      SingleBoardComputerInfo
public abstract class ProductInfo implements Exportable {
    private String itemId;
    private String name;
    private String description;
    private String series;
    private String manufacturer;
    private String mfgPartNumber;
    private int qtyAvailable;
    private double price;
    private StockOption availability;
    private EnvironmentalOption hazards;
    private MediaOption media;
    private ProductStatus status;
    private PackageOption shippingPackage;
    
    
    public ProductInfo(){
        this.itemId = "";
        this.name = "";
        this.description = "";
        this.series = "";
        this.manufacturer = "";
        this.mfgPartNumber = "";
        this.qtyAvailable = 0;
        this.price = 0.0;
        this.availability = StockOption.unknown;
        this.hazards = EnvironmentalOption.unknown;
        this.media = MediaOption.unknown;
        this.status = ProductStatus.unknown;
        this.shippingPackage = PackageOption.unknown;
        
    }
    
    public ProductInfo( String itemId, String name, String description, int qty, double price) throws Exception{
        this();
        
        if (( name == null ) || ( name.length() == 0 )){
            throw new Exception("Error: Passed invalid name!");
        } else if (( description == null) || ( description.length() == 0 )){
            throw new Exception("Error: Passed invalid description!");
        } else if (( itemId.length() == 0 ) || ( itemId == null)){
            throw new Exception("Error: Invalid itemId passed!");
        } else {
            this.itemId = itemId;
            this.name = name;
            this.description = description;
            this.qtyAvailable = qty;
            this.price = price;
            this.availability = StockOption.newProduct;
            this.status = ProductStatus.active;
        }
    }
    
    public ProductInfo( String itemId, String name, String description, String mfg, 
            String mfgPartNum, String series, int qty, double price ) throws Exception {
        this(itemId, name, description, qty, price);
        
        if (( mfg == null ) || ( mfg.length() == 0 )){
            throw new Exception("Error: Passed invalid manufacturer name!");
        } else if (( mfgPartNum == null ) || ( mfgPartNum.length() == 0 )){
            throw new Exception("Error: Passed invalid manufacturer part number!");
        } else if (( series == null ) || ( series.length() == 0 )){
            throw new Exception("Error: Passed invalid series!");
        } else if ( qty < 0 ){
            throw new Exception("Error: Passed invalid quantity!");
        } else if ( price < 0.0 ){
            throw new Exception("Error: Passed invalid price!");
        } else {
            this.manufacturer = mfg;
            this.mfgPartNumber = mfgPartNum;
            this.series = series;
        }
    }

    /**
     * @return the itemId
     */
    public String getItemId() {
        return (this.itemId);
    }

    /**
     * @return the name
     */
    public String getName() {
        return (this.name);
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return (this.description);
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the series
     */
    public String getSeries() {
        return (this.series);
    }

    /**
     * @param series the series to set
     */
    public void setSeries(String series) {
        this.series = series;
    }

    /**
     * @return the manufacturer
     */
    public String getManufacturer() {
        return (this.manufacturer);
    }

    /**
     * @param manufacturer the manufacturer to set
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * @return the mfgPartNumber
     */
    public String getMfgPartNumber() {
        return (this.mfgPartNumber);
    }

    /**
     * @param mfgPartNumber the mfgPartNumber to set
     */
    public void setMfgPartNumber(String mfgPartNumber) {
        this.mfgPartNumber = mfgPartNumber;
    }

    /**
     * @return the qtyAvailable
     */
    public int getQtyAvailable() {
        return (this.qtyAvailable);
    }

    /**
     * @param qtyAvailable the qtyAvailable to set
     */
    public void setQtyAvailable(int qtyAvailable) {
        this.qtyAvailable = qtyAvailable;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return (this.price);
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the availability
     */
    public StockOption getAvailability() {
        return (this.availability);
    }

    /**
     * @param availability the availability to set
     */
    public void setAvailability(StockOption availability) {
        this.availability = availability;
    }

    /**
     * @return the hazards
     */
    public EnvironmentalOption getHazards() {
        return (this.hazards);
    }

    /**
     * @param hazards the hazards to set
     */
    public void setHazards(EnvironmentalOption hazards) {
        this.hazards = hazards;
    }

    /**
     * @return the media
     */
    public MediaOption getMedia() {
        return (this.media);
    }

    /**
     * @param media the media to set
     */
    public void setMedia(MediaOption media) {
        this.media = media;
    }

    /**
     * @return the status
     */
    public ProductStatus getStatus() {
        return (this.status);
    }

    /**
     * @param status the status to set
     */
    public void setStatus(ProductStatus status) {
        this.status = status;
    }

    /**
     * @return the shippingPackage
     */
    public PackageOption getShippingPackage() {
        return (this.shippingPackage);
    }

    /**
     * @param shippingPackage the shippingPackage to set
     */
    public void setShippingPackage(PackageOption shippingPackage) {
        this.shippingPackage = shippingPackage;
    }

    @Override
    public String toCustom() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String output = "";
        
        output += "Item Id: " + this.itemId + '\n';
        output += "Name: " + this.name + '\n';
        output += "Description: " + this.description + '\n';
        output += "Manufacturer: " + this.manufacturer + '\n';
        output += "Manufacturer Part Number: " + this.mfgPartNumber + '\n';
        output += "Series: " + this.series + '\n';
        output += "Availability: " + this.availability + '\n';
        output += "Product Status: " + this.status + '\n';
        output += "Media: " + this.media + '\n';
        output += "Environmental Options: " + this.hazards + '\n';
        output += "Packaging: " + this.shippingPackage + '\n';
        output += "Quantity: " + this.qtyAvailable + '\n';
        output += "Price: " + this.price + '\n';
        
        return( output );
    }

    @Override
    public String toCSV() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String output = "";
        
        output += this.itemId + ",";
        output += this.name + ",";
        output += this.description + ",";
        output += this.manufacturer + ",";
        output += this.mfgPartNumber + ",";
        output += this.series + ",";
        output += this.availability + ",";
        output += this.status + ",";
        output += this.media + ",";
        output += this.hazards + ",";
        output += this.shippingPackage + ",";
        output += this.qtyAvailable + ",";
        output += this.price + ",";
        
        
        return( output );
    }

    @Override
    public String toXML() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String output = "";
        
        output += "<ProductInfo>" + '\n';
        output += "     <itemId>" + this.itemId + "</itemId>\n";
        output += "     <name>" + this.name + "</name>\n";
        output += "     <description>" + this.description + "</description>\n";
        output += "     <manufacturer>" + this.manufacturer + "</manufacturer>\n";
        output += "     <mfgPartNumber>" + this.mfgPartNumber + "</mfgPartNumber>\n";
        output += "     <series>" + this.series + "</series>\n";
        output += "     <availability>" + this.availability + "</availability>\n";
        output += "     <status>" + this.status + "</status>\n";
        output += "     <media>" + this.media + "</media>\n";
        output += "     <hazards>" + this.hazards + "</hazards>\n";
        output += "     <shippingPackage>" + this.shippingPackage + "</shippingPackage>\n";
        output += "     <qtyAvailable>" + this.qtyAvailable + "</qtyAvailable>\n";
        output += "     <price>" + this.price + "</price>\n";
        output += "</ProductInfo>\n";
        
        
        return( output );
    }    
    
}

//Generic Product Enums --> 
//  Used for variables that each type of product will contain
enum StockOption{
    inStock,
    normallyStocking,
    newProduct,
    outOfStock,
    unknown
}

enum EnvironmentalOption{
    RoHSCompliant,
    NonRoHSCompliant,
    unknown
}

enum MediaOption{
    datasheet,
    photo,
    eda_cadModels,
    unknown
}

enum PackageOption{
    Bag,
    Box,
    Bulk,
    CutTape,
    DigiReel,
    Strip,
    TapeAndBox,
    TapeAndReel,
    Tray,
    unknown
}

enum ProductStatus{
    active,
    discontinued,
    lastTimeBuy,
    notForNewDesigns,
    obsolete,
    unknown
}