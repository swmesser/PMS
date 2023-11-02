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
    private inductorMountingType mount;
    private String packageCase;
    private String operationTemp;
   
    @Override
    public String toCSV() {
        String output = "";
        
        output += super.toCSV(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += this.getTolerance() + ",";
        output += this.getMount() + ",";
        output += this.getPackageCase() + ",";
        output += this.getOperationTemp() + ",";
        
        return(output);
    }

    @Override
    public String toCustom() {
        String output = "";
        
        output += super.toCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "Tolerance: " + this.getTolerance() + "\n";
        output += "Mount: " + this.getMount() + "\n";
        output += "Package Case: " + this.getPackageCase() + "\n";
        output += "Operation Temp: " + this.getOperationTemp() + "\n";
        
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
        output += "     <operationTemp>" + this.getOperationTemp() + "</operationTemp>\n";
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
    public inductorMountingType getMount() {
        return (this.mount);
    }

    /**
     * @param mount the mount to set
     */
    public void setMount(inductorMountingType mount) {
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
}

final class AdjustableInductors extends InductorCoilAndChokesInfo {
    private String inductance;
    private String qAtFreq;
    private String height;
    private String size;

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
    private ArrayShielding shielding;
    private inductorRating rating;
    private String height;
    private String size;
    
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
    public ArrayShielding getShielding() {
        return (this.shielding);
    }

    /**
     * @param shielding the shielding to set
     */
    public void setShielding(ArrayShielding shielding) {
        this.shielding = shielding;
    }

    /**
     * @return the rating
     */
    public inductorRating getRating() {
        return (this.rating);
    }

    /**
     * @param rating the rating to set
     */
    public void setRating(inductorRating rating) {
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
    private fixedInductorShielding shielding;
    private String dcResistance;
    private String qAtFreq;
    private String selfResonantFreq;
    private inductorRating rating;
    private String operatingTemp;
    private String inductanceFreqTest;
    private String features;
    private String supplierDevicePackage;
    private String size;
    private String seatedHeight;
    
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
    public fixedInductorShielding getShielding() {
        return (this.shielding);
    }

    /**
     * @param shielding the shielding to set
     */
    public void setShielding(fixedInductorShielding shielding) {
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
    public inductorRating getRating() {
        return (this.rating);
    }

    /**
     * @param rating the rating to set
     */
    public void setRating(inductorRating rating) {
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

enum ArrayShielding{
    Shielded,
    Unshielded,
    Unknown
}

enum fixedInductorShielding{
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

enum inductorMountingType{
    ChassisMount,
    FreeHanging,
    SurfaceMount,
    ThroughHole,
    UserDefined,
    Unknown
}

enum inductorRating{
    AEC_Q200,
    Unknown
}

