package PMS.V1;


/* 
 * File: ProductInfoClass
 * Copy: Copyright (c) 2023 Samuel W. Messer
 * BlazerID: swmesser
 * Vers: 1.0.0 Oct 19, 2023 SWM - Original Coding
 * Desc: Driver for testing concepts
 */

//Going to be "flat"
// category
// subcategory
// categories found in PMS.V2 ProductInfo class
public class ProductInfo {
    //Generic Product Information
    private stockOption availability;
    private environmentalOption hazard;
    private mediaOption media;
    private productStatus status;
    private packageOption packaging;
    private String manufacturer; // Secondary Key --> Needed for the PK
    private String mfgPartNumber; //Primary Key --> Necessary to be a product
    private String series;
    private String description;
    private String Name;
    private int itemId;
    private int qtyAvailable;
    private double price; // Secondary Key
    
    //CapacitorInfo
    
    //InductorCoilAndChokeInfo
    
    //NetworkingSolutionInfo
    
    
    
    public ProductInfo(){
        this.availability = stockOption.unknown;
        this.hazard = environmentalOption.unknown;
        this.media = mediaOption.unknown;
        this.status = productStatus.unknown;
        this.packaging = packageOption.unknown;
        this.manufacturer = "";
        this.mfgPartNumber = "";
        this.series = "";
        this.description = "";
        this.Name = "";
        this.itemId = 0;
        this.qtyAvailable = 0;
        this.price = 0.0;
    }
    
    public ProductInfo( int itemId, String manufacturer, String mfgPartNumber, String series, String description, double price, int qtyAvailable ){
        //Creating a basic productInfo constructor
        this();
        
        //Validation
        if ( manufacturer.length() == 0 ){
            System.out.println("Error: Entered a zero length string!");
        } else if ( mfgPartNumber.length() == 0 ){
            System.out.println("Error: Passed a zero length string!");
        } else if ( series.length() == 0 ){
            System.out.println("Error: Passed a zero length string!");
        } else if ( description.length() == 0 ){
            System.out.println("Error: Passed a zero length string!");
        } else if ( price < 0.0 ){
            System.out.println("Error: Passed a price less than zero!");
        } else if ( qtyAvailable < 0 ){
            System.out.println("Error: Invalid quantity available provided!");
        } else if ( itemId < 0 ){
            //ALSO NEEDS TO BE VALIDATED FOR PREEXISTING ID
            System.out.println("Error: Invalid item Id provided!");
        } else {
            //inputting necessary info
            this.manufacturer = manufacturer;
            this.mfgPartNumber = mfgPartNumber;
            this.series = series;
            this.price = price;
            this.qtyAvailable = qtyAvailable;
            this.itemId = itemId;
        }
        
    }
    
    public ProductInfo( int itemId, String manufacturer, String mfgPartNumber, String series, String description, int qtyAvailable, double price,
            stockOption availability, environmentalOption hazard, mediaOption media, productStatus status, packageOption packaging){
        //Calling constructor to create a basic product
        this( itemId, manufacturer, mfgPartNumber, series, description, price, qtyAvailable );
        
        //Validation of information passed
        //How does one valid enum
        
        // After validating all of the enums use the following
        this.availability = availability;
        this.hazard = hazard;
        this.media = media;
        this.status = status;
        this.packaging = packaging;
    }
    
    /**
     * @return the availability
     */
    public stockOption getAvailability() {
        return (this.availability);
    }

    /**
     * @param availability the availability to set
     */
    public void setAvailability(stockOption availability) {
        this.availability = availability;
    }

    /**
     * @return the hazard
     */
    public environmentalOption getHazard() {
        return (this.hazard);
    }

    /**
     * @param hazard the hazard to set
     */
    public void setHazard(environmentalOption hazard) {
        this.hazard = hazard;
    }

    /**
     * @return the media
     */
    public mediaOption getMedia() {
        return (this.media);
    }

    /**
     * @param media the media to set
     */
    public void setMedia(mediaOption media) {
        this.media = media;
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
     * @return the status
     */
    public productStatus getStatus() {
        return (this.status);
    }

    /**
     * @param status the status to set
     */
    public void setStatus(productStatus status) {
        this.status = status;
    }

    /**
     * @return the packaging
     */
    public packageOption getPackaging() {
        return (this.packaging);
    }

    /**
     * @param packaging the packaging to set
     */
    public void setPackaging(packageOption packaging) {
        this.packaging = packaging;
    }
    
    
    
}


//Generic Product Enums --> 
//  Used for variables that each type of product will contain
enum stockOption{
    inStock,
    normallyStocking,
    newProduct,
    outOfStock,
    unknown
}

enum environmentalOption{
    RoHSCompliant,
    NonRoHSCompliant,
    unknown
}

enum mediaOption{
    datasheet,
    photo,
    eda_cadModels,
    unknown
}

enum marketplaceOption{
    exclude,
    unknown
}

enum packageOption{
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

enum productStatus{
    active,
    discontinued,
    lastTimeBuy,
    notForNewDesigns,
    obsolete,
    unknown
}