package com.assignment1.inventory.server;

public class InventoryRecord {

    String InventoryID;
    String Name;
    String Description;
    String UnitPrice;
    int QuantityInStock;
    String InventoryValue;
    int RecorderLevel;
    int RecorderTimeInDays;
    int QuantityInRecorder;
    boolean Discontinued;

    public InventoryRecord(String inventoryID, String name, String description, String unitPrice, int quantityInStock, String inventoryValue, int recorderLevel, int recorderTimeInDays, int quantityInRecorder, boolean discontinued) {
        InventoryID = inventoryID;
        Name = name;
        Description = description;
        UnitPrice = unitPrice;
        QuantityInStock = quantityInStock;
        InventoryValue = inventoryValue;
        RecorderLevel = recorderLevel;
        RecorderTimeInDays = recorderTimeInDays;
        QuantityInRecorder = quantityInRecorder;
        Discontinued = discontinued;
    }

    public String getInventoryID() {
        return InventoryID;
    }

    public void setInventoryID(String inventoryID) {
        InventoryID = inventoryID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        UnitPrice = unitPrice;
    }

    public int getQuantityInStock() {
        return QuantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        QuantityInStock = quantityInStock;
    }

    public String getInventoryValue() {
        return InventoryValue;
    }

    public void setInventoryValue(String inventoryValue) {
        InventoryValue = inventoryValue;
    }

    public int getRecorderLevel() {
        return RecorderLevel;
    }

    public void setRecorderLevel(int recorderLevel) {
        RecorderLevel = recorderLevel;
    }

    public int getRecorderTimeInDays() {
        return RecorderTimeInDays;
    }

    public void setRecorderTimeInDays(int recorderTimeInDays) {
        RecorderTimeInDays = recorderTimeInDays;
    }

    public int getQuantityInRecorder() {
        return QuantityInRecorder;
    }

    public void setQuantityInRecorder(int quantityInRecorder) {
        QuantityInRecorder = quantityInRecorder;
    }

    public boolean isDiscontinued() {
        return Discontinued;
    }

    public void setDiscontinued(boolean discontinued) {
        Discontinued = discontinued;
    }

    @Override
    public String toString() {
        return "InventoryRecord{" +
                "InventoryID='" + InventoryID + '\'' +
                ", Name='" + Name + '\'' +
                ", Description='" + Description + '\'' +
                ", UnitPrice='" + UnitPrice + '\'' +
                ", QuantityInStock=" + QuantityInStock +
                ", InventoryValue='" + InventoryValue + '\'' +
                ", RecorderLevel=" + RecorderLevel +
                ", RecorderTimeInDays=" + RecorderTimeInDays +
                ", QuantityInRecorder=" + QuantityInRecorder +
                ", Discontinued=" + Discontinued +
                '}';
    }
}
