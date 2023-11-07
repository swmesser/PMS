package PMS.V2;

import java.util.regex.Pattern;

/* 
 * File: RelayInfo
 * Copy: Copyright (c) 2023 Samuel W. Messer
 * BlazerID: swmesser
 * Vers: 1.0.0 Oct 30, 2023 SWM - Original Coding
 * Desc: Driver for testing concepts
 */

public abstract class RelayInfo extends ProductInfo {
    private String contactCurrentRating;
    private String mustOperateVolt;
    private String mustReleaseVolt;
    private String operateTime;
    private String releaseTime;
    private String features;
    private String terminationStyle;
    private String operationTemp;
    private String coilVoltage;
    private RelayMountingType mount;

    public RelayInfo() {
        super();
        this.contactCurrentRating = "";
        this.mustOperateVolt = "";
        this.mustReleaseVolt = "";
        this.operateTime = "";
        this.releaseTime = "";
        this.features = "";
        this.terminationStyle = "";
        this.operationTemp = "";
        this.coilVoltage = "";
        this.mount = RelayMountingType.Unknown;
    }

    public RelayInfo(String contactCurrentRating, String mustOperateVolt, String mustReleaseVolt, String operateTime, String releaseTime, String features, String terminationStyle, String operationTemp, String coilVoltage, RelayMountingType mount, String itemId, String name, String description, String mfg, String mfgPartNum, String series, int qty, double price) throws Exception {
        super(itemId, name, description, mfg, mfgPartNum, series, qty, price);
        this.contactCurrentRating = contactCurrentRating;
        this.mustOperateVolt = mustOperateVolt;
        this.mustReleaseVolt = mustReleaseVolt;
        this.operateTime = operateTime;
        this.releaseTime = releaseTime;
        this.features = features;
        this.terminationStyle = terminationStyle;
        this.operationTemp = operationTemp;
        this.coilVoltage = coilVoltage;
        this.mount = mount;
    }

    @Override
    public String toCSV() {
        String output = "";
        
        output += super.toCSV(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += this.getContactCurrentRating() + ",";
        output += this.getMustOperateVolt() + ",";
        output += this.getMustReleaseVolt() + ",";
        output += this.getOperateTime() + ",";
        output += this.getReleaseTime() + ",";
        output += this.getFeatures() + ",";
        output += this.getTerminationStyle() + ",";
        output += this.getOperationTemp() + ",";
        output += this.getCoilVoltage() + ",";
        output += this.getMount() + ",";
        
        return(output);
    }

    @Override
    public String toCustom() {
        String output = "";
        
        output += super.toCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "Contact Current Rating: " + this.getContactCurrentRating() + "\n";
        output += "Must Operate Voltage: " + this.getMustOperateVolt() + "\n";
        output += "Must Release Voltage: " + this.getMustReleaseVolt() + "\n";
        output += "Operate Time: " + this.getOperateTime() + "\n";
        output += "Release Time: " + this.getReleaseTime() + "\n";
        output += "Features: " + this.getFeatures() + "\n";
        output += "Termination Style: " + this.getTerminationStyle() + "\n";
        output += "Operation Temp: " + this.getOperationTemp() + "\n";
        output += "Coil Voltage: " + this.getCoilVoltage() + "\n";
        output += "Mount: " + this.getMount() + "\n";
        
        return(output);
    }

    @Override
    public String toXML() {
        String output = "";
        
        output += super.toXML(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "     <RelayInfo>\n";
        output += "         <contactCurrentRating>" + this.getContactCurrentRating() + "</contactCurrentRating>\n";
        output += "         <mustOperateVolt>" + this.getMustOperateVolt() + "</mustOperateVolt>\n";
        output += "         <mustReleaseVolt>" + this.getMustReleaseVolt() + "</mustReleaseVolt>\n";
        output += "         <operateTime>" + this.getOperateTime() + "</operateTime>\n";
        output += "         <releaseTime>" + this.getReleaseTime() + "</releaseTime>\n";
        output += "         <features>" + this.getFeatures() + "</features>\n";
        output += "         <terminationStyle>" + this.getTerminationStyle() + "</terminationStyle>\n";
        output += "         <operationTemp>" + this.getOperationTemp() + "</operationTemp>\n";
        output += "         <coilVoltage>" + this.getCoilVoltage() + "</coilVoltage>\n";
        output += "         <mount>" + this.getMount() + "</mount>\n";
        
        
        return(output);
    }

    /**
     * @return the contactCurrentRating
     */
    public String getContactCurrentRating() {
        return (this.contactCurrentRating);
    }

    /**
     * @param contactCurrentRating the contactCurrentRating to set
     */
    public void setContactCurrentRating(String contactCurrentRating) {
        this.contactCurrentRating = contactCurrentRating;
    }

    /**
     * @return the mustOperateVolt
     */
    public String getMustOperateVolt() {
        return (this.mustOperateVolt);
    }

    /**
     * @param mustOperateVolt the mustOperateVolt to set
     */
    public void setMustOperateVolt(String mustOperateVolt) {
        this.mustOperateVolt = mustOperateVolt;
    }

    /**
     * @return the mustReleaseVolt
     */
    public String getMustReleaseVolt() {
        return (this.mustReleaseVolt);
    }

    /**
     * @param mustReleaseVolt the mustReleaseVolt to set
     */
    public void setMustReleaseVolt(String mustReleaseVolt) {
        this.mustReleaseVolt = mustReleaseVolt;
    }

    /**
     * @return the operateTime
     */
    public String getOperateTime() {
        return (this.operateTime);
    }

    /**
     * @param operateTime the operateTime to set
     */
    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }

    /**
     * @return the releaseTime
     */
    public String getReleaseTime() {
        return (this.releaseTime);
    }

    /**
     * @param releaseTime the releaseTime to set
     */
    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
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
     * @return the terminationStyle
     */
    public String getTerminationStyle() {
        return (this.terminationStyle);
    }

    /**
     * @param terminationStyle the terminationStyle to set
     */
    public void setTerminationStyle(String terminationStyle) {
        this.terminationStyle = terminationStyle;
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
     * @return the coilVoltage
     */
    public String getCoilVoltage() {
        return (this.coilVoltage);
    }

    /**
     * @param coilVoltage the coilVoltage to set
     */
    public void setCoilVoltage(String coilVoltage) {
        this.coilVoltage = coilVoltage;
    }

    /**
     * @return the mount
     */
    public RelayMountingType getMount() {
        return (this.mount);
    }

    /**
     * @param mount the mount to set
     */
    public void setMount(RelayMountingType mount) {
        this.mount = mount;
    }
}

final class HighFrequencyRelayInfo extends RelayInfo{
    private String contactForm;
    private RelayCoilType coil;

    //parameterless constructor
    public HighFrequencyRelayInfo() {
        this.contactForm = "";
        this.coil = RelayCoilType.Unknown;
    }

    //complete constructor
    public HighFrequencyRelayInfo(String contactForm, RelayCoilType coil, String contactCurrentRating, String mustOperateVolt, String mustReleaseVolt, String operateTime, String releaseTime, String features, String terminationStyle, String operationTemp, String coilVoltage, RelayMountingType mount, String itemId, String name, String description, String mfg, String mfgPartNum, String series, int qty, double price) throws Exception {
        super(contactCurrentRating, mustOperateVolt, mustReleaseVolt, operateTime, releaseTime, features, terminationStyle, operationTemp, coilVoltage, mount, itemId, name, description, mfg, mfgPartNum, series, qty, price);
        this.contactForm = contactForm;
        this.coil = coil;
    }

    
    @Override
    public String toCSV() {
        String output = "";
        
        output += super.toCSV(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += this.getContactForm() + ",";
        output += this.getCoil() + "\n";
        
        return(output);
    }

    @Override
    public String toCustom() {
        String output = "";
        
        output += super.toCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "Contact Form: " + this.getContactForm() + "\n";
        output += "Coil: " + this.getCoil() + "\n";
        
        return(output);
    }

    @Override
    public String toXML() {
        String output = "";
        
        output += super.toXML(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "         <HighFrequencyRelayInfo>\n";
        output += "             <contactForm>" + this.getContactForm() + "</contactForm>\n";
        output += "             <coil>" + this.getCoil() + "</coil>\n";
        output += "         </HighFrequencyRelayInfo>\n";
        output += "     </RelayInfo>\n";
        output += "</ProductInfo>\n";
        
        return(output);
    }
    
    public static HighFrequencyRelayInfo fromCustom( String input ) throws Exception {
        HighFrequencyRelayInfo highFreqRelay = new HighFrequencyRelayInfo();
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
        //Relay
        String contactCurrentRating = "";
        String mustOperateVolt = "";
        String mustReleaseVolt = "";
        String operateTime = "";
        String releaseTime = "";
        String features = "";
        String terminationStyle = "";
        String operationTemp = "";
        String coilVoltage = "";
        RelayMountingType mount = RelayMountingType.Unknown;
        //HighFrequencyRelay
        String contactForm = "";
        RelayCoilType coil = RelayCoilType.Unknown;
        
        
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
                    shippingBox = PackageOption.valueOf(Chunks[1]);
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Quantity") == true ){
                    qtyAvailable = Integer.valueOf( Chunks[1] );
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Price") == true ){
                    price = Double.valueOf( Chunks[1] );
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Contact Current Rating") == true ){
                    contactCurrentRating =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Must Operate Volt") == true ){
                    mustOperateVolt =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Must Release Volt") == true ){
                    mustReleaseVolt =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Operate Time") == true ){
                    operateTime =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Release Time") == true ){
                    releaseTime =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Features") == true ){
                    features =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Termination Style") == true ){
                    terminationStyle =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Operation Temp") == true ){
                    operationTemp =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Coil Voltage") == true ){
                    coilVoltage =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Mount") == true ){
                    mount =  RelayMountingType.valueOf(Chunks[1]);
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Contact Form") == true ){
                    contactForm =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Coil") == true ){
                    coil =  RelayCoilType.valueOf(Chunks[1]);
                } else {
                    System.out.println("Error: Invalid field passed!");
                }
            }
            highFreqRelay = new HighFrequencyRelayInfo(contactForm, coil, contactCurrentRating,
                    mustOperateVolt, mustReleaseVolt, operateTime, releaseTime, features, terminationStyle,
                    operationTemp, coilVoltage, mount, id, name, description, manufacturer, mfgPartNum, series, qtyAvailable, price);
        }
        
        
        return (highFreqRelay);
    }
    
    public static HighFrequencyRelayInfo fromCSV( String input ) throws Exception {
        HighFrequencyRelayInfo highFreqRelay = new HighFrequencyRelayInfo();
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
        //Relay
        String contactCurrentRating;
        String mustOperateVolt;
        String mustReleaseVolt;
        String operateTime;
        String releaseTime;
        String features;
        String terminationStyle;
        String operationTemp;
        String coilVoltage;
        RelayMountingType mount;
        //HighFrequencyRelay
        String contactForm;
        RelayCoilType coil;
        
        
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
                //RelayInfo Params
                contactCurrentRating = Chunks[ 13 ];
                mustOperateVolt = Chunks[ 14 ];
                mustReleaseVolt = Chunks[ 15 ];
                operateTime = Chunks[ 16 ];
                releaseTime =  Chunks[ 17 ];
                features = Chunks[ 18 ];
                terminationStyle = Chunks[ 19 ];
                operationTemp = Chunks[ 20 ];
                coilVoltage = Chunks[ 21 ];
                mount = RelayMountingType.valueOf( Chunks[ 22 ] );
                //=================
                //HighFrequencyRelayInfo
                contactForm = Chunks[ 23 ];
                coil = RelayCoilType.valueOf( Chunks[ 24 ]);
                
                //Param validation is in constructors
                highFreqRelay = new HighFrequencyRelayInfo(contactForm, coil, contactCurrentRating,
                        mustOperateVolt, mustReleaseVolt, operateTime, releaseTime, 
                        features, terminationStyle, operationTemp, coilVoltage, mount,
                        id, name, description, manufacturer, mfgPartNum, series, qtyAvailable, price);
            }
        }
        return( highFreqRelay );
    }
    
    public static HighFrequencyRelayInfo fromXML( String input ) throws Exception {
        HighFrequencyRelayInfo highFreqRelay = new HighFrequencyRelayInfo();
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
        //Relay
        String contactCurrentRating = "";
        String mustOperateVolt = "";
        String mustReleaseVolt = "";
        String operateTime = "";
        String releaseTime = "";
        String features = "";
        String terminationStyle = "";
        String operationTemp = "";
        String coilVoltage = "";
        RelayMountingType mount = RelayMountingType.Unknown;
        //HighFrequencyRelay
        String contactForm = "";
        RelayCoilType coil = RelayCoilType.Unknown;
        
        
        
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
                
                regex = Pattern.compile("<contactCurrentRating>(.*)</contactCurrentRating>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    contactCurrentRating = matcher.group(1);
                }
                
                regex = Pattern.compile("<mustOperateVolt>(.*)</mustOperateVolt>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    mustOperateVolt = matcher.group(1);
                }
                
                regex = Pattern.compile("<mustReleaseVolt>(.*)</mustReleaseVolt>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    mustReleaseVolt = matcher.group(1);
                }
                
                regex = Pattern.compile("<operateTime>(.*)</operateTime>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    operateTime = matcher.group(1);
                }
                
                regex = Pattern.compile("<releaseTime>(.*)</releaseTime>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    releaseTime = matcher.group(1);
                }
                
                regex = Pattern.compile("<features>(.*)</featuresd>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    features = matcher.group(1);
                }
                
                regex = Pattern.compile("<terminationStyle>(.*)</terminationStyle>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    terminationStyle = matcher.group(1);
                }
                
                regex = Pattern.compile("<operationTemp>(.*)</operationTemp>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    operationTemp = matcher.group(1);
                }
                
                regex = Pattern.compile("<coilVoltage>(.*)</coilVoltage>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    coilVoltage = matcher.group(1);
                }
                
                regex = Pattern.compile("<mount>(.*)</mount>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    mount = RelayMountingType.valueOf(matcher.group(1));
                }
                
                regex = Pattern.compile("<contactForm>(.*)</contactForm>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    contactForm = matcher.group(1);
                }
                
                regex = Pattern.compile("<coil>(.*)</coil>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    coil = RelayCoilType.valueOf(matcher.group(1));
                }
            }
        }
        highFreqRelay = new HighFrequencyRelayInfo(contactForm, coil, contactCurrentRating,
                mustOperateVolt, mustReleaseVolt, operateTime, releaseTime, features, terminationStyle,
                operationTemp, coilVoltage, mount, id, name, description, manufacturer, mfgPartNum, series, qtyAvailable, price);
        
        return( highFreqRelay );
    }

    /**
     * @return the contactForm
     */
    public String getContactForm() {
        return (this.contactForm);
    }

    /**
     * @param contactForm the contactForm to set
     */
    public void setContactForm(String contactForm) {
        this.contactForm = contactForm;
    }

    /**
     * @return the coil
     */
    public RelayCoilType getCoil() {
        return (this.coil);
    }

    /**
     * @param coil the coil to set
     */
    public void setCoil(RelayCoilType coil) {
        this.coil = coil;
    }
    
    
}

final class AutomotiveRelayInfo extends RelayInfo{
    private String coilCurrent;
    private RelayCoilType coil;

    //parameterless constructor
    public AutomotiveRelayInfo() {
        this.coilCurrent = "";
        this.coil = RelayCoilType.Unknown;
    }

    //complete constructor
    public AutomotiveRelayInfo(String coilCurrent, RelayCoilType coil, String contactCurrentRating, String mustOperateVolt, String mustReleaseVolt, String operateTime, String releaseTime, String features, String terminationStyle, String operationTemp, String coilVoltage, RelayMountingType mount, String itemId, String name, String description, String mfg, String mfgPartNum, String series, int qty, double price) throws Exception {
        super(contactCurrentRating, mustOperateVolt, mustReleaseVolt, operateTime, releaseTime, features, terminationStyle, operationTemp, coilVoltage, mount, itemId, name, description, mfg, mfgPartNum, series, qty, price);
        this.coilCurrent = coilCurrent;
        this.coil = coil;
    }
    
    @Override
    public String toCSV() {
        String output = "";
        
        output += super.toCSV(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += this.getCoilCurrent() + ",";
        output += this.getCoil() + "\n";
        
        return(output);
    }

    @Override
    public String toCustom() {
        String output = "";
        
        output += super.toCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "Coil Current: " + this.getCoilCurrent() + "\n";
        output += "Coil: " + this.getCoil() + "\n";
        
        return(output);
    }

    @Override
    public String toXML() {
        String output = "";
        
        output += super.toXML(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "         <AutomotiveRelayInfo>\n";
        output += "             <coilCurrent>" + this.getCoilCurrent() + "</coilCurrent>\n";
        output += "             <coil>" + this.getCoil() + "</coil>\n";
        output += "         </AutomotiveRelayInfo>\n";
        output += "     </RelayInfo>\n";
        output += "</ProductInfo>\n";
        
        return(output);
    }
    
    public static AutomotiveRelayInfo fromCustom( String input ) throws Exception {
        AutomotiveRelayInfo automotiveRelay = new AutomotiveRelayInfo();
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
        //Relay
        String contactCurrentRating = "";
        String mustOperateVolt = "";
        String mustReleaseVolt = "";
        String operateTime = "";
        String releaseTime = "";
        String features = "";
        String terminationStyle = "";
        String operationTemp = "";
        String coilVoltage = "";
        RelayMountingType mount = RelayMountingType.Unknown;
        //AutomotiveRelay
        String coilCurrent = "";
        RelayCoilType coil = RelayCoilType.Unknown;
        
        
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
                    shippingBox = PackageOption.valueOf(Chunks[1]);
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Quantity") == true ){
                    qtyAvailable = Integer.valueOf( Chunks[1] );
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Price") == true ){
                    price = Double.valueOf( Chunks[1] );
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Contact Current Rating") == true ){
                    contactCurrentRating =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Must Operate Volt") == true ){
                    mustOperateVolt =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Must Release Volt") == true ){
                    mustReleaseVolt =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Operate Time") == true ){
                    operateTime =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Release Time") == true ){
                    releaseTime =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Features") == true ){
                    features =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Termination Style") == true ){
                    terminationStyle =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Operation Temp") == true ){
                    operationTemp =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Coil Voltage") == true ){
                    coilVoltage =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Mount") == true ){
                    mount =  RelayMountingType.valueOf(Chunks[1]);
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Coil Current") == true ){
                    coilCurrent =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Coil") == true ){
                    coil =  RelayCoilType.valueOf(Chunks[1]);
                } else {
                    System.out.println("Error: Invalid field passed!");
                }
            }
            automotiveRelay = new AutomotiveRelayInfo(coilCurrent, coil, contactCurrentRating,
                    mustOperateVolt, mustReleaseVolt, operateTime, releaseTime, features, terminationStyle,
                    operationTemp, coilVoltage, mount, id, name, description, manufacturer, mfgPartNum, series, qtyAvailable, price);
        }
        
        
        return( automotiveRelay );
    }
    
    public static AutomotiveRelayInfo fromCSV( String input ) throws Exception{
        AutomotiveRelayInfo automotiveRelay = new AutomotiveRelayInfo();
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
        //Relay
        String contactCurrentRating;
        String mustOperateVolt;
        String mustReleaseVolt;
        String operateTime;
        String releaseTime;
        String features;
        String terminationStyle;
        String operationTemp;
        String coilVoltage;
        RelayMountingType mount;
        //AutomotiveRelay
        String coilCurrent;
        RelayCoilType coil;
        
        
        //Validate input 
        if ( input == null ){
            throw new Exception("Error: Null input for parsing!");
        } else if ( input.length() == 0 ){
            throw new Exception("Error: Zero length string provided!");
        } else {
            //Split line based on comma
            Chunks = input.split(",");
            if ( Chunks.length == 25 ){
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
                //RelayInfo Params
                contactCurrentRating = Chunks[ 13 ];
                mustOperateVolt = Chunks[ 14 ];
                mustReleaseVolt = Chunks[ 15 ];
                operateTime = Chunks[ 16 ];
                releaseTime =  Chunks[ 17 ];
                features = Chunks[ 18 ];
                terminationStyle = Chunks[ 19 ];
                operationTemp = Chunks[ 20 ];
                coilVoltage = Chunks[ 21 ];
                mount = RelayMountingType.valueOf( Chunks[ 22 ] );
                //==================
                //AutomotiveRelayInfo
                coilCurrent = Chunks[ 23 ];
                coil = RelayCoilType.valueOf( Chunks[ 24 ]);
                
                //Param validation is in constructor
                automotiveRelay = new AutomotiveRelayInfo(coilCurrent, coil, contactCurrentRating,
                        mustOperateVolt, mustReleaseVolt, operateTime, releaseTime, features,
                        terminationStyle, operationTemp, coilVoltage, mount, id, name,
                        description, manufacturer, mfgPartNum, series, qtyAvailable, price);
            }
        }
        return( automotiveRelay );
    }
    
    public static AutomotiveRelayInfo fromXML( String input ) throws Exception{
        AutomotiveRelayInfo automotiveRelay = new AutomotiveRelayInfo();
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
        //Relay
        String contactCurrentRating = "";
        String mustOperateVolt = "";
        String mustReleaseVolt = "";
        String operateTime = "";
        String releaseTime = "";
        String features = "";
        String terminationStyle = "";
        String operationTemp = "";
        String coilVoltage = "";
        RelayMountingType mount = RelayMountingType.Unknown;
        //AutomotiveRelay
        String coilCurrent = "";
        RelayCoilType coil = RelayCoilType.Unknown;
        
        
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
                
                regex = Pattern.compile("<contactCurrentRating>(.*)</contactCurrentRating>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    contactCurrentRating = matcher.group(1);
                }
                
                regex = Pattern.compile("<mustOperateVolt>(.*)</mustOperateVolt>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    mustOperateVolt = matcher.group(1);
                }
                
                regex = Pattern.compile("<mustReleaseVolt>(.*)</mustReleaseVolt>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    mustReleaseVolt = matcher.group(1);
                }
                
                regex = Pattern.compile("<operateTime>(.*)</operateTime>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    operateTime = matcher.group(1);
                }
                
                regex = Pattern.compile("<releaseTime>(.*)</releaseTime>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    releaseTime = matcher.group(1);
                }
                
                regex = Pattern.compile("<features>(.*)</featuresd>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    features = matcher.group(1);
                }
                
                regex = Pattern.compile("<terminationStyle>(.*)</terminationStyle>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    terminationStyle = matcher.group(1);
                }
                
                regex = Pattern.compile("<operationTemp>(.*)</operationTemp>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    operationTemp = matcher.group(1);
                }
                
                regex = Pattern.compile("<coilVoltage>(.*)</coilVoltage>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    coilVoltage = matcher.group(1);
                }
                
                regex = Pattern.compile("<mount>(.*)</mount>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    mount = RelayMountingType.valueOf(matcher.group(1));
                }
                
                regex = Pattern.compile("<coilCurrent>(.*)</coilCurrent>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    coilCurrent = matcher.group(1);
                }
                
                regex = Pattern.compile("<coil>(.*)</coil>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    coil = RelayCoilType.valueOf(matcher.group(1));
                }
                
            }
        }
        automotiveRelay = new AutomotiveRelayInfo(coilCurrent, coil, contactCurrentRating,
                mustOperateVolt, mustReleaseVolt, operateTime, releaseTime, features, terminationStyle,
                operationTemp, coilVoltage, mount, id, name, description, id, mfgPartNum, series, qtyAvailable, price);
        
        return( automotiveRelay );
    }

    /**
     * @return the coilCurrent
     */
    public String getCoilCurrent() {
        return (this.coilCurrent);
    }

    /**
     * @param coilCurrent the coilCurrent to set
     */
    public void setCoilCurrent(String coilCurrent) {
        this.coilCurrent = coilCurrent;
    }

    /**
     * @return the coil
     */
    public RelayCoilType getCoil() {
        return (this.coil);
    }

    /**
     * @param coil the coil to set
     */
    public void setCoil(RelayCoilType coil) {
        this.coil = coil;
    }
}

final class SafetyRelayInfo extends RelayInfo{
    private String contactForm;
    private String contactMaterial;

    //parameterless constructor
    public SafetyRelayInfo() {
        super();
        this.contactForm = "";
        this.contactMaterial = "";
    }

    //complete constructor
    public SafetyRelayInfo(String contactForm, String contactMaterial, String contactCurrentRating, String mustOperateVolt, String mustReleaseVolt, String operateTime, String releaseTime, String features, String terminationStyle, String operationTemp, String coilVoltage, RelayMountingType mount, String itemId, String name, String description, String mfg, String mfgPartNum, String series, int qty, double price) throws Exception {
        super(contactCurrentRating, mustOperateVolt, mustReleaseVolt, operateTime, releaseTime, features, terminationStyle, operationTemp, coilVoltage, mount, itemId, name, description, mfg, mfgPartNum, series, qty, price);
        this.contactForm = contactForm;
        this.contactMaterial = contactMaterial;
    }
    
    @Override
    public String toCSV() {
        String output = "";
        
        output += super.toCSV(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += this.getContactForm() + ",";
        output += this.getContactMaterial() + "\n";
        
        return(output);
    }

    @Override
    public String toCustom() {
        String output = "";
        
        output += super.toCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "Contact Form: " + this.getContactForm() + "\n";
        output += "Contact Material: " + this.getContactMaterial() + "\n";
        
        return(output);
    }

    @Override
    public String toXML() {
        String output = "";
        
        output += super.toXML(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "         <SafetyRelayInfo>\n";
        output += "             <contactForm>" + this.getContactForm() + "</contactForm>\n";
        output += "             <contactMaterial>" + this.getContactMaterial() + "</contactMaterial>\n";
        output += "         </SafetyRelayInfo>\n";
        output += "     </RelayInfo>\n";
        output += "</ProductInfo>\n";
        
        return(output);
    }

    public static SafetyRelayInfo fromCustom( String input ) throws Exception {
        SafetyRelayInfo safetyRelay = new SafetyRelayInfo();
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
        //Relay
        String contactCurrentRating = "";
        String mustOperateVolt = "";
        String mustReleaseVolt = "";
        String operateTime = "";
        String releaseTime = "";
        String features = "";
        String terminationStyle = "";
        String operationTemp = "";
        String coilVoltage = "";
        RelayMountingType mount = RelayMountingType.Unknown;
        //Safety Relay
        String contactForm = "";
        String contactMaterial = "";
        
        
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
                    shippingBox = PackageOption.valueOf(Chunks[1]);
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Quantity") == true ){
                    qtyAvailable = Integer.valueOf( Chunks[1] );
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Price") == true ){
                    price = Double.valueOf( Chunks[1] );
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Contact Current Rating") == true ){
                    contactCurrentRating =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Must Operate Volt") == true ){
                    mustOperateVolt =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Must Release Volt") == true ){
                    mustReleaseVolt =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Operate Time") == true ){
                    operateTime =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Release Time") == true ){
                    releaseTime =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Features") == true ){
                    features =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Termination Style") == true ){
                    terminationStyle =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Operation Temp") == true ){
                    operationTemp =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Coil Voltage") == true ){
                    coilVoltage =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Mount") == true ){
                    mount =  RelayMountingType.valueOf(Chunks[1]);
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Contact Form") == true ){
                    contactForm =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Contact Material") == true ){
                    contactMaterial =  Chunks[1];
                } else {
                    System.out.println("Error: Invalid field passed!");
                }
            }
            
            safetyRelay = new SafetyRelayInfo(contactForm, contactMaterial, contactCurrentRating,
                    mustOperateVolt, mustReleaseVolt, operateTime, releaseTime, features, terminationStyle,
                    operationTemp, coilVoltage, mount, id, name, description, manufacturer, mfgPartNum, series, qtyAvailable, price);
        }
        
        
        return( safetyRelay );
    }
    
    public static SafetyRelayInfo fromCSV( String input ) throws Exception{
        SafetyRelayInfo safetyRelay = new SafetyRelayInfo();
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
        //Relay
        String contactCurrentRating;
        String mustOperateVolt;
        String mustReleaseVolt;
        String operateTime;
        String releaseTime;
        String features;
        String terminationStyle;
        String operationTemp;
        String coilVoltage;
        RelayMountingType mount;
        //SafetyRelay
        String contactForm;
        String contactMaterial;
        
        //Validate input 
        if ( input == null ){
            throw new Exception("Error: Null input for parsing!");
        } else if ( input.length() == 0 ){
            throw new Exception("Error: Zero length string provided!");
        } else {
            //Split line based on comma
            Chunks = input.split(",");
            if ( Chunks.length == 25 ){
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
                //RelayInfo Params
                contactCurrentRating = Chunks[ 13 ];
                mustOperateVolt = Chunks[ 14 ];
                mustReleaseVolt = Chunks[ 15 ];
                operateTime = Chunks[ 16 ];
                releaseTime =  Chunks[ 17 ];
                features = Chunks[ 18 ];
                terminationStyle = Chunks[ 19 ];
                operationTemp = Chunks[ 20 ];
                coilVoltage = Chunks[ 21 ];
                mount = RelayMountingType.valueOf( Chunks[ 22 ] );
                //==================
                //SafetyRelayInfo
                contactForm = Chunks[ 23 ];
                contactMaterial = Chunks[ 24 ];
                
                //Param validation is in constructors
                safetyRelay = new SafetyRelayInfo(contactForm, contactMaterial, contactCurrentRating,
                        mustOperateVolt, mustReleaseVolt, operateTime, releaseTime,
                        features, terminationStyle, operationTemp, coilVoltage, mount,
                        id, name, description, manufacturer, mfgPartNum, series, qtyAvailable, price);
            }
        }
        return( safetyRelay );
    }
    
    public static SafetyRelayInfo fromXML( String input ) throws Exception{
        SafetyRelayInfo safetyRelay = new SafetyRelayInfo();
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
        //Relay
        String contactCurrentRating = "";
        String mustOperateVolt = "";
        String mustReleaseVolt = "";
        String operateTime = "";
        String releaseTime = "";
        String features = "";
        String terminationStyle = "";
        String operationTemp = "";
        String coilVoltage = "";
        RelayMountingType mount = RelayMountingType.Unknown;
        //SafetyRelay
        String contactForm = "";
        String contactMaterial = "";
        
        
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
                
                regex = Pattern.compile("<contactCurrentRating>(.*)</contactCurrentRating>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    contactCurrentRating = matcher.group(1);
                }
                
                regex = Pattern.compile("<mustOperateVolt>(.*)</mustOperateVolt>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    mustOperateVolt = matcher.group(1);
                }
                
                regex = Pattern.compile("<mustReleaseVolt>(.*)</mustReleaseVolt>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    mustReleaseVolt = matcher.group(1);
                }
                
                regex = Pattern.compile("<operateTime>(.*)</operateTime>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    operateTime = matcher.group(1);
                }
                
                regex = Pattern.compile("<releaseTime>(.*)</releaseTime>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    releaseTime = matcher.group(1);
                }
                
                regex = Pattern.compile("<features>(.*)</featuresd>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    features = matcher.group(1);
                }
                
                regex = Pattern.compile("<terminationStyle>(.*)</terminationStyle>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    terminationStyle = matcher.group(1);
                }
                
                regex = Pattern.compile("<operationTemp>(.*)</operationTemp>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    operationTemp = matcher.group(1);
                }
                
                regex = Pattern.compile("<coilVoltage>(.*)</coilVoltage>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    coilVoltage = matcher.group(1);
                }
                
                regex = Pattern.compile("<mount>(.*)</mount>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    mount = RelayMountingType.valueOf(matcher.group(1));
                }
                
                regex = Pattern.compile("<contactForm>(.*)</contactForm>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    contactForm = matcher.group(1);
                }
                
                regex = Pattern.compile("<contactMaterial>(.*)</contactMaterial>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    contactMaterial = matcher.group(1);
                }
                
            }
        }
        safetyRelay = new SafetyRelayInfo(contactForm, contactMaterial, contactCurrentRating,
                mustOperateVolt, mustReleaseVolt, operateTime, releaseTime, features, terminationStyle,
                operationTemp, coilVoltage, mount, id, name, description, manufacturer, mfgPartNum, series, qtyAvailable, price);
        
        return( safetyRelay );
    }
    
    /**
     * @return the contactForm
     */
    public String getContactForm() {
        return (this.contactForm);
    }

    /**
     * @param contactForm the contactForm to set
     */
    public void setContactForm(String contactForm) {
        this.contactForm = contactForm;
    }

    /**
     * @return the contactMaterial
     */
    public String getContactMaterial() {
        return (this.contactMaterial);
    }

    /**
     * @param contactMaterial the contactMaterial to set
     */
    public void setContactMaterial(String contactMaterial) {
        this.contactMaterial = contactMaterial;
    }
}

final class SignalRelayInfo extends RelayInfo{
    private String contactForm;
    private String sealRating;
    private String coilInsulation;
    private String contactMaterial;
    private String relayType;

    //init constructor
    public SignalRelayInfo() {
        super();
        this.contactForm = "";
        this.sealRating = "";
        this.coilInsulation = "";
        this.contactMaterial = "";
        this.relayType = "";
    }

    //complete constructor
    public SignalRelayInfo(String contactForm, String sealRating, String coilInsulation, String contactMaterial, String relayType, String contactCurrentRating, String mustOperateVolt, String mustReleaseVolt, String operateTime, String releaseTime, String features, String terminationStyle, String operationTemp, String coilVoltage, RelayMountingType mount, String itemId, String name, String description, String mfg, String mfgPartNum, String series, int qty, double price) throws Exception {
        super(contactCurrentRating, mustOperateVolt, mustReleaseVolt, operateTime, releaseTime, features, terminationStyle, operationTemp, coilVoltage, mount, itemId, name, description, mfg, mfgPartNum, series, qty, price);
        this.contactForm = contactForm;
        this.sealRating = sealRating;
        this.coilInsulation = coilInsulation;
        this.contactMaterial = contactMaterial;
        this.relayType = relayType;
    }
    
    
    @Override
    public String toCSV() {
        String output = "";
        
        output += super.toCSV(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += this.getContactForm() + ",";
        output += this.getSealRating() + ",";
        output += this.getCoilInsulation() + ",";
        output += this.getContactMaterial() + ",";
        output += this.getRelayType() + "\n";
        
        return(output);
    }

    @Override
    public String toCustom() {
        String output = "";
        
        output += super.toCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "Contact Form: " + this.getContactForm() + "\n";
        output += "Seal Rating: " + this.getSealRating() + "\n";
        output += "Coil Insulation: " + this.getCoilInsulation() + "\n";
        output += "Contact Material: " + this.getContactMaterial() + "\n";
        output += "Relay Type: " + this.getRelayType() + "\n";
        
        return(output);
    }

    @Override
    public String toXML() {
        String output = "";
        
        output += super.toXML(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "         <SignalRelayInfo>\n";
        output += "             <contactForm>" + this.getContactForm() + "</contactForm>\n";
        output += "             <sealRating>" + this.getSealRating() + "</sealRating>\n";
        output += "             <coilInsulation>" + this.getCoilInsulation() + "</coilInsulation>\n";
        output += "             <contactMaterial>" + this.getContactMaterial() + "</contactMaterial>\n";
        output += "             <relayType>" + this.getRelayType() + "</relayType>\n";
        output += "         </SignalRelayInfo>\n";
        output += "     </RelayInfo>\n";
        output += "</ProductInfo>\n";
        
        return(output);
    }

    public static SignalRelayInfo fromCustom( String input ) throws Exception {
        SignalRelayInfo signalRelay = new SignalRelayInfo();
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
        //Relay
        String contactCurrentRating = "";
        String mustOperateVolt = "";
        String mustReleaseVolt = "";
        String operateTime = "";
        String releaseTime = "";
        String features = "";
        String terminationStyle = "";
        String operationTemp = "";
        String coilVoltage = "";
        RelayMountingType mount = RelayMountingType.Unknown;
        //SignalRelay
        String contactForm = "";
        String sealRating = "";
        String coilInsulation = "";
        String contactMaterial = "";
        String relayType = "";
        
        
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
                    shippingBox = PackageOption.valueOf(Chunks[1]);
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Quantity") == true ){
                    qtyAvailable = Integer.valueOf( Chunks[1] );
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Price") == true ){
                    price = Double.valueOf( Chunks[1] );
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Contact Current Rating") == true ){
                    contactCurrentRating =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Must Operate Volt") == true ){
                    mustOperateVolt =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Must Release Volt") == true ){
                    mustReleaseVolt =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Operate Time") == true ){
                    operateTime =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Release Time") == true ){
                    releaseTime =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Features") == true ){
                    features =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Termination Style") == true ){
                    terminationStyle =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Operation Temp") == true ){
                    operationTemp =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Coil Voltage") == true ){
                    coilVoltage =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Mount") == true ){
                    mount =  RelayMountingType.valueOf(Chunks[1]);
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Contact Form") == true ){
                    contactForm =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Seal Rating") == true ){
                    sealRating =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Coil Insulation") == true ){
                    coilInsulation =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Contact Material") == true ){
                    contactMaterial =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Relay Type") == true ){
                    relayType =  Chunks[1];
                } else {
                    System.out.println("Error: Invalid field passed!");
                }
            }
            signalRelay = new SignalRelayInfo(contactForm, sealRating, coilInsulation,
                    contactMaterial, relayType, contactCurrentRating, mustOperateVolt,
                    mustReleaseVolt, operateTime, releaseTime, features, terminationStyle,
                    operationTemp, coilVoltage, mount, id, name, description, manufacturer, mfgPartNum,
                    series, qtyAvailable, price);
        }
        
        
        return( signalRelay );
    }
    
    public static SignalRelayInfo fromCSV( String input ) throws Exception {
        SignalRelayInfo signalRelay = new SignalRelayInfo();
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
        //Relay
        String contactCurrentRating;
        String mustOperateVolt;
        String mustReleaseVolt;
        String operateTime;
        String releaseTime;
        String features;
        String terminationStyle;
        String operationTemp;
        String coilVoltage;
        RelayMountingType mount;
        //SignalRelay
        String contactForm;
        String sealRating;
        String coilInsulation;
        String contactMaterial;
        String relayType;

        //Validate input 
        if ( input == null ){
            throw new Exception("Error: Null input for parsing!");
        } else if ( input.length() == 0 ){
            throw new Exception("Error: Zero length string provided!");
        } else {
            //Split line based on comma
            Chunks = input.split(",");
            if ( Chunks.length == 28 ){
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
                //RelayInfo Params
                contactCurrentRating = Chunks[ 13 ];
                mustOperateVolt = Chunks[ 14 ];
                mustReleaseVolt = Chunks[ 15 ];
                operateTime = Chunks[ 16 ];
                releaseTime =  Chunks[ 17 ];
                features = Chunks[ 18 ];
                terminationStyle = Chunks[ 19 ];
                operationTemp = Chunks[ 20 ];
                coilVoltage = Chunks[ 21 ];
                mount = RelayMountingType.valueOf( Chunks[ 22 ] );
                //=================
                //SignalRelayInfo
                contactForm = Chunks[ 23 ];
                sealRating = Chunks[ 24 ];
                coilInsulation = Chunks[ 25 ];
                contactMaterial = Chunks[ 26 ];
                relayType = Chunks[ 27 ];
                
                //Parameter validation is in constructors
                signalRelay = new SignalRelayInfo(contactForm, sealRating, coilInsulation, 
                        contactMaterial, relayType, contactCurrentRating, mustOperateVolt, 
                        mustReleaseVolt, operateTime, releaseTime, features, terminationStyle, 
                        operationTemp, coilVoltage, mount, id, name, description, manufacturer, 
                        mfgPartNum, series, qtyAvailable, price);
                
            }
        }
        
        return( signalRelay );
    }
    
    public static SignalRelayInfo fromXML( String input ) throws Exception {
        SignalRelayInfo signalRelay = new SignalRelayInfo();
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
        //Relay
        String contactCurrentRating = "";
        String mustOperateVolt = "";
        String mustReleaseVolt = "";
        String operateTime = "";
        String releaseTime = "";
        String features = "";
        String terminationStyle = "";
        String operationTemp = "";
        String coilVoltage = "";
        RelayMountingType mount = RelayMountingType.Unknown;
        //SignalRelay
        String contactForm = "";
        String sealRating = "";
        String coilInsulation = "";
        String contactMaterial = "";
        String relayType = "";
        
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
                
                regex = Pattern.compile("<contactCurrentRating>(.*)</contactCurrentRating>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    contactCurrentRating = matcher.group(1);
                }
                
                regex = Pattern.compile("<mustOperateVolt>(.*)</mustOperateVolt>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    mustOperateVolt = matcher.group(1);
                }
                
                regex = Pattern.compile("<mustReleaseVolt>(.*)</mustReleaseVolt>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    mustReleaseVolt = matcher.group(1);
                }
                
                regex = Pattern.compile("<operateTime>(.*)</operateTime>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    operateTime = matcher.group(1);
                }
                
                regex = Pattern.compile("<releaseTime>(.*)</releaseTime>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    releaseTime = matcher.group(1);
                }
                
                regex = Pattern.compile("<features>(.*)</featuresd>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    features = matcher.group(1);
                }
                
                regex = Pattern.compile("<terminationStyle>(.*)</terminationStyle>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    terminationStyle = matcher.group(1);
                }
                
                regex = Pattern.compile("<operationTemp>(.*)</operationTemp>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    operationTemp = matcher.group(1);
                }
                
                regex = Pattern.compile("<coilVoltage>(.*)</coilVoltage>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    coilVoltage = matcher.group(1);
                }
                
                regex = Pattern.compile("<mount>(.*)</mount>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    mount = RelayMountingType.valueOf(matcher.group(1));
                }
                
                regex = Pattern.compile("<contactForm>(.*)</contactForm>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    contactForm = matcher.group(1);
                }
                
                regex = Pattern.compile("<sealRating>(.*)</sealRating>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    sealRating = matcher.group(1);
                }
                
                regex = Pattern.compile("<coilInsulation>(.*)</coilInsulation>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    coilInsulation = matcher.group(1);
                }
                
                regex = Pattern.compile("<contactMaterial>(.*)</contactMaterial>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    contactMaterial = matcher.group(1);
                }
                
                regex = Pattern.compile("<relayType>(.*)</relayType>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    relayType = matcher.group(1);
                }
                
            }
        }
        
        signalRelay = new SignalRelayInfo(contactForm, sealRating, coilInsulation,
                contactMaterial, relayType, contactCurrentRating, mustOperateVolt,
                mustReleaseVolt, operateTime, releaseTime, features, terminationStyle,
                operationTemp, coilVoltage, mount, id, name, description, manufacturer, mfgPartNum,
                series, qtyAvailable, price);
        
        return( signalRelay );
    }
    
    /**
     * @return the contactForm
     */
    public String getContactForm() {
        return (this.contactForm);
    }

    /**
     * @param contactForm the contactForm to set
     */
    public void setContactForm(String contactForm) {
        this.contactForm = contactForm;
    }

    /**
     * @return the sealRating
     */
    public String getSealRating() {
        return (this.sealRating);
    }

    /**
     * @param sealRating the sealRating to set
     */
    public void setSealRating(String sealRating) {
        this.sealRating = sealRating;
    }

    /**
     * @return the coilInsulation
     */
    public String getCoilInsulation() {
        return (this.coilInsulation);
    }

    /**
     * @param coilInsulation the coilInsulation to set
     */
    public void setCoilInsulation(String coilInsulation) {
        this.coilInsulation = coilInsulation;
    }

    /**
     * @return the contactMaterial
     */
    public String getContactMaterial() {
        return (this.contactMaterial);
    }

    /**
     * @param contactMaterial the contactMaterial to set
     */
    public void setContactMaterial(String contactMaterial) {
        this.contactMaterial = contactMaterial;
    }

    /**
     * @return the relayType
     */
    public String getRelayType() {
        return (this.relayType);
    }

    /**
     * @param relayType the relayType to set
     */
    public void setRelayType(String relayType) {
        this.relayType = relayType;
    }
}

final class PowerRelayInfo extends RelayInfo{
    private String contactForm;
    private String coilCurrent;
    private RelayCoilType coil;
    private String sealRating;
    private String coilInsulation;
    private String contactMaterial;
    private String relayType;

    //init constructor
    public PowerRelayInfo() {
        super();
        this.contactForm = "";
        this.coilCurrent = "";
        this.coil = RelayCoilType.Unknown;
        this.sealRating = "";
        this.coilInsulation = "";
        this.contactMaterial = "";
        this.relayType = "";
    }

    //Complete constructor
    public PowerRelayInfo(String contactForm, String coilCurrent, RelayCoilType coil, String sealRating, String coilInsulation, String contactMaterial, String relayType, String contactCurrentRating, String mustOperateVolt, String mustReleaseVolt, String operateTime, String releaseTime, String features, String terminationStyle, String operationTemp, String coilVoltage, RelayMountingType mount, String itemId, String name, String description, String mfg, String mfgPartNum, String series, int qty, double price) throws Exception {
        super(contactCurrentRating, mustOperateVolt, mustReleaseVolt, operateTime, releaseTime, features, terminationStyle, operationTemp, coilVoltage, mount, itemId, name, description, mfg, mfgPartNum, series, qty, price);
        
        
        //Add validation for parameters
        this.contactForm = contactForm;
        this.coilCurrent = coilCurrent;
        this.coil = coil;
        this.sealRating = sealRating;
        this.coilInsulation = coilInsulation;
        this.contactMaterial = contactMaterial;
        this.relayType = relayType;
    }
    
    
    
    @Override
    public String toCSV() {
        String output = "";
        
        output += super.toCSV(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += this.getContactForm() + ",";
        output += this.getCoilCurrent() + ",";
        output += this.getCoil() + ",";
        output += this.getSealRating() + ",";
        output += this.getCoilInsulation() + ",";
        output += this.getContactMaterial() + ",";
        output += this.getRelayType() + "\n";
        
        return(output);
    }

    @Override
    public String toCustom() {
        String output = "";
        
        output += super.toCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "Contact Form: " + this.getContactForm() + "\n";
        output += "Coil Current: " + this.getCoilCurrent() + "\n";
        output += "Coil: " + this.getCoil() + "\n";
        output += "Seal Rating: " + this.getSealRating() + "\n";
        output += "Coil Insulation: " + this.getCoilInsulation() + "\n";
        output += "Contact Material: " + this.getContactMaterial() + "\n";
        output += "Relay Type: " + this.getRelayType() + "\n";
        
        return(output);
    }

    @Override
    public String toXML() {
        String output = "";
        
        output += super.toXML(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "         <PowerRelayInfo>\n";
        output += "             <contactForm>" + this.getContactForm() + "</contactForm>\n";
        output += "             <coilCurrent>" + this.getCoilCurrent() + "</coilCurrent>\n";
        output += "             <coil>" + this.getCoil() + "</coil>\n";
        output += "             <sealRating>" + this.getSealRating() + "</sealRating>\n";
        output += "             <coilInsulation>" + this.getCoilInsulation() + "</coilInsulation>\n";
        output += "             <contactMaterial>" + this.getContactMaterial() + "</contactMaterial>\n";
        output += "             <relayType>" + this.getRelayType() + "</relayType>\n";
        output += "         </PowerRelayInfo>\n";
        output += "     </RelayInfo>\n";
        output += "</ProductInfo>\n";
        
        return(output);
    }
    
    //fromCSV
    public static PowerRelayInfo fromCSV(String input) throws Exception {
        PowerRelayInfo powerRelay = new PowerRelayInfo();
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
        //Relay
        String contactCurrentRating = "";
        String mustOperateVolt = "";
        String mustReleaseVolt = "";
        String operateTime = "";
        String releaseTime = "";
        String features = "";
        String terminationStyle = "";
        String operationTemp = "";
        String coilVoltage = "";
        RelayMountingType mount = RelayMountingType.Unknown;
        //PowerRelay
        String contactForm = "";
        String coilCurrent = "";
        RelayCoilType coil = RelayCoilType.Unknown;
        String sealRating = "";
        String coilInsulation = "";
        String contactMaterial = "";
        String relayType = "";
        
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
                //RelayInfo Params
                contactCurrentRating = Chunks[ 13 ];
                mustOperateVolt = Chunks[ 14 ];
                mustReleaseVolt = Chunks[ 15 ];
                operateTime = Chunks[ 16 ];
                releaseTime =  Chunks[ 17 ];
                features = Chunks[ 18 ];
                terminationStyle = Chunks[ 19 ];
                operationTemp = Chunks[ 20 ];
                coilVoltage = Chunks[ 21 ];
                mount = RelayMountingType.valueOf( Chunks[ 22 ] );
                //=================
                //PowerRelayInfo params
                contactForm = Chunks[ 23 ];
                coilCurrent = Chunks[ 24 ];
                coil =  RelayCoilType.valueOf( Chunks[ 25 ] );
                sealRating =  Chunks[ 26 ];
                coilInsulation = Chunks[ 27 ];
                contactMaterial = Chunks[ 28 ];
                relayType =  Chunks[ 29 ];
                
                //Parameter Validation is inside constructors 
                //Call constructor
                powerRelay = new PowerRelayInfo(contactForm, coilCurrent, coil, sealRating, 
                        coilInsulation, contactMaterial, relayType, contactCurrentRating, mustOperateVolt, 
                        mustReleaseVolt, operateTime, releaseTime, features, terminationStyle, operationTemp, 
                        coilVoltage, mount, id, name, description, manufacturer, mfgPartNum, series, qtyAvailable, price);
                
            }
        }
        
        return(powerRelay);
    }
    
    public static PowerRelayInfo fromCustom( String input ) throws Exception {
        PowerRelayInfo powerRelay = new PowerRelayInfo();
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
        //Relay
        String contactCurrentRating = "";
        String mustOperateVolt = "";
        String mustReleaseVolt = "";
        String operateTime = "";
        String releaseTime = "";
        String features = "";
        String terminationStyle = "";
        String operationTemp = "";
        String coilVoltage = "";
        RelayMountingType mount = RelayMountingType.Unknown;
        //PowerRelay
        String contactForm = "";
        String coilCurrent = "";
        RelayCoilType coil = RelayCoilType.Unknown;
        String sealRating = "";
        String coilInsulation = "";
        String contactMaterial = "";
        String relayType = "";
        
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
                    shippingBox = PackageOption.valueOf(Chunks[1]);
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Quantity") == true ){
                    qtyAvailable = Integer.valueOf( Chunks[1] );
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Price") == true ){
                    price = Double.valueOf( Chunks[1] );
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Contact Current Rating") == true ){
                    contactCurrentRating =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Must Operate Volt") == true ){
                    mustOperateVolt =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Must Release Volt") == true ){
                    mustReleaseVolt =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Operate Time") == true ){
                    operateTime =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Release Time") == true ){
                    releaseTime =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Features") == true ){
                    features =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Termination Style") == true ){
                    terminationStyle =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Operation Temp") == true ){
                    operationTemp =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Coil Voltage") == true ){
                    coilVoltage =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Mount") == true ){
                    mount =  RelayMountingType.valueOf(Chunks[1]);
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Contact Form") == true ){
                    contactForm =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Coil Current") == true ){
                    coilCurrent =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Coil") == true ){
                    coil =  RelayCoilType.valueOf(Chunks[1]);
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Seal Rating") == true ){
                    sealRating =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Coil Insulation") == true ){
                    coilInsulation =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Contact Material") == true ){
                    contactMaterial =  Chunks[1];
                } else if ( Chunks[ 0 ].equalsIgnoreCase("Relay Type") == true ){
                    relayType =  Chunks[1];
                } else {
                    System.out.println("Error: Invalid field passed!");
                }
            }
            powerRelay = new PowerRelayInfo(contactForm, coilCurrent, coil, sealRating,
                    coilInsulation, contactMaterial, relayType, contactCurrentRating,
                    mustOperateVolt, mustReleaseVolt, operateTime, releaseTime, features,
                    terminationStyle, operationTemp, coilVoltage, mount, id, name, description,
                    manufacturer, mfgPartNum, series, qtyAvailable, price);
        }
                    
        
        return( powerRelay );
    }
    
    public static PowerRelayInfo fromXML( String input ) throws Exception {
        PowerRelayInfo powerRelay = new PowerRelayInfo();
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
        //Relay
        String contactCurrentRating = "";
        String mustOperateVolt = "";
        String mustReleaseVolt = "";
        String operateTime = "";
        String releaseTime = "";
        String features = "";
        String terminationStyle = "";
        String operationTemp = "";
        String coilVoltage = "";
        RelayMountingType mount = RelayMountingType.Unknown;
        //PowerRelay
        String contactForm = "";
        String coilCurrent = "";
        RelayCoilType coil = RelayCoilType.Unknown;
        String sealRating = "";
        String coilInsulation = "";
        String contactMaterial = "";
        String relayType = "";
        
        
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
                
                regex = Pattern.compile("<contactCurrentRating>(.*)</contactCurrentRating>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    contactCurrentRating = matcher.group(1);
                }
                
                regex = Pattern.compile("<mustOperateVolt>(.*)</mustOperateVolt>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    mustOperateVolt = matcher.group(1);
                }
                
                regex = Pattern.compile("<mustReleaseVolt>(.*)</mustReleaseVolt>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    mustReleaseVolt = matcher.group(1);
                }
                
                regex = Pattern.compile("<operateTime>(.*)</operateTime>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    operateTime = matcher.group(1);
                }
                
                regex = Pattern.compile("<releaseTime>(.*)</releaseTime>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    releaseTime = matcher.group(1);
                }
                
                regex = Pattern.compile("<features>(.*)</featuresd>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    features = matcher.group(1);
                }
                
                regex = Pattern.compile("<terminationStyle>(.*)</terminationStyle>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    terminationStyle = matcher.group(1);
                }
                
                regex = Pattern.compile("<operationTemp>(.*)</operationTemp>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    operationTemp = matcher.group(1);
                }
                
                regex = Pattern.compile("<coilVoltage>(.*)</coilVoltage>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    coilVoltage = matcher.group(1);
                }
                
                regex = Pattern.compile("<mount>(.*)</mount>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    mount = RelayMountingType.valueOf(matcher.group(1));
                }
                
                regex = Pattern.compile("<contactForm>(.*)</contactForm>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    contactForm = matcher.group(1);
                }
                
                regex = Pattern.compile("<coilCurrent>(.*)</coilCurrent>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    coilCurrent = matcher.group(1);
                }
                
                regex = Pattern.compile("<coil>(.*)</coil>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    coil = RelayCoilType.valueOf(matcher.group(1));
                }
                
                regex = Pattern.compile("<sealRating>(.*)</sealRating>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    sealRating = matcher.group(1);
                }
                
                regex = Pattern.compile("<coilInsulation>(.*)</coilInsulation>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    coilInsulation = matcher.group(1);
                }
                
                regex = Pattern.compile("<contactMaterial>(.*)</contactMaterial>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    contactMaterial = matcher.group(1);
                }
                
                regex = Pattern.compile("<relayType>(.*)</relayType>");
                matcher = regex.matcher(input);
                if ( matcher.find() == true ){
                    relayType = matcher.group(1);
                }
                
            }
        }
        
        powerRelay = new PowerRelayInfo(contactForm, coilCurrent, coil, sealRating,
                coilInsulation, contactMaterial, relayType, contactCurrentRating,
                mustOperateVolt, mustReleaseVolt, operateTime, releaseTime, features,
                terminationStyle, operationTemp, coilVoltage, mount, id, name, description,
                manufacturer, mfgPartNum, series, qtyAvailable, price);
        
        return( powerRelay );
    }

    /**
     * @return the contactForm
     */
    public String getContactForm() {
        return (this.contactForm);
    }

    /**
     * @param contactForm the contactForm to set
     */
    public void setContactForm(String contactForm) {
        this.contactForm = contactForm;
    }

    /**
     * @return the coilCurrent
     */
    public String getCoilCurrent() {
        return (this.coilCurrent);
    }

    /**
     * @param coilCurrent the coilCurrent to set
     */
    public void setCoilCurrent(String coilCurrent) {
        this.coilCurrent = coilCurrent;
    }

    /**
     * @return the coil
     */
    public RelayCoilType getCoil() {
        return (this.coil);
    }

    /**
     * @param coil the coil to set
     */
    public void setCoil(RelayCoilType coil) {
        this.coil = coil;
    }

    /**
     * @return the sealRating
     */
    public String getSealRating() {
        return (this.sealRating);
    }

    /**
     * @param sealRating the sealRating to set
     */
    public void setSealRating(String sealRating) {
        this.sealRating = sealRating;
    }

    /**
     * @return the coilInsulation
     */
    public String getCoilInsulation() {
        return (this.coilInsulation);
    }

    /**
     * @param coilInsulation the coilInsulation to set
     */
    public void setCoilInsulation(String coilInsulation) {
        this.coilInsulation = coilInsulation;
    }

    /**
     * @return the contactMaterial
     */
    public String getContactMaterial() {
        return (this.contactMaterial);
    }

    /**
     * @param contactMaterial the contactMaterial to set
     */
    public void setContactMaterial(String contactMaterial) {
        this.contactMaterial = contactMaterial;
    }

    /**
     * @return the relayType
     */
    public String getRelayType() {
        return (this.relayType);
    }

    /**
     * @param relayType the relayType to set
     */
    public void setRelayType(String relayType) {
        this.relayType = relayType;
    }
    
}

enum RelayCoilType{
        LatchingDualCoil,
        LatchingSingleCoil,
        NonLatching,
        Unknown
    }

enum RelayMountingType {
        ChassisMount,
        SurfaceMount,
        PanelMount,
        ThroughHole,
        ThroughHoleRightAngle,
        FreeHanging,
        Socketable,
        SocketableThroughHole,
        DINRail,
        Unknown
    }