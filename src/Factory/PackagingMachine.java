package Factory;
import Packages.*;
import Packages.Package;

public class PackagingMachine {

    public Package getType (String packageType) {

        if (packageType.equalsIgnoreCase("Bulgaria")) {

            return new Bulgaria();

        }

        else if (packageType.equalsIgnoreCase("ForeignCountry")) {

            return new ForeignCountry();

        }

        else if (packageType.equalsIgnoreCase("Plovdiv")) {

            return new Plovdiv();

        }

        else if (packageType == null) {

            return null;

        }

        return null;

    }
}



