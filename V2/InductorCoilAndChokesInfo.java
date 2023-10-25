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
    private String size;
    
}

final class AdjustableInductors extends InductorCoilAndChokesInfo {
    private String inductance;
    private String qFreq;
    private String packageCase;
    private String height;
    private AdjustableInductorMountingType mount;
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
    private ArrayRatings Rating;
    private ArrayMountingType mount;
    private String packageCase;
    private String height;
    
    
    
}

final class DelayLinesInfo extends InductorCoilAndChokesInfo {
    private String delayTime;
    private String operatingTemp;
    private String packageCase;
    private DelayLineMountingType mount;
}

final class FixedInductorInfo extends InductorCoilAndChokesInfo {
    private String coreMaterial;
    private double inductance;
    private String currentRating;
    private String currentSaturation;
    private FixedInductorType type;
    private fixedInductorShielding shielding;
    private fixedInductorMount mount;
    private String dcResistance;
    private String qFreq;
    private String selfResonantFreq;
    private FixedInductorRatings Rating;
    private String operatingTemp;
    private String inductanceFreqTest;
    private String features;
    private String packageCase;
    private String supplierDevicePackage;
    private String size;
    private String seatedHeight;
}

final class WirelessChargingCoilInfo extends InductorCoilAndChokesInfo {
    private String inductance;
    private WirelessCoilFunction function;
    private String type;
    private String qFreq;
    private String currentRating;
    private String selfResonantFreq;
    private String operatingTemp;
    
}


//Arrays, Signal Transformers Enum
enum AdjustableInductorMountingType{
    SurfaceMount,
    ThroughHole,
    Unknown
}

enum ArrayShielding{
    Shielded,
    Unshielded,
    Unknown
}

enum ArrayRatings{
    AEC_Q200,
    Unknown
}

enum ArrayMountingType {
    ChassisMount,
    SurfaceMount,
    ThroughHole,
    Unknown
}

enum DelayLineMountingType{
    SurfaceMount,
    ThroughHole,
    Unknown
}

enum FixedInductorType{
    Ceramic,
    DrumCore,
    DrumCoreWirewound,
    Molded,
    Multilayer,
    Planar,
    ThickFilm,
    ThinFilm,
    Toroidal,
    Wirewound,
    Unknown
}

enum FixedInductorRatings{
    AEC_Q200,
    Unknown
}

enum fixedInductorShielding{
    Shielded,
    Semi_Shielding,
    Unshielded,
    Unknown
}
enum fixedInductorMount {
    ChassisMount,
    FreeHanging,
    SurfaceMount,
    ThroughHole,
    UserDefined,
    Unknown
}

enum WirelessCoilFunction{
    Receiver,
    ReceiverTransmitter,
    Transmitter,
    Unknown
}