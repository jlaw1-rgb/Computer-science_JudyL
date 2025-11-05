public class PoolUtils {
    public static int validateCleanlinessLevel(int cleanlinessLevel) {
        if (cleanlinessLevel > 10) {
            cleanlinessLevel = 10;
        } else if (cleanlinessLevel < 0) {
            cleanlinessLevel = 0;
        }
        return cleanlinessLevel;
    }

    public static String generateUsername(String name) {
        name = name.toLowerCase();
        return "@" + name.substring(0, name.indexOf(" "))
            + "_" + name.substring(name.indexOf(" ")) + "_" + (int) (Math.random() * (2050 - 1950 + 1) + 1950);
    }

    public static void cleanPool(Pool pool) {
        pool.setCleanlinessLevel(pool.getCleanlinessLevel() + 2);
    }

    public static String fixName(String name) {
        String trimmedName = name.trim();
        return "" + trimmedName.substring(0, trimmedName.indexOf(""))
            + trimmedName.substring(trimmedName.indexOf(""));
    }

}
