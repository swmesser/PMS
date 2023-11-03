package PMS.V2;

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
    private relayMountingType mount;

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
        this.mount = relayMountingType.Unknown;
    }

    public RelayInfo(String contactCurrentRating, String mustOperateVolt, String mustReleaseVolt, String operateTime, String releaseTime, String features, String terminationStyle, String operationTemp, String coilVoltage, relayMountingType mount, String itemId, String name, String description, String mfg, String mfgPartNum, String series, int qty, double price) throws Exception {
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
        output += "<RelayInfo>\n";
        output += "     <contactCurrentRating>" + this.getContactCurrentRating() + "</contactCurrentRating>\n";
        output += "     <mustOperateVolt>" + this.getMustOperateVolt() + "</mustOperateVolt>\n";
        output += "     <mustReleaseVolt>" + this.getMustReleaseVolt() + "</mustReleaseVolt>\n";
        output += "     <operateTime>" + this.getOperateTime() + "</operateTime>\n";
        output += "     <releaseTime>" + this.getReleaseTime() + "</releaseTime>\n";
        output += "     <features>" + this.getFeatures() + "</features>\n";
        output += "     <terminationStyle>" + this.getTerminationStyle() + "</terminationStyle>\n";
        output += "     <operationTemp>" + this.getOperationTemp() + "</operationTemp>\n";
        output += "     <coilVoltage>" + this.getCoilVoltage() + "</coilVoltage>\n";
        output += "     <mount>" + this.getMount() + "</mount>\n";
        output += "</RelayInfo>\n";
        
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
    public relayMountingType getMount() {
        return (this.mount);
    }

    /**
     * @param mount the mount to set
     */
    public void setMount(relayMountingType mount) {
        this.mount = mount;
    }
}

final class HighFrequencyRelayInfo extends RelayInfo{
    private String contactForm;
    private CoilType coil;

    //parameterless constructor
    public HighFrequencyRelayInfo() {
        this.contactForm = "";
        this.coil = CoilType.Unknown;
    }

    //complete constructor
    public HighFrequencyRelayInfo(String contactForm, CoilType coil, String contactCurrentRating, String mustOperateVolt, String mustReleaseVolt, String operateTime, String releaseTime, String features, String terminationStyle, String operationTemp, String coilVoltage, relayMountingType mount, String itemId, String name, String description, String mfg, String mfgPartNum, String series, int qty, double price) throws Exception {
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
        output += "<HighFrequencyRelayInfo>\n";
        output += "     <contactForm>" + this.getContactForm() + "</contactForm>\n";
        output += "     <coil>" + this.getCoil() + "</coil>\n";
        output += "</HighFrequencyRelayInfo>\n";
        
        return(output);
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
        stockOption stock;
        environmentalOption hazard;
        mediaOption media;
        packageOption shippingBox;
        productStatus status;
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
        relayMountingType mount;
        //HighFrequencyRelay
        String contactForm;
        CoilType coil;
        
        
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
                stock = stockOption.valueOf( Chunks[ 6 ]);
                hazard = environmentalOption.valueOf( Chunks[ 7 ]);
                media = mediaOption.valueOf( Chunks[ 8 ]);
                shippingBox = packageOption.valueOf( Chunks[ 9 ]);
                status = productStatus.valueOf( Chunks[ 10 ]);
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
                mount = relayMountingType.valueOf( Chunks[ 22 ] );
                //=================
                //HighFrequencyRelayInfo
                contactForm = Chunks[ 23 ];
                coil = CoilType.valueOf( Chunks[ 24 ]);
                
                //Param validation is in constructors
                highFreqRelay = new HighFrequencyRelayInfo(contactForm, coil, contactCurrentRating,
                        mustOperateVolt, mustReleaseVolt, operateTime, releaseTime, 
                        features, terminationStyle, operationTemp, coilVoltage, mount,
                        id, name, description, id, mfgPartNum, series, qtyAvailable, price);
            }
        }
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
    public CoilType getCoil() {
        return (this.coil);
    }

    /**
     * @param coil the coil to set
     */
    public void setCoil(CoilType coil) {
        this.coil = coil;
    }
    
    
}

final class AutomotiveRelayInfo extends RelayInfo{
    private String coilCurrent;
    private CoilType coil;

    //parameterless constructor
    public AutomotiveRelayInfo() {
        this.coilCurrent = "";
        this.coil = CoilType.Unknown;
    }

    //complete constructor
    public AutomotiveRelayInfo(String coilCurrent, CoilType coil, String contactCurrentRating, String mustOperateVolt, String mustReleaseVolt, String operateTime, String releaseTime, String features, String terminationStyle, String operationTemp, String coilVoltage, relayMountingType mount, String itemId, String name, String description, String mfg, String mfgPartNum, String series, int qty, double price) throws Exception {
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
        output += "<AutomotiveRelayInfo>\n";
        output += "     <coilCurrent>" + this.getCoilCurrent() + "</coilCurrent>\n";
        output += "     <coil>" + this.getCoil() + "</coil>\n";
        output += "</AutomotiveRelayInfo>\n";
        
        return(output);
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
        stockOption stock;
        environmentalOption hazard;
        mediaOption media;
        packageOption shippingBox;
        productStatus status;
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
        relayMountingType mount;
        //AutomotiveRelay
        String coilCurrent;
        CoilType coil;
        
        
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
                stock = stockOption.valueOf( Chunks[ 6 ]);
                hazard = environmentalOption.valueOf( Chunks[ 7 ]);
                media = mediaOption.valueOf( Chunks[ 8 ]);
                shippingBox = packageOption.valueOf( Chunks[ 9 ]);
                status = productStatus.valueOf( Chunks[ 10 ]);
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
                mount = relayMountingType.valueOf( Chunks[ 22 ] );
                //==================
                //AutomotiveRelayInfo
                coilCurrent = Chunks[ 23 ];
                coil = CoilType.valueOf( Chunks[ 24 ]);
                
                //Param validation is in constructor
                automotiveRelay = new AutomotiveRelayInfo(coilCurrent, coil, contactCurrentRating,
                        mustOperateVolt, mustReleaseVolt, operateTime, releaseTime, features,
                        terminationStyle, operationTemp, coilVoltage, mount, id, name,
                        description, id, mfgPartNum, series, qtyAvailable, price);
            }
        }
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
    public CoilType getCoil() {
        return (this.coil);
    }

    /**
     * @param coil the coil to set
     */
    public void setCoil(CoilType coil) {
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
    public SafetyRelayInfo(String contactForm, String contactMaterial, String contactCurrentRating, String mustOperateVolt, String mustReleaseVolt, String operateTime, String releaseTime, String features, String terminationStyle, String operationTemp, String coilVoltage, relayMountingType mount, String itemId, String name, String description, String mfg, String mfgPartNum, String series, int qty, double price) throws Exception {
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
        output += "<SafetyRelayInfo>\n";
        output += "     <contactForm>" + this.getContactForm() + "</contactForm>\n";
        output += "     <contactMaterial>" + this.getContactMaterial() + "</contactMaterial>\n";
        output += "</SafetyRelayInfo>\n";
        
        return(output);
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
        stockOption stock;
        environmentalOption hazard;
        mediaOption media;
        packageOption shippingBox;
        productStatus status;
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
        relayMountingType mount;
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
                stock = stockOption.valueOf( Chunks[ 6 ]);
                hazard = environmentalOption.valueOf( Chunks[ 7 ]);
                media = mediaOption.valueOf( Chunks[ 8 ]);
                shippingBox = packageOption.valueOf( Chunks[ 9 ]);
                status = productStatus.valueOf( Chunks[ 10 ]);
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
                mount = relayMountingType.valueOf( Chunks[ 22 ] );
                //==================
                //SafetyRelayInfo
                contactForm = Chunks[ 23 ];
                contactMaterial = Chunks[ 24 ];
                
                //Param validation is in constructors
                safetyRelay = new SafetyRelayInfo(contactForm, contactMaterial, contactCurrentRating,
                        mustOperateVolt, mustReleaseVolt, operateTime, releaseTime,
                        features, terminationStyle, operationTemp, coilVoltage, mount,
                        id, name, description, id, mfgPartNum, series, qtyAvailable, price);
            }
        }
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
    public SignalRelayInfo(String contactForm, String sealRating, String coilInsulation, String contactMaterial, String relayType, String contactCurrentRating, String mustOperateVolt, String mustReleaseVolt, String operateTime, String releaseTime, String features, String terminationStyle, String operationTemp, String coilVoltage, relayMountingType mount, String itemId, String name, String description, String mfg, String mfgPartNum, String series, int qty, double price) throws Exception {
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
        output += "<SignalRelayInfo>\n";
        output += "     <contactForm>" + this.getContactForm() + "</contactForm>\n";
        output += "     <sealRating>" + this.getSealRating() + "</sealRating>\n";
        output += "     <coilInsulation>" + this.getCoilInsulation() + "</coilInsulation>\n";
        output += "     <contactMaterial>" + this.getContactMaterial() + "</contactMaterial>\n";
        output += "     <relayType>" + this.getRelayType() + "</relayType>\n";
        output += "</SignalRelayInfo>\n";
        
        return(output);
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
        stockOption stock;
        environmentalOption hazard;
        mediaOption media;
        packageOption shippingBox;
        productStatus status;
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
        relayMountingType mount;
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
                stock = stockOption.valueOf( Chunks[ 6 ]);
                hazard = environmentalOption.valueOf( Chunks[ 7 ]);
                media = mediaOption.valueOf( Chunks[ 8 ]);
                shippingBox = packageOption.valueOf( Chunks[ 9 ]);
                status = productStatus.valueOf( Chunks[ 10 ]);
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
                mount = relayMountingType.valueOf( Chunks[ 22 ] );
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
                        operationTemp, coilVoltage, mount, id, name, description, id, 
                        mfgPartNum, series, qtyAvailable, price);
                
            }
        }
        
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
    private CoilType coil;
    private String sealRating;
    private String coilInsulation;
    private String contactMaterial;
    private String relayType;

    //init constructor
    public PowerRelayInfo() {
        super();
        this.contactForm = "";
        this.coilCurrent = "";
        this.coil = CoilType.Unknown;
        this.sealRating = "";
        this.coilInsulation = "";
        this.contactMaterial = "";
        this.relayType = "";
    }

    //Complete constructor
    public PowerRelayInfo(String contactForm, String coilCurrent, CoilType coil, String sealRating, String coilInsulation, String contactMaterial, String relayType, String contactCurrentRating, String mustOperateVolt, String mustReleaseVolt, String operateTime, String releaseTime, String features, String terminationStyle, String operationTemp, String coilVoltage, relayMountingType mount, String itemId, String name, String description, String mfg, String mfgPartNum, String series, int qty, double price) throws Exception {
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
        output += "<PowerRelayInfo>\n";
        output += "     <contactForm>" + this.getContactForm() + "</contactForm>\n";
        output += "     <coilCurrent>" + this.getCoilCurrent() + "</coilCurrent>\n";
        output += "     <coil>" + this.getCoil() + "</coil>\n";
        output += "     <sealRating>" + this.getSealRating() + "</sealRating>\n";
        output += "     <coilInsulation>" + this.getCoilInsulation() + "</coilInsulation>\n";
        output += "     <contactMaterial>" + this.getContactMaterial() + "</contactMaterial>\n";
        output += "     <relayType>" + this.getRelayType() + "</relayType>\n";
        output += "</PowerRelayInfo>\n";
        
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
        stockOption stock;
        environmentalOption hazard;
        mediaOption media;
        packageOption shippingBox;
        productStatus status;
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
        relayMountingType mount;
        //PowerRelay
        String contactForm;
        String coilCurrent;
        CoilType coil;
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
            if ( Chunks.length == 30 ){
                //Assign all parameters
                //ProductInfo Params
                id = Chunks[ 0 ];
                name = Chunks[ 1 ];
                description = Chunks[ 2 ];
                manufacturer = Chunks[ 3 ];
                mfgPartNum = Chunks[ 4 ];
                series = Chunks[ 5 ];
                stock = stockOption.valueOf( Chunks[ 6 ]);
                hazard = environmentalOption.valueOf( Chunks[ 7 ]);
                media = mediaOption.valueOf( Chunks[ 8 ]);
                shippingBox = packageOption.valueOf( Chunks[ 9 ]);
                status = productStatus.valueOf( Chunks[ 10 ]);
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
                mount = relayMountingType.valueOf( Chunks[ 22 ] );
                //=================
                //PowerRelayInfo params
                contactForm = Chunks[ 23 ];
                coilCurrent = Chunks[ 24 ];
                coil =  CoilType.valueOf( Chunks[ 25 ] );
                sealRating =  Chunks[ 26 ];
                coilInsulation = Chunks[ 27 ];
                contactMaterial = Chunks[ 28 ];
                relayType =  Chunks[ 29 ];
                
                //Parameter Validation is inside constructors 
                //Call constructor
                powerRelay = new PowerRelayInfo(contactForm, coilCurrent, coil, sealRating, 
                        coilInsulation, contactMaterial, relayType, contactCurrentRating, mustOperateVolt, 
                        mustReleaseVolt, operateTime, releaseTime, features, terminationStyle, operationTemp, 
                        coilVoltage, mount, id, name, description, id, mfgPartNum, series, qtyAvailable, price);
                
            }
        }
        
        return(powerRelay);
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
    public CoilType getCoil() {
        return (this.coil);
    }

    /**
     * @param coil the coil to set
     */
    public void setCoil(CoilType coil) {
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

enum CoilType{
        LatchingDualCoil,
        LatchingSingleCoil,
        NonLatching,
        Unknown
    }

enum relayMountingType {
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