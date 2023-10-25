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
    private stockOption availability;
    private environmentalOption hazard;
    private mediaOption media;
    private productStatus status;
    private packageOption packaging;
    private String manufacturer; // Secondary Key --> Needed for the PK
    private String mfgPartNumber; //Primary Key --> Necessary to be a product
    private String series;
    private int itemId;
    private int qtyAvailable;
    private double price; // Secondary Key
    
    public ProductInfo(){
        this.availability = stockOption.unknown;
        this.hazard = environmentalOption.unknown;
        this.media = mediaOption.unknown;
        this.status = productStatus.unknown;
        this.packaging = packageOption.unknown;
        this.manufacturer = "";
        this.mfgPartNumber = "";
        this.series = "";
        this.itemId = 0;
        this.qtyAvailable = 0;
        this.price = 0.0;
    }
    
    public ProductInfo( int itemId, String manufacturer, String mfgPartNumber, String series, double price, int qtyAvailable ){
        //Creating a basic productInfo constructor
        this();
        
        //Validation
        if ( manufacturer.length() == 0 ){
            System.out.println("Error: Entered a zero length string!");
        } else if ( mfgPartNumber.length() == 0 ){
            System.out.println("Error: Passed a zero length string!");
        } else if ( series.length() == 0 ){
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
    
    public ProductInfo( int itemId, String manufacturer, String mfgPartNumber, String series, int qtyAvailable, double price,
            stockOption availability, environmentalOption hazard, mediaOption media, productStatus status, packageOption packaging){
        //Calling constructor to create a basic product
        this( itemId, manufacturer, mfgPartNumber, series, price, qtyAvailable );
        
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



class ResistorInfo extends ProductInfo{
    private circuitType circuit;
    private double voltageRating;
    private double resistance;
    private int tolerance;
    private int resistorCount;
    private int pinCount;

    //Basic Constructor 
    public ResistorInfo( int itemId, String manfacturer, String mfgPartNumber, String series, int qtyAvailable, double price){
        super( itemId, manfacturer, mfgPartNumber, series, price, qtyAvailable);
        this.circuit = circuitType.unknown;
        this.voltageRating = 0.0;
        this.resistance = 0.0;
        this.tolerance = 0;
        this.resistorCount = 0;
        this.pinCount = 0;
    }
    
    //Constructor with information
    public ResistorInfo( int itemId,String manufacturer, String mfgPartNumber, String series, int qtyAvailable, double price,
            stockOption availability, environmentalOption hazard, mediaOption media, productStatus status, packageOption packaging,
            circuitType circuit, double voltageRating, double resistance, int tolerance, int resistorCount,
            int pinCount ) throws Exception{
        //Calling the basic product info constructor
        super( itemId, manufacturer, mfgPartNumber, series, qtyAvailable, price, availability, hazard, media, status, packaging );
        
        //HOW TO VALIDATE ENUM
        //Validation
        if ( voltageRating <= 0 ){
            System.out.println("Error: Passed a voltage rating less than zero!");
            //throw new Exception("Error: Passed a voltage rating less than zero!");       // Leave this so when we are given the main it can be activated
        } else if ( resistance <= 0 ){
            System.out.println("Error: Passed a resistance less than zero!");
        } else if ( tolerance <= 0 ){
            System.out.println("Error: Passed a tolerance less than zero!");
        } else if ( resistorCount < 0 ){
            System.out.println("Error: Passed a resistor count less than zero!");
        } else if ( pinCount <= 0 ){
            System.out.println("Error: Passed a pin count less than zero!");
        } else {
            this.circuit = circuit;
            this.voltageRating = voltageRating;
            this.resistance = resistance;
            this.tolerance = tolerance;
            this.resistorCount = resistorCount;
            this.pinCount = pinCount;
        }
    }    

    /**
     * @return the voltageRating
     */
    public double getVoltageRating() {
        return (this.voltageRating);
    }

    /**
     * @param voltageRating the voltageRating to set
     */
    public void setVoltageRating(double voltageRating) {
        this.voltageRating = voltageRating;
    }

    /**
     * @return the resistance
     */
    public double getResistance() {
        return (this.resistance);
    }

    /**
     * @param resistance the resistance to set
     */
    public void setResistance(double resistance) {
        this.resistance = resistance;
    }

    /**
     * @return the tolerance
     */
    public int getTolerance() {
        return (this.tolerance);
    }

    /**
     * @param tolerance the tolerance to set
     */
    public void setTolerance(int tolerance) {
        this.tolerance = tolerance;
    }

    /**
     * @return the circuit
     */
    public circuitType getCircuit() {
        return (this.circuit);
    }

    /**
     * @param circuit the circuit to set
     */
    public void setCircuit(circuitType circuit) {
        this.circuit = circuit;
    }

    /**
     * @return the resistorCount
     */
    public int getResistorCount() {
        return (this.resistorCount);
    }

    /**
     * @param resistorCount the resistorCount to set
     */
    public void setResistorCount(int resistorCount) {
        this.resistorCount = resistorCount;
    }

    /**
     * @return the pinCount
     */
    public int getPinCount() {
        return (this.pinCount);
    }

    /**
     * @param pinCount the pinCount to set
     */
    public void setPinCount(int pinCount) {
        this.pinCount = pinCount;
    }
    
    
}


class CapacitorInfo extends ProductInfo{
    private capacitorCat mainCategory;
}



//Pick the additional category and subcategory



//General Product Enums --> 
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

// Capacitor Enums

//Turn these into subclasses extending the capactiorInfo this is bad....
enum capacitorCat{
    accessories,
    aluminumPolymer,
    aluminumElectrolytic,
    capacitoryNetworksArrays,
    ceramicCapacitors,
    electricDoubleLayerCapacitorsSuperCapacitors,
    filmCapacitors,
    micaPTFECapacitors,
    niobiumOxiodeCapacitors,
    siliconCapacitors,
    tantalumPolymerCapacitors,
    tantalumCapacitors,
    thinFilmCapacitors,
    trimmersVariableCapacitors,
    unknown
}

// Resistor Enums

//Turn these into subclasses extending the resistorInfo
enum resistorCat{
    accessories,
    chassisMountResistors,
    chipResistorSurface,
    precisionTrimmedResistors,
    resistorNetworksArrays,
    specializedResistors,
    throughHoleResistors,
    unknown
}

enum circuitType{
    bussed,
    decadeResistor,
    dualTerminator,
    isolated,
    r2rLadder,
    voltageDivider,
    unknown
}


