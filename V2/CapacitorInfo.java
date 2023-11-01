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
        output += "<CapacitorInfo>\n";
        output += "     <capacitance>" + this.getCapacitance() + "</capacitance>\n";
        output += "     <tolerance>" + this.getTolerance() + "</tolerance>\n";
        output += "     <voltageRating>" + this.getVoltageRating() + "</voltageRating>\n";
        output += "     <operationTemp>" + this.getOperationTemp() + "</operationTemp>\n";
        output += "     <size>" + this.getSize() + "</size>\n";
        output += "     <dielectricMat>" + this.getDielectricMat() + "</dielectricMat>\n";
        output += "     <mount>" + this.getMount() + "</mount>\n";
        output += "     <packageCase>" + this.getPackageCase() + "</packageCase>\n";
        output += "     <seatedHeight>" + this.getSeatedHeight() + "</seatedHeight>\n";
        output += "</CapacitorInfo>\n";
        
        
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
    public MountingType getMount() {
        return (this.mount);
    }

    /**
     * @param mount the mount to set
     */
    public void setMount(MountingType mount) {
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
        output += "<EDLCAndSupercapacitorInfo>\n";
        output += "     <equivalentSeriesResistance>" + this.getEquivalentSeriesResistance() + "</equivalentSeriesResistance>\n";
        output += "     <lifetimeAtTemp>" + this.getLifetimeAtTemp() + "</lifetimeAtTemp>\n";
        output += "     <termination>" + this.getTermination() + "</termination>\n";
        output += "     <leadSpacing>" + this.getLeadSpacing() + "</leadSpacing>\n";
        output += "</EDLCAndSupercapacitorInfo>\n";
        
        return(output);
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
        output += "<MicaAndPTFEInfo>\n";
        output += "     <leadSpacing>" + this.getLeadSpacing() + "</leadSpacing>\n";
        output += "     <features>" + this.getFeatures() + "</features>\n";
        output += "</MicaAndPTFEInfo>\n";
        
        return(output);
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
    private capacitorRatings rating;
    private capacitorCircuitType circuit;
    
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
        output += "<NetworksAndArraysInfo>\n";
        output += "     <capacitorCount>" + this.getCapacitorCount() + "</capacitorCount>\n";
        output += "     <tempCoefficient>" + this.getTempCoefficient() + "</tempCoefficient>\n";
        output += "     <supplierDevicePackage>" + this.getSupplierDevicePackage() + "</supplierDevicePackage>\n";
        output += "     <rating>" + this.getRating() + "</rating>\n";
        output += "     <circuit>" + this.getCircuit() + "</circuit>\n";
        output += "</NetworksAndArraysInfo>\n";
        
        
        return(output);
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
    public capacitorRatings getRating() {
        return (this.rating);
    }

    /**
     * @param rating the rating to set
     */
    public void setRating(capacitorRatings rating) {
        this.rating = rating;
    }

    /**
     * @return the circuit
     */
    public capacitorCircuitType getCircuit() {
        return (this.circuit);
    }

    /**
     * @param circuit the circuit to set
     */
    public void setCircuit(capacitorCircuitType circuit) {
        this.circuit = circuit;
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
        output += "<TrimmerAndVariableInfo>\n";
        output += "     <capacitanceRange>" + this.getCapacitanceRange() + "</capacitanceRange>\n";
        output += "     <adjustmentType>" + this.getAdjustmentType() + "</adjustmentType>\n";
        output += "     <qAtFreq>" + this.getqAtFreq() + "</qAtFreq>\n";
        output += "     <features>" + this.getFeatures() + "</features>\n";
        output += "</TrimmerAndVariableInfo>\n";
        
        return(output);
    }
    
    public TrimmerAndVariableInfo fromCustom( String input ){
        TrimmerAndVariableInfo trimmerAndVariable = new TrimmerAndVariableInfo();
        
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