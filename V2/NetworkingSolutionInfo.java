package PMS.V2;

/* 
 * File: NetworkingSolutionInfo
 * Copy: Copyright (c) 2023 Samuel W. Messer
 * BlazerID: swmesser
 * Vers: 1.0.0 Oct 25, 2023 SWM - Original Coding
 * Desc: Driver for testing concepts
 */

public abstract class NetworkingSolutionInfo extends ProductInfo {

}

final class AccessoryInfo extends NetworkingSolutionInfo {
    private String accessoryType;
    private String forUseWith;
}

final class GatewaysAndRouterInfo extends NetworkingSolutionInfo {
    private String function;
    private String modulationOrProtocol;
    private String frequency;
    private String applications;
    private String interfaceType;
    private String sensitivity;
    private String outputPower;
    private String maxDataRate;
    private String features;
    
}

final class MediaConvertorInfo extends NetworkingSolutionInfo {
    private MediaConvertorType type;
    private MediaConvertorConfig config;
    private int copperPorts;
    private String copperType;
    private int fiberPorts;
    private String fiberType;
    private String sfp_xfpPorts;
    private String Features;
    private String distance;
    private int MTU;
    private String inputVoltage;
    private String connectorType;
    private String mountType;
    private String ingressProtection;
    private String operatingTemp;
}

final class MiscellaneousInfo extends NetworkingSolutionInfo {
    private String type;
    private String forUseWith;
}

final class SerialDeviceServerInfo extends NetworkingSolutionInfo {
    private String type;
    private String interfaceType;
    private int portCount;
}

final class SwitchesAndHubInfo extends NetworkingSolutionInfo {
    private String type;
    private SwitchAndHubConfig config;
    private int portCount;
    private int copperPorts;
    private String copperType;
    private int fiberPorts;
    private String fiberType;
    private String sfp_xfpPorts;
    private String sfp_xfpType;
    private int PoEPorts;
    private String connectorType;
    private String inputVoltage;
    private String ingressProtection;
    private String mountingType;
    private String operatingTemp;
}

enum MediaConvertorType{
    Managed,
    SwitchUnmanaged,
    Unmanaged,
    Unknown
}

enum MediaConvertorConfig{
    EthernetExtender,
    FixedSFP,
    Fixed,
    ModularCard,
    ModularRack,
    Unknown
}

enum SwitchAndHubConfig{
    FixedSFP,
    Fixed,
    ModularCard,
    ModularRack,
    Module,
    Unknown
}