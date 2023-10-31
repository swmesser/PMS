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
    private MountingType mount;
    
            
            
    
    
    private enum MountingType {
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
}

final class HighFrequencyRelayInfo extends RelayInfo{
    private String contactForm;
    private CoilType coil;
    
    
}

final class AutomotiveRelayInfo extends RelayInfo {
    private String coilCurrent;
    private CoilType coil;
    
}

final class SafetyRelayInfo extends RelayInfo {
    private String contactForm;
    private String contactMaterial;
}

final class SignalRelayInfo extends RelayInfo {
    private String contactForm;
    private String sealRating;
    private String coilInsulation;
    private String contactMaterial;
    private String relayType;
    
    
}

final class PowerRelayInfo extends RelayInfo {
    private String contactForm;
    private String coilCurrent;
    private CoilType coil;
    private String sealRating;
    private String coilInsulation;
    private String contactMaterial;
    private String relayType;
}

enum CoilType{
        LatchingDualCoil,
        LatchingSingleCoil,
        NonLatching,
        Unknown
    }