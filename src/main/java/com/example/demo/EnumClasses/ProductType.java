package com.example.demo.EnumClasses;

public enum ProductType {
    LAPTOP("Laptop"),
    SMARTPHONE("Smartphone"),
    TELEVISION("Television"),
    FURNITURE("Furniture"),
    CAMERA("Camera"),
    CLOTHING("Clothing"),
    BOOK("Book"),
    SPORTS_EQUIPMENT("Sports Equipment"),
    TOY("Toy"),
    JEWELRY("Jewelry"),
    ART_SUPPLIES("Art Supplies"),
    AUTOMOTIVE_PART("Automotive Part"),
    MUSICAL_INSTRUMENT("Musical Instrument"),
    OFFICE_EQUIPMENT("Office Equipment");

    private final String displayName;

    ProductType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
