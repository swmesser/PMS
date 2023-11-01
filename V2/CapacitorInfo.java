package PMS.V2;

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
    private MountingType mount;
    private String packageCase;
    private String seatedHeight;
    
    //All of the exporting methods are implemented through the inheritance
    //  added all info specific to class
    @Override
    public String toCSV() {
        String output = "";
 
        output += super.toCSV(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += this.capacitance + ",";
        output += this.tolerance + ",";
        output += this.voltageRating + ",";
        output += this.operationTemp + ",";
        output += this.size + ",";
        output += this.dielectricMat + ",";
        output += this.mount + ",";
        output += this.packageCase + ",";
        output += this.seatedHeight + ",";
        
        return( output );
    }

    @Override
    public String toCustom() {
        String output = "";
        
        output += super.toCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "Capacitance: " + this.capacitance + '\n';
        output += "Tolerance: " + this.tolerance + '\n';
        output += "Voltage Rating: " + this.voltageRating + '\n';
        output += "Operating Temperature: " + this.operationTemp + '\n';
        output += "Size: " + this.size + '\n';
        output += "Dielectric Material: " + this.dielectricMat + '\n';
        output += "Mount: " + this.mount + '\n';
        output += "Package Case: " + this.packageCase + '\n';
        output += "Seated Height: " + this.seatedHeight + '\n';
        
        return( output );
    }

    @Override
    public String toXML() {
        String output = "";
        
        output += super.toXML(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "<CapacitorInfo>\n";
        output += "     <capacitance>" + this.capacitance + "</capacitance>\n";
        output += "     <tolerance>" + this.tolerance + "</tolerance>\n";
        output += "     <voltageRating>" + this.voltageRating + "</voltageRating>\n";
        output += "     <operationTemp>" + this.operationTemp + "</operationTemp>\n";
        output += "     <size>" + this.size + "</size>\n";
        output += "     <dielectricMat>" + this.dielectricMat + "</dielectricMat>\n";
        output += "     <mount>" + this.mount + "</mount>\n";
        output += "     <packageCase>" + this.packageCase + "</packageCase>\n";
        output += "     <seatedHeight>" + this.seatedHeight + "</seatedHeight>\n";
        output += "</CapacitorInfo>\n";
        
        
        return( output );
    }
    
    
    
    
}


//Subcategories to the capacitor category
final class EDLCAndSupercapactiorInfo extends CapacitorInfo{
    private String equivalentSeriesResistance;
    private String lifetimeAtTemp;
    private String termination;
    private String leadSpacing;
    
    //All of the exporting methods are implemented through the inheritance
    //  added all info specific to class
    @Override
    public String toCSV() {
        String output = "";
        
        output += super.toCSV(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += this.equivalentSeriesResistance + ",";
        output += this.lifetimeAtTemp + ",";
        output += this.termination + ",";
        output += this.leadSpacing + "\n";
        
        return(output);
    }

    @Override
    public String toCustom() {
        String output = "";
        
        output += super.toCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "Equivalent Series Resistance: " + this.equivalentSeriesResistance + '\n';
        output += "Lifetime at Temp: " + this.lifetimeAtTemp + '\n';
        output += "Termination: " + this.termination + '\n';
        output += "Lead Spacing: " + this.leadSpacing + '\n';
        
        return(output);
    }

    @Override
    public String toXML() {
        String output = "";
        
        output += super.toXML(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "<EDLCAndSupercapacitorInfo>\n";
        output += "     <equivalentSeriesResistance>" + this.equivalentSeriesResistance + "</equivalentSeriesResistance>\n";
        output += "     <lifetimeAtTemp>" + this.lifetimeAtTemp + "</lifetimeAtTemp>\n";
        output += "     <termination>" + this.termination + "</termination>\n";
        output += "     <leadSpacing>" + this.leadSpacing + "</leadSpacing>\n";
        output += "</EDLCAndSupercapacitorInfo>\n";
        
        return(output);
    }
}

final class MicaAndPTFEInfo extends CapacitorInfo{
    private String leadSpacing;
    private String features;
    
    //All of the exporting methods are implemented through the inheritance
    //  added all info specific to class
    @Override
    public String toCSV() {
        String output = "";
        
        output += super.toCSV(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += this.leadSpacing + ",";
        output += this.features + "\n";
        
        return(output);
    }

    @Override
    public String toCustom() {
        String output = "";
        
        output += super.toCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "Lead Spacing: " + this.leadSpacing + '\n';
        output += "Features: " + this.features + '\n';
        
        return(output);
    }

    @Override
    public String toXML() {
        String output = "";
        
        output += super.toXML(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "<MicaAndPTFEInfo>\n";
        output += "     <leadSpacing>" + this.leadSpacing + "</leadSpacing>\n";
        output += "     <features>" + this.features + "</features>\n";
        output += "</MicaAndPTFEInfo>\n";
        
        return(output);
    }
}

final class NetworksAndArraysInfo extends CapacitorInfo{
    private int capacitorCount;
    private String tempCoefficient;
    private String supplierDevicePackage;
    private capacitorRatings rating;
    private capacitorCircuitType circuit;
    
    //All of the exporting methods are implemented through the inheritance
    //  added all info specific to class
    @Override
    public String toCSV() {
        String output = "";
        
        output += super.toCSV(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += this.capacitorCount + ",";
        output += this.tempCoefficient + ",";
        output += this.supplierDevicePackage + ",";
        output += this.rating + ",";
        output += this.circuit + "\n";
        
        return(output);
    }

    @Override
    public String toCustom() {
        String output = "";
        
        output += super.toCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "Capacitor Count: " + this.capacitorCount + '\n';
        output += "Temperature Coefficient: " + this.tempCoefficient + '\n';
        output += "Supplier Device Package: " + this.supplierDevicePackage + '\n';
        output += "Rating: " + this.rating + '\n';
        output += "Circuit: " + this.circuit + '\n';
        
        return(output);
    }

    @Override
    public String toXML() {
        String output = "";
        
        output += super.toXML(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "<NetworksAndArraysInfo>\n";
        output += "     <capacitorCount>" + this.capacitorCount + "</capacitorCount>\n";
        output += "     <tempCoefficient>" + this.tempCoefficient + "</tempCoefficient>\n";
        output += "     <supplierDevicePackage>" + this.supplierDevicePackage + "</supplierDevicePackage>\n";
        output += "     <rating>" + this.rating + "</rating>\n";
        output += "     <circuit>" + this.circuit + "</circuit>\n";
        output += "</NetworksAndArraysInfo>\n";
        
        
        return(output);
    }
}

final class TrimmerAndVariableInfo extends CapacitorInfo{
    private String capacitanceRange;
    private String adjustmentType;
    private String qAtFreq;
    private String features;
    
    //All of the exporting methods are implemented through the inheritance
    //  added all info specific to class
    @Override
    public String toCSV() {
        String output = "";
        
        output += super.toCSV(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += this.capacitanceRange + ",";
        output += this.adjustmentType + ",";
        output += this.qAtFreq + ",";
        output += this.features + "\n";
        
        return(output);
    }

    @Override
    public String toCustom() {
        String output = "";
        
        output += super.toCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "Capacitance Range: " + this.capacitanceRange + '\n';
        output += "Adjustment Type: " + this.adjustmentType + '\n';
        output += "Q at Frequency: " + this.qAtFreq + '\n';
        output += "Features: " + this.features + '\n';
        
        return(output);
    }

    @Override
    public String toXML() {
        String output = "";
        
        output += super.toXML(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "<TrimmerAndVariableInfo>\n";
        output += "     <capacitanceRange>" + this.capacitanceRange + "</capacitanceRange>\n";
        output += "     <adjustmentType>" + this.adjustmentType + "</adjustmentType>\n";
        output += "     <qAtFreq>" + this.qAtFreq + "</qAtFreq>\n";
        output += "     <features>" + this.features + "</features>\n";
        output += "</TrimmerAndVariableInfo>\n";
        
        return(output);
    }
    
    public TrimmerAndVariableInfo fromCustom( String input ){
        TrimmerAndVariableInfo trimmerAndVariable = new TrimmerAndVariableInfo();
        
        return( trimmerAndVariable );
    }
}

enum capacitorRatings{
    AEC_Q200,
    Unknown
}

enum capacitorCircuitType{
    Bussed,
    Isolated,
    Unknown
}

enum MountingType{
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