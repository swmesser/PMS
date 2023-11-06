package PMS.V2;

/* 
 * File: InductorCoilAndChokesInfo
 * Copy: Copyright (c) 2023 Samuel W. Messer
 * BlazerID: swmesser
 * Vers: 1.0.0 Oct 25, 2023 SWM - Original Coding
 * Desc: Driver for testing concepts
 */

public abstract class InductorCoilAndChokesInfo extends ProductInfo{
    private String tolerance;
    private InductorMountingType mount;
    private String packageCase;

    public InductorCoilAndChokesInfo() {
        super();
        this.tolerance = "";
        this.mount = InductorMountingType.Unknown;
        this.packageCase = "";
    }

    public InductorCoilAndChokesInfo(String tolerance, InductorMountingType mount, String packageCase, String itemId, String name, String description, String mfg, String mfgPartNum, String series, int qty, double price) throws Exception {
        super(itemId, name, description, mfg, mfgPartNum, series, qty, price);
        
        if ((tolerance.length() == 0) || (tolerance == null)){
            throw new Exception("Error: Invalid tolerance passed!");
        } else if ((packageCase.length() == 0) || (packageCase == null)){
            throw new Exception("Error: Invalid packageCase passed!");
        } else {
            this.tolerance = tolerance;
            this.mount = mount;
            this.packageCase = packageCase;
        }
    }
    
    @Override
    public String toCSV() {
        String output = "";
        
        output += super.toCSV(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += this.getTolerance() + ",";
        output += this.getMount() + ",";
        output += this.getPackageCase() + ",";
        
        return(output);
    }

    @Override
    public String toCustom() {
        String output = "";
        
        output += super.toCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "Tolerance: " + this.getTolerance() + "\n";
        output += "Mount: " + this.getMount() + "\n";
        output += "Package Case: " + this.getPackageCase() + "\n";
        
        return(output);
    }

    @Override
    public String toXML() {
        String output = "";
        
        output += super.toXML(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "<InductorCoilAndChokesInfo>\n";
        output += "     <tolerance>" + this.getTolerance() + "</tolerance>\n";
        output += "     <mount>" + this.getMount() + "</mount>\n";
        output += "     <packageCase>" + this.getPackageCase() + "</packageCase>\n";
        output += "</InductorCoilAndChokesInfo>\n";
        
        return(output);
    }
    
    

    /**
     * @return the tolerance
     */
    public String getTolerance() {
        return (this.tolerance);
    }

    /**
     * @param tolerance the tolerance to set
     */
    public void setTolerance(String tolerance) {
        this.tolerance = tolerance;
    }

    /**
     * @return the mount
     */
    public InductorMountingType getMount() {
        return (this.mount);
    }

    /**
     * @param mount the mount to set
     */
    public void setMount(InductorMountingType mount) {
        this.mount = mount;
    }

    /**
     * @return the packageCase
     */
    public String getPackageCase() {
        return (this.packageCase);
    }

    /**
     * @param packageCase the packageCase to set
     */
    public void setPackageCase(String packageCase) {
        this.packageCase = packageCase;
    }

}

final class AdjustableInductors extends InductorCoilAndChokesInfo {
    private String inductance;
    private String qAtFreq;
    private String height;
    private String size;

    public AdjustableInductors() {
        super();
        this.inductance = "";
        this.qAtFreq = "";
        this.height = "";
        this.size = "";
    }

    public AdjustableInductors(String inductance, String qAtFreq, String height, String size, String tolerance, InductorMountingType mount, String packageCase, String itemId, String name, String description, String mfg, String mfgPartNum, String series, int qty, double price) throws Exception {
        super(tolerance, mount, packageCase, itemId, name, description, mfg, mfgPartNum, series, qty, price);
        this.inductance = inductance;
        this.qAtFreq = qAtFreq;
        this.height = height;
        this.size = size;
    }
    
    @Override
    public String toCSV() {
        String output = "";
        
        output += super.toCSV(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += this.getInductance() + ",";
        output += this.getqAtFreq() + ",";
        output += this.getHeight() + ",";
        output += this.getSize() + "\n";
        
        return(output);
    }

    @Override
    public String toCustom() {
        String output = "";
        
        output += super.toCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "Inductance: " + this.getInductance() + "\n";
        output += "Q At Frequency: " + this.getqAtFreq() + "\n";
        output += "Height: " + this.getHeight() + "\n";
        output += "Size: " + this.getSize() + "\n";
        
        return(output);
    }

    @Override
    public String toXML() {
        String output = "";
        
        output += super.toXML(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "<AdjustableInductors>\n";
        output += "     <inductance>" + this.getInductance() + "</inductance>\n";
        output += "     <qAtFreq>" + this.getqAtFreq() + "</qAtFreq>\n";
        output += "     <height>" + this.getHeight() + "</height>\n";
        output += "     <size>" + this.getSize() + "</size>\n";
        output += "</AdjustableInductors>\n";
        
        return(output);
    }

    /**
     * @return the inductance
     */
    public String getInductance() {
        return (this.inductance);
    }

    /**
     * @param inductance the inductance to set
     */
    public void setInductance(String inductance) {
        this.inductance = inductance;
    }

    /**
     * @return the qAtFreq
     */
    public String getqAtFreq() {
        return (this.qAtFreq);
    }

    /**
     * @param qAtFreq the qAtFreq to set
     */
    public void setqAtFreq(String qAtFreq) {
        this.qAtFreq = qAtFreq;
    }

    /**
     * @return the height
     */
    public String getHeight() {
        return (this.height);
    }

    /**
     * @param height the height to set
     */
    public void setHeight(String height) {
        this.height = height;
    }

    /**
     * @return the size
     */
    public String getSize() {
        return (this.size);
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }
    
}

final class ArraysAndSignalTransformerInfo extends InductorCoilAndChokesInfo {
    private int coilNumber;
    //String b/c you need to have the unit for each parameter
    private String parallelInductance;
    private String seriesInductance;
    private String parallelCurrentRating;
    private String seriesCurrentRating;
    private String parallelCurrentSaturation;
    private String seriesCurrentSaturation;
    private String parallelDCResistance;
    private String seriesDCResistance;
    private String operatingTemp;
    private ArrayInductorShielding shielding;
    private InductorRating rating;
    private String height;
    private String size;

    public ArraysAndSignalTransformerInfo() {
        super();
        this.coilNumber = 0;
        this.parallelInductance = "";
        this.seriesInductance = "";
        this.parallelCurrentRating = "";
        this.seriesCurrentRating = "";
        this.parallelCurrentSaturation = "";
        this.seriesCurrentSaturation = "";
        this.parallelDCResistance = "";
        this.seriesDCResistance = "";
        this.operatingTemp = "";
        this.size = "";
        this.height = "";
        this.shielding = ArrayInductorShielding.Unknown;
        this.rating = InductorRating.Unknown;
    }

    public ArraysAndSignalTransformerInfo(int coilNumber, String parallelInductance, String seriesInductance, String parallelCurrentRating, String seriesCurrentRating, String parallelCurrentSaturation, String seriesCurrentSaturation, String parallelDCResistance, String seriesDCResistance, String operatingTemp, ArrayInductorShielding shielding, InductorRating rating, String height, String size, String tolerance, InductorMountingType mount, String packageCase, String itemId, String name, String description, String mfg, String mfgPartNum, String series, int qty, double price) throws Exception {
        super(tolerance, mount, packageCase, itemId, name, description, mfg, mfgPartNum, series, qty, price);
        
        if ( coilNumber < 0 ){
            throw new Exception("Error: Invalid coil number passed!");
        } else if ((parallelInductance.length() == 0) || (parallelInductance == null)){
            throw new Exception("Error: Invalid parallel inductance passed!");
        } else if ((seriesInductance.length() == 0) || (seriesInductance == null)){
            throw new Exception("Error: Invalid series inductance passed!");
        } else if ((parallelCurrentRating.length() == 0) || (parallelCurrentRating == null)){
            throw new Exception("Error: Invalid parallel current rating passed!");
        } else if ((seriesCurrentRating.length() == 0) || (seriesCurrentRating == null)){
            throw new Exception("Error: Invalid series current rating passed!");
        } else if ((parallelCurrentSaturation.length() == 0) || (parallelCurrentSaturation == null)){
            throw new Exception("Error: Invalid parallel current saturation passed!");
        } else if ((seriesCurrentSaturation.length() == 0) || (seriesCurrentSaturation == null)){
            throw new Exception("Error: Invalid series current saturation passed!");
        } else if ((parallelDCResistance.length() == 0) || (parallelDCResistance == null)){
            throw new Exception("Error: Invalid parallel DC resistance passed!");
        } else if ((operatingTemp.length() == 0) || (operatingTemp == null)){
            throw new Exception("Error:Invalid parallel DC resistance passed!");
        } else if (( height.length() == 0) || (height == null)){
            throw new Exception("Error: Invalid height passed!");
        } else if ((size.length() == 0) || (size == null)){
            throw new Exception("Error: Invalid size passed!");
        } else {
            this.coilNumber = coilNumber;
            this.parallelInductance = parallelInductance;
            this.seriesInductance = seriesInductance;
            this.parallelCurrentRating = parallelCurrentRating;
            this.seriesCurrentRating = seriesCurrentRating;
            this.parallelCurrentSaturation = parallelCurrentSaturation;
            this.seriesCurrentSaturation = seriesCurrentSaturation;
            this.parallelDCResistance = parallelDCResistance;
            this.seriesDCResistance = seriesDCResistance;
            this.operatingTemp = operatingTemp;
            this.shielding = shielding;
            this.rating = rating;
            this.height = height;
            this.size = size;
        }
    }
    
    @Override
    public String toCSV() {
        String output = "";
        
        output += super.toCSV(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += this.getCoilNumber() + ",";
        output += this.getParallelInductance() + ",";
        output += this.getSeriesInductance() + ",";
        output += this.getParallelCurrentRating() + ",";
        output += this.getSeriesCurrentRating() + ",";
        output += this.getParallelCurrentSaturation() + ",";
        output += this.getSeriesCurrentSaturation() + ",";
        output += this.getParallelDCResistance() + ",";
        output += this.getSeriesDCResistance() + ",";
        output += this.getOperatingTemp() + ",";
        output += this.getShielding() + ",";
        output += this.getRating() + ",";
        output += this.getHeight() + ",";
        output += this.getSize() + "\n";
        
        return(output);
    }

    @Override
    public String toCustom() {
        String output = "";
        
        output += super.toCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "Coil Number: " + this.getCoilNumber() + "\n";
        output += "Parallel Inductance: " + this.getParallelInductance() + "\n";
        output += "Series Inductance: " + this.getSeriesInductance() + "\n";
        output += "Parallel Current Rating: " + this.getParallelCurrentRating() + "\n";
        output += "Series Current Rating: " + this.getSeriesCurrentRating() + "\n";
        output += "Parallel Current Saturation: " + this.getParallelCurrentSaturation() + "\n";
        output += "Series Current Saturation: " + this.getSeriesCurrentSaturation() + "\n";
        output += "Parallel DC Resistance: " + this.getParallelDCResistance() + "\n";
        output += "Series DC Resistance: " + this.getSeriesDCResistance() + "\n";
        output += "Operating Temp: " + this.getOperatingTemp() + "\n";
        output += "Shielding: " + this.getShielding() + "\n";
        output += "Rating: " + this.getRating() + "\n";
        output += "Height: " + this.getHeight() + "\n";
        output += "Size: " + this.getSize() + "\n";
        
        return(output);
    }

    @Override
    public String toXML() {
        String output = "";
        
        output += super.toXML(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "<ArraysAndSignalTransformerInfo>\n";
        output += "     <coilNumber>" + this.getCoilNumber() + "</coilNumber>\n";
        output += "     <parallelInductance>" + this.getParallelInductance() + "</parallelInductance>\n";
        output += "     <seriesInductance>" + this.getSeriesInductance() + "</seriesInductance>\n";
        output += "     <parallelCurrentRating>" + this.getParallelCurrentRating() + "</parallelCurrentRating>\n";
        output += "     <seriesCurrentRating>" + this.getSeriesCurrentRating() + "</seriesCurrentRating>\n";
        output += "     <parallelCurrentSaturation>" + this.getParallelCurrentSaturation() + "</parallelCurrentSaturation>\n";
        output += "     <seriesCurrentSaturation>" + this.getSeriesCurrentSaturation() + "</seriesCurrentSaturation>\n";
        output += "     <parallelDCResistance>" + this.getParallelDCResistance() + "</parallelDCResistance>\n";
        output += "     <seriesDCResistance>" + this.getSeriesDCResistance() + "</seriesDCResistance>\n";
        output += "     <operatingTemp>" + this.getOperatingTemp() + "</operatingTemp>\n";
        output += "     <shielding>" + this.getShielding() + "</shielding>\n";
        output += "     <rating>" + this.getRating() + "</rating>\n";
        output += "     <height>" + this.getHeight() + "</height>\n";
        output += "     <size>" + this.getSize() + "</size>\n";
        output += "</ArraysAndSignalTransformerInfo>\n";
        
        return(output);
    }

    public static ArraysAndSignalTransformerInfo fromCSV( String input ) throws Exception {
        ArraysAndSignalTransformerInfo arraysAndSignalTransformer = new ArraysAndSignalTransformerInfo();
        String[] Chunks;
        //Product
        String id = "";
        String name = "";
        String description = "";
        String series = "";
        String manufacturer = "";
        String mfgPartNum = "";
        int qtyAvailable = 0;
        double price = 0.0;
        StockOption stock;
        EnvironmentalOption hazard;
        MediaOption media;
        PackageOption shippingBox;
        ProductStatus status;
        //InductorCoilAndChoke
        String tolerance = "";
        InductorMountingType mount;
        String packageCase = "";
        //ArraysAndSignalTransformer
        int coilNumber;
        String parallelInductance;
        String seriesInductance;
        String parallelCurrentRating;
        String seriesCurrentRating;
        String parallelCurrentSaturation;
        String seriesCurrentSaturation;
        String parallelDCResistance;
        String seriesDCResistance;
        String operatingTemp;
        ArrayInductorShielding shielding;
        InductorRating rating;
        String height;
        String size;
        
        //Validate input 
        if ( input == null ){
            throw new Exception("Error: Null input for parsing!");
        } else if ( input.length() == 0 ){
            throw new Exception("Error: Zero length string provided!");
        } else {
            //Split line based on comma
            Chunks = input.split(",");
            if ( Chunks.length == 30 ){
                //Assign all parameters
                //ProductInfo Params
                id = Chunks[ 0 ];
                name = Chunks[ 1 ];
                description = Chunks[ 2 ];
                manufacturer = Chunks[ 3 ];
                mfgPartNum = Chunks[ 4 ];
                series = Chunks[ 5 ];
                stock = StockOption.valueOf( Chunks[ 6 ]);
                hazard = EnvironmentalOption.valueOf( Chunks[ 7 ]);
                media = MediaOption.valueOf( Chunks[ 8 ]);
                shippingBox = PackageOption.valueOf( Chunks[ 9 ]);
                status = ProductStatus.valueOf( Chunks[ 10 ]);
                qtyAvailable = Integer.valueOf(Chunks[ 11 ]);
                price = Double.valueOf( Chunks[ 12 ]);
                //==================
                //InductorCoilAndChokeInfo Params
                tolerance = Chunks[ 13 ];
                mount = InductorMountingType.valueOf( Chunks[ 14 ]);
                packageCase = Chunks[ 15 ];
                //==================
                //ArraysAndSignalsTranformerInfo Params
                coilNumber = Integer.parseInt( Chunks[ 16 ]);
                parallelInductance = Chunks[ 17 ];
                seriesInductance = Chunks[ 18 ];
                parallelCurrentRating = Chunks[ 19 ];
                seriesCurrentRating = Chunks[ 20 ];
                parallelCurrentSaturation = Chunks[ 21 ];
                seriesCurrentSaturation = Chunks[ 22 ];
                parallelDCResistance = Chunks[ 23 ];
                seriesDCResistance = Chunks[ 24 ];
                operatingTemp = Chunks[ 25 ];
                shielding = ArrayInductorShielding.valueOf( Chunks[ 26 ] );
                rating = InductorRating.valueOf( Chunks[ 27 ] );
                height = Chunks[ 28 ];
                size = Chunks[ 29 ];
                
                arraysAndSignalTransformer = new ArraysAndSignalTransformerInfo(coilNumber, parallelInductance, seriesInductance,
                        parallelCurrentRating, seriesCurrentRating, parallelCurrentSaturation, seriesCurrentSaturation,
                        parallelDCResistance, seriesDCResistance, operatingTemp, shielding, rating,
                        height, size, tolerance, mount, packageCase, id, name, description, id, mfgPartNum, series, qtyAvailable, price);
            }
        }
        
        return( arraysAndSignalTransformer );
    }
    
    public static ArraysAndSignalTransformerInfo fromCustom( String input ) throws Exception {
        ArraysAndSignalTransformerInfo arraysAndSignalTransformer = new ArraysAndSignalTransformerInfo();
        String[] Chunks;
        String[] Lines;
        String line;
        String chunk;
        //Product
        String id = "";
        String name = "";
        String description = "";
        String series = "";
        String manufacturer = "";
        String mfgPartNum = "";
        int qtyAvailable = 0;
        double price = 0.0;
        StockOption stock;
        EnvironmentalOption hazard;
        MediaOption media;
        PackageOption shippingBox;
        ProductStatus status;
        //InductorCoilAndChoke
        String tolerance = "";
        InductorMountingType mount;
        String packageCase = "";
        //ArraysAndSignalTransformer
        int coilNumber;
        String parallelInductance;
        String seriesInductance;
        String parallelCurrentRating;
        String seriesCurrentRating;
        String parallelCurrentSaturation;
        String seriesCurrentSaturation;
        String parallelDCResistance;
        String seriesDCResistance;
        String operatingTemp;
        ArrayInductorShielding shielding;
        InductorRating rating;
        String height;
        String size;
        
        
        if ( input == null ){
            throw new Exception("Error: Null input passed!");
        } else if ( input.length() == 0 ){
            throw new Exception("Error: Zero length string passed!");
        } else {
            //Splitting the input into line segments
            Lines = input.split("\\n");
            for ( int index = 0; index < Lines.length; index++ ){
                //Getting a singlular line segment
                line = Lines[ index ];
                //Getting the parts of each segment
                Chunks = line.split(": ");
                if ( Chunks[ 1 ].length() == 0 ){
                    System.out.println("Error: Zero length value was provided!");
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Item Id") == true ){
                    id = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Name") == true ){
                    name = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Description") == true ){
                    description = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Manufacturer") == true ){
                    manufacturer = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Manufacturer Part Number") == true ){
                    mfgPartNum = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Series") == true ){
                    series = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Availability") == true ){
                    stock = StockOption.valueOf( Chunks[1] );
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Product Status") == true ){
                    status = ProductStatus.valueOf( Chunks[1] );
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Media") == true ){
                    media = MediaOption.valueOf( Chunks[1] );
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Environmental Options") == true ){
                    hazard = EnvironmentalOption.valueOf( Chunks[1] );
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Packaging") == true ){
                    packageCase = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Quantity") == true ){
                    qtyAvailable = Integer.valueOf( Chunks[1] );
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Price") == true ){
                    price = Double.valueOf( Chunks[1] );
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Tolerance") == true ){
                    tolerance = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Mount") == true ){
                    mount = InductorMountingType.valueOf( Chunks[1] );
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Package Case") == true ){
                    packageCase = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Coil Number") == true ){
                    coilNumber = Integer.parseInt( Chunks[ 1 ]);
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Parallel Inductance") == true ){
                    parallelInductance = Chunks[ 1 ];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Series Inductance") == true ){
                    seriesInductance = Chunks[ 1 ];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Parallel Current Rating") == true ){
                    parallelCurrentRating = Chunks[ 1 ];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Series Current Rating") == true ){
                    seriesCurrentRating = Chunks[ 1 ];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Parallel Current Saturation") == true ){
                    parallelCurrentSaturation = Chunks[ 1 ];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Series Current Saturation") == true ){
                    seriesCurrentSaturation = Chunks[ 1 ];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Parallel DC Resistance") == true ){
                    parallelDCResistance = Chunks[ 1 ];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Series DC Resistance") == true ){
                    seriesDCResistance = Chunks[ 1 ];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Operating Temp") == true ){
                    operatingTemp = Chunks[ 1 ];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Shielding") == true ){
                    shielding = ArrayInductorShielding.valueOf( Chunks[ 1 ]);
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Rating") == true ){
                    rating = InductorRating.valueOf( Chunks[ 1 ]);
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Height") == true ){
                    height = Chunks[ 1 ];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Size") == true ){
                    size = Chunks[ 1 ];
                } else {
                    System.out.println("Error: Invalid field passed!");
                }
            }
        }
                    
        return( arraysAndSignalTransformer );
    }
    
    /**
     * @return the coilNumber
     */
    public int getCoilNumber() {
        return (this.coilNumber);
    }

    /**
     * @param coilNumber the coilNumber to set
     */
    public void setCoilNumber(int coilNumber) {
        this.coilNumber = coilNumber;
    }

    /**
     * @return the parallelInductance
     */
    public String getParallelInductance() {
        return (this.parallelInductance);
    }

    /**
     * @param parallelInductance the parallelInductance to set
     */
    public void setParallelInductance(String parallelInductance) {
        this.parallelInductance = parallelInductance;
    }

    /**
     * @return the seriesInductance
     */
    public String getSeriesInductance() {
        return (this.seriesInductance);
    }

    /**
     * @param seriesInductance the seriesInductance to set
     */
    public void setSeriesInductance(String seriesInductance) {
        this.seriesInductance = seriesInductance;
    }

    /**
     * @return the parallelCurrentRating
     */
    public String getParallelCurrentRating() {
        return (this.parallelCurrentRating);
    }

    /**
     * @param parallelCurrentRating the parallelCurrentRating to set
     */
    public void setParallelCurrentRating(String parallelCurrentRating) {
        this.parallelCurrentRating = parallelCurrentRating;
    }

    /**
     * @return the seriesCurrentRating
     */
    public String getSeriesCurrentRating() {
        return (this.seriesCurrentRating);
    }

    /**
     * @param seriesCurrentRating the seriesCurrentRating to set
     */
    public void setSeriesCurrentRating(String seriesCurrentRating) {
        this.seriesCurrentRating = seriesCurrentRating;
    }

    /**
     * @return the parallelCurrentSaturation
     */
    public String getParallelCurrentSaturation() {
        return (this.parallelCurrentSaturation);
    }

    /**
     * @param parallelCurrentSaturation the parallelCurrentSaturation to set
     */
    public void setParallelCurrentSaturation(String parallelCurrentSaturation) {
        this.parallelCurrentSaturation = parallelCurrentSaturation;
    }

    /**
     * @return the seriesCurrentSaturation
     */
    public String getSeriesCurrentSaturation() {
        return (this.seriesCurrentSaturation);
    }

    /**
     * @param seriesCurrentSaturation the seriesCurrentSaturation to set
     */
    public void setSeriesCurrentSaturation(String seriesCurrentSaturation) {
        this.seriesCurrentSaturation = seriesCurrentSaturation;
    }

    /**
     * @return the parallelDCResistance
     */
    public String getParallelDCResistance() {
        return (this.parallelDCResistance);
    }

    /**
     * @param parallelDCResistance the parallelDCResistance to set
     */
    public void setParallelDCResistance(String parallelDCResistance) {
        this.parallelDCResistance = parallelDCResistance;
    }

    /**
     * @return the seriesDCResistance
     */
    public String getSeriesDCResistance() {
        return (this.seriesDCResistance);
    }

    /**
     * @param seriesDCResistance the seriesDCResistance to set
     */
    public void setSeriesDCResistance(String seriesDCResistance) {
        this.seriesDCResistance = seriesDCResistance;
    }

    /**
     * @return the operatingTemp
     */
    public String getOperatingTemp() {
        return (this.operatingTemp);
    }

    /**
     * @param operatingTemp the operatingTemp to set
     */
    public void setOperatingTemp(String operatingTemp) {
        this.operatingTemp = operatingTemp;
    }

    /**
     * @return the shielding
     */
    public ArrayInductorShielding getShielding() {
        return (this.shielding);
    }

    /**
     * @param shielding the shielding to set
     */
    public void setShielding(ArrayInductorShielding shielding) {
        this.shielding = shielding;
    }

    /**
     * @return the rating
     */
    public InductorRating getRating() {
        return (this.rating);
    }

    /**
     * @param rating the rating to set
     */
    public void setRating(InductorRating rating) {
        this.rating = rating;
    }

    /**
     * @return the height
     */
    public String getHeight() {
        return (this.height);
    }

    /**
     * @param height the height to set
     */
    public void setHeight(String height) {
        this.height = height;
    }

    /**
     * @return the size
     */
    public String getSize() {
        return (this.size);
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }
    
}

final class FixedInductorInfo extends InductorCoilAndChokesInfo {
    private String coreMaterial;
    private String inductance;
    private String currentRating;
    private String currentSaturation;
    private String inductorType;
    private FixedInductorShielding shielding;
    private String dcResistance;
    private String qAtFreq;
    private String selfResonantFreq;
    private InductorRating rating;
    private String operatingTemp;
    private String inductanceFreqTest;
    private String features;
    private String supplierDevicePackage;
    private String size;
    private String seatedHeight;

    public FixedInductorInfo() {
        super();
        this.coreMaterial = "";
        this.inductance = "";
        this.currentRating = "";
        this.currentSaturation = "";
        this.inductorType = "";
        this.shielding = FixedInductorShielding.Unknown;
        this.dcResistance = "";
        this.qAtFreq = "";
        this.selfResonantFreq = "";
        this.rating = InductorRating.Unknown;
        this.operatingTemp = "";
        this.inductanceFreqTest = "";
        this.features = "";
        this.supplierDevicePackage = "";
        this.size = "";
        this.seatedHeight = "";
    }

    public FixedInductorInfo(String coreMaterial, String inductance, String currentRating, String currentSaturation, String inductorType, FixedInductorShielding shielding, String dcResistance, String qAtFreq, String selfResonantFreq, InductorRating rating, String operatingTemp, String inductanceFreqTest, String features, String supplierDevicePackage, String size, String seatedHeight, String tolerance, InductorMountingType mount, String packageCase, String itemId, String name, String description, String mfg, String mfgPartNum, String series, int qty, double price) throws Exception {
        super(tolerance, mount, packageCase, itemId, name, description, mfg, mfgPartNum, series, qty, price);
        
        if ((coreMaterial.length() == 0) || (coreMaterial == null)){
            throw new Exception("Error: Invalid core material passed!");
        } else if ((inductance.length() == 0) || (inductance == null)){
            throw new Exception("Error: Invalid inductance passed!");
        } else if ((currentRating.length() == 0) || (currentRating == null)){
            throw new Exception("Error: Invalid current rating passed!");
        } else if ((currentSaturation.length() == 0) || (currentSaturation == null)){
            throw new Exception("Error: Invalid current saturation passed!");
        } else if ((inductorType.length() == 0) || (inductorType == null)){
            throw new Exception("Error: Invalid inductor type passed!");
        } else if ((dcResistance.length() == 0) || (dcResistance == null)){
            throw new Exception("Error: Invalid DC resistance passed!");
        } else if ((qAtFreq.length() == 0) || (qAtFreq == null)){
            throw new Exception("Error: Invalid q at frequency passed!");
        } else if ((selfResonantFreq.length() == 0) || (selfResonantFreq == null)){
            throw new Exception("Error: Invalid self resonant frequency passed!");
        } else if ((operatingTemp.length() == 0) || (operatingTemp == null)){
            throw new Exception("Error: Invalid operating temperature passed!");
        } else if ((inductanceFreqTest.length() == 0) || (inductanceFreqTest == null)){
            throw new Exception("Error: Invalid inductance frequency test passed!");
        } else if ((features.length() == 0) || (features == null)){
            throw new Exception("Error: Invalid features passed!");
        } else if ((supplierDevicePackage.length() == 0) || (supplierDevicePackage == null)){
            throw new Exception("Error: Invalid supplier device package passed!");
        } else if ((size.length() == 0) || (size == null)){
            throw new Exception("Error: Invalid size passed!");
        } else if ((seatedHeight.length() == 0) || (seatedHeight == null)){
            throw new Exception("Error: Invalid seated height passed!");
        } else {
            this.coreMaterial = coreMaterial;
            this.inductance = inductance;
            this.currentRating = currentRating;
            this.currentSaturation = currentSaturation;
            this.inductorType = inductorType;
            this.shielding = shielding;
            this.dcResistance = dcResistance;
            this.qAtFreq = qAtFreq;
            this.selfResonantFreq = selfResonantFreq;
            this.rating = rating;
            this.operatingTemp = operatingTemp;
            this.inductanceFreqTest = inductanceFreqTest;
            this.features = features;
            this.supplierDevicePackage = supplierDevicePackage;
            this.size = size;
            this.seatedHeight = seatedHeight;
        }
    }
    
    @Override
    public String toCSV() {
        String output = "";
        
        output += super.toCSV(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += this.getCoreMaterial() + ",";
        output += this.getInductance() + ",";
        output += this.getCurrentRating() + ",";
        output += this.getCurrentSaturation() + ",";
        output += this.getInductorType() + ",";
        output += this.getShielding() + ",";
        output += this.getDcResistance() + ",";
        output += this.getqAtFreq() + ",";
        output += this.getSelfResonantFreq() + ",";
        output += this.getRating() + ",";
        output += this.getOperatingTemp() + ",";
        output += this.getInductanceFreqTest() + ",";
        output += this.getFeatures() + ",";
        output += this.getSupplierDevicePackage() + ",";
        output += this.getSize() + ",";
        output += this.getSeatedHeight() + "\n";
        
        return(output);
    }

    @Override
    public String toCustom() {
        String output = "";
        
        output += super.toCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "Core Material: " + this.getCoreMaterial() + "\n";
        output += "Inductance: " + this.getInductance() + "\n";
        output += "Current Rating: " + this.getCurrentRating() + "\n";
        output += "Current Saturation: " + this.getCurrentSaturation() + "\n";
        output += "Inductor Type: " + this.getInductorType() + "\n";
        output += "Shielding: " + this.getShielding() + "\n";
        output += "DC Resistance: " + this.getDcResistance() + "\n";
        output += "Q At Freq: "  + this.getqAtFreq() + "\n";
        output += "Self Resonant Freq: " + this.getSelfResonantFreq() + "\n";
        output += "Rating: " + this.getRating() + "\n";
        output += "Operating Temp: " + this.getOperatingTemp() + "\n";
        output += "Inductance Freq Test: " + this.getInductanceFreqTest() + "\n";
        output += "Features: " + this.getFeatures() + "\n";
        output += "Supplier Device Package: " + this.getSupplierDevicePackage() + "\n";
        output += "Size: " + this.getSize() + "\n";
        output += "Seated Height: " + this.getSeatedHeight() + "\n";
        
        return(output);
    }

    @Override
    public String toXML() {
        String output = "";
        
        output += super.toXML(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "<FixedInductorInfo>\n";
        output += "     <coreMaterial>" + this.getCoreMaterial() + "</coreMaterial>\n";
        output += "     <inductance>" + this.getInductance() + "</inductance>\n";
        output += "     <currentRating>" + this.getCurrentRating() + "</currentRating>\n";
        output += "     <currentSaturation>" + this.getCurrentSaturation() + "</currentSaturation>\n";
        output += "     <inductorType>" + this.getInductorType() + "</inductorType>\n";
        output += "     <shielding>" + this.getShielding() + "</shielding>\n";
        output += "     <dcResistance>" + this.getDcResistance() + "</dcResistance>\n";
        output += "     <qAtFreq>" + this.getqAtFreq() + "</qAtFreq>\n";
        output += "     <selfResonantFreq>" + this.getSelfResonantFreq() + "</selfResonantFreq>\n";
        output += "     <rating>" + this.getRating() + "</rating>\n";
        output += "     <operatingTemp>" + this.getOperatingTemp() + "</operatingTemp>\n";
        output += "     <inductanceFreqTest>" + this.getInductanceFreqTest() + "</inductanceFreqTest>\n";
        output += "     <features>" + this.getFeatures() + "</features>\n";
        output += "     <supplierDevicePackage>" + this.getSupplierDevicePackage() + "</supplierDevicePackage>\n";
        output += "     <size>" + this.getSize() + "</size>\n";
        output += "     <seatedHeight>" + this.getSeatedHeight() + "</seatedHeight>\n";
        output += "</FixedInductorInfo>\n";
        
        return(output);
    }

    public static FixedInductorInfo fromCSV( String input ) throws Exception {
        FixedInductorInfo fixedInductor = new FixedInductorInfo();
        String[] Chunks;
        //Product
        String id = "";
        String name = "";
        String description = "";
        String series = "";
        String manufacturer = "";
        String mfgPartNum = "";
        int qtyAvailable = 0;
        double price = 0.0;
        StockOption stock;
        EnvironmentalOption hazard;
        MediaOption media;
        PackageOption shippingBox;
        ProductStatus status;
        //InductorCoilAndChoke
        String tolerance = "";
        InductorMountingType mount;
        String packageCase = "";
        String operationTemp = "";
        //FixedInductor
        String coreMaterial;
        String inductance;
        String currentRating;
        String currentSaturation;
        String inductorType;
        FixedInductorShielding shielding;
        String dcResistance;
        String qAtFreq;
        String selfResonantFreq;
        InductorRating rating;
        String operatingTemp;
        String inductanceFreqTest;
        String features;
        String supplierDevicePackage;
        String size;
        String seatedHeight;
        
        
        //Validate input 
        if ( input == null ){
            throw new Exception("Error: Null input for parsing!");
        } else if ( input.length() == 0 ){
            throw new Exception("Error: Zero length string provided!");
        } else {
            //Split line based on comma
            Chunks = input.split(",");
            if ( Chunks.length == 33 ){
                //Assign all parameters
                //ProductInfo Params
                id = Chunks[ 0 ];
                name = Chunks[ 1 ];
                description = Chunks[ 2 ];
                manufacturer = Chunks[ 3 ];
                mfgPartNum = Chunks[ 4 ];
                series = Chunks[ 5 ];
                stock = StockOption.valueOf( Chunks[ 6 ]);
                hazard = EnvironmentalOption.valueOf( Chunks[ 7 ]);
                media = MediaOption.valueOf( Chunks[ 8 ]);
                shippingBox = PackageOption.valueOf( Chunks[ 9 ]);
                status = ProductStatus.valueOf( Chunks[ 10 ]);
                qtyAvailable = Integer.valueOf(Chunks[ 11 ]);
                price = Double.valueOf( Chunks[ 12 ]);
                //==================
                //InductorCoilAndChokeInfo Params
                tolerance = Chunks[ 13 ];
                mount = InductorMountingType.valueOf( Chunks[ 14 ]);
                packageCase = Chunks[ 15 ];
                operationTemp = Chunks[ 16 ];
                //==================
                //FixedInductorInfo
                coreMaterial = Chunks[ 17 ];
                inductance = Chunks[ 18 ];
                currentRating = Chunks[ 19 ];
                currentSaturation = Chunks[ 20 ];
                inductorType = Chunks[ 21 ];
                shielding =FixedInductorShielding.valueOf( Chunks[ 22 ]);
                dcResistance = Chunks[ 23 ];
                qAtFreq = Chunks[ 24 ];
                selfResonantFreq = Chunks[ 25 ];
                rating = InductorRating.valueOf( Chunks[ 26 ]);
                operatingTemp = Chunks[ 27 ];
                inductanceFreqTest = Chunks[ 28 ];
                features = Chunks[ 29 ];
                supplierDevicePackage = Chunks[ 30 ];
                size = Chunks[ 31 ];
                seatedHeight = Chunks[ 32 ];
                
                fixedInductor = new FixedInductorInfo(coreMaterial, inductance, currentRating,
                        currentSaturation, inductorType, shielding, dcResistance, qAtFreq, 
                        selfResonantFreq, rating, operatingTemp, inductanceFreqTest, features,
                        supplierDevicePackage, size, seatedHeight, tolerance, mount,
                        packageCase, id, name, description, id, mfgPartNum, series, qtyAvailable, price);
            }
        }
        return( fixedInductor );
    }
    
    public static FixedInductorInfo fromCustom( String input ) throws Exception{
        FixedInductorInfo fixedInductor = new FixedInductorInfo();
        String[] Chunks;
        String[] Lines;
        String chunk;
        String line;
        //Product
        String id = "";
        String name = "";
        String description = "";
        String series = "";
        String manufacturer = "";
        String mfgPartNum = "";
        int qtyAvailable = 0;
        double price = 0.0;
        StockOption stock;
        EnvironmentalOption hazard;
        MediaOption media;
        PackageOption shippingBox;
        ProductStatus status;
        //InductorCoilAndChoke
        String tolerance = "";
        InductorMountingType mount = InductorMountingType.Unknown;
        String packageCase = "";
        //FixedInductor
        String coreMaterial = "";
        String inductance = "";
        String currentRating = "";
        String currentSaturation = "";
        String inductorType = "";
        FixedInductorShielding shielding = FixedInductorShielding.Unknown;
        String dcResistance = "";
        String qAtFreq = "";
        String selfResonantFreq = "";
        InductorRating rating = InductorRating.Unknown;
        String operatingTemp = "";
        String inductanceFreqTest = "";
        String features = "";
        String supplierDevicePackage = "";
        String size = "";
        String seatedHeight = "";
        
        
        if ( input == null ){
            throw new Exception("Error: Null input passed!");
        } else if ( input.length() == 0 ){
            throw new Exception("Error: Zero length string passed!");
        } else {
            //Splitting the input into line segments
            Lines = input.split("\\n");
            for ( int index = 0; index < Lines.length; index++ ){
                //Getting a singlular line segment
                line = Lines[ index ];
                //Getting the parts of each segment
                Chunks = line.split(": ");
                if ( Chunks[ 1 ].length() == 0 ){
                    System.out.println("Error: Zero length value was provided!");
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Item Id") == true ){
                    id = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Name") == true ){
                    name = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Description") == true ){
                    description = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Manufacturer") == true ){
                    manufacturer = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Manufacturer Part Number") == true ){
                    mfgPartNum = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Series") == true ){
                    series = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Availability") == true ){
                    stock = StockOption.valueOf( Chunks[1] );
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Product Status") == true ){
                    status = ProductStatus.valueOf( Chunks[1] );
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Media") == true ){
                    media = MediaOption.valueOf( Chunks[1] );
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Environmental Options") == true ){
                    hazard = EnvironmentalOption.valueOf( Chunks[1] );
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Packaging") == true ){
                    packageCase = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Quantity") == true ){
                    qtyAvailable = Integer.valueOf( Chunks[1] );
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Price") == true ){
                    price = Double.valueOf( Chunks[1] );
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Tolerance") == true ){
                    tolerance = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Mount") == true ){
                    mount = InductorMountingType.valueOf( Chunks[1] );
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Package Case") == true ){
                    packageCase = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Core Material") == true ){
                    coreMaterial = Chunks[1];
                }  else if ( Chunks[ 0 ].equalsIgnoreCase("Inductance") == true ){
                    inductance = Chunks[1];
                }  else if ( Chunks[ 0 ].equalsIgnoreCase("Current Rating") == true ){
                    currentRating = Chunks[1];
                }  else if ( Chunks[ 0 ].equalsIgnoreCase("Current Saturation") == true ){
                    currentSaturation = Chunks[1];
                }  else if ( Chunks[ 0 ].equalsIgnoreCase("Inductor Type") == true ){
                    inductorType = Chunks[1];
                }  else if ( Chunks[ 0 ].equalsIgnoreCase("Shielding") == true ){
                    shielding = FixedInductorShielding.valueOf( Chunks[1] );
                }  else if ( Chunks[ 0 ].equalsIgnoreCase("DC Resistance") == true ){
                    dcResistance = Chunks[1];
                }  else if ( Chunks[ 0 ].equalsIgnoreCase("Q At Freq") == true ){
                    qAtFreq = Chunks[1];
                }  else if ( Chunks[ 0 ].equalsIgnoreCase("Self Resonant Freq") == true ){
                    selfResonantFreq = Chunks[1];
                }  else if ( Chunks[ 0 ].equalsIgnoreCase("Rating") == true ){
                    rating = InductorRating.valueOf( Chunks[1] );
                }  else if ( Chunks[ 0 ].equalsIgnoreCase("Operating Temp") == true ){
                    operatingTemp = Chunks[1];
                }  else if ( Chunks[ 0 ].equalsIgnoreCase("Inductance Freq Test") == true ){
                    inductanceFreqTest = Chunks[1];
                }  else if ( Chunks[ 0 ].equalsIgnoreCase("Features") == true ){
                    features = Chunks[1];
                }  else if ( Chunks[ 0 ].equalsIgnoreCase("Supplier Device Package") == true ){
                    supplierDevicePackage = Chunks[1];
                }  else if ( Chunks[ 0 ].equalsIgnoreCase("Size") == true ){
                    size = Chunks[1];
                }  else if ( Chunks[ 0 ].equalsIgnoreCase("Seated Height") == true ){
                    seatedHeight = Chunks[1];
                } else {
                    System.out.println("Error: Invalid field provided!");
                }
                
                if ((id.length() != 0) && (name.length() > 0) && (description.length() > 0) &&
                        (qtyAvailable > 0) && (price > 0)){
                    fixedInductor = new FixedInductorInfo(coreMaterial, inductance, currentRating,
                            currentSaturation, inductorType, shielding, dcResistance, qAtFreq, 
                            selfResonantFreq, rating, operatingTemp, inductanceFreqTest, features,
                            supplierDevicePackage, size, seatedHeight, tolerance, mount,
                            packageCase, id, name, description, id, mfgPartNum, series, index, price);
                }
            }
        }
        
        return( fixedInductor );
    }
    
    /**
     * @return the coreMaterial
     */
    public String getCoreMaterial() {
        return (this.coreMaterial);
    }

    /**
     * @param coreMaterial the coreMaterial to set
     */
    public void setCoreMaterial(String coreMaterial) {
        this.coreMaterial = coreMaterial;
    }

    /**
     * @return the inductance
     */
    public String getInductance() {
        return (this.inductance);
    }

    /**
     * @param inductance the inductance to set
     */
    public void setInductance(String inductance) {
        this.inductance = inductance;
    }

    /**
     * @return the currentRating
     */
    public String getCurrentRating() {
        return (this.currentRating);
    }

    /**
     * @param currentRating the currentRating to set
     */
    public void setCurrentRating(String currentRating) {
        this.currentRating = currentRating;
    }

    /**
     * @return the currentSaturation
     */
    public String getCurrentSaturation() {
        return (this.currentSaturation);
    }

    /**
     * @param currentSaturation the currentSaturation to set
     */
    public void setCurrentSaturation(String currentSaturation) {
        this.currentSaturation = currentSaturation;
    }

    /**
     * @return the inductorType
     */
    public String getInductorType() {
        return (this.inductorType);
    }

    /**
     * @param inductorType the inductorType to set
     */
    public void setInductorType(String inductorType) {
        this.inductorType = inductorType;
    }

    /**
     * @return the shielding
     */
    public FixedInductorShielding getShielding() {
        return (this.shielding);
    }

    /**
     * @param shielding the shielding to set
     */
    public void setShielding(FixedInductorShielding shielding) {
        this.shielding = shielding;
    }

    /**
     * @return the dcResistance
     */
    public String getDcResistance() {
        return (this.dcResistance);
    }

    /**
     * @param dcResistance the dcResistance to set
     */
    public void setDcResistance(String dcResistance) {
        this.dcResistance = dcResistance;
    }

    /**
     * @return the qAtFreq
     */
    public String getqAtFreq() {
        return (this.qAtFreq);
    }

    /**
     * @param qAtFreq the qAtFreq to set
     */
    public void setqAtFreq(String qAtFreq) {
        this.qAtFreq = qAtFreq;
    }

    /**
     * @return the selfResonantFreq
     */
    public String getSelfResonantFreq() {
        return (this.selfResonantFreq);
    }

    /**
     * @param selfResonantFreq the selfResonantFreq to set
     */
    public void setSelfResonantFreq(String selfResonantFreq) {
        this.selfResonantFreq = selfResonantFreq;
    }

    /**
     * @return the rating
     */
    public InductorRating getRating() {
        return (this.rating);
    }

    /**
     * @param rating the rating to set
     */
    public void setRating(InductorRating rating) {
        this.rating = rating;
    }

    /**
     * @return the operatingTemp
     */
    public String getOperatingTemp() {
        return (this.operatingTemp);
    }

    /**
     * @param operatingTemp the operatingTemp to set
     */
    public void setOperatingTemp(String operatingTemp) {
        this.operatingTemp = operatingTemp;
    }

    /**
     * @return the inductanceFreqTest
     */
    public String getInductanceFreqTest() {
        return (this.inductanceFreqTest);
    }

    /**
     * @param inductanceFreqTest the inductanceFreqTest to set
     */
    public void setInductanceFreqTest(String inductanceFreqTest) {
        this.inductanceFreqTest = inductanceFreqTest;
    }

    /**
     * @return the features
     */
    public String getFeatures() {
        return (this.features);
    }

    /**
     * @param features the features to set
     */
    public void setFeatures(String features) {
        this.features = features;
    }

    /**
     * @return the supplierDevicePackage
     */
    public String getSupplierDevicePackage() {
        return (this.supplierDevicePackage);
    }

    /**
     * @param supplierDevicePackage the supplierDevicePackage to set
     */
    public void setSupplierDevicePackage(String supplierDevicePackage) {
        this.supplierDevicePackage = supplierDevicePackage;
    }

    /**
     * @return the size
     */
    public String getSize() {
        return (this.size);
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * @return the seatedHeight
     */
    public String getSeatedHeight() {
        return (this.seatedHeight);
    }

    /**
     * @param seatedHeight the seatedHeight to set
     */
    public void setSeatedHeight(String seatedHeight) {
        this.seatedHeight = seatedHeight;
    }
}

final class WirelessChargingCoilInfo extends InductorCoilAndChokesInfo {
    private String inductance;
    private WirelessCoilFunction function;
    private String type;
    private String qAtFreq;
    private String currentRating;
    private String selfResonantFreq;
    private String operatingTemp;
    private String size;

    public WirelessChargingCoilInfo() {
        super();
        this.inductance = "";
        this.function = WirelessCoilFunction.Unknown;
        this.type = "";
        this.qAtFreq = "";
        this.currentRating = "";
        this.selfResonantFreq = "";
        this.operatingTemp = "";
        this.size = "";
    }

    public WirelessChargingCoilInfo(String inductance, WirelessCoilFunction function, String type, String qAtFreq, String currentRating, String selfResonantFreq, String operatingTemp, String size, String tolerance, InductorMountingType mount, String packageCase, String itemId, String name, String description, String mfg, String mfgPartNum, String series, int qty, double price) throws Exception {
        super(tolerance, mount, packageCase, itemId, name, description, mfg, mfgPartNum, series, qty, price);
        
        if ((inductance.length() == 0) || (inductance == null)){
            throw new Exception("Error: Invalid inductance passed!");
        } else if ((type.length() == 0) || (type == null)){
            throw new Exception("Error: Invalid type passed!");
        } else if ((qAtFreq.length() == 0) || (qAtFreq == null)){
            throw new Exception("Error: Invalid q at frequency passed!");
        } else if ((selfResonantFreq.length() == 0) || (selfResonantFreq == null)){
            throw new Exception("Error: Invalid self resonant frequency passed!");
        } else if ((operatingTemp.length() == 0) || (operatingTemp == null)){
            throw new Exception("Error: Invalid operating temperature passed!");
        } else if ((size.length() == 0) || (size == null)){
            throw new Exception("Error: Invalid size passed!");
        } else {
            this.inductance = inductance;
            this.function = function;
            this.type = type;
            this.qAtFreq = qAtFreq;
            this.currentRating = currentRating;
            this.selfResonantFreq = selfResonantFreq;
            this.operatingTemp = operatingTemp;
            this.size = size;
        }
    } 
    
    @Override
    public String toCSV() {
        String output = "";
        
        output += super.toCSV(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += this.getInductance() + ",";
        output += this.getFunction() + ",";
        output += this.getType() + ",";
        output += this.getqAtFreq() + ",";
        output += this.getCurrentRating() + ",";
        output += this.getSelfResonantFreq() + ",";
        output += this.getOperatingTemp() + ",";
        output += this.getSize() + "\n";
        
        return(output);
    }

    @Override
    public String toCustom() {
        String output = "";
        
        output += super.toCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "Inductance: " + this.getInductance() + "\n";
        output += "Function: " + this.getFunction() + "\n";
        output += "Type: " + this.getType() + "\n";
        output += "Q At Freq: "  + this.getqAtFreq() + "\n";
        output += "Current Rating: " + this.getCurrentRating() + "\n";
        output += "Self Resonant Freq: " + this.getSelfResonantFreq() + "\n";
        output += "Operating Temp: " + this.getOperatingTemp() + "\n";
        output += "Size: " + this.getSize() + "\n";
        
        return(output);
    }

    @Override
    public String toXML() {
        String output = "";
        
        output += super.toXML(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "<WirelessCharingCoilInfo>\n";
        output += "     <inductance>" + this.getInductance() + "</inductance>\n";
        output += "     <function>" + this.getFunction() + "</function>\n";
        output += "     <type>" + this.getType() + "</type>\n";
        output += "     <qAtFreq>" + this.getqAtFreq() + "</qAtFreq>\n";
        output += "     <selfResonantFreq>" + this.getSelfResonantFreq() + "</selfResonantFreq>\n";
        output += "     <operatingTemp>" + this.getOperatingTemp() + "</operatingTemp>\n";
        output += "     <size>" + this.getSize() + "</size>\n";
        output += "</WirelessChargingCoilInfo>\n";
        
        return(output);
    }
    
    public static WirelessChargingCoilInfo fromCSV( String input ) throws Exception {
        WirelessChargingCoilInfo wirelessCoil = new WirelessChargingCoilInfo();
        String[] Chunks;
        //Product
        String id = "";
        String name = "";
        String description = "";
        String series = "";
        String manufacturer = "";
        String mfgPartNum = "";
        int qtyAvailable = 0;
        double price = 0.0;
        StockOption stock;
        EnvironmentalOption hazard;
        MediaOption media;
        PackageOption shippingBox;
        ProductStatus status;
        //InductorCoilAndChoke
        String tolerance = "";
        InductorMountingType mount;
        String packageCase = "";
        String operationTemp = "";
        //WirelessChargingCoil
        String inductance;
        WirelessCoilFunction function;
        String type;
        String qAtFreq;
        String currentRating;
        String selfResonantFreq;
        String operatingTemp;
        String size;
        
        
        //Validate input 
        if ( input == null ){
            throw new Exception("Error: Null input for parsing!");
        } else if ( input.length() == 0 ){
            throw new Exception("Error: Zero length string provided!");
        } else {
            //Split line based on comma
            Chunks = input.split(",");
            if ( Chunks.length == 24 ){
                //Assign all parameters
                //ProductInfo Params
                id = Chunks[ 0 ];
                name = Chunks[ 1 ];
                description = Chunks[ 2 ];
                manufacturer = Chunks[ 3 ];
                mfgPartNum = Chunks[ 4 ];
                series = Chunks[ 5 ];
                stock = StockOption.valueOf( Chunks[ 6 ]);
                hazard = EnvironmentalOption.valueOf( Chunks[ 7 ]);
                media = MediaOption.valueOf( Chunks[ 8 ]);
                shippingBox = PackageOption.valueOf( Chunks[ 9 ]);
                status = ProductStatus.valueOf( Chunks[ 10 ]);
                qtyAvailable = Integer.valueOf(Chunks[ 11 ]);
                price = Double.valueOf( Chunks[ 12 ]);
                //==================
                //InductorCoilAndChokeInfo Params
                tolerance = Chunks[ 13 ];
                mount = InductorMountingType.valueOf( Chunks[ 14 ]);
                packageCase = Chunks[ 15 ];
                operationTemp = Chunks[ 16 ];
                //==================
                //WirelessChargingCoilInfo Params
                inductance = Chunks[ 17 ];
                function = WirelessCoilFunction.valueOf( Chunks[ 18 ]);
                type = Chunks[ 19 ];
                qAtFreq = Chunks[ 20 ];
                currentRating = Chunks[ 21 ];
                selfResonantFreq = Chunks[ 22 ];
                operatingTemp = Chunks[ 23 ];
                size = Chunks[ 24 ];
                
                //Param validation -> constructor
                wirelessCoil = new WirelessChargingCoilInfo(inductance, function, type, qAtFreq,
                        currentRating, selfResonantFreq, operatingTemp, size, tolerance, 
                        mount, packageCase, id, name, description, id, 
                        mfgPartNum, series, qtyAvailable, price);
            }
        }
        
        return( wirelessCoil );
    }
    
    public static WirelessChargingCoilInfo fromCustom( String input ) throws Exception {
        WirelessChargingCoilInfo wirelessCoil = new WirelessChargingCoilInfo();
        String[] Chunks;
        String[] Lines;
        String chunk;
        String line;
        //Product
        String id = "";
        String name = "";
        String description = "";
        String series = "";
        String manufacturer = "";
        String mfgPartNum = "";
        int qtyAvailable = 0;
        double price = 0.0;
        StockOption stock;
        EnvironmentalOption hazard;
        MediaOption media;
        PackageOption shippingBox;
        ProductStatus status;
        //InductorCoilAndChoke
        String tolerance = "";
        InductorMountingType mount;
        String packageCase = "";
        String operationTemp = "";
        //WirelessChargingCoil
        String inductance;
        WirelessCoilFunction function;
        String type;
        String qAtFreq;
        String currentRating;
        String selfResonantFreq;
        String operatingTemp;
        String size;
        
        if ( input == null ){
            throw new Exception("Error: Null input passed!");
        } else if ( input.length() == 0 ){
            throw new Exception("Error: Zero length string passed!");
        } else {
            //Splitting the input into line segments
            Lines = input.split("\\n");
            for ( int index = 0; index < Lines.length; index++ ){
                //Getting a singlular line segment
                line = Lines[ index ];
                //Getting the parts of each segment
                Chunks = line.split(": ");
                if ( Chunks[ 1 ].length() == 0 ){
                    System.out.println("Error: Zero length value was provided!");
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Item Id") == true ){
                    id = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Name") == true ){
                    name = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Description") == true ){
                    description = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Manufacturer") == true ){
                    manufacturer = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Manufacturer Part Number") == true ){
                    mfgPartNum = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Series") == true ){
                    series = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Availability") == true ){
                    stock = StockOption.valueOf( Chunks[1] );
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Product Status") == true ){
                    status = ProductStatus.valueOf( Chunks[1] );
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Media") == true ){
                    media = MediaOption.valueOf( Chunks[1] );
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Environmental Options") == true ){
                    hazard = EnvironmentalOption.valueOf( Chunks[1] );
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Packaging") == true ){
                    packageCase = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Quantity") == true ){
                    qtyAvailable = Integer.valueOf( Chunks[1] );
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Price") == true ){
                    price = Double.valueOf( Chunks[1] );
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Tolerance") == true ){
                    tolerance = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Mount") == true ){
                    mount = InductorMountingType.valueOf( Chunks[1] );
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Package Case") == true ){
                    packageCase = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Inductance") == true ){
                    inductance = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Function") == true ){
                    function = WirelessCoilFunction.valueOf( Chunks[1] );
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Type") == true ){
                    type = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Q At Freq") == true ){
                    qAtFreq = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Current Rating") == true ){
                    currentRating = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Self Resonant Freq") == true ){
                    selfResonantFreq = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Operating Temp") == true ){
                    operatingTemp = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Size") == true ){
                    size = Chunks[1];
                }
                    
                
            }
        }
        
        return(wirelessCoil);
    }

    /**
     * @return the inductance
     */
    public String getInductance() {
        return (this.inductance);
    }

    /**
     * @param inductance the inductance to set
     */
    public void setInductance(String inductance) {
        this.inductance = inductance;
    }

    /**
     * @return the function
     */
    public WirelessCoilFunction getFunction() {
        return (this.function);
    }

    /**
     * @param function the function to set
     */
    public void setFunction(WirelessCoilFunction function) {
        this.function = function;
    }

    /**
     * @return the type
     */
    public String getType() {
        return (this.type);
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the qAtFreq
     */
    public String getqAtFreq() {
        return (this.qAtFreq);
    }

    /**
     * @param qAtFreq the qAtFreq to set
     */
    public void setqAtFreq(String qAtFreq) {
        this.qAtFreq = qAtFreq;
    }

    /**
     * @return the currentRating
     */
    public String getCurrentRating() {
        return (this.currentRating);
    }

    /**
     * @param currentRating the currentRating to set
     */
    public void setCurrentRating(String currentRating) {
        this.currentRating = currentRating;
    }

    /**
     * @return the selfResonantFreq
     */
    public String getSelfResonantFreq() {
        return (this.selfResonantFreq);
    }

    /**
     * @param selfResonantFreq the selfResonantFreq to set
     */
    public void setSelfResonantFreq(String selfResonantFreq) {
        this.selfResonantFreq = selfResonantFreq;
    }

    /**
     * @return the operatingTemp
     */
    public String getOperatingTemp() {
        return (this.operatingTemp);
    }

    /**
     * @param operatingTemp the operatingTemp to set
     */
    public void setOperatingTemp(String operatingTemp) {
        this.operatingTemp = operatingTemp;
    }

    /**
     * @return the size
     */
    public String getSize() {
        return (this.size);
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }
}

enum ArrayInductorShielding{
    Shielded,
    Unshielded,
    Unknown
}

enum FixedInductorShielding{
    Shielded,
    Semi_Shielding,
    Unshielded,
    Unknown
}

enum WirelessCoilFunction{
    Receiver,
    ReceiverTransmitter,
    Transmitter,
    Unknown
}

enum InductorMountingType{
    ChassisMount,
    FreeHanging,
    SurfaceMount,
    ThroughHole,
    UserDefined,
    Unknown
}

enum InductorRating{
    AEC_Q200,
    Unknown
}