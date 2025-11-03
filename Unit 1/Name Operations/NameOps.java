public class NameOps {

    public static String printMethodCall(String method, String name) {
        return "" + method + "(\"" + name + "\"): ";
    }

    public static String whoIsAwesome(String name) {
        return "" + name + " is awesome!";
    }

    public static int indexOfFirstSpace(String name) {
        return name.indexOf(" ");
    }

    public static int indexOfSecondSpace(String name) {
        int index = indexOfFirstSpace(name);
        String sub = name.substring(index + 1);
        if (indexOfFirstSpace(sub) == -1) {
            return -1;
        } else {
            return indexOfFirstSpace(sub) + indexOfFirstSpace(name) + 1;
        }
    }

    public static String findFirstName(String name) {
        if (indexOfFirstSpace(name) == -1) {
            return name;
        } else {
            return name.substring(0, indexOfFirstSpace(name));
        }
    }

    public static String findLastName(String name) {
        if (indexOfFirstSpace(name) == -1) {
            return "";
        } else {
            if (indexOfSecondSpace(name) == -1) {
                return name.substring(indexOfFirstSpace(name) + 1);
            } else {
                return name.substring(indexOfSecondSpace(name) + 1);
            }
        } 
    }

    public static String findMiddleName(String name) {
        if (indexOfSecondSpace(name) == -1) {
            return "";
        } else {
            return name.substring(indexOfFirstSpace(name) + 1, indexOfSecondSpace(name));
        }
    }

    public static String generateLastFirstMidInitial(String name) {
        if (indexOfFirstSpace(name) == -1) {
            return name;
        } else {
            String newName = findLastName(name) + ", " + findFirstName(name);
            if (indexOfSecondSpace(name) == -1) {
                return newName;
            } else {
                return newName + " " + findMiddleName(name).substring(0, 1) + ".";
            }
        }
    }
}
