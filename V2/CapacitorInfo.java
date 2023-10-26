package PMS.V2;

import com.sun.jdi.connect.spi.TransportService;

/* 
 * File: CapacitorInfo
 * Copy: Copyright (c) 2023 Samuel W. Messer
 * BlazerID: swmesser
 * Vers: 1.0.0 Oct 24, 2023 SWM - Original Coding
 * Desc: Driver for testing concepts
 */

public abstract class CapacitorInfo extends ProductInfo {
    private String Capacitance;
    private String tolerance;
    private String voltageRating;
    private String operationTemp;
    private String size;
    private String dielectricMat;
    private capacitorMountingType mount;
    private String packageCase;
    private String seatedHeight;
    
}


//Subcategories to the capacitor category
final class EDLCAndSupercapactiorInfo extends CapacitorInfo{
    private String equivalentSeriesResistance;
    private String lifetimeAtTemp;
    private String Termination;
    private String leadSpacing;
}

final class MicaAndPTFEInfo extends CapacitorInfo{
    private String leadSpacing;
    private String features;
    
}

final class NetworksAndArraysInfo extends CapacitorInfo{
    private int capacitorCount;
    private String tempCoefficient;
    private String supplierDevicePackage;
    private capacitorRatings rating;
    private capacitorCircuitType circuit;
}

final class TrimmerAndVariableInfo extends CapacitorInfo{
    private String capacitanceRange;
    private String adjustmentType;
    private String qAtFreq;
    private String features;
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

enum capacitorMountingType{
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