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

    @Override
    public String toCSV() {
        String output = "";
        
        output += super.toCSV(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += this.contactCurrentRating + ",";
        output += this.mustOperateVolt + ",";
        output += this.mustReleaseVolt + ",";
        output += this.operateTime + ",";
        output += this.releaseTime + ",";
        output += this.features + ",";
        output += this.terminationStyle + ",";
        output += this.operationTemp + ",";
        output += this.coilVoltage + ",";
        output += this.mount + ",";
        
        return(output);
    }

    @Override
    public String toCustom() {
        String output = "";
        
        output += super.toCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "Contact Current Rating: " + this.contactCurrentRating + "\n";
        output += "Must Operate Voltage: " + this.mustOperateVolt + "\n";
        output += "Must Release Voltage: " + this.mustReleaseVolt + "\n";
        output += "Operate Time: " + this.operateTime + "\n";
        output += "Release Time: " + this.releaseTime + "\n";
        output += "Features: " + this.features + "\n";
        output += "Termination Style: " + this.terminationStyle + "\n";
        output += "Operation Temp: " + this.operationTemp + "\n";
        output += "Coil Voltage: " + this.coilVoltage + "\n";
        output += "Mount: " + this.mount + "\n";
        
        return(output);
    }

    @Override
    public String toXML() {
        String output = "";
        
        output += super.toXML(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "<RelayInfo>\n";
        output += "     <contactCurrentRating>" + this.contactCurrentRating + "</contactCurrentRating>\n";
        output += "     <mustOperateVolt>" + this.mustOperateVolt + "</mustOperateVolt>\n";
        output += "     <mustReleaseVolt>" + this.mustReleaseVolt + "</mustReleaseVolt>\n";
        output += "     <operateTime>" + this.operateTime + "</operateTime>\n";
        output += "     <releaseTime>" + this.releaseTime + "</releaseTime>\n";
        output += "     <features>" + this.features + "</features>\n";
        output += "     <terminationStyle>" + this.terminationStyle + "</terminationStyle>\n";
        output += "     <operationTemp>" + this.operationTemp + "</operationTemp>\n";
        output += "     <coilVoltage>" + this.coilVoltage + "</coilVoltage>\n";
        output += "     <mount>" + this.mount + "</mount>\n";
        output += "</RelayInfo>\n";
        
        return(output);
    }
    
    
            
    
    
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

    @Override
    public String toCSV() {
        String output = "";
        
        output += super.toCSV(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += this.contactForm + ",";
        output += this.coil + "\n";
        
        return(output);
    }

    @Override
    public String toCustom() {
        String output = "";
        
        output += super.toCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "Contact Form: " + this.contactForm + "\n";
        output += "Coil: " + this.coil + "\n";
        
        return(output);
    }

    @Override
    public String toXML() {
        String output = "";
        
        output += super.toXML(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "<HighFrequencyRelayInfo>\n";
        output += "     <contactForm>" + this.contactForm + "</contactForm>\n";
        output += "     <coil>" + this.coil + "</coil>\n";
        output += "</HighFrequencyRelayInfo>\n";
        
        return(output);
    }
    
    
}

final class AutomotiveRelayInfo extends RelayInfo{
    private String coilCurrent;
    private CoilType coil;
    
    @Override
    public String toCSV() {
        String output = "";
        
        output += super.toCSV(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += this.coilCurrent + ",";
        output += this.coil + "\n";
        
        return(output);
    }

    @Override
    public String toCustom() {
        String output = "";
        
        output += super.toCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "Coil Current: " + this.coilCurrent + "\n";
        output += "Coil: " + this.coil + "\n";
        
        return(output);
    }

    @Override
    public String toXML() {
        String output = "";
        
        output += super.toXML(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "<AutomotiveRelayInfo>\n";
        output += "     <coilCurrent>" + this.coilCurrent + "</coilCurrent>\n";
        output += "     <coil>" + this.coil + "</coil>\n";
        output += "</AutomotiveRelayInfo>\n";
        
        return(output);
    }
}

final class SafetyRelayInfo extends RelayInfo{
    private String contactForm;
    private String contactMaterial;
    
    @Override
    public String toCSV() {
        String output = "";
        
        output += super.toCSV(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += this.contactForm + ",";
        output += this.contactMaterial + "\n";
        
        return(output);
    }

    @Override
    public String toCustom() {
        String output = "";
        
        output += super.toCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "Contact Form: " + this.contactForm + "\n";
        output += "Contact Material: " + this.contactMaterial + "\n";
        
        return(output);
    }

    @Override
    public String toXML() {
        String output = "";
        
        output += super.toXML(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "<SafetyRelayInfo>\n";
        output += "     <contactForm>" + this.contactForm + "</contactForm>\n";
        output += "     <contactMaterial>" + this.contactMaterial + "</contactMaterial>\n";
        output += "</SafetyRelayInfo>\n";
        
        return(output);
    }
}

final class SignalRelayInfo extends RelayInfo{
    private String contactForm;
    private String sealRating;
    private String coilInsulation;
    private String contactMaterial;
    private String relayType;
    
    @Override
    public String toCSV() {
        String output = "";
        
        output += super.toCSV(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += this.contactForm + ",";
        output += this.sealRating + ",";
        output += this.coilInsulation + ",";
        output += this.contactMaterial + ",";
        output += this.relayType + "\n";
        
        return(output);
    }

    @Override
    public String toCustom() {
        String output = "";
        
        output += super.toCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "Contact Form: " + this.contactForm + "\n";
        output += "Seal Rating: " + this.sealRating + "\n";
        output += "Coil Insulation: " + this.coilInsulation + "\n";
        output += "Contact Material: " + this.contactMaterial + "\n";
        output += "Relay Type: " + this.relayType + "\n";
        
        return(output);
    }

    @Override
    public String toXML() {
        String output = "";
        
        output += super.toXML(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "<SignalRelayInfo>\n";
        output += "     <contactForm>" + this.contactForm + "</contactForm>\n";
        output += "     <sealRating>" + this.sealRating + "</sealRating>\n";
        output += "     <coilInsulation>" + this.coilInsulation + "</coilInsulation>\n";
        output += "     <contactMaterial>" + this.contactMaterial + "</contactMaterial>\n";
        output += "     <relayType>" + this.relayType + "</relayType>\n";
        output += "</SignalRelayInfo>\n";
        
        return(output);
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
    
    @Override
    public String toCSV() {
        String output = "";
        
        output += super.toCSV(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += this.contactForm + ",";
        output += this.coilCurrent + ",";
        output += this.coil + ",";
        output += this.sealRating + ",";
        output += this.coilInsulation + ",";
        output += this.contactMaterial + ",";
        output += this.relayType + "\n";
        
        return(output);
    }

    @Override
    public String toCustom() {
        String output = "";
        
        output += super.toCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "Contact Form: " + this.contactForm + "\n";
        output += "Coil Current: " + this.coilCurrent + "\n";
        output += "Coil: " + this.coil + "\n";
        output += "Seal Rating: " + this.sealRating + "\n";
        output += "Coil Insulation: " + this.coilInsulation + "\n";
        output += "Contact Material: " + this.contactMaterial + "\n";
        output += "Relay Type: " + this.relayType + "\n";
        
        return(output);
    }

    @Override
    public String toXML() {
        String output = "";
        
        output += super.toXML(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "<PowerRelayInfo>\n";
        output += "     <contactForm>" + this.contactForm + "</contactForm>\n";
        output += "     <coilCurrent>" + this.coilCurrent + "</coilCurrent>\n";
        output += "     <coil>" + this.coil + "</coil>\n";
        output += "     <sealRating>" + this.sealRating + "</sealRating>\n";
        output += "     <coilInsulation>" + this.coilInsulation + "</coilInsulation>\n";
        output += "     <contactMaterial>" + this.contactMaterial + "</contactMaterial>\n";
        output += "     <relayType>" + this.relayType + "</relayType>\n";
        output += "</PowerRelayInfo>\n";
        
        return(output);
    }
    
}

enum CoilType{
        LatchingDualCoil,
        LatchingSingleCoil,
        NonLatching,
        Unknown
    }