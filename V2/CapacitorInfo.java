package PMS.V2;

import java.util.regex.Pattern;

/* 
 * File: CapacitorInfo
 * Copy: Copyright (c) 2023 Samuel W. Messer
 * BlazerID: swmesser
 * Vers: 1.0.0 Oct 24, 2023 SWM - Original Coding
 * Desc: Driver for testing concepts
 */



public abstract class CapacitorInfo extends ProductInfo{
    private String capacitance;
    private String tolerance;
    private String voltageRating;
    private String operationTemp;
    private String size;
    private String dielectricMat;
    private CapacitorMountingType mount;
    private String packageCase;
    private String seatedHeight;
    
    public CapacitorInfo(){
        super();
        this.capacitance = "";
        this.tolerance = "";
        this.voltageRating = "";
        this.operationTemp = "";
        this.size = "";
        this.dielectricMat = "";
        this.mount = CapacitorMountingType.Unknown;
        this.packageCase = "";
        this.seatedHeight = "";
    }

    
    public CapacitorInfo(String capacitance, String tolerance, String voltageRating, String operationTemp, String size, String dielectricMat, CapacitorMountingType mount, String packageCase, String seatedHeight,String itemId, String name, String description, String mfg, String mfgPartNum, String series, int qty, double price) throws Exception {
        super(itemId, name, description, mfg, mfgPartNum, series, qty, price);
        
        if ((capacitance.length() == 0) || (capacitance == null)){
            throw new Exception("Error: Invalid capacitance passed!");
        } else if ((tolerance.length() == 0) || (tolerance == null)){
            throw new Exception("Error: Invalid tolerance passed!");
        } else if ((voltageRating.length() == 0) || (voltageRating == null)){
            throw new Exception("Error: Invalid voltage rating passed!");
        } else if ((operationTemp.length() == 0) || (operationTemp == null)){
            throw new Exception("Error: Invalid operation temperature passed!");
        } else if ((size.length() == 0) || (size == null)){
            throw new Exception("Error: Invalid size passed!");
        } else if ((dielectricMat.length() == 0) || (dielectricMat == null)){
            throw new Exception("Error: Invalid dielectric material passed!");
        } else if ((packageCase.length() == 0) || (packageCase == null)){
            throw new Exception("Error: Invalid package case passed!");
        } else if ((seatedHeight.length() == 0) || (seatedHeight == null)){
            throw new Exception("Error: Invalid seated height passed!");
        } else {
            this.capacitance = capacitance;
            this.tolerance = tolerance;
            this.voltageRating = voltageRating;
            this.operationTemp = operationTemp;
            this.size = size;
            this.dielectricMat = dielectricMat;
            this.mount = mount;
            this.packageCase = packageCase;
            this.seatedHeight = seatedHeight;
        }
    }
    
    //All of the exporting methods are implemented through the inheritance
    //  added all info specific to class
    @Override
    public String toCSV() {
        String output = "";
 
        output += super.toCSV(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += this.getCapacitance() + ",";
        output += this.getTolerance() + ",";
        output += this.getVoltageRating() + ",";
        output += this.getOperationTemp() + ",";
        output += this.getSize() + ",";
        output += this.getDielectricMat() + ",";
        output += this.getMount() + ",";
        output += this.getPackageCase() + ",";
        output += this.getSeatedHeight() + ",";
        
        return( output );
    }

    @Override
    public String toCustom() {
        String output = "";
        
        output += super.toCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "Capacitance: " + this.getCapacitance() + '\n';
        output += "Tolerance: " + this.getTolerance() + '\n';
        output += "Voltage Rating: " + this.getVoltageRating() + '\n';
        output += "Operating Temperature: " + this.getOperationTemp() + '\n';
        output += "Size: " + this.getSize() + '\n';
        output += "Dielectric Material: " + this.getDielectricMat() + '\n';
        output += "Mount: " + this.getMount() + '\n';
        output += "Package Case: " + this.getPackageCase() + '\n';
        output += "Seated Height: " + this.getSeatedHeight() + '\n';
        
        return( output );
    }

    @Override
    public String toXML() {
        String output = "";
        
        output += super.toXML(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "     <CapacitorInfo>\n";
        output += "         <capacitance>" + this.getCapacitance() + "</capacitance>\n";
        output += "         <tolerance>" + this.getTolerance() + "</tolerance>\n";
        output += "         <voltageRating>" + this.getVoltageRating() + "</voltageRating>\n";
        output += "         <operationTemp>" + this.getOperationTemp() + "</operationTemp>\n";
        output += "         <size>" + this.getSize() + "</size>\n";
        output += "         <dielectricMat>" + this.getDielectricMat() + "</dielectricMat>\n";
        output += "         <mount>" + this.getMount() + "</mount>\n";
        output += "         <packageCase>" + this.getPackageCase() + "</packageCase>\n";
        output += "         <seatedHeight>" + this.getSeatedHeight() + "</seatedHeight>\n";
        
        
        return( output );
    }

    /**
     * @return the capacitance
     */
    public String getCapacitance() {
        return (this.capacitance);
    }

    /**
     * @param capacitance the capacitance to set
     */
    public void setCapacitance(String capacitance) {
        this.capacitance = capacitance;
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
     * @return the voltageRating
     */
    public String getVoltageRating() {
        return (this.voltageRating);
    }

    /**
     * @param voltageRating the voltageRating to set
     */
    public void setVoltageRating(String voltageRating) {
        this.voltageRating = voltageRating;
    }

    /**
     * @return the operationTemp
     */
    public String getOperationTemp() {
        return (this.operationTemp);
    }

    /**
     * @param operationTemp the operationTemp to set
     */
    public void setOperationTemp(String operationTemp) {
        this.operationTemp = operationTemp;
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
     * @return the dielectricMat
     */
    public String getDielectricMat() {
        return (this.dielectricMat);
    }

    /**
     * @param dielectricMat the dielectricMat to set
     */
    public void setDielectricMat(String dielectricMat) {
        this.dielectricMat = dielectricMat;
    }

    /**
     * @return the mount
     */
    public CapacitorMountingType getMount() {
        return (this.mount);
    }

    /**
     * @param mount the mount to set
     */
    public void setMount(CapacitorMountingType mount) {
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


//Subcategories to the capacitor category
final class EDLCAndSupercapactiorInfo extends CapacitorInfo{
    private String equivalentSeriesResistance;
    private String lifetimeAtTemp;
    private String termination;
    private String leadSpacing;

    public EDLCAndSupercapactiorInfo() {
        super();
        this.equivalentSeriesResistance = "";
        this.lifetimeAtTemp = "";
        this.termination = "";
        this.leadSpacing = "";
    }

    public EDLCAndSupercapactiorInfo(String equivalentSeriesResistance, String lifetimeAtTemp, String termination, String leadSpacing, String capacitance, String tolerance, String voltageRating, String operationTemp, String size, String dielectricMat, CapacitorMountingType mount, String packageCase, String seatedHeight, String itemId, String name, String description, String mfg, String mfgPartNum, String series, int qty, double price) throws Exception {
        super(capacitance, tolerance, voltageRating, operationTemp, size, dielectricMat, mount, packageCase, seatedHeight, itemId, name, description, mfg, mfgPartNum, series, qty, price);
        
        if ((equivalentSeriesResistance.length() == 0) || (equivalentSeriesResistance == null)){
            throw new Exception("Error: Invalid equivalent series resistance passed!");
        } else if ((lifetimeAtTemp.length() == 0) || (lifetimeAtTemp == null)){
            throw new Exception("Error: Invalid lifetime at temperature passed!");
        } else if ((termination.length() == 0) || (termination == null)){
            throw new Exception("Error: Invalid termination passed!");
        } else if ((leadSpacing.length() == 0) || (leadSpacing == null)){
            throw new Exception("Error: Invalid lead spacing passed!");
        } else {
            this.equivalentSeriesResistance = equivalentSeriesResistance;
            this.lifetimeAtTemp = lifetimeAtTemp;
            this.termination = termination;
            this.leadSpacing = leadSpacing;
        }
    }
    
    //All of the exporting methods are implemented through the inheritance
    //  added all info specific to class
    @Override
    public String toCSV() {
        String output = "";
        
        output += super.toCSV(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += this.getEquivalentSeriesResistance() + ",";
        output += this.getLifetimeAtTemp() + ",";
        output += this.getTermination() + ",";
        output += this.getLeadSpacing() + "\n";
        
        return(output);
    }

    @Override
    public String toCustom() {
        String output = "";
        
        output += super.toCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "Equivalent Series Resistance: " + this.getEquivalentSeriesResistance() + '\n';
        output += "Lifetime at Temp: " + this.getLifetimeAtTemp() + '\n';
        output += "Termination: " + this.getTermination() + '\n';
        output += "Lead Spacing: " + this.getLeadSpacing() + '\n';
        
        return(output);
    }

    @Override
    public String toXML() {
        String output = "";
        
        output += super.toXML(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "         <EDLCAndSupercapacitorInfo>\n";
        output += "             <equivalentSeriesResistance>" + this.getEquivalentSeriesResistance() + "</equivalentSeriesResistance>\n";
        output += "             <lifetimeAtTemp>" + this.getLifetimeAtTemp() + "</lifetimeAtTemp>\n";
        output += "             <termination>" + this.getTermination() + "</termination>\n";
        output += "             <leadSpacing>" + this.getLeadSpacing() + "</leadSpacing>\n";
        output += "         </EDLCAndSupercapacitorInfo>\n";
        output += "     </CapacitorInfo>\n";
        output += "</ProductInfo>\n";
        
        return(output);
    }

    public static EDLCAndSupercapactiorInfo fromCSV( String input ) throws Exception{
        EDLCAndSupercapactiorInfo edlcAndSupercapacitor = new EDLCAndSupercapactiorInfo();
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
        //Capacitor
        String capacitance = "";
        String tolerance = "";
        String voltageRating = "";
        String operationTemp = "";
        String size = "";
        String dielectricMat = "";
        CapacitorMountingType mount;
        String packageCase = "";
        String seatedHeight = "";
        //EDLCAndSupercapacitor
        String equivalentSeriesResistance;
        String lifetimeAtTemp;
        String termination;
        String leadSpacing;
        
        
        //Validate input 
        if ( input == null ){
            throw new Exception("Error: Null input for parsing!");
        } else if ( input.length() == 0 ){
            throw new Exception("Error: Zero length string provided!");
        } else {
            //Split line based on comma
            Chunks = input.split(",");
            if ( Chunks.length == 26 ){
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
                //CapacitorInfo
                capacitance = Chunks[ 13 ];
                tolerance = Chunks[ 14 ];
                voltageRating = Chunks[ 15 ];
                operationTemp = Chunks[ 16 ];
                size = Chunks[ 17 ];
                dielectricMat = Chunks[ 18 ];
                mount = CapacitorMountingType.valueOf( Chunks[ 19 ]);
                packageCase = Chunks[ 20 ];
                seatedHeight = Chunks[ 21 ];
                //=================
                //EDLCAndSupercapacitors
                equivalentSeriesResistance = Chunks[ 22 ];
                lifetimeAtTemp = Chunks[ 23 ];
                termination = Chunks[ 24 ];
                leadSpacing = Chunks[ 25 ];
                
                //Param validation -> constructor
                edlcAndSupercapacitor = new EDLCAndSupercapactiorInfo(equivalentSeriesResistance, lifetimeAtTemp, termination, 
                        leadSpacing, capacitance, tolerance, voltageRating, operationTemp, size, dielectricMat, mount, packageCase,
                        seatedHeight, id, name, description, manufacturer, mfgPartNum, series, qtyAvailable, price);
                
            }
            
        }
        
        return( edlcAndSupercapacitor );
    }
    
    public static EDLCAndSupercapactiorInfo fromCustom( String input ) throws Exception {
        EDLCAndSupercapactiorInfo edlcAndSupercapacitor = new EDLCAndSupercapactiorInfo();
        String[] Chunks;
        String[] Lines;
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
        //Capacitor
        String capacitance = "";
        String tolerance = "";
        String voltageRating = "";
        String operationTemp = "";
        String size = "";
        String dielectricMat = "";
        CapacitorMountingType mount = CapacitorMountingType.Unknown;
        String packageCase = "";
        String seatedHeight = "";
        //EDLCAndSupercapacitor
        String equivalentSeriesResistance = "";
        String lifetimeAtTemp = "";
        String termination = "";
        String leadSpacing = "";
        
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
                    price = Double.parseDouble( Chunks[1]);
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Capacitance") == true ){
                    capacitance = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Tolerance") == true ){
                    tolerance = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Voltage Rating") == true ){
                    voltageRating = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Operating Temperature") == true ){
                    operationTemp = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Size") == true ){
                    size = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Dielectric Material") == true ){
                    dielectricMat = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Mount") == true ){
                    mount = CapacitorMountingType.valueOf(Chunks[1]);
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Package Case") == true ){
                    packageCase = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Seated Height") == true ){
                    seatedHeight = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Equivalent Series Resistance") == true ){
                    equivalentSeriesResistance = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Lifetime at Temp") == true ){
                    lifetimeAtTemp = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Termination") == true ){
                    termination = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Lead Spacing") == true ){
                    leadSpacing = Chunks[1];
                } else {
                    System.out.println("Error: Invalid field passed!");
                }
            }
            edlcAndSupercapacitor = new EDLCAndSupercapactiorInfo(equivalentSeriesResistance, lifetimeAtTemp, termination,
                    leadSpacing, capacitance, tolerance, voltageRating, operationTemp, size, dielectricMat,
                    mount, packageCase, seatedHeight, id, name, description, manufacturer, mfgPartNum, series, qtyAvailable, price);
            
        }
        
        return( edlcAndSupercapacitor );
    }
    
    public static EDLCAndSupercapactiorInfo fromXML( String input ) throws Exception {
        EDLCAndSupercapactiorInfo edlcAndSupercapacitor = new EDLCAndSupercapactiorInfo();
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
        //Capacitor
        String capacitance = "";
        String tolerance = "";
        String voltageRating = "";
        String operationTemp = "";
        String size = "";
        String dielectricMat = "";
        CapacitorMountingType mount = CapacitorMountingType.Unknown;
        String packageCase = "";
        String seatedHeight = "";
        //EDLCAndSupercapacitor
        String equivalentSeriesResistance = "";
        String lifetimeAtTemp = "";
        String termination = "";
        String leadSpacing = "";
        
        //Parsing input using regex
        java.util.regex.Pattern regex = java.util.regex.Pattern.compile("<ProductInfo>(.*)</ProductInfo>");
        //Matching the Pattern
        java.util.regex.Matcher matcher = regex.matcher( input );
        
        //Looping through the groups captured using pattern matching
        for ( int index = 0; index < matcher.groupCount(); index++){
            //Testing to find match
            if ( matcher.find() == true ){
                //Pattern match for each of the fields in the Object
                regex = Pattern.compile("<itemId>(.*)</itemId>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    id = matcher.group(1);
                }
                
                regex = Pattern.compile("<name>(.*)</name>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    name = matcher.group(1);
                }
                
                regex = Pattern.compile("<description>(.*)</description>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    description = matcher.group(1);
                }
                
                regex = Pattern.compile("<manufacturer>(.*)</manufacturer>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    manufacturer = matcher.group(1);
                }
                
                regex = Pattern.compile("<mfgPartNumber>(.*)</mfgPartNumber>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    mfgPartNum = matcher.group(1);
                }
                
                regex = Pattern.compile("<series>(.*)</series>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    series = matcher.group(1);
                }
                
                regex = Pattern.compile("<availability>(.*)</availability>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    stock = StockOption.valueOf(matcher.group(1));
                }
                
                regex = Pattern.compile("<status>(.*)</status>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    status = ProductStatus.valueOf(matcher.group(1));
                }
                
                regex = Pattern.compile("<media>(.*)</media>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    media = MediaOption.valueOf(matcher.group(1));
                }
                
                regex = Pattern.compile("<hazards>(.*)</hazards>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    hazard = EnvironmentalOption.valueOf(matcher.group(1));
                }
                
                regex = Pattern.compile("<shippingPackage>(.*)</shippingPackage>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    shippingBox = PackageOption.valueOf(matcher.group(1));
                }
                
                regex = Pattern.compile("<qtyAvailabile>(.*)</qtyAvailable>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    qtyAvailable = Integer.parseInt(matcher.group(1));
                }
                
                regex = Pattern.compile("<price>(.*)</price>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    price = Double.parseDouble(matcher.group(1));
                }
                
                regex = Pattern.compile("<capacitance>(.*)</capacitance>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    capacitance = matcher.group(1);
                }
                
                regex = Pattern.compile("<tolerance>(.*)</tolerance>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    tolerance = matcher.group(1);
                }
                
                regex = Pattern.compile("<voltageRating>(.*)</voltageRating>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    voltageRating = matcher.group(1);
                }
                
                regex = Pattern.compile("<operationTemp>(.*)</operationTemp>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    operationTemp = matcher.group(1);
                }
                
                regex = Pattern.compile("<size>(.*)</size>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    size = matcher.group(1);
                }
                
                regex = Pattern.compile("<dielectricMat>(.*)</dielectricMat>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    dielectricMat = matcher.group(1);
                }
                
                regex = Pattern.compile("<mount>(.*)</mount>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    mount = CapacitorMountingType.valueOf(matcher.group(1));
                }
                
                regex = Pattern.compile("<packageCase>(.*)</packageCase>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    packageCase = matcher.group(1);
                }
                
                regex = Pattern.compile("<seatedHeight>(.*)</seatedHeight>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    seatedHeight = matcher.group(1);
                }
                
                regex = Pattern.compile("<equivalentSeriesResistance>(.*)</equivalentSeriesResistance>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    equivalentSeriesResistance = matcher.group(1);
                }
                
                regex = Pattern.compile("<lifetimeAtTemp>(.*)</lifetimeAtTemp>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    lifetimeAtTemp = matcher.group(1);
                }
                
                regex = Pattern.compile("<termination>(.*)</termination>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    termination = matcher.group(1);
                }
                
                regex = Pattern.compile("<leadSpacing>(.*)</leadSpacing>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    leadSpacing = matcher.group(1);
                }
                
                edlcAndSupercapacitor = new EDLCAndSupercapactiorInfo(equivalentSeriesResistance,
                        lifetimeAtTemp, termination, leadSpacing, capacitance, tolerance,
                        voltageRating, operationTemp, size, dielectricMat, mount, packageCase,
                        seatedHeight, id, name, manufacturer, id, mfgPartNum, series, qtyAvailable, price);
            }
        }
        
        return( edlcAndSupercapacitor );
    }
    
    /**
     * @return the equivalentSeriesResistance
     */
    public String getEquivalentSeriesResistance() {
        return (this.equivalentSeriesResistance);
    }

    /**
     * @param equivalentSeriesResistance the equivalentSeriesResistance to set
     */
    public void setEquivalentSeriesResistance(String equivalentSeriesResistance) {
        this.equivalentSeriesResistance = equivalentSeriesResistance;
    }

    /**
     * @return the lifetimeAtTemp
     */
    public String getLifetimeAtTemp() {
        return (this.lifetimeAtTemp);
    }

    /**
     * @param lifetimeAtTemp the lifetimeAtTemp to set
     */
    public void setLifetimeAtTemp(String lifetimeAtTemp) {
        this.lifetimeAtTemp = lifetimeAtTemp;
    }

    /**
     * @return the termination
     */
    public String getTermination() {
        return (this.termination);
    }

    /**
     * @param termination the termination to set
     */
    public void setTermination(String termination) {
        this.termination = termination;
    }

    /**
     * @return the leadSpacing
     */
    public String getLeadSpacing() {
        return (this.leadSpacing);
    }

    /**
     * @param leadSpacing the leadSpacing to set
     */
    public void setLeadSpacing(String leadSpacing) {
        this.leadSpacing = leadSpacing;
    }
}

final class MicaAndPTFEInfo extends CapacitorInfo{
    private String leadSpacing;
    private String features;

    public MicaAndPTFEInfo() {
        super();
        this.leadSpacing = "";
        this.features = "";
    }

    public MicaAndPTFEInfo(String leadSpacing, String features, String capacitance, String tolerance, String voltageRating, String operationTemp, String size, String dielectricMat, CapacitorMountingType mount, String packageCase, String seatedHeight, String itemId, String name, String description, String mfg, String mfgPartNum, String series, int qty, double price) throws Exception {
        super(capacitance, tolerance, voltageRating, operationTemp, size, dielectricMat, mount, packageCase, seatedHeight, itemId, name, description, mfg, mfgPartNum, series, qty, price);
        
        if ((leadSpacing.length() == 0) || (leadSpacing == null)){
            throw new Exception("Error: Invalid lead spacing passed!");
        } else if ((features.length() == 0) || (features == null)){
            throw new Exception("Error: Invalid features passed!");
        } else {
            this.leadSpacing = leadSpacing;
            this.leadSpacing = leadSpacing;
        }
    }
    
    
    
    //All of the exporting methods are implemented through the inheritance
    //  added all info specific to class
    @Override
    public String toCSV() {
        String output = "";
        
        output += super.toCSV(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += this.getLeadSpacing() + ",";
        output += this.getFeatures() + "\n";
        
        return(output);
    }

    @Override
    public String toCustom() {
        String output = "";
        
        output += super.toCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "Lead Spacing: " + this.getLeadSpacing() + '\n';
        output += "Features: " + this.getFeatures() + '\n';
        
        return(output);
    }

    @Override
    public String toXML() {
        String output = "";
        
        output += super.toXML(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "         <MicaAndPTFEInfo>\n";
        output += "             <leadSpacing>" + this.getLeadSpacing() + "</leadSpacing>\n";
        output += "             <features>" + this.getFeatures() + "</features>\n";
        output += "         </MicaAndPTFEInfo>\n";
        output += "     </CapacitorInfo>\n";
        output += "</ProductInfo>\n";
        
        return(output);
    }
    
    
    public static MicaAndPTFEInfo fromCSV( String input ) throws Exception{
        MicaAndPTFEInfo micaAndPTFE = new MicaAndPTFEInfo();
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
        //Capacitor
        String capacitance = "";
        String tolerance = "";
        String voltageRating = "";
        String operationTemp = "";
        String size = "";
        String dielectricMat = "";
        CapacitorMountingType mount;
        String packageCase = "";
        String seatedHeight = "";
        //MicaAndPTFE
        String leadSpacing = "";
        String features = "";
        
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
                //CapacitorInfo
                capacitance = Chunks[ 13 ];
                tolerance = Chunks[ 14 ];
                voltageRating = Chunks[ 15 ];
                operationTemp = Chunks[ 16 ];
                size = Chunks[ 17 ];
                dielectricMat = Chunks[ 18 ];
                mount = CapacitorMountingType.valueOf( Chunks[ 19 ]);
                packageCase = Chunks[ 20 ];
                seatedHeight = Chunks[ 21 ];
                //=================
                //MicaAndPTFEInfo
                leadSpacing = Chunks[ 22 ];
                features = Chunks[ 23 ];
                
                //Param Validation -> constructor
                micaAndPTFE = new MicaAndPTFEInfo(leadSpacing, features, capacitance, tolerance, voltageRating,
                        operationTemp, size, dielectricMat, mount, packageCase, seatedHeight, 
                        id, name, description, manufacturer, mfgPartNum, series, qtyAvailable, price);
            }
            
        }
        
        return( micaAndPTFE );
    }
    
    public static MicaAndPTFEInfo fromCustom( String input ) throws Exception {
        MicaAndPTFEInfo micaAndPTFE = new MicaAndPTFEInfo();
        String[] Chunks;
        String[] Lines;
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
        //Capacitor
        String capacitance = "";
        String tolerance = "";
        String voltageRating = "";
        String operationTemp = "";
        String size = "";
        String dielectricMat = "";
        CapacitorMountingType mount = CapacitorMountingType.Unknown;
        String packageCase = "";
        String seatedHeight = "";
        //MicaAndPTFE
        String leadSpacing = "";
        String features = "";
        
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
                    price = Double.parseDouble( Chunks[1]);
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Capacitance") == true ){
                    capacitance = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Tolerance") == true ){
                    tolerance = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Voltage Rating") == true ){
                    voltageRating = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Operating Temperature") == true ){
                    operationTemp = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Size") == true ){
                    size = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Dielectric Material") == true ){
                    dielectricMat = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Mount") == true ){
                    mount = CapacitorMountingType.valueOf(Chunks[1]);
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Package Case") == true ){
                    packageCase = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Seated Height") == true ){
                    seatedHeight = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Lead Spacing") == true ){
                    leadSpacing = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Features") == true ){
                    features = Chunks[1];
                } else {
                    System.out.println("Error: Invalid field provided");
                }
                
            }
            
            micaAndPTFE = new MicaAndPTFEInfo(leadSpacing, features, capacitance, tolerance,
                    voltageRating, operationTemp, size, dielectricMat, mount, packageCase,
                    seatedHeight, id, name, description, manufacturer, mfgPartNum, series, qtyAvailable, price);
            
        }
        
        return( micaAndPTFE );
    }
    
    public static MicaAndPTFEInfo fromXML( String input ) throws Exception{
        MicaAndPTFEInfo micaAndPTFE = new MicaAndPTFEInfo();
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
        //Capacitor
        String capacitance = "";
        String tolerance = "";
        String voltageRating = "";
        String operationTemp = "";
        String size = "";
        String dielectricMat = "";
        CapacitorMountingType mount = CapacitorMountingType.Unknown;
        String packageCase = "";
        String seatedHeight = "";
        //MicaAndPTFE
        String leadSpacing = "";
        String features = "";
        
        //Parsing input using regex
        java.util.regex.Pattern regex = java.util.regex.Pattern.compile("<ProductInfo>(.*)</ProductInfo>");
        //Matching the Pattern
        java.util.regex.Matcher matcher = regex.matcher( input );
        
        //Looping through the groups captured using pattern matching
        for ( int index = 0; index < matcher.groupCount(); index++){
            //Testing to find match
            if ( matcher.find() == true ){
                //Pattern match for each of the fields in the Object
                regex = Pattern.compile("<itemId>(.*)</itemId>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    id = matcher.group(1);
                }
                
                regex = Pattern.compile("<name>(.*)</name>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    name = matcher.group(1);
                }
                
                regex = Pattern.compile("<description>(.*)</description>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    description = matcher.group(1);
                }
                
                regex = Pattern.compile("<manufacturer>(.*)</manufacturer>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    manufacturer = matcher.group(1);
                }
                
                regex = Pattern.compile("<mfgPartNumber>(.*)</mfgPartNumber>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    mfgPartNum = matcher.group(1);
                }
                
                regex = Pattern.compile("<series>(.*)</series>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    series = matcher.group(1);
                }
                
                regex = Pattern.compile("<availability>(.*)</availability>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    stock = StockOption.valueOf(matcher.group(1));
                }
                
                regex = Pattern.compile("<status>(.*)</status>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    status = ProductStatus.valueOf(matcher.group(1));
                }
                
                regex = Pattern.compile("<media>(.*)</media>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    media = MediaOption.valueOf(matcher.group(1));
                }
                
                regex = Pattern.compile("<hazards>(.*)</hazards>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    hazard = EnvironmentalOption.valueOf(matcher.group(1));
                }
                
                regex = Pattern.compile("<shippingPackage>(.*)</shippingPackage>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    shippingBox = PackageOption.valueOf(matcher.group(1));
                }
                
                regex = Pattern.compile("<qtyAvailabile>(.*)</qtyAvailable>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    qtyAvailable = Integer.parseInt(matcher.group(1));
                }
                
                regex = Pattern.compile("<price>(.*)</price>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    price = Double.parseDouble(matcher.group(1));
                }
                
                regex = Pattern.compile("<capacitance>(.*)</capacitance>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    capacitance = matcher.group(1);
                }
                
                regex = Pattern.compile("<tolerance>(.*)</tolerance>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    tolerance = matcher.group(1);
                }
                
                regex = Pattern.compile("<voltageRating>(.*)</voltageRating>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    voltageRating = matcher.group(1);
                }
                
                regex = Pattern.compile("<operationTemp>(.*)</operationTemp>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    operationTemp = matcher.group(1);
                }
                
                regex = Pattern.compile("<size>(.*)</size>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    size = matcher.group(1);
                }
                
                regex = Pattern.compile("<dielectricMat>(.*)</dielectricMat>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    dielectricMat = matcher.group(1);
                }
                
                regex = Pattern.compile("<mount>(.*)</mount>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    mount = CapacitorMountingType.valueOf(matcher.group(1));
                }
                
                regex = Pattern.compile("<packageCase>(.*)</packageCase>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    packageCase = matcher.group(1);
                }
                
                regex = Pattern.compile("<seatedHeight>(.*)</seatedHeight>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    seatedHeight = matcher.group(1);
                }
                
                regex = Pattern.compile("<leadSpacing>(.*)</leadSpacing>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    leadSpacing = matcher.group(1);
                }
                
                regex = Pattern.compile("<features>(.*)</features>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    features = matcher.group(1);
                }
                
                micaAndPTFE = new MicaAndPTFEInfo(leadSpacing, series, capacitance, tolerance,
                        voltageRating, operationTemp, size, dielectricMat, mount, packageCase,
                        seatedHeight, id, name, description, manufacturer, mfgPartNum, series, qtyAvailable, price);
            }
        }
        
        return( micaAndPTFE );
    }

    /**
     * @return the leadSpacing
     */
    public String getLeadSpacing() {
        return (this.leadSpacing);
    }

    /**
     * @param leadSpacing the leadSpacing to set
     */
    public void setLeadSpacing(String leadSpacing) {
        this.leadSpacing = leadSpacing;
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
}

final class NetworksAndArraysInfo extends CapacitorInfo{
    private int capacitorCount;
    private String tempCoefficient;
    private String supplierDevicePackage;
    private CapacitorRatings rating;
    private CapacitorCircuitType circuit;

    public NetworksAndArraysInfo() {
        super();
        this.capacitorCount = 0;
        this.tempCoefficient = "";
        this.supplierDevicePackage = "";
        this.rating = CapacitorRatings.Unknown;
        this.circuit = CapacitorCircuitType.Unknown;
    }
    
    public NetworksAndArraysInfo(int capacitorCount, String tempCoefficient, String supplierDevicePackage, CapacitorRatings rating, CapacitorCircuitType circuit, String capacitance, String tolerance, String voltageRating, String operationTemp, String size, String dielectricMat, CapacitorMountingType mount, String packageCase, String seatedHeight, String itemId, String name, String description, String mfg, String mfgPartNum, String series, int qty, double price) throws Exception {
        super(capacitance, tolerance, voltageRating, operationTemp, size, dielectricMat, mount, packageCase, seatedHeight, itemId, name, description, mfg, mfgPartNum, series, qty, price);
        
        if ( capacitorCount < 0 ){
            throw new Exception("Error: Invalid capacitor count passed!");
        } else if ((tempCoefficient.length() == 0) || (tempCoefficient == null)){
            throw new Exception("Error: Invalid temperature coefficient passed!");
        } else if ((supplierDevicePackage.length() == 0) || (supplierDevicePackage == null)){
            throw new Exception("Error: Invalid supplier device package passed!");
        } else {
            this.capacitorCount = capacitorCount;
            this.tempCoefficient = tempCoefficient;
            this.supplierDevicePackage = supplierDevicePackage;
            this.rating = rating;
            this.circuit = circuit;
        }
    }
        
    //All of the exporting methods are implemented through the inheritance
    //  added all info specific to class
    @Override
    public String toCSV() {
        String output = "";
        
        output += super.toCSV(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += this.getCapacitorCount() + ",";
        output += this.getTempCoefficient() + ",";
        output += this.getSupplierDevicePackage() + ",";
        output += this.getRating() + ",";
        output += this.getCircuit() + "\n";
        
        return(output);
    }

    @Override
    public String toCustom() {
        String output = "";
        
        output += super.toCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "Capacitor Count: " + this.getCapacitorCount() + '\n';
        output += "Temperature Coefficient: " + this.getTempCoefficient() + '\n';
        output += "Supplier Device Package: " + this.getSupplierDevicePackage() + '\n';
        output += "Rating: " + this.getRating() + '\n';
        output += "Circuit: " + this.getCircuit() + '\n';
        
        return(output);
    }

    @Override
    public String toXML() {
        String output = "";
        
        output += super.toXML(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "         <NetworksAndArraysInfo>\n";
        output += "             <capacitorCount>" + this.getCapacitorCount() + "</capacitorCount>\n";
        output += "             <tempCoefficient>" + this.getTempCoefficient() + "</tempCoefficient>\n";
        output += "             <supplierDevicePackage>" + this.getSupplierDevicePackage() + "</supplierDevicePackage>\n";
        output += "             <rating>" + this.getRating() + "</rating>\n";
        output += "             <circuit>" + this.getCircuit() + "</circuit>\n";
        output += "         </NetworksAndArraysInfo>\n";
        output += "     </CapacitorInfo>\n";
        output += "</ProductInfo>\n";
        
        
        return(output);
    }
    
    public static NetworksAndArraysInfo fromCSV( String input ) throws Exception{
        NetworksAndArraysInfo networkAndArray = new NetworksAndArraysInfo();
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
        //Capacitor
        String capacitance = "";
        String tolerance = "";
        String voltageRating = "";
        String operationTemp = "";
        String size = "";
        String dielectricMat = "";
        CapacitorMountingType mount;
        String packageCase = "";
        String seatedHeight = "";
        //NetworkAndArray
        int capacitorCount;
        String tempCoefficient;
        String supplierDevicePackage;
        CapacitorRatings rating;
        CapacitorCircuitType circuit;
        
        //Validate input 
        if ( input == null ){
            throw new Exception("Error: Null input for parsing!");
        } else if ( input.length() == 0 ){
            throw new Exception("Error: Zero length string provided!");
        } else {
            //Split line based on comma
            Chunks = input.split(",");
            if ( Chunks.length == 27 ){
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
                //CapacitorInfo
                capacitance = Chunks[ 13 ];
                tolerance = Chunks[ 14 ];
                voltageRating = Chunks[ 15 ];
                operationTemp = Chunks[ 16 ];
                size = Chunks[ 17 ];
                dielectricMat = Chunks[ 18 ];
                mount = CapacitorMountingType.valueOf( Chunks[ 19 ]);
                packageCase = Chunks[ 20 ];
                seatedHeight = Chunks[ 21 ];
                //=================
                //NetworkAndArray
                capacitorCount = Integer.valueOf( Chunks[ 22 ]);
                tempCoefficient = Chunks[ 23 ];
                supplierDevicePackage = Chunks[ 24 ];
                rating = CapacitorRatings.valueOf( Chunks[ 25 ]);
                circuit = CapacitorCircuitType.valueOf( Chunks[ 26 ]);
                
                //Param Validation -> constructor
                networkAndArray = new NetworksAndArraysInfo(capacitorCount, tempCoefficient, supplierDevicePackage,
                        rating, circuit, capacitance, tolerance, voltageRating, operationTemp, size, dielectricMat,
                        mount, packageCase, seatedHeight, id, name, description, manufacturer, mfgPartNum, series,
                        qtyAvailable, price);
            }
        }
        
        return( networkAndArray );
    }

    public static NetworksAndArraysInfo fromCustom( String input ) throws Exception {
        NetworksAndArraysInfo networkAndArray = new NetworksAndArraysInfo();
        String[] Chunks;
        String[] Lines;
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
        //Capacitor
        String capacitance = "";
        String tolerance = "";
        String voltageRating = "";
        String operationTemp = "";
        String size = "";
        String dielectricMat = "";
        CapacitorMountingType mount = CapacitorMountingType.Unknown;
        String packageCase = "";
        String seatedHeight = "";
        //NetworkAndArray
        int capacitorCount = 0;
        String tempCoefficient = "";
        String supplierDevicePackage = "";
        CapacitorRatings rating = CapacitorRatings.Unknown;
        CapacitorCircuitType circuit = CapacitorCircuitType.Unknown;
        
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
                    price = Double.parseDouble( Chunks[1]);
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Capacitance") == true ){
                    capacitance = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Tolerance") == true ){
                    tolerance = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Voltage Rating") == true ){
                    voltageRating = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Operating Temperature") == true ){
                    operationTemp = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Size") == true ){
                    size = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Dielectric Material") == true ){
                    dielectricMat = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Mount") == true ){
                    mount = CapacitorMountingType.valueOf(Chunks[1]);
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Package Case") == true ){
                    packageCase = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Seated Height") == true ){
                    seatedHeight = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Capacitor Count") == true ){
                    capacitorCount = Integer.parseInt( Chunks[1] );
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Temperature Coefficient") == true ){
                    tempCoefficient = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Supplier Device Package") == true ){
                    supplierDevicePackage = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Rating") == true ){
                    rating = CapacitorRatings.valueOf( Chunks[1] );
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Circuit") == true ){
                    circuit = CapacitorCircuitType.valueOf( Chunks[1] );
                } else {
                    System.out.println("Error: Invalid field passed!");
                }
            }

            networkAndArray = new NetworksAndArraysInfo(capacitorCount, tempCoefficient, supplierDevicePackage,
                    rating, circuit, capacitance, tolerance, voltageRating,
                    operationTemp, size, dielectricMat, mount, packageCase,
                    seatedHeight, id, name, description, manufacturer, mfgPartNum, series, qtyAvailable, price);
        }                     
                
        return( networkAndArray );
    }
    
    public static NetworksAndArraysInfo fromXML( String input ) throws Exception {
        NetworksAndArraysInfo networkAndArray = new NetworksAndArraysInfo();
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
        //Capacitor
        String capacitance = "";
        String tolerance = "";
        String voltageRating = "";
        String operationTemp = "";
        String size = "";
        String dielectricMat = "";
        CapacitorMountingType mount = CapacitorMountingType.Unknown;
        String packageCase = "";
        String seatedHeight = "";
        //NetworkAndArray
        int capacitorCount = 0;
        String tempCoefficient = "";
        String supplierDevicePackage = "";
        CapacitorRatings rating = CapacitorRatings.Unknown;
        CapacitorCircuitType circuit = CapacitorCircuitType.Unknown;
        
        //Parsing input using regex
        java.util.regex.Pattern regex = java.util.regex.Pattern.compile("<ProductInfo>(.*)</ProductInfo>");
        //Matching the Pattern
        java.util.regex.Matcher matcher = regex.matcher( input );
        
        //Looping through the groups captured using pattern matching
        for ( int index = 0; index < matcher.groupCount(); index++){
            //Testing to find match
            if ( matcher.find() == true ){
                //Pattern match for each of the fields in the Object
                regex = Pattern.compile("<itemId>(.*)</itemId>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    id = matcher.group(1);
                }
                
                regex = Pattern.compile("<name>(.*)</name>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    name = matcher.group(1);
                }
                
                regex = Pattern.compile("<description>(.*)</description>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    description = matcher.group(1);
                }
                
                regex = Pattern.compile("<manufacturer>(.*)</manufacturer>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    manufacturer = matcher.group(1);
                }
                
                regex = Pattern.compile("<mfgPartNumber>(.*)</mfgPartNumber>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    mfgPartNum = matcher.group(1);
                }
                
                regex = Pattern.compile("<series>(.*)</series>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    series = matcher.group(1);
                }
                
                regex = Pattern.compile("<availability>(.*)</availability>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    stock = StockOption.valueOf(matcher.group(1));
                }
                
                regex = Pattern.compile("<status>(.*)</status>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    status = ProductStatus.valueOf(matcher.group(1));
                }
                
                regex = Pattern.compile("<media>(.*)</media>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    media = MediaOption.valueOf(matcher.group(1));
                }
                
                regex = Pattern.compile("<hazards>(.*)</hazards>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    hazard = EnvironmentalOption.valueOf(matcher.group(1));
                }
                
                regex = Pattern.compile("<shippingPackage>(.*)</shippingPackage>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    shippingBox = PackageOption.valueOf(matcher.group(1));
                }
                
                regex = Pattern.compile("<qtyAvailabile>(.*)</qtyAvailable>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    qtyAvailable = Integer.parseInt(matcher.group(1));
                }
                
                regex = Pattern.compile("<price>(.*)</price>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    price = Double.parseDouble(matcher.group(1));
                }
                
                regex = Pattern.compile("<capacitance>(.*)</capacitance>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    capacitance = matcher.group(1);
                }
                
                regex = Pattern.compile("<tolerance>(.*)</tolerance>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    tolerance = matcher.group(1);
                }
                
                regex = Pattern.compile("<voltageRating>(.*)</voltageRating>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    voltageRating = matcher.group(1);
                }
                
                regex = Pattern.compile("<operationTemp>(.*)</operationTemp>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    operationTemp = matcher.group(1);
                }
                
                regex = Pattern.compile("<size>(.*)</size>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    size = matcher.group(1);
                }
                
                regex = Pattern.compile("<dielectricMat>(.*)</dielectricMat>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    dielectricMat = matcher.group(1);
                }
                
                regex = Pattern.compile("<mount>(.*)</mount>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    mount = CapacitorMountingType.valueOf(matcher.group(1));
                }
                
                regex = Pattern.compile("<packageCase>(.*)</packageCase>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    packageCase = matcher.group(1);
                }
                
                regex = Pattern.compile("<seatedHeight>(.*)</seatedHeight>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    seatedHeight = matcher.group(1);
                }
                
                regex = Pattern.compile("<capacitorCount>(.*)</capacitorCount>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    capacitorCount = Integer.parseInt(matcher.group(1));
                }
                
                regex = Pattern.compile("<tempCoefficient>(.*)</tempCoefficient>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    tempCoefficient = matcher.group(1);
                }
                
                regex = Pattern.compile("<supplierDevicePackage>(.*)</supplierDevicePackage>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    supplierDevicePackage = matcher.group(1);
                }
                
                regex = Pattern.compile("<rating>(.*)</rating>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    rating = CapacitorRatings.valueOf(matcher.group(1));
                }
                
                regex = Pattern.compile("<circuit>(.*)</circuit>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    circuit = CapacitorCircuitType.valueOf(matcher.group(1));
                }
                
                networkAndArray = new NetworksAndArraysInfo(capacitorCount, tempCoefficient,
                        supplierDevicePackage, rating, circuit, capacitance, tolerance,
                        voltageRating, operationTemp, size, dielectricMat, mount, packageCase,
                        seatedHeight, id, name, description, manufacturer, mfgPartNum, series, qtyAvailable,
                        price);
                
            }
        }
        
        return( networkAndArray );
    }
    
    /**
     * @return the capacitorCount
     */
    public int getCapacitorCount() {
        return (this.capacitorCount);
    }

    /**
     * @param capacitorCount the capacitorCount to set
     */
    public void setCapacitorCount(int capacitorCount) {
        this.capacitorCount = capacitorCount;
    }

    /**
     * @return the tempCoefficient
     */
    public String getTempCoefficient() {
        return (this.tempCoefficient);
    }

    /**
     * @param tempCoefficient the tempCoefficient to set
     */
    public void setTempCoefficient(String tempCoefficient) {
        this.tempCoefficient = tempCoefficient;
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
     * @return the rating
     */
    public CapacitorRatings getRating() {
        return (this.rating);
    }

    /**
     * @param rating the rating to set
     */
    public void setRating(CapacitorRatings rating) {
        this.rating = rating;
    }

    /**
     * @return the circuit
     */
    public CapacitorCircuitType getCircuit() {
        return (this.circuit);
    }

    /**
     * @param circuit the circuit to set
     */
    public void setCircuit(CapacitorCircuitType circuit) {
        this.circuit = circuit;
    }
}

final class TrimmerAndVariableInfo extends CapacitorInfo{
    private String capacitanceRange;
    private String adjustmentType;
    private String qAtFreq;
    private String features;

    public TrimmerAndVariableInfo() {
        super();
        this.capacitanceRange = "";
        this.adjustmentType = "";
        this.qAtFreq = "";
        this.features = "";
    }
    
    public TrimmerAndVariableInfo(String capacitanceRange, String adjustmentType, String qAtFreq, String features, String capacitance, String tolerance, String voltageRating, String operationTemp, String size, String dielectricMat, CapacitorMountingType mount, String packageCase, String seatedHeight, String itemId, String name, String description, String mfg, String mfgPartNum, String series, int qty, double price) throws Exception {
        super(capacitance, tolerance, voltageRating, operationTemp, size, dielectricMat, mount, packageCase, seatedHeight, itemId, name, description, mfg, mfgPartNum, series, qty, price);
        
        if ((capacitanceRange.length() == 0) || (capacitanceRange == null)){
            throw new Exception("Error: Invalid capacitance range passed!");
        } else if ((adjustmentType.length() == 0) || (adjustmentType == null)){
            throw new Exception("Error: Invalid adjustment type passed!");
        } else if ((qAtFreq.length() == 0) || (qAtFreq == null)){
            throw new Exception("Error: Invalid q at frequency passed!");
        } else if ((features.length() == 0) || (features == null)){
            throw new Exception("Error: Invalid features passed!");
        } else {
            this.capacitanceRange = capacitanceRange;
            this.adjustmentType = adjustmentType;
            this.qAtFreq = qAtFreq;
            this.features = features;
        }
    }    
    
    //All of the exporting methods are implemented through the inheritance
    //  added all info specific to class
    @Override
    public String toCSV() {
        String output = "";
        
        output += super.toCSV(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += this.getCapacitanceRange() + ",";
        output += this.getAdjustmentType() + ",";
        output += this.getqAtFreq() + ",";
        output += this.getFeatures() + "\n";
        
        return(output);
    }

    @Override
    public String toCustom() {
        String output = "";
        
        output += super.toCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "Capacitance Range: " + this.getCapacitanceRange() + '\n';
        output += "Adjustment Type: " + this.getAdjustmentType() + '\n';
        output += "Q at Frequency: " + this.getqAtFreq() + '\n';
        output += "Features: " + this.getFeatures() + '\n';
        
        return(output);
    }

    @Override
    public String toXML() {
        String output = "";
        
        output += super.toXML(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "         <TrimmerAndVariableInfo>\n";
        output += "             <capacitanceRange>" + this.getCapacitanceRange() + "</capacitanceRange>\n";
        output += "             <adjustmentType>" + this.getAdjustmentType() + "</adjustmentType>\n";
        output += "             <qAtFreq>" + this.getqAtFreq() + "</qAtFreq>\n";
        output += "             <features>" + this.getFeatures() + "</features>\n";
        output += "         </TrimmerAndVariableInfo>\n";
        output += "     </CapacitorInfo>\n";
        output += "</ProductInfo>\n";
        
        return(output);
    }
    
    public static TrimmerAndVariableInfo fromCSV( String input ) throws Exception{
        TrimmerAndVariableInfo trimmerAndVariableInfo = new TrimmerAndVariableInfo();
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
        //Capacitor
        String capacitance = "";
        String tolerance = "";
        String voltageRating = "";
        String operationTemp = "";
        String size = "";
        String dielectricMat = "";
        CapacitorMountingType mount;
        String packageCase = "";
        String seatedHeight = "";
        //TrimmerAndVariable
        String capacitanceRange = "";
        String adjustmentType = "";
        String qAtFreq = "";
        String features = "";
        
        //Validate input 
        if ( input == null ){
            throw new Exception("Error: Null input for parsing!");
        } else if ( input.length() == 0 ){
            throw new Exception("Error: Zero length string provided!");
        } else {
            //Split line based on comma
            Chunks = input.split(",");
            if ( Chunks.length == 26 ){
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
                //CapacitorInfo
                capacitance = Chunks[ 13 ];
                tolerance = Chunks[ 14 ];
                voltageRating = Chunks[ 15 ];
                operationTemp = Chunks[ 16 ];
                size = Chunks[ 17 ];
                dielectricMat = Chunks[ 18 ];
                mount = CapacitorMountingType.valueOf( Chunks[ 19 ]);
                packageCase = Chunks[ 20 ];
                seatedHeight = Chunks[ 21 ];
                //=================
                //TrimmerAndVariableInfo
                capacitanceRange = Chunks[ 22 ];
                adjustmentType = Chunks[ 23 ];
                qAtFreq = Chunks[ 24 ];
                features = Chunks[ 25 ];
                
                //Param Validation -> construct.
                trimmerAndVariableInfo = new TrimmerAndVariableInfo(capacitanceRange, adjustmentType, qAtFreq,
                        features, capacitance, tolerance, voltageRating, operationTemp, 
                        size, dielectricMat, mount, packageCase, seatedHeight, id, name, 
                        description, manufacturer, mfgPartNum, series, qtyAvailable, price);
                
            }
        }
        
        return( trimmerAndVariableInfo );
    }
    
    public TrimmerAndVariableInfo fromCustom( String input ) throws Exception {
        TrimmerAndVariableInfo trimmerAndVariable = new TrimmerAndVariableInfo();
        String[] Chunks;
        String[] Lines;
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
        //Capacitor
        String capacitance = "";
        String tolerance = "";
        String voltageRating = "";
        String operationTemp = "";
        String size = "";
        String dielectricMat = "";
        CapacitorMountingType mount = CapacitorMountingType.Unknown;
        String packageCase = "";
        String seatedHeight = "";
        //TrimmerAndVariableInfo
        String capacitanceRange = "";
        String adjustmentType = "";
        String qAtFreq = "";
        String features = "";
        
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
                    price = Double.parseDouble( Chunks[1]);
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Capacitance") == true ){
                    capacitance = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Tolerance") == true ){
                    tolerance = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Voltage Rating") == true ){
                    voltageRating = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Operating Temperature") == true ){
                    operationTemp = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Size") == true ){
                    size = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Dielectric Material") == true ){
                    dielectricMat = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Mount") == true ){
                    mount = CapacitorMountingType.valueOf(Chunks[1]);
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Package Vase") == true ){
                    packageCase = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Seated Height") == true ){
                    seatedHeight = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Capacitance Range") == true ){
                    capacitanceRange = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Adjustment Type") == true ){
                    adjustmentType = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Q at Frequency") == true ){
                    qAtFreq = Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Features") == true ){
                    features = Chunks[1];
                } else {
                    System.out.println("Error: Invalid field passed!");
                }
                
            }
            trimmerAndVariable = new TrimmerAndVariableInfo(capacitanceRange, adjustmentType, qAtFreq,
                        features, capacitance, tolerance, voltageRating, operationTemp, size,
                        dielectricMat, mount, packageCase, seatedHeight, id, name,
                        description, manufacturer, mfgPartNum, series, qtyAvailable, price);
        }
                
        return( trimmerAndVariable );
    }

    public static TrimmerAndVariableInfo fromXML( String input ) throws Exception {
        TrimmerAndVariableInfo trimmerAndVariable = new TrimmerAndVariableInfo();
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
        //Capacitor
        String capacitance = "";
        String tolerance = "";
        String voltageRating = "";
        String operationTemp = "";
        String size = "";
        String dielectricMat = "";
        CapacitorMountingType mount = CapacitorMountingType.Unknown;
        String packageCase = "";
        String seatedHeight = "";
        //TrimmerAndVariableInfo
        String capacitanceRange = "";
        String adjustmentType = "";
        String qAtFreq = "";
        String features = "";
        
        
        //Parsing input using regex
        java.util.regex.Pattern regex = java.util.regex.Pattern.compile("<ProductInfo>(.*)</ProductInfo>");
        //Matching the Pattern
        java.util.regex.Matcher matcher = regex.matcher( input );
        
        //Looping through the groups captured using pattern matching
        for ( int index = 0; index < matcher.groupCount(); index++){
            //Testing to find match
            if ( matcher.find() == true ){
                //Pattern match for each of the fields in the Object
                regex = Pattern.compile("<itemId>(.*)</itemId>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    id = matcher.group(1);
                }
                
                regex = Pattern.compile("<name>(.*)</name>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    name = matcher.group(1);
                }
                
                regex = Pattern.compile("<description>(.*)</description>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    description = matcher.group(1);
                }
                
                regex = Pattern.compile("<manufacturer>(.*)</manufacturer>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    manufacturer = matcher.group(1);
                }
                
                regex = Pattern.compile("<mfgPartNumber>(.*)</mfgPartNumber>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    mfgPartNum = matcher.group(1);
                }
                
                regex = Pattern.compile("<series>(.*)</series>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    series = matcher.group(1);
                }
                
                regex = Pattern.compile("<availability>(.*)</availability>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    stock = StockOption.valueOf(matcher.group(1));
                }
                
                regex = Pattern.compile("<status>(.*)</status>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    status = ProductStatus.valueOf(matcher.group(1));
                }
                
                regex = Pattern.compile("<media>(.*)</media>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    media = MediaOption.valueOf(matcher.group(1));
                }
                
                regex = Pattern.compile("<hazards>(.*)</hazards>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    hazard = EnvironmentalOption.valueOf(matcher.group(1));
                }
                
                regex = Pattern.compile("<shippingPackage>(.*)</shippingPackage>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    shippingBox = PackageOption.valueOf(matcher.group(1));
                }
                
                regex = Pattern.compile("<qtyAvailabile>(.*)</qtyAvailable>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    qtyAvailable = Integer.parseInt(matcher.group(1));
                }
                
                regex = Pattern.compile("<price>(.*)</price>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    price = Double.parseDouble(matcher.group(1));
                }
                
                regex = Pattern.compile("<capacitance>(.*)</capacitance>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    capacitance = matcher.group(1);
                }
                
                regex = Pattern.compile("<tolerance>(.*)</tolerance>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    tolerance = matcher.group(1);
                }
                
                regex = Pattern.compile("<voltageRating>(.*)</voltageRating>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    voltageRating = matcher.group(1);
                }
                
                regex = Pattern.compile("<operationTemp>(.*)</operationTemp>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    operationTemp = matcher.group(1);
                }
                
                regex = Pattern.compile("<size>(.*)</size>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    size = matcher.group(1);
                }
                
                regex = Pattern.compile("<dielectricMat>(.*)</dielectricMat>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    dielectricMat = matcher.group(1);
                }
                
                regex = Pattern.compile("<mount>(.*)</mount>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    mount = CapacitorMountingType.valueOf(matcher.group(1));
                }
                
                regex = Pattern.compile("<packageCase>(.*)</packageCase>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    packageCase = matcher.group(1);
                }
                
                regex = Pattern.compile("<seatedHeight>(.*)</seatedHeight>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    seatedHeight = matcher.group(1);
                }
                
                regex = Pattern.compile("<capacitanceRange>(.*)</capacitanceRange>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    capacitanceRange = matcher.group(1);
                }
                
                regex = Pattern.compile("<adjustmentType>(.*)</adjustmentType>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    adjustmentType = matcher.group(1);
                }
                
                regex = Pattern.compile("<qAtFreq>(.*)</qAtFreq>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    qAtFreq = matcher.group(1);
                }
                
                regex = Pattern.compile("<features>(.*)</features>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    features = matcher.group(1);
                }
                
                trimmerAndVariable = new TrimmerAndVariableInfo(capacitanceRange, adjustmentType,
                        qAtFreq, features, capacitance, tolerance, voltageRating, operationTemp,
                        size, dielectricMat, mount, packageCase, seatedHeight, id, name,
                        description, manufacturer, mfgPartNum, series, qtyAvailable, price);
                
            }
        }
        
        return( trimmerAndVariable );
    }
    
    /**
     * @return the capacitanceRange
     */
    public String getCapacitanceRange() {
        return (this.capacitanceRange);
    }

    /**
     * @param capacitanceRange the capacitanceRange to set
     */
    public void setCapacitanceRange(String capacitanceRange) {
        this.capacitanceRange = capacitanceRange;
    }

    /**
     * @return the adjustmentType
     */
    public String getAdjustmentType() {
        return (this.adjustmentType);
    }

    /**
     * @param adjustmentType the adjustmentType to set
     */
    public void setAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
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
}

enum CapacitorRatings{
    AEC_Q200,
    Unknown
}

enum CapacitorCircuitType{
    Bussed,
    Isolated,
    Unknown
}

enum CapacitorMountingType{
    ChassisMount,
    PanelMount,
    BracketMount,
    UserDefined,
    ChassisMountRequiresHolder,
    ChassisStudMount,
    SurfaceMount,
    ThroughHole,
    Unknown
}