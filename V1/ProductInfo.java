package PMS.V1;

/* 
 * File: ProductInfo
 * Copy: Copyright (c) 2023 Samuel W. Messer
 * BlazerID: swmesser
 * Vers: 1.0.0 Oct 31, 2023 SWM - Original Coding
 * Desc: Driver for testing concepts
 */

//Flat version 
public class ProductInfo {
    private String itemId;
    private String name;
    private String description;
    private String series;
    private String manufacturer;
    private String mfgPartNumber;
    private int qtyAvailable;
    private double price;
    private stockOption availability;
    private environmentalOption hazards;
    private mediaOption media;
    private productStatus status;
    private packageOption shippingPackage;
    private marketplaceOption marketplace;
    
    //Need to add all of the additional parameters from the other categories
    
    //Generic Product Enums --> 
    //  Used for variables that each type of product will contain
    private enum stockOption{
        inStock,
        normallyStocking,
        newProduct,
        outOfStock,
        unknown
    }

    private enum environmentalOption{
        RoHSCompliant,
        NonRoHSCompliant,
        unknown
    }

    private enum mediaOption{
        datasheet,
        photo,
        eda_cadModels,
        unknown
    }

    private enum marketplaceOption{
        exclude,
        unknown
    }

    private enum packageOption{
        Bag,
        Box,
        Bulk,
        CutTape,
        DigiReel,
        Strip,
        TapeAndBox,
        TapeAndReel,
        Tray,
        unknown
    }

    private enum productStatus{
        active,
        discontinued,
        lastTimeBuy,
        notForNewDesigns,
        obsolete,
        unknown
    }
    
}
