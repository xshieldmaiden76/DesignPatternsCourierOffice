package Singleton;
import Factory.PackagingMachine;
import Utility.Randomizer;
import Packages.Package;


public class Office {

private static Office office = new Office();

private Office(){}

public static Office getInstance() {

    return office;

}

PackagingMachine packagingMachine = new PackagingMachine();

Package packaged = packagingMachine.getType("Bulgaria");

    public Package addPackage() {

        Randomizer randomizer = new Randomizer();

        int typeOfPackage = randomizer.packageType();

        switch (typeOfPackage) {

            case 1:
                packaged = packagingMachine.getType("Bulgaria");
                return packaged;
            case 2:
                packaged = packagingMachine.getType("ForeignCountry");
                return packaged;
            case 3:
                packaged = packagingMachine.getType("Plovdiv");
                return packaged;

        }

       return null;

    }

}




