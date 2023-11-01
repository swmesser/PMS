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
        output += this.tolerance + ",";
        output += this.mount + ",";
        output += this.packageCase + ",";
        output += this.operationTemp + ",";
        
        return(output);
    }

    @Override
    public String toCustom() {
        String output = "";
        
        output += super.toCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "Tolerance: " + this.tolerance + "\n";
        output += "Mount: " + this.mount + "\n";
        output += "Package Case: " + this.packageCase + "\n";
        output += "Operation Temp: " + this.operationTemp + "\n";
        
        return(output);
    }

    @Override
    public String toXML() {
        String output = "";
        
        output += super.toXML(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "<InductorCoilAndChokesInfo>\n";
        output += "     <tolerance>" + this.tolerance + "</tolerance>\n";
        output += "     <mount>" + this.mount + "</mount>\n";
        output += "     <packageCase>" + this.packageCase + "</packageCase>\n";
        output += "     <operationTemp>" + this.operationTemp + "</operationTemp>\n";
        output += "</InductorCoilAndChokesInfo>\n";
        
        return(output);
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
        output += this.inductance + ",";
        output += this.qAtFreq + ",";
        output += this.height + ",";
        output += this.size + "\n";
        
        return(output);
    }

    @Override
    public String toCustom() {
        String output = "";
        
        output += super.toCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "Inductance: " + this.inductance + "\n";
        output += "Q At Frequency: " + this.qAtFreq + "\n";
        output += "Height: " + this.height + "\n";
        output += "Size: " + this.size + "\n";
        
        return(output);
    }

    @Override
    public String toXML() {
        String output = "";
        
        output += super.toXML(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "<AdjustableInductors>\n";
        output += "     <inductance>" + this.inductance + "</inductance>\n";
        output += "     <qAtFreq>" + this.qAtFreq + "</qAtFreq>\n";
        output += "     <height>" + this.height + "</height>\n";
        output += "     <size>" + this.size + "</size>\n";
        output += "</AdjustableInductors>\n";
        
        return(output);
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
        output += this.coilNumber + ",";
        output += this.parallelInductance + ",";
        output += this.seriesInductance + ",";
        output += this.parallelCurrentRating + ",";
        output += this.seriesCurrentRating + ",";
        output += this.parallelCurrentSaturation + ",";
        output += this.seriesCurrentSaturation + ",";
        output += this.parallelDCResistance + ",";
        output += this.seriesDCResistance + ",";
        output += this.operatingTemp + ",";
        output += this.shielding + ",";
        output += this.rating + ",";
        output += this.height + ",";
        output += this.size + "\n";
        
        return(output);
    }

    @Override
    public String toCustom() {
        String output = "";
        
        output += super.toCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "Coil Number: " + this.coilNumber + "\n";
        output += "Parallel Inductance: " + this.parallelInductance + "\n";
        output += "Series Inductance: " + this.seriesInductance + "\n";
        output += "Parallel Current Rating: " + this.parallelCurrentRating + "\n";
        output += "Series Current Rating: " + this.seriesCurrentRating + "\n";
        output += "Parallel Current Saturation: " + this.parallelCurrentSaturation + "\n";
        output += "Series Current Saturation: " + this.seriesCurrentSaturation + "\n";
        output += "Parallel DC Resistance: " + this.parallelDCResistance + "\n";
        output += "Series DC Resistance: " + this.seriesDCResistance + "\n";
        output += "Operating Temp: " + this.operatingTemp + "\n";
        output += "Shielding: " + this.shielding + "\n";
        output += "Rating: " + this.rating + "\n";
        output += "Height: " + this.height + "\n";
        output += "Size: " + this.size + "\n";
        
        return(output);
    }

    @Override
    public String toXML() {
        String output = "";
        
        output += super.toXML(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "<ArraysAndSignalTransformerInfo>\n";
        output += "     <coilNumber>" + this.coilNumber + "</coilNumber>\n";
        output += "     <parallelInductance>" + this.parallelInductance + "</parallelInductance>\n";
        output += "     <seriesInductance>" + this.seriesInductance + "</seriesInductance>\n";
        output += "     <parallelCurrentRating>" + this.parallelCurrentRating + "</parallelCurrentRating>\n";
        output += "     <seriesCurrentRating>" + this.seriesCurrentRating + "</seriesCurrentRating>\n";
        output += "     <parallelCurrentSaturation>" + this.parallelCurrentSaturation + "</parallelCurrentSaturation>\n";
        output += "     <seriesCurrentSaturation>" + this.seriesCurrentSaturation + "</seriesCurrentSaturation>\n";
        output += "     <parallelDCResistance>" + this.parallelDCResistance + "</parallelDCResistance>\n";
        output += "     <seriesDCResistance>" + this.seriesDCResistance + "</seriesDCResistance>\n";
        output += "     <operatingTemp>" + this.operatingTemp + "</operatingTemp>\n";
        output += "     <shielding>" + this.shielding + "</shielding>\n";
        output += "     <rating>" + this.rating + "</rating>\n";
        output += "     <height>" + this.height + "</height>\n";
        output += "     <size>" + this.size + "</size>\n";
        output += "</ArraysAndSignalTransformerInfo>\n";
        
        return(output);
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
        output += this.coreMaterial + ",";
        output += this.inductance + ",";
        output += this.currentRating + ",";
        output += this.currentSaturation + ",";
        output += this.inductorType + ",";
        output += this.shielding + ",";
        output += this.dcResistance + ",";
        output += this.qAtFreq + ",";
        output += this.selfResonantFreq + ",";
        output += this.rating + ",";
        output += this.operatingTemp + ",";
        output += this.inductanceFreqTest + ",";
        output += this.features + ",";
        output += this.supplierDevicePackage + ",";
        output += this.size + ",";
        output += this.seatedHeight + "\n";
        
        return(output);
    }

    @Override
    public String toCustom() {
        String output = "";
        
        output += super.toCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "Core Material: " + this.coreMaterial + "\n";
        output += "Inductance: " + this.inductance + "\n";
        output += "Current Rating: " + this.currentRating + "\n";
        output += "Current Saturation: " + this.currentSaturation + "\n";
        output += "Inductor Type: " + this.inductorType + "\n";
        output += "Shielding: " + this.shielding + "\n";
        output += "DC Resistance: " + this.dcResistance + "\n";
        output += "Q At Freq: "  + this.qAtFreq + "\n";
        output += "Self Resonant Freq: " + this.selfResonantFreq + "\n";
        output += "Rating: " + this.rating + "\n";
        output += "Operating Temp: " + this.operatingTemp + "\n";
        output += "Inductance Freq Test: " + this.inductanceFreqTest + "\n";
        output += "Features: " + this.features + "\n";
        output += "Supplier Device Package: " + this.supplierDevicePackage + "\n";
        output += "Size: " + this.size + "\n";
        output += "Seated Height: " + this.seatedHeight + "\n";
        
        return(output);
    }

    @Override
    public String toXML() {
        String output = "";
        
        output += super.toXML(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "<FixedInductorInfo>\n";
        output += "     <coreMaterial>" + this.coreMaterial + "</coreMaterial>\n";
        output += "     <inductance>" + this.inductance + "</inductance>\n";
        output += "     <currentRating>" + this.currentRating + "</currentRating>\n";
        output += "     <currentSaturation>" + this.currentSaturation + "</currentSaturation>\n";
        output += "     <inductorType>" + this.inductorType + "</inductorType>\n";
        output += "     <shielding>" + this.shielding + "</shielding>\n";
        output += "     <dcResistance>" + this.dcResistance + "</dcResistance>\n";
        output += "     <qAtFreq>" + this.qAtFreq + "</qAtFreq>\n";
        output += "     <selfResonantFreq>" + this.selfResonantFreq + "</selfResonantFreq>\n";
        output += "     <rating>" + this.rating + "</rating>\n";
        output += "     <operatingTemp>" + this.operatingTemp + "</operatingTemp>\n";
        output += "     <inductanceFreqTest>" + this.inductanceFreqTest + "</inductanceFreqTest>\n";
        output += "     <features>" + this.features + "</features>\n";
        output += "     <supplierDevicePackage>" + this.supplierDevicePackage + "</supplierDevicePackage>\n";
        output += "     <size>" + this.size + "</size>\n";
        output += "     <seatedHeight>" + this.seatedHeight + "</seatedHeight>\n";
        output += "</FixedInductorInfo>\n";
        
        return(output);
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
        output += this.inductance + ",";
        output += this.function + ",";
        output += this.type + ",";
        output += this.qAtFreq + ",";
        output += this.currentRating + ",";
        output += this.selfResonantFreq + ",";
        output += this.operatingTemp + ",";
        output += this.size + "\n";
        
        return(output);
    }

    @Override
    public String toCustom() {
        String output = "";
        
        output += super.toCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "Inductance: " + this.inductance + "\n";
        output += "Function: " + this.function + "\n";
        output += "Type: " + this.type + "\n";
        output += "Q At Freq: "  + this.qAtFreq + "\n";
        output += "Current Rating: " + this.currentRating + "\n";
        output += "Self Resonant Freq: " + this.selfResonantFreq + "\n";
        output += "Operating Temp: " + this.operatingTemp + "\n";
        output += "Size: " + this.size + "\n";
        
        return(output);
    }

    @Override
    public String toXML() {
        String output = "";
        
        output += super.toXML(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "<WirelessCharingCoilInfo>\n";
        output += "     <inductance>" + this.inductance + "</inductance>\n";
        output += "     <function>" + this.function + "</function>\n";
        output += "     <type>" + this.type + "</type>\n";
        output += "     <qAtFreq>" + this.qAtFreq + "</qAtFreq>\n";
        output += "     <selfResonantFreq>" + this.selfResonantFreq + "</selfResonantFreq>\n";
        output += "     <operatingTemp>" + this.operatingTemp + "</operatingTemp>\n";
        output += "     <size>" + this.size + "</size>\n";
        output += "</WirelessChargingCoilInfo>\n";
        
        return(output);
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

