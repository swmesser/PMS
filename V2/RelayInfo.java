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
        output += this.getContactCurrentRating() + ",";
        output += this.getMustOperateVolt() + ",";
        output += this.getMustReleaseVolt() + ",";
        output += this.getOperateTime() + ",";
        output += this.getReleaseTime() + ",";
        output += this.getFeatures() + ",";
        output += this.getTerminationStyle() + ",";
        output += this.getOperationTemp() + ",";
        output += this.getCoilVoltage() + ",";
        output += this.getMount() + ",";
        
        return(output);
    }

    @Override
    public String toCustom() {
        String output = "";
        
        output += super.toCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "Contact Current Rating: " + this.getContactCurrentRating() + "\n";
        output += "Must Operate Voltage: " + this.getMustOperateVolt() + "\n";
        output += "Must Release Voltage: " + this.getMustReleaseVolt() + "\n";
        output += "Operate Time: " + this.getOperateTime() + "\n";
        output += "Release Time: " + this.getReleaseTime() + "\n";
        output += "Features: " + this.getFeatures() + "\n";
        output += "Termination Style: " + this.getTerminationStyle() + "\n";
        output += "Operation Temp: " + this.getOperationTemp() + "\n";
        output += "Coil Voltage: " + this.getCoilVoltage() + "\n";
        output += "Mount: " + this.getMount() + "\n";
        
        return(output);
    }

    @Override
    public String toXML() {
        String output = "";
        
        output += super.toXML(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "<RelayInfo>\n";
        output += "     <contactCurrentRating>" + this.getContactCurrentRating() + "</contactCurrentRating>\n";
        output += "     <mustOperateVolt>" + this.getMustOperateVolt() + "</mustOperateVolt>\n";
        output += "     <mustReleaseVolt>" + this.getMustReleaseVolt() + "</mustReleaseVolt>\n";
        output += "     <operateTime>" + this.getOperateTime() + "</operateTime>\n";
        output += "     <releaseTime>" + this.getReleaseTime() + "</releaseTime>\n";
        output += "     <features>" + this.getFeatures() + "</features>\n";
        output += "     <terminationStyle>" + this.getTerminationStyle() + "</terminationStyle>\n";
        output += "     <operationTemp>" + this.getOperationTemp() + "</operationTemp>\n";
        output += "     <coilVoltage>" + this.getCoilVoltage() + "</coilVoltage>\n";
        output += "     <mount>" + this.getMount() + "</mount>\n";
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

    /**
     * @return the contactCurrentRating
     */
    public String getContactCurrentRating() {
        return (this.contactCurrentRating);
    }

    /**
     * @param contactCurrentRating the contactCurrentRating to set
     */
    public void setContactCurrentRating(String contactCurrentRating) {
        this.contactCurrentRating = contactCurrentRating;
    }

    /**
     * @return the mustOperateVolt
     */
    public String getMustOperateVolt() {
        return (this.mustOperateVolt);
    }

    /**
     * @param mustOperateVolt the mustOperateVolt to set
     */
    public void setMustOperateVolt(String mustOperateVolt) {
        this.mustOperateVolt = mustOperateVolt;
    }

    /**
     * @return the mustReleaseVolt
     */
    public String getMustReleaseVolt() {
        return (this.mustReleaseVolt);
    }

    /**
     * @param mustReleaseVolt the mustReleaseVolt to set
     */
    public void setMustReleaseVolt(String mustReleaseVolt) {
        this.mustReleaseVolt = mustReleaseVolt;
    }

    /**
     * @return the operateTime
     */
    public String getOperateTime() {
        return (this.operateTime);
    }

    /**
     * @param operateTime the operateTime to set
     */
    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }

    /**
     * @return the releaseTime
     */
    public String getReleaseTime() {
        return (this.releaseTime);
    }

    /**
     * @param releaseTime the releaseTime to set
     */
    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
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
     * @return the terminationStyle
     */
    public String getTerminationStyle() {
        return (this.terminationStyle);
    }

    /**
     * @param terminationStyle the terminationStyle to set
     */
    public void setTerminationStyle(String terminationStyle) {
        this.terminationStyle = terminationStyle;
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
     * @return the coilVoltage
     */
    public String getCoilVoltage() {
        return (this.coilVoltage);
    }

    /**
     * @param coilVoltage the coilVoltage to set
     */
    public void setCoilVoltage(String coilVoltage) {
        this.coilVoltage = coilVoltage;
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
}

final class HighFrequencyRelayInfo extends RelayInfo{
    private String contactForm;
    private CoilType coil;

    @Override
    public String toCSV() {
        String output = "";
        
        output += super.toCSV(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += this.getContactForm() + ",";
        output += this.getCoil() + "\n";
        
        return(output);
    }

    @Override
    public String toCustom() {
        String output = "";
        
        output += super.toCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "Contact Form: " + this.getContactForm() + "\n";
        output += "Coil: " + this.getCoil() + "\n";
        
        return(output);
    }

    @Override
    public String toXML() {
        String output = "";
        
        output += super.toXML(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "<HighFrequencyRelayInfo>\n";
        output += "     <contactForm>" + this.getContactForm() + "</contactForm>\n";
        output += "     <coil>" + this.getCoil() + "</coil>\n";
        output += "</HighFrequencyRelayInfo>\n";
        
        return(output);
    }

    /**
     * @return the contactForm
     */
    public String getContactForm() {
        return (this.contactForm);
    }

    /**
     * @param contactForm the contactForm to set
     */
    public void setContactForm(String contactForm) {
        this.contactForm = contactForm;
    }

    /**
     * @return the coil
     */
    public CoilType getCoil() {
        return (this.coil);
    }

    /**
     * @param coil the coil to set
     */
    public void setCoil(CoilType coil) {
        this.coil = coil;
    }
    
    
}

final class AutomotiveRelayInfo extends RelayInfo{
    private String coilCurrent;
    private CoilType coil;
    
    @Override
    public String toCSV() {
        String output = "";
        
        output += super.toCSV(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += this.getCoilCurrent() + ",";
        output += this.getCoil() + "\n";
        
        return(output);
    }

    @Override
    public String toCustom() {
        String output = "";
        
        output += super.toCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "Coil Current: " + this.getCoilCurrent() + "\n";
        output += "Coil: " + this.getCoil() + "\n";
        
        return(output);
    }

    @Override
    public String toXML() {
        String output = "";
        
        output += super.toXML(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "<AutomotiveRelayInfo>\n";
        output += "     <coilCurrent>" + this.getCoilCurrent() + "</coilCurrent>\n";
        output += "     <coil>" + this.getCoil() + "</coil>\n";
        output += "</AutomotiveRelayInfo>\n";
        
        return(output);
    }

    /**
     * @return the coilCurrent
     */
    public String getCoilCurrent() {
        return (this.coilCurrent);
    }

    /**
     * @param coilCurrent the coilCurrent to set
     */
    public void setCoilCurrent(String coilCurrent) {
        this.coilCurrent = coilCurrent;
    }

    /**
     * @return the coil
     */
    public CoilType getCoil() {
        return (this.coil);
    }

    /**
     * @param coil the coil to set
     */
    public void setCoil(CoilType coil) {
        this.coil = coil;
    }
}

final class SafetyRelayInfo extends RelayInfo{
    private String contactForm;
    private String contactMaterial;
    
    @Override
    public String toCSV() {
        String output = "";
        
        output += super.toCSV(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += this.getContactForm() + ",";
        output += this.getContactMaterial() + "\n";
        
        return(output);
    }

    @Override
    public String toCustom() {
        String output = "";
        
        output += super.toCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "Contact Form: " + this.getContactForm() + "\n";
        output += "Contact Material: " + this.getContactMaterial() + "\n";
        
        return(output);
    }

    @Override
    public String toXML() {
        String output = "";
        
        output += super.toXML(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "<SafetyRelayInfo>\n";
        output += "     <contactForm>" + this.getContactForm() + "</contactForm>\n";
        output += "     <contactMaterial>" + this.getContactMaterial() + "</contactMaterial>\n";
        output += "</SafetyRelayInfo>\n";
        
        return(output);
    }

    /**
     * @return the contactForm
     */
    public String getContactForm() {
        return (this.contactForm);
    }

    /**
     * @param contactForm the contactForm to set
     */
    public void setContactForm(String contactForm) {
        this.contactForm = contactForm;
    }

    /**
     * @return the contactMaterial
     */
    public String getContactMaterial() {
        return (this.contactMaterial);
    }

    /**
     * @param contactMaterial the contactMaterial to set
     */
    public void setContactMaterial(String contactMaterial) {
        this.contactMaterial = contactMaterial;
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
        output += this.getContactForm() + ",";
        output += this.getSealRating() + ",";
        output += this.getCoilInsulation() + ",";
        output += this.getContactMaterial() + ",";
        output += this.getRelayType() + "\n";
        
        return(output);
    }

    @Override
    public String toCustom() {
        String output = "";
        
        output += super.toCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "Contact Form: " + this.getContactForm() + "\n";
        output += "Seal Rating: " + this.getSealRating() + "\n";
        output += "Coil Insulation: " + this.getCoilInsulation() + "\n";
        output += "Contact Material: " + this.getContactMaterial() + "\n";
        output += "Relay Type: " + this.getRelayType() + "\n";
        
        return(output);
    }

    @Override
    public String toXML() {
        String output = "";
        
        output += super.toXML(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "<SignalRelayInfo>\n";
        output += "     <contactForm>" + this.getContactForm() + "</contactForm>\n";
        output += "     <sealRating>" + this.getSealRating() + "</sealRating>\n";
        output += "     <coilInsulation>" + this.getCoilInsulation() + "</coilInsulation>\n";
        output += "     <contactMaterial>" + this.getContactMaterial() + "</contactMaterial>\n";
        output += "     <relayType>" + this.getRelayType() + "</relayType>\n";
        output += "</SignalRelayInfo>\n";
        
        return(output);
    }

    /**
     * @return the contactForm
     */
    public String getContactForm() {
        return (this.contactForm);
    }

    /**
     * @param contactForm the contactForm to set
     */
    public void setContactForm(String contactForm) {
        this.contactForm = contactForm;
    }

    /**
     * @return the sealRating
     */
    public String getSealRating() {
        return (this.sealRating);
    }

    /**
     * @param sealRating the sealRating to set
     */
    public void setSealRating(String sealRating) {
        this.sealRating = sealRating;
    }

    /**
     * @return the coilInsulation
     */
    public String getCoilInsulation() {
        return (this.coilInsulation);
    }

    /**
     * @param coilInsulation the coilInsulation to set
     */
    public void setCoilInsulation(String coilInsulation) {
        this.coilInsulation = coilInsulation;
    }

    /**
     * @return the contactMaterial
     */
    public String getContactMaterial() {
        return (this.contactMaterial);
    }

    /**
     * @param contactMaterial the contactMaterial to set
     */
    public void setContactMaterial(String contactMaterial) {
        this.contactMaterial = contactMaterial;
    }

    /**
     * @return the relayType
     */
    public String getRelayType() {
        return (this.relayType);
    }

    /**
     * @param relayType the relayType to set
     */
    public void setRelayType(String relayType) {
        this.relayType = relayType;
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
        output += this.getContactForm() + ",";
        output += this.getCoilCurrent() + ",";
        output += this.getCoil() + ",";
        output += this.getSealRating() + ",";
        output += this.getCoilInsulation() + ",";
        output += this.getContactMaterial() + ",";
        output += this.getRelayType() + "\n";
        
        return(output);
    }

    @Override
    public String toCustom() {
        String output = "";
        
        output += super.toCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "Contact Form: " + this.getContactForm() + "\n";
        output += "Coil Current: " + this.getCoilCurrent() + "\n";
        output += "Coil: " + this.getCoil() + "\n";
        output += "Seal Rating: " + this.getSealRating() + "\n";
        output += "Coil Insulation: " + this.getCoilInsulation() + "\n";
        output += "Contact Material: " + this.getContactMaterial() + "\n";
        output += "Relay Type: " + this.getRelayType() + "\n";
        
        return(output);
    }

    @Override
    public String toXML() {
        String output = "";
        
        output += super.toXML(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        output += "<PowerRelayInfo>\n";
        output += "     <contactForm>" + this.getContactForm() + "</contactForm>\n";
        output += "     <coilCurrent>" + this.getCoilCurrent() + "</coilCurrent>\n";
        output += "     <coil>" + this.getCoil() + "</coil>\n";
        output += "     <sealRating>" + this.getSealRating() + "</sealRating>\n";
        output += "     <coilInsulation>" + this.getCoilInsulation() + "</coilInsulation>\n";
        output += "     <contactMaterial>" + this.getContactMaterial() + "</contactMaterial>\n";
        output += "     <relayType>" + this.getRelayType() + "</relayType>\n";
        output += "</PowerRelayInfo>\n";
        
        return(output);
    }

    /**
     * @return the contactForm
     */
    public String getContactForm() {
        return (this.contactForm);
    }

    /**
     * @param contactForm the contactForm to set
     */
    public void setContactForm(String contactForm) {
        this.contactForm = contactForm;
    }

    /**
     * @return the coilCurrent
     */
    public String getCoilCurrent() {
        return (this.coilCurrent);
    }

    /**
     * @param coilCurrent the coilCurrent to set
     */
    public void setCoilCurrent(String coilCurrent) {
        this.coilCurrent = coilCurrent;
    }

    /**
     * @return the coil
     */
    public CoilType getCoil() {
        return (this.coil);
    }

    /**
     * @param coil the coil to set
     */
    public void setCoil(CoilType coil) {
        this.coil = coil;
    }

    /**
     * @return the sealRating
     */
    public String getSealRating() {
        return (this.sealRating);
    }

    /**
     * @param sealRating the sealRating to set
     */
    public void setSealRating(String sealRating) {
        this.sealRating = sealRating;
    }

    /**
     * @return the coilInsulation
     */
    public String getCoilInsulation() {
        return (this.coilInsulation);
    }

    /**
     * @param coilInsulation the coilInsulation to set
     */
    public void setCoilInsulation(String coilInsulation) {
        this.coilInsulation = coilInsulation;
    }

    /**
     * @return the contactMaterial
     */
    public String getContactMaterial() {
        return (this.contactMaterial);
    }

    /**
     * @param contactMaterial the contactMaterial to set
     */
    public void setContactMaterial(String contactMaterial) {
        this.contactMaterial = contactMaterial;
    }

    /**
     * @return the relayType
     */
    public String getRelayType() {
        return (this.relayType);
    }

    /**
     * @param relayType the relayType to set
     */
    public void setRelayType(String relayType) {
        this.relayType = relayType;
    }
    
}

enum CoilType{
        LatchingDualCoil,
        LatchingSingleCoil,
        NonLatching,
        Unknown
    }