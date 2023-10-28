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
   
    
}

final class AdjustableInductors extends InductorCoilAndChokesInfo {
    private String inductance;
    private String qAtFreq;
    private String height;
    private String size;

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
    private inductorRating Rating;
    private String height;
    private String size;
    
    
    
}


final class FixedInductorInfo extends InductorCoilAndChokesInfo {
    private String coreMaterial;
    private double inductance;
    private String currentRating;
    private String currentSaturation;
    private String inductorType;
    private fixedInductorShielding shielding;
    private String dcResistance;
    private String qAtFreq;
    private String selfResonantFreq;
    private inductorRating Rating;
    private String operatingTemp;
    private String inductanceFreqTest;
    private String features;
    private String supplierDevicePackage;
    private String size;
    private String seatedHeight;
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

